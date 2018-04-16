package com.gebeya.app.menus.projectMenu;

import com.gebeya.app.menus.baseMenu.Menu;

public class ProjectMenu extends Menu {
    public ProjectMenu() {
        super();
        setTitle("Welcome To Project");
        addMenuItems(6,"6. HRMS");
        addMenuItems(7, "7. PMS");
        addMenuItems(3, "3. Exit");
        addMenuItems(0,"Back");
    }

}
