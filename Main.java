import java.util.Scanner;

public class Main {
    public static void arrange(int arr[], int n) {
        int count = 0;

        // shifting non zero element to the left of the loop
        for (int i = 0; i < n; i++)
            if (arr[i] != 0)
                arr[count++] = arr[i];

        // adding the zeros to the end
        while (count < n)
            arr[count++] = 0;
    }

    public static void main(String[] args) {
        // creating a object for Scanner class
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        arrange(arr, n);
        System.out.println("Arrange array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}