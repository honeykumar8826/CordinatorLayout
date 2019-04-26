package com.coordinator;

public class StudentModal {
    private String userName, userCourse;

    public StudentModal(String userName, String userCourse) {
        this.userName = userName;
        this.userCourse = userCourse;
    }
    public String getUserName() {
        return userName;
    }

    public String getUserCourse() {
        return userCourse;
    }

}
