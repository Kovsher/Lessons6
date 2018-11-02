import java.lang.reflect.Array;
import java.util.Arrays;

public class Application
{
    public static void main(String[] args) {
        int[]a={99,87,-12,87,12,23,-100};
        BubbleSort(a);



    }

    public static void BubbleSort(int[]arr) {
        for (int i=arr.length-1;i>0;i--){
            for (int j=0;j<i;j++){
                if (arr[j]>arr[j+1]){
                    int tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }
            System.out.println(Arrays.toString(arr));
            System.out.println();
        }
        System.out.println("sorted array"+Arrays.toString(arr));
    }
}
