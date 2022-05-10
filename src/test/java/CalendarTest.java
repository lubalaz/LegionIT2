
import org.junit.jupiter.api.*;

import org.junit.jupiter.api. Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


import java.util.concurrent.Callable;

public class CalendarTest {

    @Test
    @DisplayName("NullPointer Exception test")
    public void errorTest() {
        Calendar calendar = new Calendar();
        Assertions.assertThrows(NullPointerException.class, () -> {
            Calendar.getDay(null);
        });


    }

    @ParameterizedTest
    @ValueSource(ints = {0})
    public void LargerThan0Test(int a) {

        Calendar calendar = new Calendar();
        String actualResult = calendar.getDay(a);
        System.out.println(actualResult);
        Assertions.assertNotNull(actualResult);
        Assertions.assertTrue(actualResult.length() > 0);


    }


    @ParameterizedTest
    @ValueSource(ints = {8})
    public void SmallThan7Test(int a) {

        Calendar calendar = new Calendar();
        String actualResult = calendar.getDay(a);
        System.out.println(actualResult);
        Assertions.assertNotNull(actualResult);
        Assertions.assertTrue(actualResult.length() > 0);
    }

    @ParameterizedTest
    @ValueSource(ints = {1,2,3,4,5,6,7})
    public void negativeParamsTest(int a) {

        Calendar calendar = new Calendar();
        String actualResult = calendar.getDay(a);
        System.out.println(actualResult);
        Assertions.assertNotNull(actualResult);
        Assertions.assertTrue(actualResult.length() > 0);
    }
}





