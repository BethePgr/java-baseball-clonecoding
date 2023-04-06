package baseball.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    private static String INPUT_STRING_MESSAGE = "숫자를 입력해주세요 : ";

    public static String printInputNumberMessage(){
        System.out.println(INPUT_STRING_MESSAGE);
        return Console.readLine();
    }
}
