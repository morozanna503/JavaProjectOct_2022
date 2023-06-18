import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateArrayTest {

        final CreateArray createArr = new CreateArray();
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
            String number = "3 4 1 8 10 12.3";
            int[] expectedResult = {3,4,1,8,10,12};
            //act
            int[] actualResult = createArr.createIntArrayFromText(number);

            //Assert
            Assert.assertEquals(actualResult, expectedResult);
        }

        // number == 0- 2 тест
        @Test
        public void testStartEqualsEndHappyPath() {
            //AAA
            //arrange
            String number = "0";
            int[] expectedResult = {0};
            //act
            int[] actualResult = createArr.createIntArrayFromText(number);
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
            String number = "333";
            int[] expectedResult = {333};
            //act
            int[] actualResult = createArr.createIntArrayFromText(number);
            //Assert
            Assert.assertEquals(actualResult, expectedResult);
        }

    }


