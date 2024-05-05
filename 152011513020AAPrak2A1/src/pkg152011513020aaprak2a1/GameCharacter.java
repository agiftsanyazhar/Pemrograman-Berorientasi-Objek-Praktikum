package pkg152011513020aaprak2a1;

public class GameCharacter {
    private final String name;
    private int lifePoint;
    private int attackHitPoint;
    private int attackKickPoint;
    
    // Constructor
    GameCharacter (String charName, int ahp, int akp){
        this.name               = charName;
        this.lifePoint          = 100;
        this.attackHitPoint     = ahp;
        this.attackKickPoint    = akp;
    }
    
    public String getName (){
        return this.name;
    }
    
    public int getLifePoint (){
        return this.lifePoint;
    }
    
    public void hit (GameCharacter musuh){
        musuh.lifePoint     = musuh.lifePoint - this.attackHitPoint;
        System.out.println("Name                : " + musuh.name);
        System.out.println("Life Point          : " + musuh.lifePoint + "\n");
    }
    
    public void kick (GameCharacter musuh){
        musuh.lifePoint     = musuh.lifePoint - this.attackKickPoint;
        System.out.println("Name                : " + musuh.name);
        System.out.println("Life Point          : " + musuh.lifePoint + "\n");
    }
    
    public void winnerCheck (GameCharacter musuh) {
        if (this.lifePoint < musuh.lifePoint){
            System.out.println(musuh.name + " WIN");
        }
        else {
            System.out.println(this.name + " WIN");
        }
    }
    
    // Display
    public void display (){
        System.out.println("Name                : " + this.name);
        System.out.println("Life Point          : " + this.lifePoint);
        System.out.println("Attack Hit Point    : " + this.attackHitPoint);
        System.out.println("Attack Kick Point   : " + this.attackKickPoint + "\n");
    }
}