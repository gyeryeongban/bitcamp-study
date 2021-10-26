package com.eomcs.pms.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.ibatis.session.SqlSession;
import com.eomcs.pms.dao.MemberDao;
import com.eomcs.pms.domain.Member;
import com.eomcs.util.Prompt;
import com.sun.net.httpserver.HttpServer;

public class MemberUpdateHandler extends HttpServer {

  MemberDao memberDao;
  SqlSession sqlSession;

  public MemberUpdateHandler(MemberDao memberDao, SqlSession sqlSession) {
    this.memberDao = memberDao;
    this.sqlSession = sqlSession;
  }

  @WebServlet("/member/update")
  public class MemberAddHandler extends HttpServlet {
    private static final long serialVersionUID = 1L;

    SqlSession sqlSession;
    MemberDao memberDao;

    @Override
    public void init(ServletConfig config) throws ServletException {
      ServletContext 웹애플리케이션공용저장소 = config.getServletContext();
      sqlSession = (SqlSession) 웹애플리케이션공용저장소.getAttribute("sqlSession");
      memberDao = (MemberDao) 웹애플리케이션공용저장소.getAttribute("memberDao");
    }

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

      response.setContentType("text/html;charset=UTF-8");
      PrintWriter out = response.getWriter();

      out.println("<html>");
      out.println("<head>");
      out.println("  <title>회원변경</title>");
      out.println("</head>");
      out.println("<body>");
      out.println("<h1>회원변경결과</h1>");

      Member member = new Member();

      member.setName(request.getParameter("name"));
      member.setEmail(request.getParameter("email"));
      member.setPassword(request.getParameter("password"));
      member.setPhoto(request.getParameter("photo"));
      member.setTel(request.getParameter("tel"));

      try {
        memberDao.insert(member);
        sqlSession.commit();

        out.println("회원을 등록했습니다.<br>");

        out.println("<a href='list'>[목록]</a><br>");

      } catch (Exception e) {
        throw new ServletException(e);
      }

      out.println("</body>");
      out.println("</html>");

      try {
        int no = (int) request.getAttribute("no");

        HashMap<String,String> params = new HashMap<>();
        params.put("no", String.valueOf(no));

        Member member = memberDao.findByNo(no);

        if (member == null) {
          System.out.println("해당 번호의 회원이 없습니다.");
          return;

        } else {

          member.setName(request.getParameter("name"));
          member.setEmail(request.getParameter("email"));
          member.setPassword(request.getParameter("password"));
          member.setPhoto(request.getParameter("photo"));
          member.setTel(request.getParameter("tel"));

          memberDao.update(member);
          sqlSession.commit();

          out.println("회원을 변경하였습니다.");
        }
      } catch (Exception e) {
        throw new ServletException(e);
      }

      out.println("</body>");
      out.println("</html>");
    }
  }






