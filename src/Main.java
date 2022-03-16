import java.time.Year;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int[]arr={1,1,1,2,3,4,5,6,7,2,1,4,3};
        int[]copyArr=new int[arr.length];

        Arrays.sort(arr);

        int count=0;

   firstArray:     for (int x=0;x<arr.length;x++)
        {
          secondArray:  for (int y=0;y<arr.length;y++)

            if(arr[x]==arr[y]&&x!=y)
            {
                copyArr[x]=arr[x];
                if (arr[x]!=arr[y])
                {
                    continue firstArray;
                }
            }

        }
        System.out.println(Arrays.toString(copyArr));




    }
}
