package com.allcoolboys.ChainResponsibility;

/**
 * error日志
 * @author coolboy
 */
public class ErrorLogger extends AbstractLogger {
    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    void write(String message) {
        System.out.println("ErrorLogger:" + message);
    }
}
