import org.testng.Assert;
import org.testng.annotations.Test;
import project_utils.*;

public class OddIndicesTest {
    final OddIndices oddIndices = new OddIndices();
    //здесь мы проверяем наши методы через тестовый фреймворк
    // Unit testы в TestNg
    //1. Positive testing Happy path
    // if (start <= end)
    //return array;

    //start < end 1 тест
    @Test
    public void testOddIndicesNotZeroHappyPath() {
        //AAA
        //arrange
        int[] emptyArray = {};
        int[] oneNumberArray = {1};

        int[] actualResult = oddIndices.oddIndices(emptyArray);
        Assert.assertEquals(actualResult, emptyArray);

        int[] actualResultTwo = oddIndices.oddIndices(oneNumberArray);
        Assert.assertEquals(actualResultTwo, emptyArray);
    }

    // start == end - 2 тест
    @Test
    public void testStartEqualsEndHappyPath() {
        //AAA
        //arrange
        int[] oddInd = {1, 4, 55, 90, 0, 45, 60};

        int[] expectedResult = {};
        //act
        int[] actualResult = oddIndices.oddIndices(oddInd);
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
        int[] oddInd = {1, 4, 55, 90, 0, 45, 60};

        int[] expectedResult = {};
        //act
        int[] actualResult = oddIndices.oddIndices(oddInd);
        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

}


