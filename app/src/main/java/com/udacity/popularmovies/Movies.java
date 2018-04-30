package com.udacity.popularmovies;

import java.util.Date;

/**
 * Created by carl on 4/30/18.
 */

public class Movies {
    private String title;
    private String poster;
    private String plot; // ie. overview
    private Double rating; // ie. vote_average
    private Date release;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public Date getRelease() {
        return release;
    }

    public void setRelease(Date release) {
        this.release = release;
    }
}
