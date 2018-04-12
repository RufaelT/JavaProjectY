package com.gebeya.app.menus.courseMenu;

import com.gebeya.app.menus.baseMenu.Menu;

public class CourseMenu extends Menu {
    public CourseMenu() {
        super();
        setTitle("Welcome To Course");
        addMenuItems(1,"1. Java");
        addMenuItems(2, "2. C#");
        addMenuItems(3, "3. Exit");
        addMenuItems(0,"Back");
    }

}
