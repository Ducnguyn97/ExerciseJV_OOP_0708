package Ex2;

public class stopWatch {
    private long startTime;
    private long stopTime;
    public stopWatch() {
        this.startTime = System.currentTimeMillis();
    }
    public long getStartTime() {
        return startTime;
    }
    public long getStopTime() {
        return stopTime;
    }
    public void start() {
        this.startTime = System.currentTimeMillis();
    }
    public void stop() {
        this.stopTime = System.currentTimeMillis();
    }
    public long getElapsedTime() {
        return (this.stopTime - this.startTime);
    }
}
