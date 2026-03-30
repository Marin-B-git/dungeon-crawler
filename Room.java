import java.util.ArrayList;

public class Room {
   private ArrayList<Item> itemsInRoom;
   private ArrayList<Monster> monstersInRoom;
   private final int maxNumberOfMonsters = 2;
   private final int maxNumberOfItems = 2;
   
   public Room() {
      // TODO: Generate a random number of monsters and items between 1 and max (inclusive)
      int numOfMonsters = (int) (Math.random() * maxNumberOfMonsters + 1);
      int numOfItems = (int) (Math.random() * maxNumberOfItems + 1);
      monstersInRoom = new ArrayList<Monster>();
      itemsInRoom = new ArrayList<Item>();
      for (int i = 0; i < numOfMonsters; i++)
      {
      monstersInRoom.add(new Monster());
      }
      for (int i = 0; i < numOfItems; i++)
      {
      itemsInRoom.add(new Item());
      }
      
      // TODO: Create the ArrayLists to hold the Items and Monsters in the Room and populate them with Monsters and Items
      
   }
   
   public String toString() {
      String returnString = " ";
      
      // TODO: build a returnString that nicely formats the Monsters and Items in the Room
      for(Monster monster : monstersInRoom)
      {
      returnString+=monster.toString() + " ";
      }
      for(Item item : itemsInRoom)
      {
      returnString+=item.toString() + " ";
      }
      // HINT: Use a for-each loop to go through the ArrayLists
      return returnString;

   }
   
   public static void main(String args[])
   {
   System.out.println("It works.");
   Room room = new Room();
   System.out.println(room);
   
   }

   }