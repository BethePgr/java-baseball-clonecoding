package baseball.controller;

import baseball.model.Computer;
import baseball.model.Judgement;
import baseball.model.User;
import baseball.view.InputView;
import baseball.view.OutputView;

public class GameController {

    User user;
    Computer computer;
    Judgement judgement;

    public GameController(){
        user = new User();
        computer = new Computer();
        judgement = new Judgement();
    }

    public void gameStart(){
        OutputView.printGameStartMessage();
        initializeGame();
        continueGameUntilThreeStrike();
        OutputView.printGameEndMessage();
        gameRestartOrNot();
    }

    private void continueGameUntilThreeStrike() {
        while(judgement.getStrikeCount() != 3) {
            String expectedNumberOfUser = InputView.getExpectedNumberOfUser();
            user.setUserInputNumber(expectedNumberOfUser);
            if(judgement.isNothing(user,computer)){
                OutputView.printNothing();
            }else{
                OutputView.printBallAndStrike(judgement.getBallCount(), judgement.getStrikeCount());
            }
        }
    }

    private void initializeGame() {
        computer.generateRandomNumber();
        judgement.cntClear();
    }

    private void gameRestartOrNot() {
        String valueOfRestartGameOrNot  = InputView.getValueOfRestartGameOrNot();
        if(valueOfRestartGameOrNot.equals("1")){
            gameStart();
        }
    }
}
