//class created called MarioKartPlayer.
public class MarioKartPlayer{
    private String playerName;
    private String character;
    private int speed;
// Constructor which contains player name, character, and speed.
public MarioKartPlayer(String playerName, String character, int speed) {
    this.playerName = playerName;
    this.character = character;
    this.speed = speed;
}
// Methods:
    //Create a boost method which will increase the speed of the user.
public int boost(){
    speed += 10;
    return speed;

}
    // Create a display info method which returns nothing but display the user info.
public void displayInfo(){
    System.out.println("Player info\nPlayer name: " + playerName + "\nCharacter: " + character + "\nSpeed: " + speed);
}

}
