package fmi.observer;

public class Cinema {

    public static void main(String[] args)
    {
        Movie movie = new Movie();

        Viewer viewer1 = new Viewer("Ivaylo");
        Viewer viewer2 = new Viewer("Dimitar");
        Viewer viewer3 = new Viewer("Maria");

        movie.subscribe(viewer1);
        movie.subscribe(viewer2);
        movie.subscribe(viewer3);

        viewer1.registerMovie(movie);
        viewer2.registerMovie(movie);
        viewer3.registerMovie(movie);

        movie.startMovie("Titanic");

    }

}
