public class Map {

    private Room[][] roomGrid;

    public int getNumRows() {
        return roomGrid.length;
    }

    public int getNumCols() {
        return roomGrid[0].length;
    }

    public Map(int rows, int columns) {
        roomGrid = new Room[rows][columns];
        populateMap();
    }

    public void populateMap() {
        for (int i = 0; i < roomGrid.length; i++) {
            for (int j = 0; j < roomGrid[0].length; j++) {
                roomGrid[i][j] = new Room();
            }
        }
    }

    public Room getRoom(int row, int column) {
        return roomGrid[row][column];
    }

    public static void main(String[] args) {
        Map map = new Map(5, 6);
        System.out.println(map.getRoom(0, 0));
        System.out.println(map.getRoom(2, 3));
    }
}
