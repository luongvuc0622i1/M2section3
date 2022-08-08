import java.util.Scanner;

public class Merge {
    public static void main(String[] args) {
        int[] array1 = newArray(1);
        int[] array2 = newArray(2);
        showArray(array1, 1);
        System.out.println();
        showArray(array2, 2);
        int[] array3 = new int[array1.length+array2.length];
        for (int i=0; i< array1.length; i++) {
            array3[i] = array1[i];
        }
        for (int i=0; i< array2.length; i++) {
            array3[array1.length+i] = array2[i];
        }
        System.out.println();
        showArray(array3, 3);

    }


    //Hàm nhập vào mảng
    public static int[] newArray (int stt) {
        Scanner input = new Scanner (System.in);
        System.out.println("Số phần tử của mảng " + stt + " là: ");
        int size = input.nextInt();
        int[] newArray = new int[size];
        for (int i=0; i<newArray.length; i++) {
            System.out.print("Nhập vào giá trị thứ " + (i+1) + " của mảng " + stt + ": ");
            newArray[i] = input.nextInt();
        }
        return newArray;
    }

    //Hàm in ra mảng
    public static void showArray(int[] array, int stt) {
        System.out.printf("%-20s%s", "Các giá trị của mảng " + stt + " : ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}
