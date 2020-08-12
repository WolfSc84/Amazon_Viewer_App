package model;

import java.util.ArrayList;

public class Chapter extends Movie{

    private int id;
    private int sessionNumber;
    private Serie serie;

    public Chapter(String title, String genre, String creator, int duration, short year, int sessionNumber, Serie serie) {
        super(title, genre, creator, duration, year);
        this.setSessionNumber(sessionNumber);
        this.setSerie(serie);
    }

    public int getId() {
        return this.id;
    }

    public int getSessionNumber() {
        return this.sessionNumber;
    }

    public void setSessionNumber(int sessionNumber) {
        this.sessionNumber = sessionNumber;
    }

    public Serie getSerie() {
        return this.serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public String toString() {
        return "\n :: SERIE ::\n Title: " + this.getSerie().getTitle() + "\n :: CHAPTER ::" + "\n Title: " + this.getTitle() + "\n Year: " + this.getYear() + "\n Creator: " + this.getCreator() + "\n Duration: " + this.getDuration();
    }

    public static ArrayList<Chapter> makeChaptersList(Serie serie) {
        ArrayList<Chapter> chapters = new ArrayList();

        for(int i = 1; i <= 5; ++i) {
            chapters.add(new Chapter("Capituo " + i, "genero " + i, "creator" + i, 45, (short)(2017 + i), i, serie));
        }

        return chapters;
    }

    @Override
    public void view(){
        super.view();
        ArrayList<Chapter> chapters = getSerie().getChapters();
        int chapterViewedCounter = 0;
        for (Chapter chapter : chapters){
            if(chapter.getIsViewed()){
                chapterViewedCounter++;
            }
        }
        if(chapterViewedCounter == chapters.size()){
            getSerie().view();
        }
    }

}

