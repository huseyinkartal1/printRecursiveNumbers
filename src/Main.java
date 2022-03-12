import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        int right = 3;
        String arrInput = "";
        int size = 0;
        int[] arr;
        int[] copyArr;

        System.out.println("what size array do you want to creat?");
        if (!input.hasNextInt()) {
            while (!input.hasNextInt() && right > 0) {
                right--;
                System.out.printf("you have typed wrong format. You have %d right%n", right);
                System.out.println("try again: ");
                arrInput = input.nextLine();
                if (right == 0) {
                    System.err.println("program did not start");
                }
            }
        } else {
            size = input.nextInt();
        }

        arr = new int[size];
        right = 3;

        System.out.println("type the numbers of array: ");
            arrInput = input.nextLine();
        if (!input.hasNextInt()) {
            while (!input.hasNextInt() && right > 0) {
                System.out.println("you have typed wrong format. You have" + right + " left");
                System.out.println("try again: ");
                arrInput = input.nextLine();
                right--;
                if (right == 0) {
                    System.err.println("program did not start");
                }
            }
        } else if (input.hasNextInt()){
            for (int x = 0; x < size; x++) {
                arr[x] = input.nextInt();

            }
        }

        for (int element:arr)
        {
            System.out.print("numbers of arry: "+element);
        }


        //0,1,4,6,1,7,9,1,0,10
        //0,0,1,1,1,4,7,9,10

        System.out.println(da);



        Arrays.sort(arr);

        for (int a=0;a< arr.length;a++)
        {

        }





        //size=Integer.parseInt(arrInput);

        //System.out.println(size);


    }
}
