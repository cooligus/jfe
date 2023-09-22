package Part2.Helpers;

public class Runner {
    public String name;
    public int runningTime;

    public Runner(String newName, int newTime) {
       name = newName;
       runningTime = newTime;
    }

    public Runner() {
        name = "";
        runningTime = 0;
    }
}
