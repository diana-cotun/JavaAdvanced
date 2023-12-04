package Interfaces;

public interface StreamingPlayer {
    //    static final - default pentru constante in Interfete
    int MAX_NUMBER_OF_USERS = 10;


    //     public abstract - default pentru metode in Interfete
    //     se pot defini si metode statice si default
    public abstract void playMovie(String movie);

    void stopMovie();

    default double getSubscriptionPrice() {
        return 20.20;
    }


}
