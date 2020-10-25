package com.allcoolboys.ChainResponsibility;

/**
 * 责任模式使用
 * @author coolboy
 */
public class ChainResponsibilityPattern {
    private static AbstractLogger getChainOfLogger() {
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.INFO);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.DEBUG);

        consoleLogger.setNextAbstractLogger(fileLogger);
        fileLogger.setNextAbstractLogger(errorLogger);

        return consoleLogger;
    }

    public static void main(String[] args) {
        AbstractLogger logger = getChainOfLogger();

        logger.logMessage(AbstractLogger.ERROR, "测试error日志");
        logger.logMessage(AbstractLogger.INFO, "测试info日志");
        logger.logMessage(AbstractLogger.DEBUG, "测试debug日志");


    }
}
