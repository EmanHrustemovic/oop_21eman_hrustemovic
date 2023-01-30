// 2. Create a class Player with the instance variables for the player name and the number of goals. 
// A player should have two constructors: one that initializes the name and another that initializes the name and the number of goals. 
// Implement also the following methods:
//getName, returns the player's name
//getGoals, returns the number of goals
// toString, returns a string representation that is formed as in the example below


public class Player{
    private String name ;
    private int numberOfGoals;
    public Player(String name){}
    public Player(String name ,int numberOfGoals ){}

public void setName(String name){
    this.name=name;
}
public void setNumberOfGoals(int numberOfGoals){
    this.numberOfGoals=numberOfGoals;
}

public String getName(){
    return this.name;
}

public Integer getNumberOfGoals(){
    return this.numberOfGoals;
}

}

public class Main {
    public static void main(String[] args) {
    Team barcelona = new Team("FC Barcelona");
    System.out.println("Team: " + barcelona.getName());
 
        Player brian = new Player("Brian");
        System.out.println("Player: " + brian);
 
        Player pekka = new Player("Pekka", 39);
        System.out.println("Player: " + pekka);
    }
}
