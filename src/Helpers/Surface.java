package Helpers;

public class Surface {
    float totalSurface;
    float[] roomsSurface;
    int numberOfPeople;
    public Surface(int numOfPeople)  {
        numberOfPeople = numOfPeople;
        totalSurface = 0;
        roomsSurface = new float[4];
    }
    public void count(int[][] rooms) {
        for (int i = 0, size = rooms.length; i < size; i++) {
            roomsSurface[i] = (float)(rooms[i][0] * rooms[i][1]) / numberOfPeople;
            System.out.println("Powierzchnia pomieszczenia " + i + " przypadająca na " + numberOfPeople +  " osob: " + roomsSurface[i]);
            totalSurface += roomsSurface[i];
        }
        System.out.println("Całkowita powierzchnia przydająca na " + numberOfPeople + " osob: " + totalSurface);
    }
}
