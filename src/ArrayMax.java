public class ArrayMax {

    public static int getMaxFromArray(int[] array) {

        int indexOfMax=0;
        for (int i=1;i<array.length;i++){
            if(array[i]>array[indexOfMax]){
                indexOfMax=i;
            }
        }
    return array[indexOfMax];
    }}
