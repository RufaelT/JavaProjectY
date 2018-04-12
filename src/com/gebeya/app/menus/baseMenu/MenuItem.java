package com.gebeya.app.menus.baseMenu;

public class MenuItem  {
    private int choiceNo;
    private String description;

    public MenuItem(int choiceNo, String description) {
        this.choiceNo = choiceNo;
        this.description = description;
    }
    public void showMenuItem()
    {
        System.out.println(" Choice : " + choiceNo + " Description : " + description);
    }

    public int getChoiceNo() {
        return choiceNo;
    }

    public void setChoiceNo(int choiceNo) {
        this.choiceNo = choiceNo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
