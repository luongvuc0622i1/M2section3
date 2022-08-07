public class FindMinimum {
    public static void main(String[] args) {
        int[] array = {1,3,4,2,5,8,9,13};
        int index = minValue(array);
        System.out.println("Giá trị nhỏ nhất trong mảng là: " + array[index]);
    }

    public static int minValue(int[] array) {
        int index =0;
        for (int i = 1; i < array.length ; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }
}
