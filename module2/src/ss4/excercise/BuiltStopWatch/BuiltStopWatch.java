package ss4.excercise.BuiltStopWatch;

import java.time.LocalTime;

public class BuiltStopWatch {
    private long startTime;
    private long endTime;

    public BuiltStopWatch() {
    }

    public long getStartTime() {
        return this.startTime;
    }

    public long getEndTime() {
        return this.endTime;
    }


    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return this.startTime - this.endTime;
    }
}
