import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;


public class FizzBuzzTest {
final FizzBuzz fizzBuzz = new FizzBuzz();
    //здесь мы проверяем наши методы через тестовый фреймворк
    // Unit testы в TestNg
    //1. Positive testing Happy path
    // if (start <= end)
    //return array;

    //start < end 1 тест
    @Test
    public void testStartLessThanEndHappyPath() {
        //AAA
        //arrange
        int start = 1;
        int end = 20;
        String[] expectedResult = {"1", "2", "Fizz", "4", "Buzz", "Fizz",
                "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz"};
        //act
        // FizzBuzz fizzBuzz = new FizzBuzz();
        String[] actualResult = fizzBuzz.fizzBuzz(start, end);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    // start == end - 2 тест
    @Test
    public void testStartEqualsEndHappyPath() {
        //AAA
        //arrange
        int start = 1;
        int end = 1;
        String[] expectedResult = {"1"};
        //act
        String[] actualResult = fizzBuzz.fizzBuzz(start, end);
        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    // start < end - 3 тест

    @Test
    public void testStartLessThanEndStartEndAreNegativeHappyPath() {
        //AAA
        //arrange
        int start = -20;
        int end = -1;
        String[] expectedResult = {"Buzz", "-19", "Fizz", "-17", "-16", "FizzBuzz", "-14", "-13", "Fizz",
                "-11", "Buzz", "Fizz", "-8", "-7", "Fizz", "Buzz", "-4", "Fizz", "-2", "-1"};
        //act
        String[] actualResult = fizzBuzz.fizzBuzz(start, end);
        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //2. Negative testing
    // if (start > end)
    //return new String[0];

    @Test
    public void testStartGreaterThanEndNegativePath() {
        //AAA
        //arrange
        int start = 20;
        int end = 1;
        String[] expectedResult = {};
        //act
        String[] actualResult = fizzBuzz.fizzBuzz(start, end);
        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

}
