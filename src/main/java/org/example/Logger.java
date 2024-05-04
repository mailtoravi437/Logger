package org.example;

import static org.example.LogManager.addObservers;
import static org.example.LogManager.doChaining;

public class Logger implements Cloneable{
    private static Logger logger;
    private static AbstractLoggger chainOfLogger;
    private static LoggerSubject loggerSubject;

    private Logger(){

    }

    public static Logger getLogger(){
        if(logger == null){
            synchronized (Logger.class){
                if(logger == null){
                    logger = new Logger();
                    chainOfLogger = doChaining();
                    loggerSubject = addObservers();
                }
            }
        }

        return logger;
    }

    public Logger clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    public void info(String message){
        createLog(1, message);
    }

    public void error(String message){
        createLog(2, message);
    }

    public void debug(String message){
        createLog(3, message);
    }

    private void createLog(int level, String message){
        chainOfLogger.logMessage(level, message, loggerSubject);
    }
}
