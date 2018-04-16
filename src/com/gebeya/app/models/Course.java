package com.gebeya.app.models;

public class Course {
    private int courseId;
    private String courseCode;
    private String courseTitle;
    private String courseDescription;
    private String courseLink;

    public Course(int courseId, String courseCode, String courseTitle, String courseDescription, String courseLink) {
        this.courseId = courseId;
        this.courseCode = courseCode;
        this.courseTitle = courseTitle;
        this.courseDescription = courseDescription;
        this.courseLink = courseLink;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    public String getCourseLink() {
        return courseLink;
    }

    public void setCourseLink(String courseLink) {
        this.courseLink = courseLink;
    }

    public void DisplayCourse()
    {

    }
    public boolean RegisterCourse()
    {
        return false;
    }
    public boolean UpdateCourse()
    {
        return false;
    }
    public boolean DeleteCourse()
    {
        return false;
    }
    public void SearchCourse()
    {

    }
}
