package ru.netology.javaqa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoviesManagerTest {

    @Test
    public void shouldAddNullMovies() {
        MoviesManager manager = new MoviesManager();

        manager.addMovie("");

        String[] expected = {""};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddThreeMovies() {
        MoviesManager manager = new MoviesManager();

        manager.addMovie("Movie I");
        manager.addMovie("Movie II");
        manager.addMovie("Movie III");

        String[] expected = {"Movie I", "Movie II", "Movie III"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddSixMovies() {
        MoviesManager manager = new MoviesManager();

        manager.addMovie("Movie I");
        manager.addMovie("Movie II");
        manager.addMovie("Movie III");
        manager.addMovie("Movie IV");
        manager.addMovie("Movie V");
        manager.addMovie("Movie VI");

        String[] expected = {"Movie I", "Movie II", "Movie III", "Movie IV", "Movie V", "Movie VI"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastMoviesWithoutLimitFirst() {
        MoviesManager manager = new MoviesManager();

        manager.addMovie("Movie I");
        manager.addMovie("Movie II");
        manager.addMovie("Movie III");
        manager.addMovie("Movie IV");
        manager.addMovie("Movie V");

        String[] expected = {"Movie V", "Movie IV", "Movie III", "Movie II", "Movie I"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastMoviesWithoutLimitSecond() {
        MoviesManager manager = new MoviesManager();

        manager.addMovie("Movie I");
        manager.addMovie("Movie II");
        manager.addMovie("Movie III");
        manager.addMovie("Movie IV");

        String[] expected = {"Movie IV", "Movie III", "Movie II", "Movie I"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastMoviesWithoutLimitThird() {
        MoviesManager manager = new MoviesManager();

        manager.addMovie("Movie I");
        manager.addMovie("Movie II");
        manager.addMovie("Movie III");
        manager.addMovie("Movie IV");
        manager.addMovie("Movie V");
        manager.addMovie("Movie VI");

        String[] expected = {"Movie VI", "Movie V", "Movie IV", "Movie III", "Movie II"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastMoviesWithLimitFirst() {
        MoviesManager manager = new MoviesManager(6);

        manager.addMovie("Movie I");
        manager.addMovie("Movie II");
        manager.addMovie("Movie III");
        manager.addMovie("Movie IV");
        manager.addMovie("Movie V");
        manager.addMovie("Movie VI");

        String[] expected = {"Movie VI", "Movie V", "Movie IV", "Movie III", "Movie II", "Movie I"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastMoviesWithLimitSecond() {
        MoviesManager manager = new MoviesManager(6);

        manager.addMovie("Movie I");
        manager.addMovie("Movie II");
        manager.addMovie("Movie III");

        String[] expected = {"Movie III", "Movie II", "Movie I"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastMoviesWithLimitThird() {
        MoviesManager manager = new MoviesManager(6);

        manager.addMovie("Movie I");
        manager.addMovie("Movie II");
        manager.addMovie("Movie III");
        manager.addMovie("Movie IV");
        manager.addMovie("Movie V");
        manager.addMovie("Movie VI");
        manager.addMovie("Movie VII");

        String[] expected = {"Movie VII", "Movie VI", "Movie V", "Movie IV", "Movie III", "Movie II"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}


