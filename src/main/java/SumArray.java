public class SumArray {
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
}
