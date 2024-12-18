//pppppaaaaannnnddddaaaaaaa;)
public class Main {
    static void print() {
     for (int i = 1; i <= 10; i++) {
         System.out.println(i);
     }
    }
    static void print10odd() {
        int count =1;
        int num=0;
        while(count<=10){
          if (num%2!=0){
              System.out.println(num);
              count++;
          }
          num++;
        }
    }
    static void print10even() {
        int count =1;
        int num=0;
        while(count<=10){
            if (num%2==0){
                System.out.println(num);
                count++;
            }
            num++;
        }
    }
    static void printSum() {
        int sum=0;
        for(int i=1; i<=10; i++){
            sum+=i;
        }
        System.out.println(sum);
    }
    static void printTable2() {
        int sum;
        int num=2;
        for(int i=0; i<=12; i++){
            sum=num*i;
            System.out.println(num +" * "+i + " = " + sum);
        }
    }
    static void LargestOfTwo(int n1, int n2) {
        if(n1>n2){
            System.out.println("Largest of two numbers is "+n1+" and "+n2+" is: "+n1);
        }
        else{
            System.out.println("Largest of two numbers is "+n1+" and "+n2+" is: "+n2);
        }
    }
    static void checkNumber(int n){
        if(n>0){
            System.out.println(n + " is a positive number");
        }
        else if (n<0) {
            System.out.println(n + " is a negative number");
        }
        else{
            System.out.println(n + " is a zero");
        }
    }
    static void Fibonacci(int n) {
        int n1 = 0, n2 = 1;
        System.out.println(n1);
        if (n > 1) {
            System.out.println(n2);
        }
        for (int i = 2; i < n; i++) {
            int sum = n1 + n2;
            System.out.println(sum);
            n1 = n2;
            n2 = sum;
        }
    }
    static void printTriangle() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void countDigits(int num) {
        int n=num;
        int count = 0;
        do {
            count++;
            num /= 10;
        } while (num > 0);

        System.out.println("number of digits of number " +n +" is: "+ count);
    }
    /////////////////////////////////////////
    static void printDivisibleBy3And5(){
        for (int i = 0; i <= 50; i++) {
            if (i%3==0&&i%5==0){
                System.out.println("this number: "+i+" divisible by 3 and 5");
            }
        }
    }
    static void factorial(int n){
       if (n==1||n==0){
           System.out.println("the factorial of: "+n+" is "+n);
           return;
       }
       if (n<0) {
           System.out.println("invalid number");
           return;
       }
       int sum=1;
       for (int i = n; i >=1; i--) {
          sum*=i;
       }
        System.out.println("the factorial of "+n+" is: "+sum);
    }
    static void isPrime(int n){
        if (n<0){
            System.out.println("invalid number");
            return;
        }
        int m =n-1;
        while (m!=1){
            if (n%m==0){
                System.out.println(n+" is not prime number");
                return;
            }
            m--;
        }
        System.out.println(n+" is prime number");
    }
    static boolean boolisPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    static void printPrimeNumbers(int start, int end) {
        System.out.println("Prime numbers between " + start + " and " + end + " are:");
        for (int num = start; num <= end; num++) {
            if (boolisPrime(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
    static void reverseNumber(int num) {
        String str = String.valueOf(num);
        String x="";
        for(int i =str.length()-1; i>=0; i--) {
            x+=str.charAt(i);
        }
        System.out.println("the reversed number: "+x);
    }
    static void isPalindrome(int num) {
        int original = num;
        int reversed = 0;
        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        System.out.println((original == reversed) ? (original + " is a palindrome.") : (original + " is not a palindrome."));
    }
    static void sumOfDigits(int num) {
        int number=num;
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        System.out.println("The sum of digits in " + number + " is: " + sum);
    }
    static void descendingPattern(int num) {
        System.out.println("the sequence of descending pattern is: ");
        for(int i=num;i>=0;i=i-3){
            System.out.print(i+" ");
        }
    }
    static void largestNumber(int x,int y,int z){
        if(x>y){
            if(x>z){
                System.out.println("the largest number is "+x);
            }
            if (x<z){
                System.out.println("the largest number is "+z);
            }
        }
        if(y>x){
            if(y>z){
                System.out.println("the largest number is "+y);
            }
            if (y<z){
                System.out.println("the largest number is "+z);
            }
        }
    }
    static boolean isArmstrong(int num) {
        int original = num, sum = 0, digits = String.valueOf(num).length();
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }
        return sum == original;
    }
    static void findArmstrongNumbers(int num) {
        int n = num;
        System.out.println("Armstrong Numbers:");
        for (int i = 1; i <= n; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    static void fizzBuzz(){//if:%3&&%5->fizzbuzz, if:%3->fizz, if:%5->buzz, else print number
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
    static void GCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println("GCD is: " + a);
    }
    static void pascalTringle(){
        int rows = 5;
        for (int i = 0; i < rows; i++) {
            int number = 1;
            for (int j = 0; j < rows - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
    static void allFactors(int num){
        System.out.println("Factors of " + num + ":");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
    static void diamond(int num){
        int rows = num;
        for (int i = 1; i <= rows; i++) {
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = rows - 1; i >= 1; i--) {
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void allPerfectNumbers(){
        for (int num = 1; num <= 1000; num++) {
            int sum = 0;
            for (int i = 1; i <= num / 2; i++) {
                if (num % i == 0) {
                    sum += i;
                }
            }
            if (sum == num) {
                System.out.println(num + " is a perfect number.");
            }
        }
    }
    static void collatz(int num){
        System.out.print("Collatz sequence: ");
        while (num != 1) {
            System.out.print(num + " ");
            num = (num % 2 == 0) ? num / 2 : 3 * num + 1;
        }
        System.out.println(1);
    }
    static void allprimesum(){
        int sum = 0;
        for (int num = 2; num <= 100; num++) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                sum += num;
            }
        }
        System.out.println("Sum of prime numbers between 1 and 100 is: " + sum);
    }
    static void amicableNumbers(int num1, int num2){
        int sum1 = 0, sum2 = 0;

        for (int i = 1; i <= num1 / 2; i++) {
            if (num1 % i == 0) {
                sum1 += i;
            }
        }
        for (int i = 1; i <= num2 / 2; i++) {
            if (num2 % i == 0) {
                sum2 += i;
            }
        }

        if (sum1 == num2 && sum2 == num1) {
            System.out.println(num1 + " and " + num2 + " are amicable numbers.");
        } else {
            System.out.println(num1 + " and " + num2 + " are not amicable numbers.");
        }
    }
    static void b2d(int binary){
        int decimal = 0;
        int power = 0;
        for (; binary > 0; binary /= 10) {
            int digit = binary % 10;
            decimal += digit * Math.pow(2, power);
            power++;
        }
        System.out.println("Decimal equivalent is: " + decimal);
    }
    ///////////////////////////////////////////////////
    public static void main(String[] args) {
        //print();
        //print10odd();
        //print10even();
        //printSum();
        //printTable2();
        //LargestOfTwo(10,20);
        //checkNumber(10);
        //checkNumber(-10);
        //checkNumber(0);
        //Fibonacci(5);
        //printTriangle();
        //countDigits(100);
        ///////////////////////////////////////////////////
        //printDivisibleBy3And5();
        //factorial(3);
        //factorial(5);
        //factorial(0);
        //factorial(-10);
        //factorial(1);
        //isPrime(9);
        //isPrime(7);
        //printPrimeNumbers(1,50);
        //reverseNumber(452);
        //isPalindrome(121);
        //sumOfDigits(12345);
        //descendingPattern(30);
        //largestNumber(7,5,8);
        //findArmstrongNumbers(500);
        ///////////////////////////////////////////////
        //fizzBuzz();
        //GCD(12,18);
        //pascalTringle();
        //allFactors(9);
        //diamond(5);
        //allPerfectNumbers();
        //collatz(13);
        //allprimesum();
        //amicableNumbers(18,29);
        //amicableNumbers(220,284);
        //b2d(1101);
    }
}