import org.testng.Assert;
import org.testng.annotations.Test;

public class StringMethodsTest {
    // task 1 tests
    final StringMethods stringRed = new StringMethods();
    //здесь мы проверяем наши методы через тестовый фреймворк
    // Unit testы в TestNg
    //1. Positive testing Happy path
    // if (s.length() != check.length())
    //return "Лишние пробелы удалены";

    //s содержит пробелы 1 тест
    @Test
    public void testContainSpacesHappyPath() {
        //AAA
        //arrange
        String s = "   Red Rover School   ";
        String expectedResult = "Лишние пробелы удалены";
        //act
        String actualResult = stringRed.removeSpaces(s);
        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    // s  не содержит пробелы 2 тест
    @Test
    public void testNotContainSpacesHappyPath() {
        //AAA
        //arrange
        String s = "Red Rover School";
        String expectedResult = "Пробелов не было";
        //act
        String actualResult = stringRed.removeSpaces(s);
        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testEmptyStringHappyPath() {
        //AAA
        //arrange
        String s = "";
        String expectedResult = "Строка пустая";
        //act
        String actualResult = stringRed.removeSpaces(s);
        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //2. Negative testing
    // if (s = "")
    //return "Строка пустая"

    @Test
    public void testSContainNullNegativePath() {
        //AAA
        //arrange
        String s = ""; // здесь нельзя сделать проверку на null
        String expectedResult = "Строка пустая";
        //act
        String actualResult = stringRed.removeSpaces(s);
        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    // task 2
    final StringMethods removeAll = new StringMethods();
    //здесь мы проверяем наши методы через тестовый фреймворк
    // Unit testы в TestNg
    //1. Positive testing Happy path
    // s2.trim();
    //return "Red Rover School";

    //s2 удаляет все 'а' 1 тест
    @Test
    public void testCancelAllAsHappyPath() {
        //AAA
        //arrange
        String s2 = "   Red Rover School   ";
        String expectedResult = "Red Rover School";
        //act
        String actualResult = removeAll.removeAllAs(s2);
        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    // s2  удаляет пробелы 2 тест
    @Test
    public void testCancelAllAsTwoHappyPath() {
        //AAA
        //arrange
        String s2 = "panda   ";  // or “taramasalata” → “trmslt”
        String expectedResult = "pnd";
        //act
        String actualResult = removeAll.removeAllAs(s2);
        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }
    // if (s = "")->"Строка пустая"
    @Test
    public void testNotEmptyHappyPath() {
        //AAA
        //arrange
        String s2 = "";
        String expectedResult = "Строка пустая";
        //act
        String actualResult = removeAll.removeAllAs(s2);
        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //2. Negative testing
    // if (s = null)->"Строка пустая"


    @Test
    public void testSCheckNullNegativePath() {
        //AAA
        //arrange
        String s = null;
        String expectedResult = "Строка пустая";
        //act
        String actualResult = removeAll.removeAllAs("");
        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    // task 3
    final StringMethods removeZero = new StringMethods();
    //здесь мы проверяем наши методы через тестовый фреймворк
    // Unit testы в TestNg
    //1. Positive testing Happy path

    //s3 удаляет все 0 1 тест
    @Test
    public void testCancelAllZeroHappyPath() {
        //AAA
        //arrange
        String s3 = "3504209706040000 ";
        String expectedResult = "35429764";
        //act
        String actualResult = removeZero.removeAllZeros(s3);
        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    // s3  убирает все 0 - 2 тест
    @Test
    public void testCancelZeroTwoHappyPath() {
        //AAA
        //arrange
        String s3 = "0000000111";
        String expectedResult = "111";
        //act
        String actualResult = removeZero.removeAllZeros(s3);
        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    // if (!s3.contains("0") -> "This is a valid string"
    @Test
    public void testNotContainZeroHappyPath() {
        //AAA
        //arrange
        String s3 = "";
        String expectedResult = "This is a valid string";
        //act
        String actualResult = removeZero.removeAllZeros(s3);
        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //2. Negative testing
   //// if(s3.isEmpty())-> "This is a valid string"

    @Test
    public void testSCheckEmptyNegativePath() {
        //AAA
        //arrange
        String s3 = "";    // здесь нельзя проверить на null
        String expectedResult = "This is a valid string";
        //act
        String actualResult = removeZero.removeAllZeros(s3);
        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    // task 4
    final StringMethods removeSpaces = new StringMethods();
    //здесь мы проверяем наши методы через тестовый фреймворк
    // Unit testы в TestNg
    //1. Positive testing Happy path

    //s4 удаляет все пробелы 1 тест
    @Test
    public void testCancelSpacesHappyPath() {
        //AAA
        //arrange
        String s4 = "    R e d     Ro ve    r Sc   h ool   ";
        String expectedResult = "RedRoverSchool";
        //act
        String actualResult = removeSpaces.removeAllSpaces(s4);
        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    // s4  убирает все пробелы - 2 тест
    @Test
    public void testCancelSpacesTwoHappyPath() {
        //AAA
        //arrange
        String s4 = "p a     n   d a   ";
        String expectedResult = "panda";
        //act
        String actualResult = removeSpaces.removeAllSpaces(s4);
        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //2. Negative testing
    // if(s4.isEmpty())-> ""

    @Test
    public void testSCheckEmptyRemoveSpacesNegativePath() {
        //AAA
        //arrange
        String s4 = "";    // здесь нельзя проверить на null
        String expectedResult = "";
        //act
        String actualResult = removeSpaces.removeAllSpaces(s4);
        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }





}


