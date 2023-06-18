import org.testng.Assert;
import org.testng.annotations.Test;

public class SumArrayTest {

    final SumArray sumArray = new SumArray();
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
        int[] arr = {0, 1, 2, 3, 4, 5};

        int expectedResult = 15;
        //act
        int actualResult = sumArray.SumArray(arr);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    // start == end - 2 тест
    @Test
    public void testStartEqualsEndHappyPath() {
        //AAA
        //arrange
        int[] arr = {0, 1, 2, 3, 4, 5};
        int expectedResult = 15;
        //act
        int actualResult = sumArray.SumArray(arr);
        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    // start < end - 3 тест

    //2. Negative testing
    // if (start > end)
    //return new String[0];

    @Test
    public void testStartGreaterThanEndNegativePath() {
        //AAA
        //arrange
        int[] arr = {0, 1, 2, 3, 4, 5};
        int expectedResult = 15;
        //act
        int actualResult = sumArray.SumArray(arr);
        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testSumArray() {
        int[] arr2 = {2, 4, 6};
        int expectedResult = 12;
        int actualResult = sumArray.SumArray(arr2);

        Assert.assertEquals(actualResult, expectedResult);
    }
}


