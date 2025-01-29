import java.util.Scanner;
public class Operations {
    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    static void isPrime(int n) {
        if (n <= 1) {
            System.out.println("The number is not prime");
            return;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println("The number is not prime");
                return;
            }
        }
        System.out.println("The number is prime");
    }
    static int power(int number, int exponent) {
        int result = 1;
        for (int i = 1; i <= exponent; i++) {
            result *= number;
        }
        return result;
    }
    static int sumOfArrayElements(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
    static String reverseString(String input) {
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        return reversed;
    }
    static void isPalindrome(String str) {
        int size = str.length();
        int left = 0;
        int right = size - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                System.out.println("The string is not a palindrome");
                return;
            }
            left++;
            right--;
        }
        System.out.println("The string is a palindrome");
    }
    static int largestNumber(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    static void vowelNumber(String str) {
        int vowels = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            }
        }
        System.out.println("The number of vowels is: " + vowels);
    }
    static void isArmstrongNumber(int number) {
        String str = String.valueOf(number);
        int sum = 0;
        int length = str.length();
        for (int i = 0; i < length; i++) {
            int digit = Character.getNumericValue(str.charAt(i));
            sum += Math.pow(digit, length);
        }
        if (sum == number) {
            System.out.println("The number is an Armstrong number");
        } else {
            System.out.println("The number is not an Armstrong number");
        }
    }
    static double Area(String str) {
        Scanner sc = new Scanner(System.in);
        double area = 0;
        if (str.equals("circle")) {
            System.out.println("Enter the radius of the circle");
            int radius = sc.nextInt();
            area = Math.PI * radius * radius;
        } else if (str.equals("square")) {
            System.out.println("Enter the side of the square");
            int side = sc.nextInt();
            area = side * side;
        } else if (str.equals("triangle")) {
            System.out.println("Enter the height of the triangle");
            int height = sc.nextInt();
            System.out.println("Enter the base of the triangle");
            int base = sc.nextInt();
            area = 0.5 * height * base;
        } else if (str.equals("rectangle")) {
            System.out.println("Enter the width of the rectangle");
            int width = sc.nextInt();
            System.out.println("Enter the length of the rectangle");
            int length = sc.nextInt();
            area = width * length;
        } else {
            System.out.println("Invalid shape type");
        }
        return area;
    }
}
