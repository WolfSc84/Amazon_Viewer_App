package model;

public abstract class Film {

    private String title;
    private String genre;
    private String creator;
    private int duration;
    private short year;
    private boolean viewed;

    public Film(String title, String genre, String creator, int duration) {
        this.title = title;
        this.genre = genre;
        this.creator = creator;
        this.duration = duration;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return this.genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getCreator() {
        return this.creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public int getDuration() {
        return this.duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public short getYear() {
        return this.year;
    }

    public void setYear(short year) {
        this.year = year;
    }

    public String isViewed() {
        String visto = "";
        if (this.viewed) {
            visto = "Sí";
        } else {
            visto = "No";
        }

        return visto;
    }

    public boolean getIsViewed() {
        return this.viewed;
    }

    public void setViewed(boolean viewed) {
        this.viewed = viewed;
    }

    //Metodo abstract que se debe implementar en las clases donde se herede.
    public abstract void view();

}
