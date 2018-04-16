package com.gebeya.app.controllers;

import java.util.Date;
import com.gebeya.app.models.Project;

public class ProjectController implements Controllers {
    private Project project;
    public ProjectController()
    {
        project=new Project(1,"PR001","HRMS","PHP","Gary Manny","The project allows holding of records related to HRMS",new Date("02/02/2017"),"http://JavaTPoint.com/Projects/Hrms");
    }
    public void DisplayItem(int id)
    {
        System.out.println("Project Code " + project.getProjectCode());
        System.out.println("Project Title " + project.getProjectTitle());
        System.out.println("Description " + project.getProjectDescription());
        System.out.println("Language " + project.getProjectLanguage());
        System.out.println("Developer " + project.getProjectDeveloper());
        System.out.println("Project Link " + project.getProjectLink());

    }
}
