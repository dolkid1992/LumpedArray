import java.util.Scanner;

public class NumberStudent {
    public static void main(String[] args) {
        int size1;
        int[] array1;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter a size1: ");
            size1 = sc.nextInt();
            if (size1 > 20)
                System.out.println("Size should not exceed 3");
        } while (size1 > 20);

        array1 = new int[size1];
        int i1 = 0;
        while (i1 < array1.length) {
            System.out.print("Enter element" + (i1 + 1) + " : ");
            array1[i1] = sc.nextInt();
            i1++;
        }

        int size2;
        int[] array2;
        do {
            System.out.print("Enter a size2: ");
            size2 = sc.nextInt();
            if (size2 > 20)
                System.out.println("Size should not exceed 4");
        } while (size2 > 20);

        array2 = new int[size2];
        int i2 = 0;
        while (i2 < array2.length) {
            System.out.print("Enter element" + (i2 + 1) + " : ");
            array2[i2] = sc.nextInt();
            i2++;
        }

        int[] array3 = new int[array1.length + array2.length];

        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }

        for (int i = array1.length, j = 0; i < array3.length; i++, j++) {
            array3[i] = array2[j];
        }


        System.out.println("Property list of Array 3: ");
        for (int j = 0; j < array3.length; j++) {
            System.out.print(array3[j] + "\t");
        }
    }
}
