package baseball.domain;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Test;

class GameResultTest {

    @Test
    void 결과_0스_2볼() throws Exception {
        //given
        List<Integer> list1 = List.of(3,1,2);
        List<Integer> list2 = List.of(4,3,1);
        //when
        GameResult result = new GameResult(list1, list2);
        //then
        assertEquals(2,result.ballCount);
        assertEquals(0,result.strikeCount);
    }

    @Test
    void 결과_0스_3볼() throws Exception {
        //given
        List<Integer> list1 = List.of(3,1,2);
        List<Integer> list2 = List.of(2,3,1);
        //when
        GameResult result = new GameResult(list1, list2);
        //then
        assertEquals(3,result.ballCount);
        assertEquals(0,result.strikeCount);
    }

    @Test
    void 결과_1스_2볼() throws Exception {
        //given
        List<Integer> list1 = List.of(3,1,2);
        List<Integer> list2 = List.of(1,3,2);
        //when
        GameResult result = new GameResult(list1, list2);
        //then
        assertEquals(2,result.ballCount);
        assertEquals(1,result.strikeCount);
    }

    @Test
    void 결과_3스_0볼() throws Exception {
        //given
        List<Integer> list1 = List.of(3,1,2);
        List<Integer> list2 = List.of(3,1,2);
        //when
        GameResult result = new GameResult(list1, list2);
        //then
        assertEquals(0,result.ballCount);
        assertEquals(3,result.strikeCount);
    }

}