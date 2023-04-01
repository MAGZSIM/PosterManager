public class PosterManager {
    private String[] movies = new String[0];

    private int limitManager = 10;

    public PosterManager(int limitMovies) {

        this.limitManager = limitMovies;
    }

    public PosterManager() {
    this.limitManager = 10;
    }

    public String[] getMovies() {

        return movies;
    }


    //принимать новый фильм для добавления
    public void save(String movie) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
                tmp[i] = movies[i];
            }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public String[] findAll() {
        return movies;
    }

    public String [] findLast () {
        int resultLenght=0;
        if (movies.length < limitManager) {
            resultLenght = movies.length;
        } else {
            resultLenght = limitManager;
        }
        String [] reversed = new String [resultLenght];
        for (int i =0; i < reversed.length; i++ ) {
            reversed[i] = movies[movies.length -1-i];
        }
        return reversed;

    }
}
