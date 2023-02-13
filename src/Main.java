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
        ArrayList<String> results = new ArrayList<String>();
        results.add("Kevin Bacon");
        int min = 0;
        int max = movies.size();
        ArrayList<SimpleMovie> tempMovies = new ArrayList<SimpleMovie>();
        tempMovies = movies;
        /**while (min <= max)
        {
            int middle = (min + max) / 2;
            if (tempMovies.subList(0,middle).contains(searchTerm))
            {
                max = middle - 1;
                movies = tempMovies;
                movies.clear();
                System.out.println(movies.size());
            }
            else if (tempMovies.subList(middle,tempMovies.size()-1).contains(searchTerm))
            {
                min = middle + 1;
                movies = tempMovies;
                movies.clear();
            }
            else
            {
                results.add(movies.get(middle).getTitle());
                System.out.println(movies.size());
                System.out.println(tempMovies.size());

            }
        }
**/

        /**for (int i =0;i<movies.size();i++)
        {
            ArrayList<String> list1 = movies.get(i).getActors();
            for (int j = 0;j<list1.size();i++)
            {
                if (list1.get(j).equals(searchTerm))
                {
                    results.add(movies.get(i).getTitle());
                }
            }
        }
        **/
        results.add(searchTerm);
        for (int i = 0;i<results.size();i++)
        {
            System.out.print(results.get(i)+ " --> ");
        }
    }
}