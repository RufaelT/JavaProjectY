package com.gebeya.app.menus.baseMenu;

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
            System.out.println(">: ");
            choice= keyboard.nextInt();

        } while (isValidChoice(choice));
        selectChoice(choice);
    }
    public void selectChoice(int choice)
    {
       //se
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
