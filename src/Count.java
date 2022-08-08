import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập vào 1 chuỗi:");
        String str = input.nextLine();
        System.out.print("Nhập vào 1 ký tự:");
        String a = input.nextLine();

        int count=0;
        for (int i=0; i< str.length(); i++) {
            if (a.charAt(0) == str.charAt(i)) count++;
        }
        System.out.printf("Số lần xuất hiện của ký tự %s là %d", a, count);
    }
}
