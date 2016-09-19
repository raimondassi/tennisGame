/**
 * Created by ozc on 2016.09.15.
 */
public class TennisGame {

    private Player player1;
    private Player player2;

    public TennisGame(String firstPlayerName, String secondPlayerName) {
        player1=new Player(firstPlayerName);
        player2=new Player(secondPlayerName);
    }


    public boolean isgameOver(){
         return (isFourPointsScored() && (getPointsDifference() >= 2));
     }

    public boolean isGameOn() {return !isgameOver();}

    private boolean isFourPointsScored() {return (player1.scores>=4 || player2.scores>=4);
    }

    private int getPointsDifference() {
        return 0;
    }



}
