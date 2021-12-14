import java.util.HashSet;

public class NewsPrinter {
    
    public NewsPrinter(Watchlist watchlist) {
        printWatchlistName(watchlist);
        System.out.println("-----------------------");
        printWatchlistElements(watchlist.getWatchlist());
        
    }

    private void printWatchlistName(Watchlist watchlist) {
        System.out.println(watchlist.getName());
    }

    private void printWatchlistElements(HashSet<Stock> watchlist) {
        for(Stock stock : watchlist) {
            System.out.println(stock.getName());
        }

    }

}
