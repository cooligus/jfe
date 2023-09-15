public class Zadanie5 {
    public static void main(String[] args) {
        int[][] rooms = new int[4][2];
        rooms[0][0] = 3; rooms[0][1] = 4;
        rooms[1][0] = 3; rooms[1][1] = 4;
        rooms[2][0] = 2; rooms[2][1] = 3;
        rooms[3][0] = 2; rooms[3][1] = 2;

        int[] roomsSurface = new int[4];
        int totalSurface = 0;
        for (int i = 0, size = rooms.length; i < size; i++) {
            roomsSurface[i] = rooms[i][0] * rooms[i][1];
            System.out.println("Powierzchnia pomieszczenia " + i + ": " + roomsSurface[i]);
            totalSurface += roomsSurface[i];
        }
        System.out.println("Całkowita powierzchnia: " + totalSurface);
    }
}
