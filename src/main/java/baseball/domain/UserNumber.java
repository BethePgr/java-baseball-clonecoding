package baseball.domain;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UserNumber {

    private static final int NUMBER_LENGTH = 3;
    public final List<Integer> userNumber;

    public UserNumber(String userInput) {
        this.userNumber = createUserNumber(userInput);
    }

    private List<Integer> createUserNumber(String str) throws IllegalArgumentException {
        int[] userNumber = convertStringToInt(str);
        if (checkValidNumber(userNumber)) {
            return Arrays.stream(userNumber).boxed().collect(Collectors.toList());
        }
        throw new IllegalArgumentException();
    }

    private boolean checkValidNumber(int[] userNums) {
        return isRightRange(userNums) && isNumber(userNums) && isNotDuplicate(userNums);
    }

    private boolean isNumber(int[] userNums) {
        return Arrays.stream(userNums).allMatch(num -> num >= 1 && num <= 9);
    }

    private boolean isNotDuplicate(int[] userNums) {
        return Arrays.stream(userNums).distinct().count() == NUMBER_LENGTH;
    }

    private boolean isRightRange(int[] userNums) {
        return userNums.length == NUMBER_LENGTH;
    }

    private int[] convertStringToInt(String str) {
        return str.chars().map(num -> num - '0').toArray();
    }

}
