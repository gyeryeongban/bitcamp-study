package com.eomcs.pms.domain;

import java.sql.Date;
import java.util.List;

public class Project {
  private int no;
  private String title;
  private String content;
  private Date startDate;
  private Date endDate;
  private Member owner;
  private List<Member> members;
  private List<Task> tasks = new ArrayList<>();

  @Override
  public String toString() {
    return "Project [content=" + content + ", endDate=" + endDate + ", members=" + members + ", no=" + no + ", owner="
        + owner + ", startDate=" + startDate + ", task=" + task + ", title=" + title + "]";
  }

  public List<Task> getTask() {
    return task;
  }

  public void setTask(List<Task> task) {
    this.task = task;
  }

  public int getNo() {
    return no;
  }

  public void setNo(int no) {
    this.no = no;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public Date getStartDate() {
    return startDate;
  }

  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  public Date getEndDate() {
    return endDate;
  }

  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }

  public Member getOwner() {
    return owner;
  }

  public void setOwner(Member owner) {
    this.owner = owner;
  }

  public Member getMembers() {
    return members;
  }

  public void setMembers(Member members) {
    this.members = members;
  }
}
