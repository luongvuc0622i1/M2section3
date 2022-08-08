import java.util.Scanner;

public class MaxInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Mảng nhập vào có số hàng: ");
        int m = input.nextInt();
        System.out.println("Mảng nhập vào có số cột: ");
        int n = input.nextInt();
        int[][] array = new int[m][n];

        //Nhập vào giá trị cho mảng
        for (int i=0; i< array.length; i++) {
            for (int j=0; j<array[i].length; j++) {
                System.out.printf("Nhập vào giá trị ở vị trí %d x %d là:", i,j);
                array[i][j] = input.nextInt();
            }
        }

        //Tìm giá trị lớn nhất
        int max = array[0][0];
        for (int i=0; i< array.length; i++) {
            for (int j=0; j<array[i].length; j++) {
                if(max<array[i][j]) max = array[i][j];
            }
        }
        System.out.print("Giá trị lớn nhất của mảng 2 chiều là:");
        System.out.println(max);

    }
}
