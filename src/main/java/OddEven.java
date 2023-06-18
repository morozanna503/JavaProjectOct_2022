public class OddEven {
    public String OddEven(int odd) {
        if (odd != 0) {
            if (odd % 2 == 0) {

                return "Even";
            } else {

                return "Odd";
            }
        }

        return "Zero";
    }
    // task2
    int[] oddInd = {1,4,55,90,0,45,60};
    public  int[] oddIndices(int[] oddInd) {
        if (oddInd.length == 0) return oddInd;

        int size = oddInd.length / 2; // число -сколько индексов будет в новом массиве
        int[] result = new int[size];
        int resultCounter = 0;

        for (int i = 0; i < oddInd.length; i++) {
            if (i % 2 != 0) {
                result[resultCounter] = oddInd[i];
                resultCounter++;
            }
        }
        return result;
    }
    // task 3
    public int SumArray( int[] arr){
        int sumArr = 0;
        for(int i = 0; i < arr.length; i ++){
            sumArr = sumArr + arr[i];
            arr[i]++;
        }
        System.out.println("sum valueArray = " + sumArr);
        return sumArr;
    }
    // task 4
    public int BiggerValue( int a , int b){
        if( a > b){
            return a;
        }else {
            return b;
        }
    }
    // task 5
    public boolean IsPositiveNumber(int a){
        boolean result;
        if(a >= 0){
            result = true;

            return result;
        }else {
            result = false;

            return result;
        }

    }
    public String goodBadPoorNumber(int M) {

        if(M != 0) {
            if (M % 7 == 0 && M % 9 == 0) {
                return "Good Number";
            } else if (M % 9 == 0) {
                return "Bad Number";
            } else if (M % 11 == 0){
                return "Poor Number";
            } else {
                return "-1";
            }
        } else {
            return "Zero is always multiple of every number";
        }

    }

}
