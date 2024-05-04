package org.example;

public class DebugLogger extends AbstractLoggger{
    DebugLogger(int level){
        this.level = level;
    }
    @Override
    protected void display(String msg, LoggerSubject loggerSubject) {
        loggerSubject.notifyAllObserver(4,"DEBUG : "+msg);
    }
}
