package com.gebeya.app.menus.baseMenu;

import com.gebeya.app.controllers.CourseController;
import com.gebeya.app.controllers.ProjectController;
import com.gebeya.app.menus.HomeMenu.HomeMenu;
import com.gebeya.app.menus.courseMenu.CourseMenu;
import com.gebeya.app.menus.projectMenu.ProjectMenu;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private String title;
    private ArrayList<MenuItem> menuItems;
    public Menu()
    {
        title="";
        menuItems= new ArrayList<>();
    }
    public Menu(String title, ArrayList<MenuItem> menuItems) {
        this.title = title;
        this.menuItems = menuItems;
    }
    public void showMenu()
    {
        System.out.println(title);
        for(int i=0;i<menuItems.size();i++)
        {
            MenuItem menuItem=menuItems.get(i);
            menuItem.showMenuItem();
        }
    }
    public void start()
    {
        int choice;
        showMenu();
        Scanner keyboard=new Scanner(System.in);
        do {
            System.out.print(">: ");
            choice= keyboard.nextInt();

        } while (!isValidChoice(choice));
        selectChoice(choice);
    }
    public void selectChoice(int choice)
    {
       switch (choice)
        {
            case 1: (new CourseMenu()).start();
            break;
            case 2:(new ProjectMenu()).start();
            break;
            case 3 :
                break;
            case 4:
                (new CourseController()).DisplayItem(1);
                break;
            case 5:
                (new CourseController()).DisplayItem(1);
                break;
            case 6:
                (new ProjectController()).DisplayItem(1);
                break;
            case 7:
                (new ProjectController()).DisplayItem(1);
                break;
            case 0: repeatChoice();
            break;
            default: System.out.println("Wrong input");
            break;
        }
    }
    public void repeatChoice()
    {
        (new HomeMenu()).start();
    }
    public boolean isValidChoice(int choice) {
        for (int i = 0; i < menuItems.size(); i++) {
            MenuItem menuitem = menuItems.get(i);
            if (menuitem.getChoiceNo() == choice)
                return true;
        }
        return false;
    }
    public void addMenuItems(int choice,String description)
    {
        MenuItem abc = new MenuItem(choice,description);
        menuItems.add(abc);
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

}
