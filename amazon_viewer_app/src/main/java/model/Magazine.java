package model;

import java.util.ArrayList;
import java.util.Date;

public class Magazine extends Publication {

    private int id;

    public Magazine(String title, Date edititionDate, String editorial) {
        super(title, edititionDate, editorial);
    }

    public int getId() {
        return this.id;
    }

    public String toString() {
        String detailMagazine = "\n :: MAGAZINE ::\n Title: " + this.getTitle() + "\n Editorial: " + this.getEditorial() + "\n Edition Date: " + this.getEdititionDate() + "\n Authors: ";

        for(int i = 0; i < this.getAuthors().length; ++i) {
            detailMagazine = detailMagazine + "\t" + this.getAuthors()[i] + " ";
        }

        return detailMagazine;
    }

    public static ArrayList<Magazine> makeMagazineList() {
        ArrayList<Magazine> magazines = new ArrayList();
        String[] authors = new String[3];

        int i;
        for(i = 0; i < 3; ++i) {
            authors[i] = "author " + i;
        }

        for(i = 1; i <= 5; ++i) {
            magazines.add(new Magazine("Magazine " + i, new Date(), "Editorial " + i));
        }

        return magazines;
    }

}

