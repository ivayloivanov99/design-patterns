package fmi.observer;

import java.util.ArrayList;
import java.util.List;

public class Movie implements Observable {

    List<Viewer> viewers = new ArrayList<>();
    String movieName;

    @Override
    public void subscribe(Viewer viewer)
    {
        viewers.add(viewer);
    }

    @Override
    public void unSubscribe(Viewer viewer)
    {
        viewers.remove(viewer);
    }

    @Override
    public void notifyViewers()
    {
        for(Viewer viewer: viewers)
        {
            viewer.update();
        }
    }

    @Override
    public void startMovie(String movieName)
    {
        this.movieName = movieName;
        notifyViewers();
    }
}
