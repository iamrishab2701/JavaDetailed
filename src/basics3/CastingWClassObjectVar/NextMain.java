package basics3.CastingWClassObjectVar;

import basics3.Polymorphism.Movie;

public class NextMain {
    public static void main(String[] args) {
        NextMovie nextMovie = NextMovie.getMovie("A", "Jaws");
        nextMovie.watchMovie();

        Adventure jaws = (Adventure) NextMovie.getMovie("A", "Jaws");
        jaws.watchMovie();

        Object comedy = NextMovie.getMovie("C", "Airplace");
        Comedy comedyMovie = (Comedy) comedy;
        comedyMovie.watchComedy();

        var airplane = NextMovie.getMovie("C", "Airplane");
        airplane.watchMovie();

        var plane = new Comedy("Airplace");
        plane.watchComedy();

        Object unknownObject = NextMovie.getMovie("C", "Jaws");
        if(unknownObject.getClass().getSimpleName().equals("Comedy")){
            Comedy c = (Comedy) unknownObject;
            c.watchComedy();
        } else if (unknownObject instanceof Adventure) {
            ((Adventure) unknownObject).watchAdventure();
        } else if (unknownObject instanceof ScienceFiction syfy) {
            syfy.watchScienceFiction();
        }
    }
}
