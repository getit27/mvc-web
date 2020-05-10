package cn.edu.nju.mvcweb;

public class PiResult {
    double pi;
    long time;
    public PiResult(double pi,long time){
        this.pi=pi;
        this.time=time;
    }
    /**
     * @param pi the pi to set
     */
    public void setPi(double pi) {
        this.pi = pi;
    }
    /**
     * @param time the time to set
     */
    public void setTime(long time) {
        this.time = time;
    }
    /**
     * @return the pi
     */
    public double getPi() {
        return pi;
    }
    /**
     * @return the time
     */
    public long getTime() {
        return time;
    }
}