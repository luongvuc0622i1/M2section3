import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Mảng nhập vào có số hàng: ");
        int m = input.nextInt();
        System.out.println("Mảng nhập vào có số cột: ");
        int n = input.nextInt();
        int[][] array = new int[m][n];

        //Nhập vào giá trị cho mảng
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("Nhập vào giá trị ở vị trí %d x %d là:", i, j);
                array[i][j] = input.nextInt();
            }
        }
        int sumN;
        do {
            System.out.println("Bạn muốn tính tổng ở cột thứ mấy: ");
            sumN = input.nextInt();
            if (sumN<0) System.out.println("Hãy nhập lại số lớn hơn 0");
            if (sumN>m) System.out.println("Hãy nhập lại số nhỏ hơn " + m);
        } while (sumN<0 && sumN>m);


        int sum=0;
        for (int i=0; i<array.length ; i++) {
            sum += array[i][sumN];
        }
        System.out.printf("Tổng của các số trong cột %d là %d", sumN, sum);
    }
}
