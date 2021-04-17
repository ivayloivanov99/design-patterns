package fmi.observer;

public interface Observable {
    void subscribe(Viewer viewer);

    void unSubscribe(Viewer viewer);

    void notifyViewers();

    void startMovie(String movieName);
}
