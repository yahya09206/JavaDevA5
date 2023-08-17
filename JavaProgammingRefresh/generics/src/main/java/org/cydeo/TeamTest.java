package org.cydeo;

public class TeamTest {
    public static void main(String[] args) {

        FootballPlayer player = new FootballPlayer("Joe");
        BaseballPlayer baseballPlayer = new BaseballPlayer("Judge");
        SoccerPlayer soccerPlayer = new SoccerPlayer("Messi");

        Team<SoccerPlayer> liverpool = new Team<>("Liverpool");
        Team<String> brokenTeam = new Team<>("this wont work");

//        liverpool.addPlayer(player);
//        liverpool.addPlayer(baseballPlayer);
        liverpool.addPlayer(soccerPlayer);

        System.out.println(liverpool.numPlayers());



    }
}
