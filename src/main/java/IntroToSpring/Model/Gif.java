package IntroToSpring.Model;

import java.time.LocalDate;

public class Gif {
    private String name;
    private LocalDate dateUpLoaded;
    private String username;
    private boolean favorite;

    public Gif(String name, LocalDate dateUpLoaded, String username, boolean favorite) {
        this.name = name;
        this.dateUpLoaded = dateUpLoaded;
        this.username = username;
        this.favorite = favorite;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateUpLoaded() {
        return dateUpLoaded;
    }

    public void setDateUpLoaded(LocalDate dateUpLoaded) {
        this.dateUpLoaded = dateUpLoaded;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavourite(boolean favorite) {
        this.favorite = favorite;
    }
}
