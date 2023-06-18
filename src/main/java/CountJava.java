public class CountJava {
    //task 5
    //Напишите метод countAs(), который принимает на вход строку и считает, сколько букв а или А содержится в строке.
    // Метод возвращает количество букв a/A,  и количество букв/знаков в слове без букв a/A.
    // Итоговый результат должен строится с помощью метода из видео 2.
    //Test Data:
    //“Abracadabra” → “5, 6”
    //“Homenum Revelio” → “0, 15”
    //“3 tarAmasAlatA” → “6, 8”
    public int countAs(String s5) {
        if (!s5.isEmpty()) {
           // s5 = s5.trim();
            s5 = s5.replace(" ","");
            String check = s5.toLowerCase().replace("a", "");
            int result = s5.length() - check.length();
            System.out.println(result + "," + check.length());
            return result + check.length();
        } else {

            return 0;
        }
    }
    // task 6
    // Напишите метод countJava(), который принимает на вход текст и проверяет,
    // содержится ли в тексте хотя бы одно слово Java.
    public int countJava(String s6){
       int result = s6.indexOf("Java",0);
        System.out.println(s6.indexOf("Java",0)); ////здесь ищем строку Java с индекса 0
        return result;
    }
    // вариант 2
    public boolean countJava2(String s6){
        boolean result = s6.contains("Java"); // содержит ли стринг Java  true or false
        System.out.println(result);
        return result;
    }
    // task 7
    //Напишите метод insertQuotes(), который принимает слово и возвращает строку, в которой это слово
    // “обернуто” в кавычки:
    //Test Data:
    //“Abracadabra” →  ““Abracadabra””
    public String insertQuotes(String s7) {
        if (!s7.isEmpty()) {
            s7 = s7.concat("\"");
            System.out.println(s7);
            String c = "\"";
            s7 = c + s7;
            return s7;
        } else {
            return "Строка пустая";
        }
    }
    public String insertQuotes2(String s7) {
        if (!s7.isEmpty()) {
            String ss7 = "\"0";
            ss7 = ss7.concat("\"");
            s7 = ss7.replace("0",s7);// здесь мы меняем 0 на стринг s7
            System.out.println(s7);
            return s7;
        } else {
            return "Строка пустая";
        }
    }


    public static void main(String[] args) {
        CountJava cv = new CountJava();
        cv.countAs("Abracadabra");
        cv.countAs("Homenum Revelio");
        cv.countAs("3 tarAmasAlatA");

        cv.countJava("As of March 2022, Java 18 is the latest version, while Java 17, " +
                "11 and 8 are the current long-term support (LTS) versions. Oracle released " +
                "the last zero-cost public update for the legacy version Java 8 LTS in January " +
                "2019 for commercial use, although it will otherwise still support Java 8 with" +
                " public updates for personal use indefinitely. Other vendors have begun to offer " +
                "zero-cost builds of OpenJDK 8 and 11 that are still receiving security and other upgrades.");

        cv.countJava2("99 little bugs in a code.\n" +
                "99 little bugs in a code.\n" +
                "Take one down, and patch it around.\n" +
                "235 critical bugs in the code");
        cv.insertQuotes("Abracadabra");
        cv.insertQuotes2("Abracadabra");
    }

}
