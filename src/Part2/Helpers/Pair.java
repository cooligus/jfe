package Part2.Helpers;

public class Pair {
    public int first;
    public int timestamps;

    public Pair() {
        first = 0;
        timestamps = 0;
    }
    public Pair(int newSeconds, int newTimestamps) {
        first = newSeconds;
        timestamps = newTimestamps;
    }
}
