package com.allcoolboys.ChainResponsibility;

/**
 * 日志抽象类
 *
 * @author coolboy
 */
public abstract class AbstractLogger {
    public static int ERROR = 1;
    public static int INFO = 2;
    public static int DEBUG = 3;

    /**
     * 处理级别
     */
    protected int level;
    /**
     * 责任链中的下一个元素
     */
    private AbstractLogger nextAbstractLogger;

    public void setNextAbstractLogger(AbstractLogger abstractLogger) {
        this.nextAbstractLogger = abstractLogger;
    }

    public void logMessage(int level, String message) {
        if (this.level <= level) {
            this.write(message);
        }

        if (nextAbstractLogger != null) {
            nextAbstractLogger.logMessage(level, message);
        }
    }

    /**
     * 输出日志
     *
     * @param message
     */
    abstract void write(String message);
}
