import org.testng.Assert;
import org.testng.annotations.Test;

public class CountJavaTest {
    // task 5
    //Test Data:
    //“Abracadabra” → “5, 6”
    //“Homenum Revelio” → “0, 15”
    //“3 tarAmasAlatA” → “6, 8”
    final CountJava countA = new CountJava();
    //1. Positive testing Happy path

    //s5 считает все 'а'/А 1 тест
    @Test
    public void testCheckAsHappyPath() {
        //AAA
        //arrange
        String s5 = "Abracadabra";
        int expectedResult = 5 + 6;
        //act
        int actualResult = countA.countAs(s5);
        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    // s5  считает все а/А 2 тест
    @Test
    public void testCheckAsTwoHappyPath() {
        //AAA
        //arrange
        String s5 = "Homenum Revelio";
        int expectedResult = 0 + 14;
        //act
        int actualResult = countA.countAs(s5);
        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }
    // if (s5 = "")->"0
    @Test
    public void testNotEmptyHappyPath() {
        //AAA
        //arrange
        String s5 = "";
        int expectedResult = 0;
        //act
        int actualResult = countA.countAs(s5);
        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //2. Negative testing
    // if (s = null)->"0


    @Test
    public void testSCheckNullNegativePath() {
        //AAA
        //arrange
        String s5 = ""; // здесь мы не можем передать null
        int expectedResult = 0;
        //act
        int actualResult = countA.countAs(s5);
        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    // task 6
    //Test Data:
    //As of March 2022, Java 18 is the latest version, while Java 17, 11 and 8 are the current long-term support (LTS)
    // versions. Oracle released the last zero-cost public update for the legacy version Java 8 LTS in January 2019
    // for commercial use, although it will otherwise still support Java 8 with public updates for personal use
    // indefinitely. Other vendors have begun to offer zero-cost builds of OpenJDK 8 and 11 that are still receiving
    // security and other upgrades.->true
    //“99 little bugs in a code.
    //99 little bugs in a code.
    //Take one down, and patch it around.
    //235 critical bugs in the code.” → false
    final CountJava countJV = new CountJava();
    //1. Positive testing Happy path

    //s6 find все Java 1 тест
    @Test
    public void testCheckJavaHappyPath() {
        //AAA
        //arrange
        String s6 = "99 little bugs in a code.\n" +
                "99 little bugs in a code.\n" +
                "Take one down, and patch it around.\n" +
                "235 critical bugs in the code.";
        boolean expectedResult = false;
        //act
        boolean actualResult = countJV.countJava2(s6);
        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    // s6  find все Java 2 тест
    @Test
    public void testCheckJavaTwoHappyPath() {
        //AAA
        //arrange
        String s6 = "As of March 2022, Java 18 is the latest version, while Java 17, 11 and 8 are the current " +
                "long-term support (LTS) versions. Oracle released the last zero-cost public update for the " +
                "legacy version Java 8 LTS in January 2019 for commercial use, although it will otherwise still" +
                " support Java 8 with public updates for personal use indefinitely. Other vendors have begun " +
                "to offer zero-cost builds of OpenJDK 8 and 11 that are still receiving security and other upgrades.";
        boolean expectedResult = true;
        //act
        boolean actualResult = countJV.countJava2(s6);
        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }
    // if (s6 = "")->"0
    @Test
    public void testEmptyHappyPath() {
        //AAA
        //arrange
        String s6 = "";
        boolean expectedResult = false;
        //act
        boolean actualResult = countJV.countJava2(s6);
        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //2. Negative testing
    // if (s6 = null)->"0


    @Test
    public void testNullNegativePath() {
        //AAA
        //arrange
        String s6 = ""; // здесь мы не можем передать null
        boolean expectedResult = false;
        //act
        boolean actualResult = countJV.countJava2(s6);
        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

}
