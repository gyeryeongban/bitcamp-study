package com.eomcs.pms.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.eomcs.pms.dao.ProjectDao;
import com.eomcs.pms.domain.Member;
import com.eomcs.pms.domain.Project;
import com.eomcs.pms.domain.Task;

// 역할
// - 게시글을 데이터를 서버를 통해 관리한다.
//
public class MariadbProjectDao implements ProjectDao {

  Connection con;

  public MariadbProjectDao(Connection con) {
    this.con = con;
  }

  @Override
  public void insert(Project project) throws Exception {

  }

  @Override
  public List<Project> findAll() throws Exception {
    try (PreparedStatement stmt = con.prepareStatement(
        "select"
            + " project_no,"
            + "title,"
            + "start_dt,"
            + "end_dt,"
            + "member_no"
            + " from pms_project"
            + " order by name asc");
        ResultSet rs = stmt.executeQuery()) {

      /* select
      project_no,
      title,
      start_dt,
      end_dt,
      member_no
      from pms_project p
      inner join pms_member m on p.member_no=m.member_no
      order by project_no desc);
      ResultSet rs = stmt.executeQuery()) */

      ArrayList<Project> list = new ArrayList<>();

      while (rs.next()) {
        Project project = new Project();
        project.setNo(rs.getInt("project_no"));
        project.setTitle(rs.getString("title"));
        project.setStartDate(rs.getDate("start_dt"));
        project.setEndDate(rs.getDate("end_dt"));

        Member owner = new Member();
        owner.setNo(rs.getInt("member_no"));
        owner.setName(rs.getString("member_name"));
        owner.setEmail(rs.getString("member_email"));

        project.setOwner(owner);

        list.add(project);
      }

      return list;
    }
  }

  @Override
  public Project findByNo(int no) throws Exception {
    return null;
  }

  @Override
  public void update(Project project) throws Exception {

  }

  @Override
  public void delete(int no) throws Exception {

  }

  @Override
  public void insertTask(Task task) throws Exception {

  }

  @Override
  public void deleteTask(int projectNo, int taskNo) throws Exception {

  }

  @Override
  public void updateTask(Task task) throws Exception {

  }

}


