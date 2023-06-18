public class StringMethods {
    // String s3 = " ";
    //  System.out.println(s3.isEmpty()); // возвращает true  если стринг пустой
    //task1  Написать метод removeSpaces(), который принимает на вход строку.
    //Если строка не пустая (проверить методом класса String), то примените метод по удалению пробелов
    // в начале и в конце строки.
    //Догадаться, каким методом из видео можно проверить, были ли пробелы в строке.
    //Если пробелы были, то метод должен удалить их и вернуть сообщение: “Лишние пробелы удалены”.
    //Если пробелов не было, вернуть сообщение “Пробелов не было”.
    //Если строка пустая (проверить методом класса String), вернуть сообщение “Строка пустая”.
    //Test Data:
    //“    Red Rover School   “ → “Лишние пробелы удалены”
    //“Red Rover School“ → “Пробелов не было”
    //“” → “Строка пустая”
    public String removeSpaces(String s) {
        if (s != null && s.length() > 0) {            // если здесь добавить проверку на null  вылетает ошибка -
            String check = s.trim();
            if (s.length() != check.length()) {
                System.out.println("Лишние пробелы удалены");
                return "Лишние пробелы удалены";
            } else {
                System.out.println("Пробелов не было");
                return "Пробелов не было";
            }
        } else {
            System.out.println("Строка пустая");
            return "Строка пустая";
        }
    }

    //task 2 Написать алгоритм removeAllAs().
    //С помощью методов из видео1,  написать алгоритм, который принимает на вход строку.
    // Если строка валидная, то метод удаляет все буквы a из строки, если таковые имеются.
    // Метод возвращает обработанную строку.
    //Test Data:
    // “    Red Rover School   “ →  “Red Rover School“
    //“panda   “ → “pnd”
    //“taramasalata” → “trmslt”
    public String removeAllAs(String s2) {
        if (!s2.isEmpty()) {
            s2 = s2.trim();

            return s2.replace("a", "");
        } else {

            System.out.println("Строка пустая");
            return "Строка пустая";
        }
    }

    // task 3 Написать алгоритм removeAllZeros().
    //С помощью методов из видео1,  написать алгоритм, который принимает на вход строку, состоящую из цифр.
    // Если строка валидная, то метод удаляет все пробелы из строки, если таковые имеются.
    // Метод возвращает обработанную строку, в которой нет нулей. Если в строке не было нулей,
    // метод возвращает сообщение “This is a valid string”.
    //Test Data:
    // “3504209706040000 “ →  “35429764“
    //“0000000111“ → “111”
    public String removeAllZeros(String s3) {
        //  if (!s3.contains(null)) {
        if (!s3.isEmpty()) {
            s3.trim();
            System.out.println(s3.replace(" ", "").replace("0", ""));
            return s3.replace(" ", "").replace("0", "");
        }
        if (!s3.contains("0")) {
            System.out.println("This is a valid string");
            return "This is a valid string";
        }
        return "";
    }

    //  return "1";
    // }

    // 4 task Написать алгоритм removeAllSpaces.
    //С помощью методов из видео1,  написать алгоритм, который принимает на вход строку.
    // Если строка валидная, то метод удаляет все пробелы из строки, если таковые имеются.
    // Метод возвращает обработанную строку.
    //Test Data:
    // “    R e d     Ro ve    r Sc   h ool   “ →  “RedRoverSchool“
    //“p a     n   d a   “ → “panda”

    public String removeAllSpaces(String s4) {
        if (!s4.isEmpty()) {
            s4 = s4.replace(" ", "");
            System.out.println(s4);
            return s4;
        } else {

            return "";
        }
    }


    public static void main(String[] args) {
        StringMethods str = new StringMethods();
        str.removeSpaces("   Red Rover School   ");
        str.removeAllAs("    Red Rover School   ");
        str.removeAllAs("taramasalata");

        //3
        str.removeAllZeros("3504209706040000 ");
        str.removeAllZeros("0000000111");
        //  str.removeAllAs(null);

        //4
        str.removeAllSpaces("    R e d     Ro ve    r Sc   h ool   ");
        str.removeAllSpaces("p a     n   d a   ");
    }
}
