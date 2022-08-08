import java.util.Scanner;

public class Add {
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

        //Nhập vào và kiểm tra phần tử cần thêm và vị trí thêm
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào vị trí cần thêm:");
        int indexX = sc.nextInt();
        System.out.println("Nhập vào giá trị cần thêm:");
        int x = sc.nextInt();
        int[] newArray = arrayAdd(array, indexX, x);


        //In ra mảng mới
        System.out.printf("%-20s%s", "Các giá trị của mảng: ", "");
        for (int j = 0; j < newArray.length; j++) {
            System.out.print(newArray[j] + "\t");
        }
    }

    public static int[] arrayAdd(int[] array,int indexX, int x) {
        int[] newArray = new int[array.length+1];
        for(int i=0; i<newArray.length; i++){
            if (i < indexX) newArray[i] = array[i];
            else if (i == indexX) newArray[i] = x;
            else  newArray[i] = array [i-1];
        }
        return newArray;
    }

}
