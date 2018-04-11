package com.gebeya.app.menus.HomeMenu;

import com.gebeya.app.menus.baseMenu.Menu;

public class HomeMenu extends Menu {
    public HomeMenu() {
        super();
        setTitle("Welcome To Home");
        addMenuItems(1,"1. Course");
        addMenuItems(2, "2. Project");
        addMenuItems(0,"Back");
    }
}
