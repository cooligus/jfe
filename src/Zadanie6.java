import Helpers.Surface;

public class Zadanie6 {
    public static void main(String[] args) {
        int[][] rooms = new int[4][2];
        rooms[0][0] = 3; rooms[0][1] = 4;
        rooms[1][0] = 3; rooms[1][1] = 4;
        rooms[2][0] = 2; rooms[2][1] = 3;
        rooms[3][0] = 2; rooms[3][1] = 2;
        Surface surfaces = new Surface(4);
        surfaces.count(rooms);
    }

}
