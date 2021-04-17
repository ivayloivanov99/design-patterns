package fmi.observer;

public class Viewer implements Observer {

    private String name;
    private Movie movie;

    public Viewer(String name) {
        this.name = name;
    }

    @Override
    public void update(){
        System.out.println("Notifying "+ name + " that the movie "+ movie.movieName +" has started");
    }

    @Override
    public void registerMovie(Movie mv){
        movie = mv;
    }
}
