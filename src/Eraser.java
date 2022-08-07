import java.util.Scanner;

public class Eraser {
    public static void main(String[] args) {
        System.out.println("Nhập vào mảng số nguyên gồm N phần tử:");

        Scanner input = new Scanner (System.in);

        System.out.println("Nhập vào số phần tử của mảng:");
        int size = input.nextInt();
        int[] array = new int[size];
        for (int i=0; i < array.length ; i++) {
            System.out.printf("Nhập vào giá trị của phần tử thứ %d: ", (i+1));
            array[i] = input.nextInt();
        }

        System.out.println();
        //In ra mảng vừa nhập
        System.out.printf("%-20s%s", "Các giá trị của mảng: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }

        //Nhập vào và kiểm tra phần tử cần xoá
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào phần tử cần xoá:");
        int x = sc.nextInt();
        for(int h=0; h<array.length; h++){
            if (x == array[h]) {
                for (int k = h; k < array.length - 1; k++) {
                    array[k] = array[k + 1];
                }
            }
        }

        //In ra mảng mới
        System.out.printf("%-20s%s", "Các giá trị của mảng: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }



}
