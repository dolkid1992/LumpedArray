import java.util.Scanner;

public class NumberStudent {
    public static void main(String[] args) {
        int size; // kiem tra kick thuoc mang
        int[] elements;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter a size:");
            size = sc.nextInt();
            if (size > 20)
                System.out.println("Size does not exceed 20");
        } while (size > 20);

        elements = new int[size]; //nhap gia tri cho cac phan tu cua mang
        int i = 0;
        while (i < elements.length) {
            System.out.print("Enter element " + (i + 1) + ": ");
            elements[i] = sc.nextInt();
            i++;
        }

        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int j = 0 ; j < elements.length; j++) {
            System.out.print(elements[j] + "\t");
        }

        for (int j = 0;j < elements.length / 2; j++){
            int temp = elements[j];
            elements[j] = elements[size - 1 -j];
            elements[size - 1 - j] = temp;
        }
        System.out.printf("%-20s%s", "Reverse array: ", "");
        for (int j = 0; j < elements.length; j++) {
            System.out.print(elements[j] + "\t");
        }
    }
}
