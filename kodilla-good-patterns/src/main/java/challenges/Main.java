package challenges;

import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        MovieStore moviesStore = new MovieStore();
        String movies = moviesStore.getMovies().entrySet().stream()
                .flatMap(entry -> entry.getValue().stream())
                .collect(Collectors.joining("!"));
        System.out.println(movies);
    }
}