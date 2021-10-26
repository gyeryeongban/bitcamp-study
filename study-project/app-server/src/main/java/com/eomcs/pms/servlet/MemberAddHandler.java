package com.eomcs.pms.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.ibatis.session.SqlSession;
import com.eomcs.pms.dao.MemberDao;
import com.eomcs.pms.domain.Member;

@WebServlet("/member/add")
public class MemberAddHandler extends HttpServlet {
  private static final long serialVersionUID = 1L;

  MemberDao memberDao;
  SqlSession sqlSession;

  @Override
  protected void service(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

    response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();

    out.println("<html>");
    out.println("<head>");
    out.println("  <title>회원등록</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("<h1>회원등록결과</h1>");

    Member member = new Member();

    member.setName(request.getParameter("이름? "));
    member.setEmail(request.getParameter("이메일? "));
    member.setPassword(request.getParameter("암호? "));
    member.setPhoto(request.getParameter("사진? "));
    member.setTel(request.getParameter("전화? "));

    try {
      memberDao.insert(member);
      sqlSession.commit();

      out.println("회원을 등록했습니다.");
    } catch (Exception e) {
      throw new ServletException(e);
    }

    out.println("</body>");
    out.println("</html>");
  }

  @Override
  public void destroy() {
    sqlSession.close();
  }
}
