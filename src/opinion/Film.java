package opinion;

import java.util.LinkedList;

public class Film {
    private String director;
    private String kind;
    private String title;
    private String scenarist;
    private int duration;
    LinkedList<Review> listeReview = new LinkedList<Review>();

    public Film(String director, String kind, String title, String scenarist, int duration){
        this.director=director;
        this.kind=kind;
        this.title=title;
        this.scenarist=scenarist;
        this.duration=duration;
    }
    public String getTitle() {
        return this.title;
    }
    public String getDirector() {
        return this.director;
    }
    public String getScenarist() {
        return this.scenarist;
    }
    public String getKind() {
        return this.kind;
    }
    public int getDuration() {
        return this.duration;
    }

}
