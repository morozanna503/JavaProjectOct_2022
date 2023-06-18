import org.testng.Assert;
import org.testng.annotations.Test;

public class InsertStringTest {
    // task 8
    //“Федор Достоевский писал”, “Надо любить жизнь больше, чем смысл жизни.” →
    //“Федор Достоевский писал: "Надо любить жизнь больше, чем смысл жизни."”
    //“Наполеон Бонапарт писал”, “В моем словаре нет слова «невозможно».” →
    //"Наполеон Бонапарт писал: "В моем словаре нет слова "невозможно".""

    final InsertString quotes = new InsertString();
    //1. Positive testing Happy path

    //a / b  добавляет :  и " "  1 тест
    @Test
    public void testInsertQuotesHappyPath() {
        //AAA
        //arrange
        String a = "Федор Достоевский писал";
        String b = "Надо любить жизнь больше, чем смысл жизни.";
        String expectedResult = "Федор Достоевский писал:\"Надо любить жизнь больше, чем смысл жизни.\"";
        //act
        String actualResult = quotes.insertQuotes(a, b);
        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    // a / b  добавляет :  и " " и меняет « » -> " " 2 тест
    @Test
    public void testInsertQuotesTwoHappyPath() {
        //AAA
        //arrange
        String a = "Наполеон Бонапарт писал";
        String b = "В моем словаре нет слова «невозможно».";
        String expectedResult = "Наполеон Бонапарт писал:\"В моем словаре нет слова \"невозможно\".\"";
        //act
        String actualResult = quotes.insertQuotes(a, b);
        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    // if (a/b = "")->"" test 3
    @Test
    public void testEmptyAButNotEmptyBHappyPath() {
        //AAA
        //arrange
        String a = "";
        String b = "";
        String expectedResult = "";
        //act
        String actualResult = quotes.insertQuotes(a, b);
        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //2. Negative testing
    // if (a = " ", b = " ")->" "


    @Test
    public void testEmptyStringNegativePath() {
        //AAA
        //arrange
        String a = ""; // здесь мы не можем передать null
        String b = ""; // здесь мы не можем передать null
        String expectedResult = "";
        //act
        String actualResult = quotes.insertQuotes(a, b);
        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    // task 9
    //Напишите метод, кторый принимает на вход название города и исправляет написание:
    //“ташкент” → “Ташкент”
    //“ЧикаГО” → “Чикаго”/
    final InsertString changeLatter = new InsertString();
    //1. Positive testing Happy path

    //s9  пишет первую букву заглавной  1 тест
    @Test
    public void testChangeLetterHappyPath() {
        //AAA
        //arrange
        String a = "ЧикаГО";
        String expectedResult = "Чикаго";
        //act
        String actualResult = changeLatter.changeLetter(a);
        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    // s9  пишет первую букву заглавной  2 тест
    @Test
    public void testIChangeLetterTwoHappyPath() {
        //AAA
        //arrange
        String a = "ташкент";
        String expectedResult = "Ташкент";
        //act
        String actualResult = changeLatter.changeLetter(a);
        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //2. Negative testing
    // if (a = " ",)->" "

    @Test
    public void testEmptyStringAndLetterNegativePath() {
        //AAA
        //arrange
        String a = ""; // здесь мы не можем передать null
        String expectedResult = "";
        //act
        String actualResult = changeLatter.changeLetter(a);
        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    // task 10
    //Напишите метод, который принимает на вход строку и букву-параметр, и возвращает все,
    // что находится между первой и последней буквой-параметром:
    //“Abracadabra”, “b” → “bracadab”
    //“Whippersnapper”, “p” → “ppersnapp”
    final InsertString indexLatter = new InsertString();
    //1. Positive testing Happy path

    //s10  обрезает стринг от 1 а до последнего а  1 тест
    @Test
    public void testIndexLetterHappyPath() {
        //AAA
        //arrange
        String s10 = "Abracadabra";
        String a = "b";
        String expectedResult = "bracadab";
        //act
        String actualResult = indexLatter.indexLetter(s10,a);
        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    // s10  обрезает стринг от 1 а до последнего а 2 тест
    @Test
    public void testIndexLetterTwoHappyPath() {
        //AAA
        //arrange
        String s10 = "Whippersnapper";
        String a = "p";
        String expectedResult = "ppersnapp";
        //act
        String actualResult = indexLatter.indexLetter(s10,a);
        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //2. Negative testing
    // if (s10 = " ",)->" "

    @Test
    public void testEmptyStringAndIndexNegativePath() {
        //AAA
        //arrange
        String s10 = "";
        String  a = "";  // здесь мы не можем передать null
        String expectedResult = "";
        //act
        String actualResult = indexLatter.indexLetter(s10,a);
        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    // task 11
    //Напишите метод, который принимает на вход слово, и возвращает true, если слово начинается
       // и заканчивается на одинаковую букву, и false иначе
       //	“Abracadabra” → true
       //	“Whippersnapper” → false
    final InsertString equalsLetter = new InsertString();
    //1. Positive testing Happy path

    //s11  сравнивает первый символ с последним  1 тест
    @Test
    public void testEqualsLetterHappyPath() {
        //AAA
        //arrange
        String s11 = "Abracadabra";
        boolean expectedResult = false;
        //act
        boolean actualResult = equalsLetter.equalsStartAndEnd(s11);
        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    // s11 сравнивает первый символ с последним  2 тест
    @Test
    public void testEuqualstterTwoHappyPath() {
        //AAA
        //arrange
        String s11 = "Whippersnapper";
        boolean expectedResult = false;
        //act
        boolean actualResult = equalsLetter.equalsStartAndEnd(s11);
        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //2. Negative testing
    // if (s11 = " ",)->false

    @Test
    public void testEmptyStringEqualsNegativePath() {
        //AAA
        //arrange
        String s11 = "";  // здесь мы не можем передать null
        boolean expectedResult = false;
        //act
        boolean actualResult = equalsLetter.equalsStartAndEnd(s11);
        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }


}
