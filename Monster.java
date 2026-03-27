public class Monster {
private String monsterType;
   

   private final String[] monsterTypes = {
            "Goblin",
            "Skeleton Warrior",
            "Zombie",
            "Orc",
            "Dark Sorcerer",
            "Giant Spider",
            "Vampire Bat",
            "Slime",
            "Mimic",
            "Lich",
            "Troll",
            "Werewolf",
            "Gargoyle",
            "Wraith",
            "Minotaur",
            "Basilisk",
            "Doppelgänger",
            "Demon Hound",
            "Cave Serpent",
            "Ancient Dragon"
        };

   public Monster() {
      // TODO: Pick a random monster type from monsterTypes
      int randomNumber = (int)(Math.random() * monsterTypes.length);
      this.monsterType = monsterTypes[randomNumber];

   }
   
   
   public String getMonsterType() {
      return this.monsterType;
   }
   
   public String toString() {
      // TODO: Build a descriptive String for use by other methods
      return "A wild " + monsterType + " appears.";
   }
            
   public static void main(String args[]) {
      
      Monster myMonster = new Monster();
      System.out.println(myMonster);
   }

}