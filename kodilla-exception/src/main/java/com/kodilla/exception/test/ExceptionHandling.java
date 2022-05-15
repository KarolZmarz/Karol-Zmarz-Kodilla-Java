package com.kodilla.exception.test;

public class ExceptionHandling {

    public void handleException(double x, double y) {

        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            String second = secondChallenge.probablyIWillThrowException(x, y);
            System.out.println(second);
        } catch (Exception e) {
            System.out.println("Wyjątek: " + e);
        } finally {
            System.out.println("Koniec drugiego Challengu ");
        }
    }
}


