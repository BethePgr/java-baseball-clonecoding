package baseball.domain;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ComputerNumber {

    private static final int NUMBER_LENGTH = 3;
    private static final int START_RANGE = 1;
    private static final int END_LENGTH = 9;

    public static List<Integer> createRandomNumber(){
        List<Integer> randomNumbers = pickRandomNumber();
        if(isDuplicate(randomNumbers)){
            return randomNumbers;
        }
        return createRandomNumber();
    }

    private static List<Integer> pickRandomNumber(){
        return Arrays.stream(new List[NUMBER_LENGTH])
            .map(num -> Randoms.pickNumberInRange(START_RANGE,END_LENGTH)).collect(Collectors.toList());
    }

    private static boolean isDuplicate(List<Integer> randomNums){
        return NUMBER_LENGTH == randomNums.stream().distinct().count();
    }

}
