
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

    public static void findMinMax(int[] number) {
        Arrays.sort(number);
        System.out.println("\nPhần tử nhỏ nhất của mảng là: " + number[0]);
        System.out.println("Phần tử lớn nhất của mảng là: " + number[number.length - 1]);
    }
}

