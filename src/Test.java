import java.util.Scanner;

public class Test {


    public static void Test(String[] args) {
        Scanner input = new Scanner(System.in);
        int right = 3;
        String arrSize = "";
        String arrElements;
        int[] arr;
        int[] emptyArr;


        System.out.println("what size array do you want to creat?");
        while (!input.hasNextInt() && right > 0) {
            right--;
            System.err.printf("you have typed wrong format. You have %d right%n", right);
            if(right==0)
            {
                System.err.println("program did not start");
                System.exit(0);

            }
            System.out.println("try again: ");

            arrSize = input.nextLine();

        }

        arr = new int[input.nextInt()];
        right = 3;

        System.out.println("type the numbers of array");

        arrElements = input.nextLine();
        for (int x = 0; x < arr.length; x++) {
            while (!input.hasNextInt() && right > 0) {
                right--;
                System.err.println("you have typed wrong format. You have" + right + " left");
                if(right==0)
                {
                    System.err.println("program did not start");
                    System.exit(0);

                }
                System.out.println("try again: ");
                arrElements = input.nextLine();
                x --;
                right++;
            }

        }


        //0,1,4,6,1,7,9,1,0,10
        //0,0,1,1,1,4,7,9,10


    }
}