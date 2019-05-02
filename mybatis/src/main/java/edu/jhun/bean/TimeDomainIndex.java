package edu.jhun.bean;

import org.springframework.stereotype.Component;

/**
 * Created by hgw on 2019/4/30.
 */
@Component
public class TimeDomainIndex {

    public double adjustmentTime;
    public double delayTime;
    public double numberOfOscillation;
    public double overShoot;
    public double peakTime;
    public double riseTime;

    @Override
    public String toString() {
        return "TimeDomainIndex{" +
                "adjustmentTime=" + adjustmentTime +
                ", delayTime=" + delayTime +
                ", numberOfOscillation=" + numberOfOscillation +
                ", overShoot=" + overShoot +
                ", peakTime=" + peakTime +
                ", riseTime=" + riseTime +
                '}';
    }

    public double getNumberOfOscillation() {
        return numberOfOscillation;
    }

    public void setNumberOfOscillation(double numberOfOscillation) {
        this.numberOfOscillation = numberOfOscillation;
    }

    public double getAdjustmentTime() {
        return adjustmentTime;
    }

    public void setAdjustmentTime(double adjustmentTime) {
        this.adjustmentTime = adjustmentTime;
    }

    public double getDelayTime() {
        return delayTime;
    }

    public void setDelayTime(double delayTime) {
        this.delayTime = delayTime;
    }



    public double getOverShoot() {
        return overShoot;
    }

    public void setOverShoot(double overShoot) {
        this.overShoot = overShoot;
    }

    public double getPeakTime() {
        return peakTime;
    }

    public void setPeakTime(double peakTime) {
        this.peakTime = peakTime;
    }

    public double getRiseTime() {
        return riseTime;
    }

    public void setRiseTime(double riseTime) {
        this.riseTime = riseTime;
    }
}
