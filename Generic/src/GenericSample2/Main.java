package GenericSample2;

public class Main {
    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer  pat = new BaseballPlayer("Pat");
        SoccerPlayer hgai = new SoccerPlayer("Hgai");

        Team<SoccerPlayer> chelsea  = new Team<>("Chelsea");
        chelsea.addPlayer(hgai);
        System.out.println(chelsea.numPlayer());

        Team<FootballPlayer> cowboy  = new Team<>("Dallas Cowboy");
        cowboy.addPlayer(joe);

        Team<BaseballPlayer> yankee  = new Team<>("NY Yankee");
        yankee.addPlayer(pat);

        // initiate opponents
        Team<SoccerPlayer> mu = new Team<>("Manchester United");
        Team<SoccerPlayer> liverpool = new Team<>("Liverpool");

        chelsea.matchResult(mu, 4, 1);
        chelsea.matchResult(liverpool, 3, 2);

        System.out.println("chelsea points: " + chelsea.ranking());

        //Team<String> notATeam = new Team<>("not a team");

    }

}
