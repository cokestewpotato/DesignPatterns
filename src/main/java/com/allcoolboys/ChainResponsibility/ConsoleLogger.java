package com.allcoolboys.ChainResponsibility;

/**
 * 控制台日志
 * @author coolboy
 */
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    void write(String message) {
        System.out.println("ConsoleLogger:" + message);
    }
}
