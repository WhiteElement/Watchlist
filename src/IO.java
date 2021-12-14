public class IO {

    public static void main(String[] args) {
        Stock stonk = new Stock("Micron");
        Watchlist watchlist = new Watchlist("Meine erste Watchlist");
        watchlist.addToList(stonk);
        NewsPrinter printer = new NewsPrinter(watchlist);
    }
}
