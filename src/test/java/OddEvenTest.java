import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class OddEvenTest {
    final OddEven oddEven = new OddEven();
    //здесь мы проверяем наши методы через тестовый фреймворк
    // Unit testы в TestNg
    //1. Positive testing Happy path
    // if (odd % 2 == 0)
    //return "Even";

    @Test
    public void testOddEvenHappyPath() {
        //AAA
        //arrange
        int odd = 30;
        String expectedResult = "Even";
        //act
        String actualResult = oddEven.OddEven(30);
        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    // odd % 2 != 0
    @Test
    public void testOddNotEvenHappyPath() {
        //AAA
        //arrange
        int odd = 35;
        String expectedResult = "Odd";
        //act
        String actualResult = oddEven.OddEven(35);
        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //2. Negative testing
    // if (odd == 0)
    //return "Zero";

    @Test
    public void testOddEndEvenNotWorkNegativePath() {
        //AAA
        //arrange
        int odd = 0;
        String expectedResult = "Zero";
        //act
        String actualResult = oddEven.OddEven(0);
        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

}


