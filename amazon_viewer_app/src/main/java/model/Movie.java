package model;

import java.util.ArrayList;
import java.util.Date;

/**
 * Clase que hereda de {@link Film}
 * Implementa de {@link IVisualizable}
 *
*/
public class Movie extends Film implements IVisualizable {

    private int id;
    private int timeViewed;

    public Movie(String title, String genre, String creator, int duration, short year) {
        super(title, genre, creator, duration);
        this.setYear(year);
    }

    public int getId() {
        return this.id;
    }

    public int getTimeViewed() {
        return this.timeViewed;
    }

    public void setTimeViewed(int timeViewed) {
        this.timeViewed = timeViewed;
    }

    public String toString() {
        return "\n :: MOVIE ::\n Title: " + this.getTitle() + "\n Genero: " + this.getGenre() + "\n Year: " + this.getYear() + "\n Creator: " + this.getCreator() + "\n Duration: " + this.getDuration();
    }

    public Date startToSee(Date dateI) {
        return dateI;
    }

    public void stopToSee(Date dateI, Date dateF) {
        if (dateF.getTime() > dateI.getTime()) {
            this.setTimeViewed((int)(dateF.getTime() - dateI.getTime()));
        } else {
            this.setTimeViewed(0);
        }

    }

    public static ArrayList<Movie> makeMoviesList() {
        ArrayList<Movie> movies = new ArrayList();

        for(int i = 1; i <= 5; ++i) {
            movies.add(new Movie("Movie " + i, "Genero " + i, "Creador " + i, 120 + i, (short)(2017 + i)));
        }

        return movies;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void view() {
        setViewed(true);
        Date dateI = startToSee(new Date());

        for(int i = 0; i < 100000; ++i) {
            System.out.println("..........");
        }

        stopToSee(dateI, new Date());
        System.out.println();
        System.out.println("Viste: " + toString());
        System.out.println("Por: " + getTimeViewed() + " milisegundos");

    };

}
