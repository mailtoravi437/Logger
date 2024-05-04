package org.example;

public class InfoLogger extends AbstractLoggger{
    InfoLogger(int level){
        this.level = level;
    }
    @Override
    protected void display(String msg, LoggerSubject loggerSubject) {
        loggerSubject.notifyAllObserver(1,"INFO : "+msg);
    }
}
