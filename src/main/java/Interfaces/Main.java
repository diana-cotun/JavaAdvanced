package Interfaces;

public class Main {
    public static void main(String[] args) {
        StreamingPlayer netflix = new NetflixStreamingPlayer();
        StreamingPlayer prime = new PrimeStreamingPlayer();

        netflix.playMovie("Batman");
        prime.playMovie("Spider");

        netflix.stopMovie();
        prime.stopMovie();

        System.out.println("Prime subsciption is " + prime.getSubscriptionPrice());
        System.out.println("Netflix subsciption is " + netflix.getSubscriptionPrice());

        StreamingPlayer streamingPlayer = new StreamingPlayer() {
            @Override
            public void playMovie(String movie) {
                System.out.println("Playing movie " + movie + " on my awsome streaming playier");
            }

            @Override
            public void stopMovie() {
                System.out.println("Stopping movie on my awsome streaming playier");

            }

            @Override
            public double getSubscriptionPrice() {
                return 5.99;
            }
        };
        System.out.println(streamingPlayer.getSubscriptionPrice());
        streamingPlayer.playMovie("Titanic");
        streamingPlayer.stopMovie();
        System.out.println("---------------------------------------------------------");
        processStreamingPlayer(netflix, "Batman");
        processStreamingPlayer(prime, "Spider");
        processStreamingPlayer(streamingPlayer, "Titanic");
    }
    public static void processStreamingPlayer(StreamingPlayer streamingPlayer, String movie) {
        streamingPlayer.playMovie(movie);
        streamingPlayer.stopMovie();
        System.out.println("Subscription price is: " + streamingPlayer.getSubscriptionPrice());
        System.out.println("----------------------------------------------------------------------");
    }
}
