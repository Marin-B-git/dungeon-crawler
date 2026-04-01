public class Map {

   private Room[][] roomGrid;
   
   public int getNumRows() {
      // TODO: return the number of rows in roomGrid
      roomGrid.length
      return ;
   }
   public int getNumCols() {
      // TODO: return the number of columns in roomGrid
      roomGrid[0].length
      return ;
   }

   public Map(int rows, int columns) {
      int Map = new int[x][y]
      // TODO: initalize the Map by creating the 2D array
      // and then calling populateMap which will build all of the Rooms
   }
   public void populateMap() {
      // TODO: populate the map with a bunch of Rooms with random numbers of monsters and items
      
      // Hint: Use nested for loops to fill every row and column
      // Another Hint: use the Room constructor to populate the Monsters and Items
   }
   public Room getRoom(int row, int column) {
      // TODO: return the Room that is at the row and column that are passed
   }
   
   public Room getRandomRoom() {
      // TODO: This method will simply return a random room in the Map so that you can 
      // give the player a random starting point.
      
   }
}
  