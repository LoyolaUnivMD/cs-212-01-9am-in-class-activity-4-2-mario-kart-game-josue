// Programmers:  Josue Sanchez
// Course:  CS 212
// Due Date: 2/8/2024
// In class activity: phone bill
// Problem Statement: Create a class and mario kart game
// Data In: none
// Data Out: Player info, speed, and character
// Credits: Class notes from John Nweke
class HelloWorld {
    public static void main(String[] args) {
        //Instantiate 2 objects containing names, characters and speeds.
    MarioKartPlayer Mario = new MarioKartPlayer("Josue","Mario",50);
    MarioKartPlayer Luigi = new MarioKartPlayer("John","Luigi",30);
   // Display both of the user's information.
    System.out.println("Player 1:");
    Mario.displayInfo();
    System.out.println("\nPlayer 2:");
    Luigi.displayInfo();
    //Call the boost method to increase their speeds.
    Mario.boost();
    Luigi.boost();
    //Call the display method for the user to see their new speed.
    System.out.println("\nBoth players have hit a boost pad!");
    System.out.println("\nNew stats:");
    System.out.println("Player 1:");
    Mario.displayInfo();
    System.out.println("\nPlayer 2:");
    Luigi.displayInfo();
        
    }
}
