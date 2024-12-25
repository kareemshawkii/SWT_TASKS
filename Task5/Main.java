/*
-Write a program to find the second-largest element in a single-dimensional array.
-Explain the concept of jagged arrays and write code to demonstrate them with three sub-arrays of varying lengths.
-Write a program to calculate the sum of each row in a 2D array.
-Write a program to check if a specific number exists in a single-dimensional array.
-Given an integer array, write a program to count the occurrences of each unique number.
-Write a program to transpose a 2D array.
-How do you copy the elements of one array into another? Provide an example.
-Write a program to sort the elements of a single-dimensional array in ascending order.
-How do you find the diagonal elements of a square matrix? Write code to extract them.
-Write a program to multiply two 2D arrays.
*/
public class Main {
    static void SecondLargestElement() {
        int [] arr ={1,2,3,4,5,5,10,7,123};
        int max = arr[0];
        int max2 = arr[1];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max2&&arr[i]<max) {
                max2 = arr[i];
            }
        }
        System.out.println("Second largest element is: " + max2);
    }
    static void jaggedArrays(){
        int[][] jaggedArray = new int[3][];
        jaggedArray[0] = new int[] { 1, 2, 3 };
        jaggedArray[1] = new int[] { 4, 5 };
        jaggedArray[2] = new int[] { 6, 7, 8, 9 };
        for (int i = 0; i < jaggedArray.length; i++) {
            System.out.print("Array"+(i+1)+" Elements: ");
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void sumOfEachRow(){
        int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            System.out.println("The sum of row"+(i+1)+" is: "+sum);
            sum = 0;
        }
    }
    static void SearchElement(int n){
        int[] arr={1,2,3,4,5,6,7,8,9};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==n){
                System.out.println("Element "+(n)+" found at index "+i);
                return;
            }
            if(arr[i]!=n&&i==arr.length-1){
                System.out.println("Element "+(n)+" is not found in the array");
            }
        }
    }
    static void countOccurrences() {
        int[] arr = {1, 2, 2, 3, 4, 4, 4, 5};
        int n = arr.length;
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                continue;
            }
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println("Element of value ("+arr[i] +") occurred: " + ": " + count);
        }
    }
    static void TransposeMatrix(){
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[][] transposed = new int[columns][rows];
        System.out.println("Original matrix: ");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        System.out.println("---------------------------");
        System.out.println("Transposed matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(transposed[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void CopyArray(){
        int[]arr={1,2,3,4,5};
        int[]arr2={6,7,8,9,10};
        System.out.println("array2 before copy values from array1: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr2[i]+" ");
        }
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println("array2 after copy values from array1: ");
        for(int i=0;i<arr2.length;i++){
            arr2[i]=arr[i];
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void arraySort(){
        int [] arr = {4,3,5,6,7,1,2,3,6,7,9,5,4,6,7};
        int n = arr.length;
        int[] SortedArr = new int[n];
        boolean[] visited = new boolean[n];
        System.out.println("Original array: ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            int leastIndex = -1;
            for (int j = 0; j < n; j++) {
                if (!visited[j] && (leastIndex == -1 || arr[j] < arr[leastIndex])) {
                    leastIndex = j;
                }
            }
            SortedArr[i] = arr[leastIndex];
            visited[leastIndex] = true;
        }
        System.out.println("Sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(SortedArr[i] + " ");
        }
        System.out.println();
    }
    static void arrayDiagonalElements(){
        int[][]arr={{1,2,3},{4,5,6},{7,8,9}};
        int row=0;
        int column=0;
        System.out.println("Diagonal elements: ");
        for(int i=0;i<arr[0].length;i++){
            System.out.println(arr[row][column]);
            row++;
            column++;
        }
    }
    static void multiplyTow2DArrays(){
        int[][] arr1 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] arr2 = {{1,2,3},{4,5,6},{7,8,9}};
        int n = arr1.length;
        int[][] mulArray = new int[n][n];
        System.out.println("Array 1: ");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("------------------------");
        System.out.println("Array 2: ");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                mulArray[i][j]=arr1[i][j]*arr2[i][j];
            }
        }
        System.out.println("-------------------");
        System.out.println("Multiplied Array: ");
        for(int i=0;i<mulArray.length;i++){
            for(int j=0;j<mulArray[i].length;j++){
                System.out.print(mulArray[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        //SecondLargestElement();
        //jaggedArrays();
        //sumOfEachRow();
        //SearchElement(3);
        //SearchElement(11);
        //countOccurrences();
        //TransposeMatrix();
        //CopyArray();
        //arraySort();
        //arrayDiagonalElements();
        //multiplyTow2DArrays();
    }
}