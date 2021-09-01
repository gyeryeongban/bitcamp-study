package com.eomcs.pms.domain;

import java.sql.Date;

public class Task {
  private int no;
  private String content;
  private Date deadline;
  private Member owner;
  private int status;
  private Project project;

  @Override
  public String toString() {
    return "Task [content=" + content + ", deadline=" + deadline + ", no=" + no + ", owner=" + owner + ", project="
        + project + ", status=" + status + "]";
  }

  public List<Project> getProject() {
    return project;
  }

  public void setProject(List<Project> project) {
    this.project = project;
  }

  public int getNo() {
    return no;
  }

  public void setNo(int no) {
    this.no = no;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public Date getDeadline() {
    return deadline;
  }

  public void setDeadline(Date deadline) {
    this.deadline = deadline;
  }

  public Member getOwner() {
    return owner;
  }

  public void setOwner(Member owner) {
    this.owner = owner;
  }

  public int getStatus() {
    return status;
  }

  public void setStatus(int status) {
    this.status = status;
  }
}
