public class ArraysInsert {
    public static void main(String[] args) {

        int arr[] = new int[5];

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;

        int index = 2;
        int value = 35;

        for (int i = 3; i >= index; i--) {
            arr[i + 1] = arr[i];
        }

        arr[index] = value;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}