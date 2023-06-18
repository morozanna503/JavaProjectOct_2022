public class OddIndices {
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
}
