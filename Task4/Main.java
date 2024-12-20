import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //array declaration
        int[] arr = new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        System.out.println("----------------------------");

        //array length
        System.out.println("The length of the array is: " + arr.length);
        System.out.println("----------------------------");

        //print array
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element " + (i + 1) + ": " + arr[i]);
        }
        System.out.println("----------------------------");

        //assign new value = 1 to element position 2 in array and print it
        arr[2 - 1] = 1;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element " + (i + 1) + ": " + arr[i]);
        }
        System.out.println("----------------------------");

        //print first and last
        System.out.println("First Element: " + arr[0]);
        System.out.println("Last Element: " + arr[arr.length - 1]);
        System.out.println("----------------------------");

        //default value is zero
        int[] array2 = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element " + (i + 1) + ": " + arr[i]);
        }
        System.out.println("----------------------------");

        //sum of array
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("the sum of the array is: " + sum);
        System.out.println("----------------------------");

        //2D array
        int[][] Array2D ={{1,2,3},{4,5,6},{7,8,9}};
        for (int i = 0; i < Array2D.length; i++) {
            for (int j = 0; j < Array2D[0].length; j++) {
                System.out.print(Array2D[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("----------------------------");

        //Maxinmum element in array
        int array[]={1,2,3,4,5};
        int maxElement = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] > maxElement){
                maxElement = array[i];
            }
        }
        System.out.println("The max element is: " + maxElement);
        System.out.println("----------------------------");

        //reverse elements in array
        int[] arrayy ={1,2,3,4,5};
        int [] revrsedArray = new int[5];
        int n = 0;
        for (int i = arrayy.length -1; i >=0; i--) {
            revrsedArray[n] = arrayy[i];
            n++;
        }
        for (int i = 0; i < revrsedArray.length; i++) {
            System.out.println("Element " + (i + 1) + " of reversed Array is: " + revrsedArray[i]);
        }
    }
}
