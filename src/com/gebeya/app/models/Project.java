package com.gebeya.app.models;

import java.util.Date;

public class Project {
    private int projectId;
    private String projectCode;
    private String projectTitle;
    private String projectLanguage;
    private String projectDeveloper;
    private String projectDescription;
    private Date projectDevelopmentDate;
    private String projectLink;

    public Project(int projectId, String projectCode, String projectTitle, String projectLanguage, String projectDeveloper, String projectDescription, Date projectDevelopmentDate, String projectLink) {
        this.projectId = projectId;
        this.projectCode = projectCode;
        this.projectTitle = projectTitle;
        this.projectLanguage = projectLanguage;
        this.projectDeveloper = projectDeveloper;
        this.projectDescription = projectDescription;
        this.projectDevelopmentDate = projectDevelopmentDate;
        this.projectLink = projectLink;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }

    public String getProjectTitle() {
        return projectTitle;
    }

    public void setProjectTitle(String projectTitle) {
        this.projectTitle = projectTitle;
    }

    public String getProjectLanguage() {
        return projectLanguage;
    }

    public void setProjectLanguage(String projectLanguage) {
        this.projectLanguage = projectLanguage;
    }

    public String getProjectDeveloper() {
        return projectDeveloper;
    }

    public void setProjectDeveloper(String projectDeveloper) {
        this.projectDeveloper = projectDeveloper;
    }

    public String getProjectDescription() {
        return projectDescription;
    }

    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }

    public Date  getProjectDevelopmentDate() {
        return projectDevelopmentDate;
    }

    public void setProjectDevelopmentDate(Date  projectDevelopmentDate) {
        this.projectDevelopmentDate = projectDevelopmentDate;
    }

    public String getProjectLink() {
        return projectLink;
    }

    public void setProjectLink(String projectLink) {
        this.projectLink = projectLink;
    }

    public void DisplayProject()
    {

    }
    public boolean RegisterProject()
    {
        return false;
    }
    public boolean UpdateProject()
    {
        return false;
    }
    public boolean DeleteProject()
    {
        return false;
    }
    public void SearchProject()
    {

    }

}
