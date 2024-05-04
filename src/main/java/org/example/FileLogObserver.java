package org.example;

public class FileLogObserver implements LogObserver {
    @Override
    public void log(String message) {
        System.out.println("Writing to File " + message);
    }
}
