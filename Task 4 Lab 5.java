// 4. Add to the class Team the methods setMaxSize(int maxSize), sets the maximum number of players that the team can have size,
// returns the number of players on the team
//By default, the maximum number of players should be set to 16, and that can be changed with the method setMaxSize.
//Change the method addPlayer so that it does not add players to the team if the team already has the maximum number of players.

public class Team{
    private String player;
    private int number = 0 ;
    private int maxSize=16;
    
}
public void setPlayer(String player){
    
    this.player=player;
}
public void setNumberOfPlayers(int number){
    this.NumberOfPlayers= NumberOfPlayers;

}
public void setMaxSize(int maxSize){
    this.maxSize= new maxSize;
  
}
public int size(){
    return this.players.size();

}

public void Integer addPlayer(Player player){
    if(maxSize>16){
        break;
    }
    else{
        Player.add(player);
    }
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
