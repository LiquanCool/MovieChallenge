import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<SimpleMovie> movies = MovieDatabaseBuilder.getMovieDB("src/movie_data");
        for (SimpleMovie movie : movies) {
            System.out.println(movie);
        }
        System.out.println("Number of movies: " + movies.size());
        Scanner n = new Scanner(System.in);
        System.out.println("What actor do you want to link?");
        String searchTerm = n.nextLine();
        ArrayList<String> list1 = new ArrayList<String>();
        for (int i =0;i<movies.size();i++)
        {
            for (int j = 0;i<movies.get(i).getActors().size();i++)
            {
                if (movies.get(i).getActors().get(j).contains(searchTerm))
                {
                    list1.add(movies.get(i).getActors().get(j));
                }
            }
            if (movies.get(i))
        }
    }
}