import java.util.Scanner;

public class MinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[4];

        for (int i = 0;i<array.length;i++){
            System.out.print("Enter a element at index " + (i+1) + " : ");
            array[i] = sc.nextInt();
        }

        int min = array[0];
        for (int i = 1; i<array.length;i++){
            if (min > array[i]){
                min = array[i];
            }
        }
        System.out.println("The min element in array: " + min);
    }
}
