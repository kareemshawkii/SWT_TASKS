public class Main {
    public static void main(String[] args) {
        Operations main = new Operations();
        // Test factorial
        System.out.println("----------------------------------------");
        System.out.println("Factorial of 0: " + main.factorial(0)); //1
        System.out.println("Factorial of 5: " + main.factorial(5)); //120
        System.out.println("----------------------------------------");

        // Test isPrime
        System.out.println("----------------------------------------");
        main.isPrime(1); //not prime
        main.isPrime(2); // smallest prime
        main.isPrime(29); // prime
        main.isPrime(30); // not prime
        System.out.println("----------------------------------------");

        // Test power
        System.out.println("----------------------------------------");
        System.out.println("2^0 (boundary): " + main.power(2, 0)); // 1
        System.out.println("2^3: " + main.power(2, 3)); //8
        System.out.println("----------------------------------------");

        // Test sumOfArrayElements
        System.out.println("----------------------------------------");
        int[] array1 = {}; // empty array
        int[] array2 = {1, 2, 3, 4, 5}; // 15
        System.out.println("Sum of empty array : " + main.sumOfArrayElements(array1));
        System.out.println("Sum of array {1, 2, 3, 4, 5}: " + main.sumOfArrayElements(array2));
        System.out.println("----------------------------------------");

        // Test reverseString
        System.out.println("----------------------------------------");
        System.out.println("Reverse of empty string: " + main.reverseString("")); //nothing
        System.out.println("Reverse of 'hello': " + main.reverseString("hello")); // olleh
        System.out.println("----------------------------------------");

        // Test isPalindrome
        System.out.println("----------------------------------------");
        main.isPalindrome(""); // nothing
        main.isPalindrome("madam"); // palindrome
        main.isPalindrome("hello"); // not palindrome
        System.out.println("----------------------------------------");

        // Test largestNumber
        System.out.println("----------------------------------------");
        int[] array4 = {1, 2, 3, 4, 5}; // 5
        System.out.println("Largest number in array {1, 2, 3, 4, 5}: " + main.largestNumber(array4));
        System.out.println("----------------------------------------");

        // Test vowelNumber
        System.out.println("----------------------------------------");
        main.vowelNumber("hello world"); // 3
        System.out.println("----------------------------------------");

        // Test isArmstrongNumber
        System.out.println("----------------------------------------");
        main.isArmstrongNumber(153); // Armstrong number
        main.isArmstrongNumber(123); // not Armstrong number
        System.out.println("----------------------------------------");

        // Test Area
        System.out.println("----------------------------------------");
        System.out.println("Area of circle: " + main.Area("circle"));
        System.out.println("Area of invalid shape: " + main.Area("mamama"));
        System.out.println("----------------------------------------");
    }
}
