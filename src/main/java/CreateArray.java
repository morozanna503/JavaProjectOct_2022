public class CreateArray {
    //В классе CreateArray написать метод createIntArrayFromText(),
    // который принимает на вход строку чисел (н-р, “3 4 1 8 10 12.3”)
    // и возвращает массив типа int[] из этих чисел. (vожно использовать split() или toCharArray())
    public static int[] createIntArrayFromText(String textNumbers) {
        String[] arrayChar = textNumbers.split(" ");

        int[] result = new int[arrayChar.length];
        for (int i = 0; i < arrayChar.length; i++) {
            if (arrayChar[i].contains(".")) {
                //  int number = (int) temp;
                double temp = Double.parseDouble(arrayChar[i]);
                //  result[i] = number;
            } else {
                int temp = Integer.parseInt(arrayChar[i]);
                result[i] = temp;
            }
        }
        return result;
    }

    // Part 3
    //В классе CreateArray написать метод getPhoneNumberAndCountry(),
    // который принимает массив из 11 целых положительных чисел от 0 до 9,
    // и возвращает массив, который содержит номер телефона, состоящий из этих чисел,
    // и название страны, которой номер принадлежит.
    //Например:
    //getPhoneNumberAndCountry({1, 8, 0, 0, 1, 2, 3, 4, 5, 6, 7}) -> {“1(800)123-45-67”, “USA”}
    static String[] getPhoneNumberAndCountry(int[] list) {
        if (list.length < 11) return new String[0];
        return new String[]{list[0] + "(" + list[1]
                + list[2]
                + list[3] + ")"
                + list[4]
                + list[5]
                + list[6] + "-"
                + list[7]
                + list[8] + "-"
                + list[9]
                + list[10], "USA"};

    }
    //String phone = "x(xxx)xxx-xx-xx";
    //        for (int n : array) {
    //            phone = phone.replaceFirst("x", n + "");
    //        }

    public static void main(String[] args) {
        int[] result = createIntArrayFromText("3 4 1 8 10 12.3");

        for (int i = 0; i < result.length; i++) {
            System.out.println("Число " + result[i]);

        }

        int [] array = {1, 8, 0, 0, 1, 2, 3, 4, 5, 6, 7};

        String[] result2 = getPhoneNumberAndCountry(array );

        System.out.println(result2[0]);
        System.out.println(result2[1]);

    }
}


