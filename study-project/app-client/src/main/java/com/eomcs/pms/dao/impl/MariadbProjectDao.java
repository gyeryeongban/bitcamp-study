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
// - 프로젝트 데이터를 DBMS 서버를 통해 관리한다.
//
public class MariadbProjectDao implements ProjectDao {

  Connection con;

  public MariadbProjectDao(Connection con) {
    this.con = con;
  }

  @Override
  public void insert(Project project) throws Exception {

  }

  // 방법1: 프로젝트 목록을 가져올 때
  @Override
  public List<Project> findAll() throws Exception {
    try (PreparedStatement stmt = con.prepareStatement(
        "select" 
            + " p.project_no,"
            + " p.title,"
            + " p.start_dt,"
            + " p.end_dt,"
            + " m.member_no,"
            + " m.name,"
            + " m.email"
            + " from pms_project p"
            + " inner join pms_member m on p.member_no=m.member_no"
            + " order by project_no desc");
        PreparedStatement stmt2 = con.prepareStatement(
            "select\r\n"
                + " m.project_no,"
                + " m.member_no,"
                + " m.name,"
                + " m.email"
                + " from"
                + " pms_project_member pm"
                + " inner join pms_member m on pm.member_no=m.member_no"
                + " where"
                + " pm.project_no=101"
                + " order by"
                + " m.name asc);");
        ResultSet rs = stmt.executeQuery()) {

      /*
       select
          pm.project_no,
          m.member_no,
          m.name,
          m.email
          m2.member_no,
          m2.name
          m2.email
       from
          pms_project_member pm
          inner join pms_member m on pm.member_no=m.member_no
          left outer join pms_project_member pm on p.project_no=pm.project_no
          inner join pms_member m2 on pm.member=m2.member_no
        order by project_no desc;
        where
          pm.project_no=101
        order by
          m.name asc);
       */

      ArrayList<Project> list = new ArrayList<>();

      while (rs.next()) {
        Project project = new Project();
        project.setNo(rs.getInt("project_no"));
        project.setTitle(rs.getString("title"));
        project.setStartDate(rs.getDate("start_dt"));
        project.setEndDate(rs.getDate("end_dt"));

        Member owner = new Member();
        owner.setNo(rs.getInt("member_no"));
        owner.setName(rs.getString("name"));
        owner.setEmail(rs.getString("email"));

        project.setOwner(owner);

        stmt2.setInt(1, project.getNo());
        try (ResultSet memberRs = stmt2.executeQuery()) {
          while (memberRs.next()) {
            Member member = new Member();
            member.setNo(memberRs.getInt("member_no"));
            member.setName(memberRs.getString("name"));
            member.setEmail(memberRs.getString("member_email"));
          }
        }


        list.add(project);
      }

      return list;
    }
  }

  // 방법2:
  //  @Override
  //  public List<Project> findAll() throws Exception {
  //    try (PreparedStatement stmt = con.prepareStatement(
  //        "select" 
  //            + " p.project_no,"
  //            + " p.title,"
  //            + " p.start_dt,"
  //            + " p.end_dt,"
  //            + " m.member_no,"
  //            + " m.name,"
  //            + " m.email"
  //            + " from pms_project p"
  //            + " inner join pms_member m on p.member_no=m.member_no"
  //            + " order by project_no desc");
  //        PreparedStatement stmt2 = con.prepareStatement(
  //            "select\r\n"
  //                + " m.project_no,"
  //                + " m.member_no,"
  //                + " m.name,"
  //                + " m.email"
  //                + " from"
  //                + " pms_project_member pm"
  //                + " inner join pms_member m on pm.member_no=m.member_no"
  //                + " where"
  //                + " pm.project_no=101"
  //                + " order by"
  //                + " m.name asc);");
  //        ResultSet rs = stmt.executeQuery()) {
  //
  //      /*
  //       select
  //          pm.project_no,
  //          m.member_no,
  //          m.name,
  //          m.email
  //       from
  //          pms_project_member pm
  //          inner join pms_member m on pm.member_no=m.member_no
  //        where
  //          pm.project_no=101
  //        order by
  //          m.name asc);
  //       */
  //
  //      ArrayList<Project> list = new ArrayList<>();
  //
  //      while (rs.next()) {
  //        Project project = new Project();
  //        project.setNo(rs.getInt("project_no"));
  //        project.setTitle(rs.getString("title"));
  //        project.setStartDate(rs.getDate("start_dt"));
  //        project.setEndDate(rs.getDate("end_dt"));
  //
  //        Member owner = new Member();
  //        owner.setNo(rs.getInt("member_no"));
  //        owner.setName(rs.getString("name"));
  //        owner.setEmail(rs.getString("email"));
  //
  //        project.setOwner(owner);
  //
  //        stmt2.setInt(1, project.getNo());
  //        try (ResultSet memberRs = stmt2.executeQuery()) {
  //          while (memberRs.next()) {
  //            Member member = new Member();
  //            member.setNo(memberRs.getInt("member_no"));
  //            member.setName(memberRs.getString("name"));
  //            member.setEmail(memberRs.getString("member_email"));
  //          }
  //        }
  //
  //
  //        list.add(project);
  //      }
  //
  //      return list;
  //    }
  //  }

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



