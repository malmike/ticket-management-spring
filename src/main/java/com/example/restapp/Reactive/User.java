package com.example.restapp.Reactive;

public class User {
  private Integer userId;
  private String userName;

  public User(Integer userId, String userName) {
    this.userId = userId;
    this.userName = userName;
  }

  public Integer getUserId() {
    return userId;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

}
