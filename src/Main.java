import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<SimpleMovie> movies = MovieDatabaseBuilder.getMovieDB("src/KevinBaconActorMovies.txt");
        ArrayList<String> actors1 = MovieDatabaseBuilder.getBaconActors("src/KevinBaconActors.txt");
        System.out.println("Number of movies: " + movies.size());
        Scanner n = new Scanner(System.in);
        System.out.println("What actor do you want to link?");
        String searchTerm = n.nextLine();
        ArrayList<String> results = new ArrayList<String>();
        results.add(searchTerm);
        int min = 0;
        int max = movies.size();
        ArrayList<SimpleMovie> tempMovies = new ArrayList<SimpleMovie>();
        tempMovies = movies;
        for (int i =0;i<movies.size()&&results.size()<2;i++)
        {
            ArrayList<String> list1 = movies.get(i).getActors();
            if (list1.contains(searchTerm))
            {
                results.add(movies.get(i).getTitle());
            }
            /**for (int j = 0;j<list1.size();i++)
            {
                System.out.println("yes");
                System.out.println(results.size());
                if (list1.get(j).equals(searchTerm))
                {
                    results.add(movies.get(i).getTitle());
                }
             }**/
        }
        for (int i = 0;i<results.size();i++)
        {
            System.out.print(results.get(i)+ " --> ");
        }
        System.out.print("Kevin Bacon");
    }
}