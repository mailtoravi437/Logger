package org.example;

public class ErrorLogger extends AbstractLoggger{
    ErrorLogger(int level){
        this.level = level;
    }
    @Override
    protected void display(String msg, LoggerSubject loggerSubject) {
        loggerSubject.notifyAllObserver(3,"ERROR : "+msg);
    }
}
