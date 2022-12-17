package LeetCodeProblems;

public class SortArray {
    public static int [] sortIntArrayInDescendingOrder(int [] array){
        for(int i=0; i <= array.length-1; i++){
            for (int j = i+1; j <= array.length-1; j++){
                int temporaryContainer;
                if (array[i] < array[j]){
                    temporaryContainer = array[i];
                    array[i] = array[j];
                    array[j] = temporaryContainer;
                }
            }
        }
        return array;
    }

    public static int [] sortIntArrayInAscendingOrder(int [] array){
        for(int i=0; i <= array.length-1; i++){
            for (int j = i+1; j <= array.length-1; j++){
                int temporaryContainer;
                if (array[i] > array[j]){
                    temporaryContainer = array[j];
                    array[j] = array[i];
                    array[i] = temporaryContainer;
                }
            }
        }
        return array;
    }
}
