package baseball.domain;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ComputerNumberTest {

    @Test
    void Random_길이_테스트() throws Exception{
        for(int i = 0;i<10;i++){
            List<Integer> result = ComputerNumber.createRandomNumber();
            System.out.println(result);
            assertEquals(3,result.size());
        }

    }

}