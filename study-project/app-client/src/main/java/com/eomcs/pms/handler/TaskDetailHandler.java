package com.eomcs.pms.handler;

import java.util.HashMap;
import com.eomcs.pms.domain.Member;
import com.eomcs.pms.domain.Task;
import com.eomcs.request.RequestAgent;
import com.eomcs.util.Prompt;

public class TaskDetailHandler implements Command {

  RequestAgent requestAgent;

  public TaskDetailHandler(RequestAgent requestAgent) {
    this.requestAgent = requestAgent;
  }

  @Override
  public void execute(CommandRequest request) throws Exception {
    System.out.println("[작업 상세보기]");
    int no = Prompt.inputInt("번호? ");

    HashMap<String,String> params = new HashMap<>();
    params.put("no", String.valueOf(no));

    requestAgent.request("task.selectOne", params);

    if (requestAgent.getStatus().equals(RequestAgent.FAIL)) {
      System.out.println("해당 번호의 작업이 없습니다.");
      return;
    }

    Task task = requestAgent.getObject(Task.class);

    //    Project project = projectPrompt.promptProject();
    //    if (project == null) {
    //      System.out.println("작업 조회를 취소합니다.");
    //      return;
    //    }
    //
    //    printTasks(project);
    //
    //    System.out.println("-------------------------------------");
    //
    //    int taskNo = Prompt.inputInt("작업 번호? ");
    //
    //    Task task = task.findTaskByNo(taskNo);
    //    if (task == null) {
    //      System.out.println("해당 번호의 작업이 없습니다.");
    //      return;
    //    }

    System.out.printf("내용: %s\n", task.getContent());
    System.out.printf("마감일: %s\n", task.getDeadline());
    System.out.printf("상태: %s\n", TaskHandlerHelper.getStatusLabel(task.getStatus()));
    System.out.printf("담당자: %s\n", task.getOwner().getName());
    System.out.println();

    Member loginUser = AuthLoginHandler.getLoginUser(); 
    if (loginUser == null || (task.getNo() != loginUser.getNo() && !loginUser.getEmail().equals("root@test.com"))) {
      return;
    }

    request.setAttribute("project", task);
    request.setAttribute("task", task);

    while (true) {
      String input = Prompt.inputString("변경(U), 삭제(D), 이전(0)>");
      switch (input) {
        case "U":
        case "u":
          request.getRequestDispatcher("/task/update").forward(request);
          return;
        case "D":
        case "d":
          request.getRequestDispatcher("/task/delete").forward(request);
          return;
        case "0":
          return;
        default:
          System.out.println("명령어가 올바르지 않습니다!");
      }
    }
  }
}





