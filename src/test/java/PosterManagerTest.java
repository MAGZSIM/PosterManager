import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PosterManagerTest {
    String movies0 = new String("Бладшот");
    String movies1 = new String("Вперед");
    String movies2 = new String("Вверх");
    String movies3 = new String("Отель Белград");
    String movies4 = new String("Джентльмены");
    String movies5 = new String("Человек Невидимка");
    String movies6 = new String("Тролли. Мировой тур");
    String movies7 = new String("Номер один");
    String movies8 = new String("Аватар 2");
    String movies9 = new String("Быстрее пули");
    String movies10 = new String("Быстрее пули 2");

    @Test
    public void saveFirstConstructor() {
        PosterManager repo = new PosterManager(9);
        repo.save(movies0);
        repo.save(movies1);
        repo.save(movies2);
        repo.save(movies3);
        repo.save(movies4);
        repo.save(movies5);
        repo.save(movies6);
        repo.save(movies7);
        repo.save(movies8);
        String[] expected = {movies0, movies1, movies2, movies3, movies4, movies5,movies6,movies7,movies8};
        String[] actual = repo.getMovies();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void saveSecondConstructor() {
        PosterManager repo = new PosterManager();
        repo.save(movies0);
        repo.save(movies1);
        repo.save(movies2);
        repo.save(movies3);
        repo.save(movies4);
        repo.save(movies5);
        repo.save(movies6);
        repo.save(movies7);
        repo.save(movies8);
        repo.save(movies9);
        repo.save(movies10);
        String[] expected = {movies0, movies1, movies2, movies3, movies4, movies5, movies6, movies7, movies8, movies9, movies10};
        String[] actual = repo.getMovies();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void findAll() {
        PosterManager repo = new PosterManager();
        repo.save(movies0);
        repo.save(movies1);
        repo.save(movies2);
        repo.save(movies3);
        repo.save(movies9);
        String[] expected = {movies0, movies1, movies2, movies3, movies9};
        String[] actual = repo.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void findLast() {
        PosterManager repo = new PosterManager();
        repo.save(movies3);
        repo.save(movies2);
        repo.save(movies1);
        repo.save(movies0);
        String[] expected = {movies0, movies1, movies2, movies3};
        String[] actual = repo.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}