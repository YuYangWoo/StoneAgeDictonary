package com.cookandroid.stoneagedc.kindOfPet;

public class ListItem {
    private int poster;
    private String petName;
    private String grade;

    public ListItem(int poster, String petName, String grade){
        this.poster = poster;
        this.petName = petName;
        this.grade = grade;
    }

    public int getPoster()
    {
        return this.poster;
    }

    public String getPetName()
    {
        return this.petName;
    }

    public String getGrade()
    {
        return this.grade;
    }
}
