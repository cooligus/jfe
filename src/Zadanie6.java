class RoomsParams {
    float totalSurface;
    float[] roomsSurface;
    int numberOfPeople;

    RoomsParams()  {
        numberOfPeople = 4;
        totalSurface = 0;
        roomsSurface = new float[4];
    }
}

public class Zadanie6 {
    public static void main(String[] args) {
        int[][] rooms = new int[4][2];
        rooms[0][0] = 3; rooms[0][1] = 4;
        rooms[1][0] = 3; rooms[1][1] = 4;
        rooms[2][0] = 2; rooms[2][1] = 3;
        rooms[3][0] = 2; rooms[3][1] = 2;
        float[] roomsSurface = new float[4];
        float totalSurface = 0;
        int numberOfPeople = 4;

        for (int i = 0, size = rooms.length; i < size; i++) {
            roomsSurface[i] = (float)(rooms[i][0] * rooms[i][1]) / numberOfPeople;
            System.out.println("Powierzchnia pomieszczenia " + i + " przypadająca na " + numberOfPeople +  " osob: " + roomsSurface[i]);
            totalSurface += roomsSurface[i];
        }
        System.out.println("Całkowita powierzchnia przydająca na " + numberOfPeople + " osob: " + totalSurface);
    }
    public static RoomsParams countSurfaces(int[][] rooms) {
        RoomsParams roomParams = new RoomsParams();

        for (int i = 0, size = rooms.length; i < size; i++) {
            roomParams.roomsSurface[i] = (float)(rooms[i][0] * rooms[i][1]) / roomParams.numberOfPeople;
            System.out.println("Powierzchnia pomieszczenia " + i + " przypadająca na " + roomParams.numberOfPeople +  " osob: " + roomParams.roomsSurface[i]);
            roomParams.totalSurface += roomParams.roomsSurface[i];
        }
        return roomParams;
    }

}
