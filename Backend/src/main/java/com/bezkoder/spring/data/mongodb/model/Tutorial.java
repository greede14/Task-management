package com.bezkoder.spring.data.mongodb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "tutorials")
public class Tutorial {
  @Id
  private String id;

  private String title;
  private int status; //1todo 2doing 3done
  private String description;
  private String duedate;
  private boolean published;

  public Tutorial() {

  }

  public Tutorial(String title, String description, boolean published) {
    this.title = title;
    this.description = description;
    this.published = published;
  }
  public Tutorial(String title, String description, int status, String duedate) {
    this.title = title;
    this.description = description;
    this.status = status;
    this.duedate = duedate;
  }

  public String getId() {
    return id;
  }
  public int getStatus() {
    return status;
  }
  public void setStatus(int status) {
    this.status = status;
  }
  public String getDueDate() {
    return duedate;
  }
  public void setDueDate(String duedate) {
    this.duedate = duedate;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }



  @Override
  public String toString() {
    return "Task [id=" + id + ", title=" + title + ", desc=" + description + ", status=" + status + "Due date"+ duedate + "]";
  }
}
