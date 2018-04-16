package com.gebeya.app.menus.courseMenu;

import com.gebeya.app.menus.baseMenu.Menu;

public class CourseMenu extends Menu {
    public CourseMenu() {
        super();
        setTitle("Welcome To Course");
        addMenuItems(4,"4. Java");
        addMenuItems(5, "5. C#");
        addMenuItems(3, "3. Exit");
        addMenuItems(0,"Back");
    }

}
