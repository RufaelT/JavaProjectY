package com.gebeya.app.menus.projectMenu;

import com.gebeya.app.menus.baseMenu.Menu;

public class ProjectMenu extends Menu {
    public ProjectMenu() {
        super();
        setTitle("Welcome To Project");
        addMenuItems(1,"1. HRMS");
        addMenuItems(2, "2. PMS");
        addMenuItems(3, "3. Exit");
        addMenuItems(0,"Back");
    }

}
