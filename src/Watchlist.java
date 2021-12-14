import java.util.HashSet;

public class Watchlist {
    private HashSet<Stock> watchlist;
    private String name;

    public Watchlist(String name) {
        watchlist = new HashSet<Stock>();
        this.name = name;
    }

    public void addToList(Stock stock) {
        watchlist.add(stock);

    }

    public HashSet getWatchlist() {
        return watchlist;
    }

    public String getName() {
        return name;
    }
}

