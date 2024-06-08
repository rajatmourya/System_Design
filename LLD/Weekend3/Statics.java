package Weekend3;

import java.util.Objects;

class StatData {
    private int avg;
    private  int median;
    private  int min;
    private  int max;

    public StatData(int avg, int median, int min, int max){
        this.avg = avg;
        this.median = median;
        this.min = min;
        this.max = max;
    }

    public int getAvg() {
        return avg;
    }

    public void setAvg(int avg) {
        this.avg = avg;
    }

    public int getMedian() {
        return median;
    }

    public void setMedian(int median) {
        this.median = median;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StatData statData = (StatData) o;
        return avg == statData.avg && median == statData.median && min == statData.min && max == statData.max;
    }

    @Override
    public int hashCode() {
        return Objects.hash(avg, median, min, max);
    }
}

//public StatData calculateStatistics(int[] arr) {
//
//}

public class Statics {
}
