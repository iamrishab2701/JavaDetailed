package basics3.Polymorphism;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        NextMovie movie = NextMovie.getMovie("Science", "Star Wars");
//        movie.watchMovie();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter type (A for adventure, C for Comedy, " +
                    "S for Science Fiction, or Q to quit: ");
            String type = scanner.nextLine();
            if ("Qq".contains(type)) {
                break;
            }

            System.out.println("Enter NextMovie Title: ");
            String title = scanner.nextLine();
            Movie movie = Movie.getMovie(type, title);
            movie.watchMovie();
        }
    }
}
