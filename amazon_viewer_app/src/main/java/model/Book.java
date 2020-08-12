package model;

import java.util.ArrayList;
import java.util.Date;

public class Book extends Publication implements IVisualizable {
    private int id;
    private String isbn;
    private boolean readed;
    private int timeReaded;

    public Book(String title, Date edititionDate, String editorial, String[] authors) {
        super(title, edititionDate, editorial);
        this.setAuthors(authors);
    }

    public int getId() {
        return this.id;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String isReaded() {
        String leido = "";
        if (this.readed) {
            leido = "Sí";
        } else {
            leido = "No";
        }

        return leido;
    }

    public void setReaded(boolean readed) {
        this.readed = readed;
    }

    public boolean getIsReaded() {
        return this.readed;
    }

    public int getTimeReaded() {
        return this.timeReaded;
    }

    public void setTimeReaded(int timeReaded) {
        this.timeReaded = timeReaded;
    }

    public String toString() {
        String detailBook = "\n :: BOOK ::\n Title: " + this.getTitle() + "\n Editorial: " + this.getEditorial() + "\n Edition Date: " + this.getEdititionDate() + "\n Authors: ";

        for(int i = 0; i < this.getAuthors().length; ++i) {
            detailBook = detailBook + "\t" + this.getAuthors()[i] + " ";
        }

        return detailBook;
    }

    public Date startToSee(Date dateI) {
        return dateI;
    }

    public void stopToSee(Date dateI, Date dateF) {
        if (dateF.getTime() > dateI.getTime()) {
            this.setTimeReaded((int)(dateF.getTime() - dateI.getTime()));
        } else {
            this.setTimeReaded(0);
        }

    }

    public static ArrayList<Book> makeBookList() {
        ArrayList<Book> books = new ArrayList();
        String[] authors = new String[3];

        int i;
        for(i = 0; i < 3; ++i) {
            authors[i] = "author " + i;
        }

        for(i = 1; i <= 5; ++i) {
            books.add(new Book("Book " + i, new Date(), "editorial " + i, authors));
        }

        return books;
    }

    public void view(){

        setReaded(true);
        Date dateI = startToSee(new Date());

        for(int i = 0; i < 100000; ++i) {
            System.out.println("..........");
        }

        stopToSee(dateI, new Date());
        System.out.println();
        System.out.println("Leíste: " + toString());
        System.out.println("Por: " + getTimeReaded() + " milisegundos");
    }
}
