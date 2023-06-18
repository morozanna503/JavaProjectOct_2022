import org.testng.Assert;
import org.testng.annotations.Test;

public class BiggerValueTest {
    final BiggerValue biggerValue = new BiggerValue();
    //здесь мы проверяем наши методы через тестовый фреймворк
    // Unit testы в TestNg
    //1. Positive testing Happy path
    // if (a > b)
    //return a;

    //a > b 1 тест
    @Test
    public void testABiggerThanBHappyPath() {
        //AAA
        //arrange
        int a = 33333;
        int b = 99999;

        int expectedResult = 99999;
        //act
        int actualResult = biggerValue.BiggerValue(a,b);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }
    //a < b 2 тест
    @Test
    public void testHappyPath() {
        //AAA
        //arrange
        int a = 80;
        int b = 99999;

        int expectedResult = 99999;
        //act
        int actualResult = biggerValue.BiggerValue(a,b);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }



    // a == b - 3 тест

    //2. Negative testing
    // if (a == b)
    //return a ;

    @Test
    public void testStartGreaterThanEndNegativePath() {
        //AAA
        //arrange
        int a = 333;
        int b = 333;

        int expectedResult = 333;
        //act
        int actualResult = biggerValue.BiggerValue(a,b);
        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

}


