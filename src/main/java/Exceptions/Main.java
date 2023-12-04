package Exceptions;

import Interfaces.StreamingPlayer;

public class Main {
    public static void main(String[] args) {
        StreamingPlayer streamingPlayer = null;
        if (streamingPlayer != null) {
            streamingPlayer.stopMovie();
        }

        System.out.println("bau");
        String[] names = {"Alin", "Bogdan"};
        System.out.println();

        try {
            System.out.println("Befour");
            System.out.println(names[6]);
            System.out.println("After");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bound");
        } finally {
            System.out.println("Finally");
        }
        System.out.println("Aftre try-catch");
        System.out.println();

        try {
            simulateException();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void simulateException() throws Exception {
        System.out.println("something");
        throw new Exception("something went wrong");
    }
}
