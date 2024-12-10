import java.util.Scanner;

public class Main {
    static void countDigits(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String s = in.nextLine();
        int count = 0;
        while(count!=s.length()){
          count++;
        }
        System.out.println("the Number has: "+count+" digits");
    }
    static void evenNumberCount(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int i = in.nextInt();
        int count = 0;
        int start = 1;
        while(start<=i){
           if(start%2==0){
               count+=start;
           }
           start++;
        }
        System.out.println("the Number has sum of even numbers = "+count);
    }
    static void checkPrime(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int i = in.nextInt();
        int num=i-1;
        while(num!=1){
            if(i%num==0){
                System.out.println(i+" is not a prime number");
                break;
            }
            if(num==2&&i%2!=0){
                System.out.println(i+" is a prime number");
                break;
            }
            num--;
        }
    }
    static void greatestCommonDivisor(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number1: ");
        int i1 = in.nextInt();
        System.out.println("Enter a number2: ");
        int i2 = in.nextInt();
        int temp;
        if(i1<i2){
             temp = i1;
        }
        else{
             temp = i2;
        }
        while(temp!=0){
            if(i1%temp==0&&i2%temp==0){
                System.out.println(temp+" is the greatest common divisor");
                break;
            }
            temp--;
        }
    }
    static void binaryToDecimal(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a binary number: ");
        String s = in.nextLine();
        int num = s.length() - 1;
        int decimal = 0;
        int index = 0;
        while (num != -1) {
            decimal += (Character.getNumericValue(s.charAt(index))) * (Math.pow(2, num));
            num--;
            index++;
        }
        System.out.println("The decimal value is: " + decimal);
    }
    public static boolean isArmstrong(int num) {
        int original = num, sum = 0, digits = String.valueOf(num).length();
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }
        return sum == original;
    }
    public static void findArmstrongNumbers() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();

        System.out.println("Armstrong Numbers:");
        for (int i = 1; i <= n; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    public static void collatzConjecture() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();
        System.out.println("Collatz Sequence:");
        while (n != 1) {
            System.out.print(n + " ");
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = n * 3 + 1;
            }
        }
        System.out.print(1); // Print the final 1
        System.out.println();
    }



    public static void main(String[] args) {
        countDigits();
        evenNumberCount();
        checkPrime();
        greatestCommonDivisor();
        binaryToDecimal();
        findArmstrongNumbers();
        collatzConjecture();
    }
}