package org.example;

public class LogManager {
    public static AbstractLoggger doChaining(){
        AbstractLoggger infoLogger = new InfoLogger(1);
        AbstractLoggger errorLogger = new ErrorLogger(2);
        AbstractLoggger debugLogger = new DebugLogger(3);
        infoLogger.setNextLevelLogger(errorLogger);
        errorLogger.setNextLevelLogger(debugLogger);
        return errorLogger;
    }

    public static LoggerSubject addObservers(){
        LoggerSubject loggerSubject = new LoggerSubject();
        ConsoleLogObserver consoleLogObserver = new ConsoleLogObserver();
        DataBaseLogOberver dataBaseLogOberver = new DataBaseLogOberver();
        FileLogObserver fileLogObserver = new FileLogObserver();

        loggerSubject.assignObserver(1, consoleLogObserver);
        loggerSubject.assignObserver(2, dataBaseLogOberver);
        loggerSubject.assignObserver(3, fileLogObserver);

        return loggerSubject;
    }
}
