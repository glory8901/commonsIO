package com.fxh.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PerformanceRecord {
    private static Logger m_Logger = LoggerFactory.getLogger(PerformanceRecord.class);

    private String desp;
    private long iStart;

    private PerformanceRecord(String desp) {
        this.desp = desp;
    }

    public static PerformanceRecord getInstance(String desp) {
        return new PerformanceRecord(desp);
    }

    public long start() {
        iStart = System.nanoTime();
        return iStart;
    }

    public double endInSeconds() {
        long iEnd = System.nanoTime();

        double timeInSeconds = (iEnd - iStart) / (1000000000.0);

        m_Logger.info(desp + " 耗时为 [" + timeInSeconds + "] 秒");
        return timeInSeconds;
    }

    public double endInMs() {
        long iEnd = System.nanoTime();

        double timeInMs = (iEnd - iStart) / (1000000.0);

        m_Logger.info(desp + " 耗时为 [" + timeInMs + "] 毫秒");
        return timeInMs;
    }

    public long endInNs() {
        long iEnd = System.nanoTime();

        long timeInNs = (iEnd - iStart);

        m_Logger.info(desp + " 耗时为 [" + timeInNs + "] 纳秒");
        return timeInNs;
    }
}