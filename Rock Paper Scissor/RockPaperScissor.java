import java.util.*;
public class RockPaperScissor {
    private static final String[] computerChoices ={"Rock",  "Paper", "Scissor"};
    //store the comouter choice so that we csn retrieve the value and display it to the frontend
    public String getComputerChoice(){
        return computerChoice;
    }
    public int getComputerScore(){
        return computerScore;
    }
    public int getPlayerScore(){
        return playerScore;
    }
    
    private String computerChoice;

    // store the scores so that we can retreive the values and display it to the frontend
    private int computerScore, playerScore;

    private Random random;

    public RockPaperScissor(){
        random= new Random();
    }
    //call this method to beign playing rock paper scissor
    //playerchoice = its the choice made by the player.
    //this method will return the result of the game
    public String playRockPaperScissor(String playerChoice){
        // generate computer choice
        computerChoice= computerChoices[random.nextInt(computerChoices.length)];
        
        //will contain the returning message indicating the result of the game
        String result;

        //evaluate the winner
        if(computerChoice.equals("Rock")){
            if(playerChoice.equals("Paper")){
                result = "Player Wins";
                playerScore++;
            }
            else if(playerChoice.equals("Scissors")){
                result= "Computer Wins";
                computerScore++;
            }
            else{
                result ="Draw";
            }
        }else if(computerChoice.equals("Paper")){
            if(playerChoice.equals("Scissors")){
                result = "Player Wins";
                playerScore++;
            }
            else if(playerChoice.equals("Rock")){
                result= "Computer Wins";
                computerScore++;
            }
            else{
                result ="Draw";
            }
        } else{
            if(playerChoice.equals("Rock")){
                result = "Player Wins";
                playerScore++;
            }
            else if(playerChoice.equals("Paper")){
                result= "Computer Wins";
                computerScore++;
            }
            else{
                result ="Draw";
            }
        }

        return result;
    }
}
