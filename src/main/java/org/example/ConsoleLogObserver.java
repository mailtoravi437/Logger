package org.example;

public class ConsoleLogObserver implements LogObserver{
    @Override
    public void log(String message) {
        System.out.println("Writing to Console " + message);
    }
}
