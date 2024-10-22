package MoiveDemo;

public class moive {
    private int id;
    private String name;
    private String score;
    private int year;
    private String actor;
    public moive(){

    }
    public moive(int id, String name, String score, int year, String actor)
    {
        this.id = id;
        this.name = name;
        this.score = score;
        this.year = year;
        this.actor = actor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }
}
