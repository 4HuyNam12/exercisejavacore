
import java.util.Arrays;
import java.util.Scanner;

public class Exercise_01 {
    public static int[] inputArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số phần tử của mảng: ");
        int n = sc.nextInt();
        int[] number = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập vào phần tử ở index số: " + i);
            number[i] = sc.nextInt();
        }
        return number;
    }

    public static void displayArray(int[] number) {
        System.out.print("\nMảng vừa nhập vào là: ");
        for (int numb : number) {
            System.out.print(numb + " ");
        }
    }

    public static void findMin(int[] number) {
        int min = number[0];
        for (int i = 0; i < number.length; i++) {
            if (min > number[i]) {
                min = number[i];
            }
        }
        System.out.println("\nPhần tử nhỏ nhất của mảng là: " + min);
    }

    public static void findMax(int[] number) {
        int max = number[0];
        for (int i = 0; i < number.length; i++) {
            if (max < number[i]) {
                max = number[i];
            }
        }
        System.out.println("Phần tử lớn nhất của mảng là: " + max);
    }
}

