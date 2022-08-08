import java.util.Scanner;

public class ListOfMark {
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhập vào số lượng sinh viên: ");
            size =  sc.nextInt();
            if (size > 30) System.out.println("Hãy nhập lại số nhỏ hơn 30!");
        } while (size >30);

        int[] array = new int[size];
        for(int i=0; i< array.length; i++) {
            System.out.printf("Nhập vào điểm của sinh viên thứ %d: ", (i+1));
            array[i] = sc.nextInt();
        }

        int count =0;
        System.out.print("Danh sách điểm: ");
        for (int i=0; i<array.length; i++) {
            System.out.print(array[i] + "\t");
            if (array[i] >=5 && array[i] <= 10) count++;
        }
        System.out.println("\n Số lượng sinh viên qua bài kiểm tra là: " + count);
    }
}
