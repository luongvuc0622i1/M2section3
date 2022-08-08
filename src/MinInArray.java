import java.util.Scanner;

public class MinInArray {
    public static void main(String[] args) {
        int[] array = newArray();
        showArray(array);
        System.out.println();
        int min = array[0];
        for (int i=1; i<array.length; i++) {
            if(min>array[i]) min = array[i];
        }
        System.out.print("Giá trị nhỏ nhất của mảng là: ");
        System.out.println(min);

    }
    //Hàm nhập vào mảng
    public static int[] newArray () {
        Scanner input = new Scanner (System.in);
        System.out.println("Số phần tử của mảng là: ");
        int size = input.nextInt();
        int[] newArray = new int[size];
        for (int i=0; i<newArray.length; i++) {
            System.out.print("Nhập vào giá trị thứ " + (i+1) + " của mảng: ");
            newArray[i] = input.nextInt();
        }
        return newArray;
    }

    //Hàm in ra mảng
    public static void showArray(int[] array) {
        System.out.printf("%-20s%s", "Các giá trị của mảng: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}
