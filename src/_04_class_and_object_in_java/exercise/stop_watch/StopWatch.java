package _04_class_and_object_in_java.exercise.stop_watch;

public class StopWatch {
    private long startTime;
    private long endTime;

    public long getStartTime() {
        return startTime;
    }


    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public void starTime() {
    }

    public long star() {
        startTime = System.currentTimeMillis();
        return startTime;
    }

    public long stop() {
        endTime=System.currentTimeMillis();
        return endTime;
    }

    public long getElapsedTime() {
        long getElapsedTime=endTime-startTime;
        return getElapsedTime;
    }
    //Phương thức start() để reset startTime về thời gian hiện tại của hệ thống.
    //
    //Phương thức stop() để thiết đặt endTime về thời gian hiện tại của hệ thống.
    //
    //Phương thức getElapsedTime() trả về thời gian đã trôi qua theo số milisecond giây
}
