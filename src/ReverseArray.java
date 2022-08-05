import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhập vào size: ");
            size = scanner.nextInt();
            if (size>20) System.out.println("Không chạy, nhập lại nhỏ hơn 20");
        } while (size>20);

        //Nhập vào các phần tử
        array = new int[size];
        for (int i=0; i< array.length; i++) {
            System.out.print("Nhập vào giá trị ở vị trí thứ "+ (i+1) + " là: ");
            array[i] = scanner.nextInt();
        }

        //In ra mảng vừa nhập
        System.out.printf("%-20s%s", "Giá trị của các phần tử trong mảng là: ", "");
        for (int j=0; j<array.length; j++) {
            System.out.print(array[j] + "\t");
        }

        //Đảo ngược thứ tự
        for (int j=0; j<array.length/2; j++) {
            int temp = array[j];
            array[j] = array[size -1-j];
            array[size -1-j] = temp;
        }


        System.out.println();
        //In ra mảng vừa đảo
        System.out.printf("%-20s%s", "Giá trị của các phần tử trong mảng là: ", "");
        for (int j=0; j<array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}
