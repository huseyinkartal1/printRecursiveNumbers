import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int arrSize;

        System.out.println("type");

        while (!input.hasNextInt())
        {
            arrSize= input.nextInt();
        }
        System.out.println("sorun yok");

    }
}
