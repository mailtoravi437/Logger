package org.example;

public abstract class AbstractLoggger {
    int level;
    private AbstractLoggger nextLevelLogger;

    public void setNextLevelLogger(AbstractLoggger nextLevelLogger) {
        this.nextLevelLogger = nextLevelLogger;
    }

    public void logMessage(int level,String msg,LoggerSubject loggerSubject){
        if(this.level<=level){
            display(msg, loggerSubject);
        }
        if(nextLevelLogger!=null){
            nextLevelLogger.logMessage(level, msg, loggerSubject);
        }
    }

    protected abstract void display(String msg, LoggerSubject loggerSubject);

}
