import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<SimpleMovie> movies = MovieDatabaseBuilder.getMovieDB("src/KevinBaconActorMovies.txt");
        for (SimpleMovie movie : movies) {
            System.out.println(movie);
        }
        ArrayList<String> actors1 = MovieDatabaseBuilder.getBaconActors("src/KevinBaconActors.txt");
        for (String actor : actors1) {
            System.out.println(actor);
        }
        System.out.println("Number of movies: " + movies.size());
        Scanner n = new Scanner(System.in);
        System.out.println("What actor do you want to link?");
        String searchTerm = n.nextLine();
        ArrayList<String> list1 = new ArrayList<String>();
        for (int i =0;i<movies.size();i++)
        {

        }
    }
}