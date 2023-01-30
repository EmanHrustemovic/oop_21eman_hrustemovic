// 5. Add to the class Team the method goals, returns the total number of goals for all the players in the team


public class Team{
    private String player;
    private int number = 0 ;
    
}
public void setPlayer(String player){
    
    this.player=player;
}
public void setNumberOfPlayers(int number){
    this.NumberOfPlayers= NumberOfPlayers;

}

public void Integer addPlayer(Player player){
    if(NumberOfPlayers>16){
        break;
    }
    else{
        Player.add(player);
    }
}
public void Integer goals(){
    int totalGoals = sum(numberOfGoals);
    return totalGoals ; 

}



public class Main {
    public static void main(String[] args) {
    Team barcelona = new Team("FC Barcelona");
        barcelona.setMaxSize(1);
 
        Player brian = new Player("Brian");
        Player pekka = new Player("Pekka", 39);
        barcelona.addPlayer(brian);
        barcelona.addPlayer(pekka);
        barcelona.addPlayer(new Player("Mikael", 1)); // works similarly as the above
 
        System.out.println("Number of players: " + barcelona.size());
    }
}