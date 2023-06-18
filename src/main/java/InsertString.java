public class InsertString {
    // task 8
    // Напишите метод insertQuotes(), который принимает на вход две строки, и добавляет знак :
    // после слова “писал”,  и оборачивает в кавычки вторую строку
    //(результат строится с помощью метода concat())
    //Test Data:
    //“Федор Достоевский писал”, “Надо любить жизнь больше, чем смысл жизни.” →
    //“Федор Достоевский писал: "Надо любить жизнь больше, чем смысл жизни."”
    //Задание со звездочкой:
    //“Наполеон Бонапарт писал”, “В моем словаре нет слова «невозможно».” →
    //"Наполеон Бонапарт писал: "В моем словаре нет слова "невозможно".""
    public String insertQuotes(String a, String b) {
        if (!a.isEmpty() && !(b.isEmpty())) {
            a = a.concat(":");
            String check = "\"0\"";
            b = b.replace("«", "\"");
            b = b.replace("»", "\"");
            b = check.replace("0", b);
            //check = check.concat(b);
            String result = a.concat(b);
            System.out.println(result);

            return result;
        }
        return "";
    }

    // task 9
    //Напишите метод, кторый принимает на вход название города и исправляет написание:
    //Test Data:
    //“ташкент” → “Ташкент”
    //“ЧикаГО” → “Чикаго”
    public String changeLetter(String s9) {
        if (!s9.isEmpty()) {
            s9 = s9.toLowerCase();
            String check = s9.substring(0, 1).toUpperCase();
            s9 = s9.substring(1);
            s9 = check.concat(s9);
            System.out.println(s9);

            return s9;
        }
        return "";
    }

    //task 10
    //Напишите метод, который принимает на вход строку и букву-параметр, и возвращает все,
    // что находится между первой и последней буквой-параметром:
    //“Abracadabra”, “b” → “bracadab”
    //“Whippersnapper”, “p” → “ppersnapp”
    public String indexLetter(String s10, String a) {
        if (!s10.isEmpty()) {
            s10 = s10.toLowerCase();
            s10 = s10.substring(s10.indexOf(a), s10.lastIndexOf(a) + 1);
            System.out.println(s10);

            return s10;
        }

        return "";
    }

    // task 11
    //Напишите метод, который принимает на вход слово, и возвращает true, если слово начинается
    // и заканчивается на одинаковую букву, и false иначе
    //	“Abracadabra” → true
    //	“Whippersnapper” → false
    public boolean equalsStartAndEnd(String s11) {
        if (!s11.isEmpty()) {
            String a = s11.substring(0, 1);
            String b = s11.substring(s11.length() - 1, s11.length());
            // boolean result = a.equals(b);
            if (a.equals(b)) {
                System.out.println(true);

                return true;
            } else {
                System.out.println(false);

                return false;
            }
        }

        return false;
    }

    // task 12
    //Напишите метод, который принимает на вход строку из двух слов, разделенных пробелом, и возвращает последнее слово
    //Test Data:
    //	“Red Rover” → “Rover”
    public String returnEnd(String s12) {
        return s12.isEmpty() ? "" : s12.split(" ")[1]; //если true то верни первую часть -если false - то верни то что после :
//        if (s12.isEmpty()) return "";
//        String[] c = s12.split(" ");
//        System.out.println(c[1]);
//
//        return c[1];
    }


    public static void main(String[] args) {
        InsertString in = new InsertString();
        in.insertQuotes("Федор Достоевский писал", "Надо любить жизнь больше, чем смысл жизни.");
        in.insertQuotes("Наполеон Бонапарт писал", "В моем словаре нет слова «невозможно».");
        in.insertQuotes("", "");
        in.changeLetter("ташкент");
        in.changeLetter("ЧикаГО");
        in.indexLetter("Abracadabra", "b");
        in.indexLetter("Whippersnapper", "p");
        in.equalsStartAndEnd("Abracadabra");
        in.equalsStartAndEnd("Whippersnapper");
        in.returnEnd("Red Rover");
    }
}
