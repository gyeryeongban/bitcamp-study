package com.eomcs.pms.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import com.eomcs.pms.dao.MemberDao;
import com.eomcs.pms.domain.Member;
import com.eomcs.util.Prompt;

@WebServlet("/member/delete")
public class MemberDeleteHandler extends HttpServlet {
  private static final long serialVersionUID = 1L;

  SqlSession sqlSession;
  MemberDao memberDao;

  @Override
  public void init(ServletConfig config) throws ServletException {
    ServletContext 웹애플리케이션공용저장소 = config.getServletContext();
    sqlSession = (MemberDao) 웹애플리케이션공용저장소.getAttribute("memberNo");
    memberDao = (MemberDao) 웹애플리케이션공용저장소.getAttribute("memberNo");
  }

  @Override
  protected void service(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {

    response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();

    out.println("<html>");
    out.println("<head>");
    out.println("  <title>회원등록</title>");
    out.println("</head>");
    out.println("<body>");

    System.out.println("[회원 삭제]");

    try {
      int no = Integer.parseInt(request.getParmeter("no"));

      Member member = memberDao.findByNo(no);

      if (member == null) {
        System.out.println("해당 번호의 회원이 없습니다.");
        return;

      } else {
        memberDao.delete(no);
        sqlSession.commit();

        out.println("");

      } else {
        memberDao.delete(no);
        sqlSession.commit();

        System.out.println("회원을 삭제하였습니다.");

        out.println("이름: %s<br>");
        out.println("이메일: %s<br>");
        out.println("암호: %s<br>");
        out.println("사진: %s<br>");
        out.println("전화: %s<br>");
        out.println("등록일: %s<br>");
        out.println();

        out.println("[변경]");
        out.println("<a href='delete?no=%d'>[삭제]</a>", member.getNo());
        out.println("<a href='list'>[목록]</a><br>");
      }
    } catch (Exception e) {
      throw new ServletException(e);
    }

    out.println("</body>");
    out.println("</html>");
  }
}








