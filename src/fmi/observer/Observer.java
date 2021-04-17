package fmi.observer;

public interface Observer {
    void update();

    void registerMovie(Movie mv);
}
