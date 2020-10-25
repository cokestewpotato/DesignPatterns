package com.allcoolboys.ChainResponsibility;

/**
 * 日志输出类
 *
 * @author coolboy
 */
public class FileLogger extends AbstractLogger {
    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    void write(String message) {
        System.out.println("FileLogger:" + message);
    }
}
