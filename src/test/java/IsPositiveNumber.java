import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;


public class IsPositiveNumber {
    final IsPositiveNumber isPositiveObject = new IsPositiveNumber();
    //здесь мы проверяем наши методы через тестовый фреймворк
    // Unit testы в TestNg
    //1. Positive testing Happy path
    // if (a > b)
    //return a;
    @Ignore
    //a = 555 1 тест
    @Test
    public void testIsPositiveNumberIsTrueHappyPath() {
        //AAA
        //arrange
        int a = 555;
        boolean expectedResult = true;
        //act
      //  boolean actualResult = isPositiveObject;
        //Assert
        //Assert.assertEquals(actualResult, expectedResult);
    }
@Ignore
    //a = 0 2 тест
    @Test
    public void testIsPositiveNumberIsZeroHappyPath() {
        //AAA
        //arrange
        int a = 0;
        boolean expectedResult = true;
        //act
      // boolean actualResult = isPositiveNumber.IsPositiveNumber(a);
        //Assert
       // Assert.assertEquals(actualResult, expectedResult);
    }


    // a = -555 - 3 тест
    //2. Negative testing
@Ignore
    @Test
    public void testSIsPositiveNumberIsMinusNegativePath() {
        //AAA
        //arrange
        int a = -555;
        boolean expectedResult = false;
        //act
      //  boolean actualResult = isPositiveNumber.IsPositiveNumber(a);
        //Assert
      //  Assert.assertEquals(actualResult, expectedResult);
    }
}
