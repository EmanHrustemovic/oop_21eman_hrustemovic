// 3. Add to the class Team the following methods:
//addPlayer, adds a player to the team
//printPlayers, prints the players in the team
//You should store the players in an instance variable of the type ArrayList<Player> within the class Team.

public class Team{
 
    ArrayList<String> players = new ArrayList<String>();
    public Team(){}

}













public class Main {
    public static void main(String[] args) {
    Team barcelona = new Team("FC Barcelona");
 
        Player brian = new Player("Brian");
        Player pekka = new Player("Pekka", 39);
 
        barcelona.addPlayer(brian);
        barcelona.addPlayer(pekka);
        barcelona.addPlayer(new Player("Mikael", 1)); // works similarly as the above
 
        barcelona.printPlayers();
    }
}
