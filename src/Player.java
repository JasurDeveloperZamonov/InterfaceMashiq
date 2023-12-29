public class Player implements Information{

   private String nameOfPlayer;
   private String sportType;
   private int numberPosition;

    private String teamName;

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamName() {
        return teamName;
    }

    public String getNameOfPlayer() {
        return nameOfPlayer;
    }

    public void setNameOfPlayer(String nameOfPlayer) {
        this.nameOfPlayer = nameOfPlayer;
    }

    public String getSportType() {
        return sportType;
    }

    public void setSportType(String sportType) {
        this.sportType = sportType;
    }

    public int getNumberPosition() {
        return numberPosition;
    }

    public void setNumberPosition(int numberPosition) {
        this.numberPosition = numberPosition;
    }



    @Override
    public void getInfo() {
        GoalKeeper g=new GoalKeeper();
        g.setCountOfSeyf(10);
    g.setCountOfGoals(0);
    g.setCountOfRedCard(1);
    g.setCountOfYellowCard(3);
    g.setSportType("Football");
    g.setNameOfPlayer("Casilas");
        System.out.println(g.getNameOfPlayer());
        System.out.println(g.getSportType());
        System.out.println(g.getCountOfRedCard());
        System.out.println(g.getCountOfYellowCard());
        System.out.println(g.getCountOfGoals());
        System.out.println(g.getCountOfSeyf());
    }

    @Override
    public void getTeam_Name() {
        FootballPlayer f=new FootballPlayer();
        f.setTeamName("Real Madrid");
        System.out.println(f.getTeamName());
    }
}
