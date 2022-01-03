import java.util.Scanner;

public class sumOfThreeIntiger {
    static void findTriplets(int[] arr, int n) {
        boolean found = false;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
                        found = true;
                    }
                }
            }
        }
        if (found == false)
            System.out.println("Numbers with sum 0 are not exists");

    }

    public static int[] readInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Array length");
        int arrLength = input.nextInt();
        int[] arr = new int[arrLength];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < arrLength ; i++){
            int numElement = input.nextInt();
            arr[i] = numElement;
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = readInput();
        int n = arr.length;
        findTriplets(arr, n);
    }
}
