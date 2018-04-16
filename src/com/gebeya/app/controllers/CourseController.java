package com.gebeya.app.controllers;

import com.gebeya.app.models.Course;

public class CourseController implements Controllers {
    private Course course;
    public CourseController()
    {
        course=new Course(1,"CS001","Java OOP","This Course provides detail information about OOP basics","http://JavaTpoint.com/Java");
    }
    public void DisplayItem(int id)
    {
        System.out.println("Course Code " + course.getCourseCode());
        System.out.println("Course Title " + course.getCourseTitle());
        System.out.println("Course Description " + course.getCourseDescription());
        System.out.println("Course Link " + course.getCourseLink());

    }
}
