package baseball.model;

import java.util.List;

public class Judgement {

    private int strikeCount;
    private int ballCount;

    public Judgement(){
        strikeCount = 0;
        ballCount = 0;
    }

    public void judgeStrike(User user, Computer computer){
        strikeCount = 0;
        List<Integer> userNumber = user.getUserInputNumber();
        List<Integer> computerNumber = computer.getRandomNumber();

        for(int i = 0;i<3;i++){
            if(userNumber.get(i) == computerNumber.get(i)){
                strikeCount++;
            }
        }
    }
}
