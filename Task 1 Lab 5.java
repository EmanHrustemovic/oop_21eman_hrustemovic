//  1. Implement a class Team. At this stage team has only a name (String) and the following functionality:
// a constructor that sets the team name
// getName, which returns the name


public class Team{
    private String name;

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
}

public class Main {
    public static void main(String[] args) {
    Team barcelona = new Team("FC Barcelona");
    System.out.println("Team: " + barcelona.getName());
    }
}


