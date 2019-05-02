package edu.jhun.bean;

import org.springframework.stereotype.Component;

/**
 * Created by hgw on 2019/4/30.
 */
@Component
public class BaseIndex {
    double maxDate;
    double minDate;
    double varianceDate;
    double standardDeviationDate;
    double averageDate;
    double rangeDate;

    @Override
    public String toString() {
        return "BaseIndex{" +
                "maxDate=" + maxDate +
                ", minDate=" + minDate +
                ", varianceDate=" + varianceDate +
                ", standardDeviationDate=" + standardDeviationDate +
                ", averageDate=" + averageDate +
                ", rangeDate=" + rangeDate +
                '}';
    }

    public double getMaxDate() {
        return maxDate;
    }

    public void setMaxDate(double maxDate) {
        this.maxDate = maxDate;
    }

    public double getMinDate() {
        return minDate;
    }

    public void setMinDate(double minDate) {
        this.minDate = minDate;
    }

    public double getVarianceDate() {
        return varianceDate;
    }

    public void setVarianceDate(double varianceDate) {
        this.varianceDate = varianceDate;
    }

    public double getStandardDeviationDate() {
        return standardDeviationDate;
    }

    public void setStandardDeviationDate(double standardDeviationDate) {
        this.standardDeviationDate = standardDeviationDate;
    }

    public double getAverageDate() {
        return averageDate;
    }

    public void setAverageDate(double averageDate) {
        this.averageDate = averageDate;
    }

    public double getRangeDate() {
        return rangeDate;
    }

    public void setRangeDate(double rangeDate) {
        this.rangeDate = rangeDate;
    }
}
