import java.util.Stack;

public class Main {
    //////////////////////////////////////////////////loops
    static void printNumbers(){
        for(int i =1;i<=100;i++){
            System.out.print(i+" ");
        }
    }
    static void printEvenNumbers(){
        for(int i =1;i<=100;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
    }
    static void sumOfNaturalNumbers(){
        int sum = 0;
        for(int i =1;i<=50;i++){
            sum += i;
        }
        System.out.println("The Sum Of First 50 Natural Numbers Is: "+sum);
    }
    static void sumOfEvenNumbers(){}
    static void multiplicationTable(int n){
        for(int i =1;i<=12;i++){
            System.out.println(n+"* "+i+" = "+(i*n));
        }
    }
    static void numberOfDigits(int n){
        int count =0;
        while(n>0){
            n=n/10;
            count++;
        }
        System.out.println("the number of digits is: "+count);
    }
    static void reverseNumber(int n){
        String num = Integer.toString(n);
        for(int i =num.length()-1;i>=0;i--){
            System.out.print(num.charAt(i));
        }
    }
    static void printFibonacciSeries(int n) {
        int firstTerm = 0, secondTerm = 1;
        if (n >= 1) {
            System.out.print(firstTerm + " ");
        }
        if (n >= 2) {
            System.out.print(secondTerm + " ");
        }
        for (int i = 3; i <= n; i++) {
            int nextTerm = firstTerm + secondTerm;
            System.out.print(nextTerm + " ");
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
    static void factorial(int n){
        int sum = 1;
        for (int i = n; i >= 2; i--) {
            sum *= i;
        }
        System.out.println("the factorial is: "+sum);
    }
    static void isPalindrome(int n) {
        String num = Integer.toString(n);
        int size = num.length();
        int left = 0;
        int right = size - 1;
        while (left < right) {
            if (num.charAt(left) != num.charAt(right)) {
                System.out.println("The number is not a palindrome");
                return;
            }
            left++;
            right--;
        }
        System.out.println("The number is a palindrome");
    }
    static void GCD(int a, int b) {
        int temp;
        if (a>b){
            temp = a;
        }
        else {
             temp = b;
        }
        while(temp>0){
            if(b%temp==0&&a%temp==0){
                System.out.println("The GCD of "+a+" and "+b+" is: "+temp);
                break;
            }
            temp--;
        }
    }
    //////////////////////////////////////////////////Arrays
    static void largestElement(int [] arr){
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>temp){
                temp = arr[i];
            }
        }
        System.out.println("The largest element is: "+temp);
    }
    static void smallestElement(int [] arr){
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<temp){
                temp = arr[i];
            }
        }
        System.out.println("The smallest element is: "+temp);
    }
    static void sumOfAllElements(int [] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("The sum of all elements is: "+sum);
    }
    static void reverseArray(int[] arr) {
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            s.push(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.pop();
            System.out.print(arr[i] + " ");
        }
    }
    static void isEqual(int[]arr1,int[]arr2){
        if(arr1.length!=arr2.length){
            System.out.println("The arrays are not equal");
            return;
        }
        int it =0;
        while(it<arr1.length){
            if(arr1[it]!=arr2[it]){
                System.out.println("The arrays are not equal");
            }
            it++;
        }
        System.out.println("The arrays are equal");
    }
    static void secondLargestElement(int[] arr){
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>temp){
                temp = arr[i];
            }
        }
        int number=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>number&&arr[i]!=temp){
                number=arr[i];
            }
        }
        System.out.println("The second largest element is: "+number);
    }
    static void ascendingSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        System.out.println("The ascending sort of the array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void descendingSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        System.out.println("The descending sort of the array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void elementFrequency(int[] arr) {
        boolean[] visited = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (visited[i]) {
                continue;
            }
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                    visited[j] = true;
                }
            }
            System.out.println("The frequency of element " + arr[i] + " is: " + count);
        }
    }
    static void mergeTwoArrays(int[] arr1, int[] arr2) {
        int[] arr = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr[arr1.length + i] = arr2[i];
        }
        System.out.println("Merged Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    //////////////////////////////////////////////////Strings
    static void isStringPalindrome(String str) {
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
    static void countVowelsAndConsonants(String str){
        int vowels =0;
        int consonants =0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='o'||str.charAt(i)=='u'||str.charAt(i)=='i'){
                vowels++;
            }
            else{
                consonants++;
            }
        }
        System.out.println("the number of vowels in the string is: "+vowels);
        System.out.println("the number of consonants in the string is: "+consonants);
    }
    static void reverseString(String str){
        StringBuilder reversedStr = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr.append(str.charAt(i));
        }
        System.out.println("The reversed string: " + reversedStr.toString());
    }
    static void isAnagram(String str1, String str2){
        if(str1.length()!=str2.length()){
            System.out.println("The strings are not anagram");
            return;
        }
        int n1 =0,n2 =0;
        for(int i=0;i<str1.length();i++){
           n1+=str1.charAt(i);
           n2+=str2.charAt(i);
        }
        if(n1==n2){
            System.out.println("The strings are anagram");
        }
        else {
            System.out.println("The strings are not anagram");
        }
    }
    static void findFirstNonRepeatingChar(String str) {
        int n = str.length();
        for (int i = 0; i < n; i++) {
            char currentChar = str.charAt(i);
            boolean isRepeating = false;
            for (int j = 0; j < n; j++) {
                if (i != j && currentChar == str.charAt(j)) {
                    isRepeating = true;
                    break;
                }
            }
            if (!isRepeating) {
                System.out.println("The first non repeating character is: " + currentChar);
                return;
            }
        }
        System.out.println("there is no non repeating character");
    }
    static void replaceWhiteSpcases(String str) {
        int n = str.length();
        for (int i = 0; i < n; i++) {
            if (Character.isWhitespace(str.charAt(i))) {
                str = str.replace(str.charAt(i), '-');
            }
        }
        System.out.println("The replaced string is: " + str);
    }
    static void occurrencesOfSpecificChar(String str, Character ch) {
        int n =0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                n++;
            }
        }
        System.out.println("the occurrences of "+ch+" in "+str+" is: " + n);
    }
    static void capitalize(String str) {
        str = str.substring(0, 1).toUpperCase() + str.substring(1);

        int index = str.indexOf(' ');
        while (index != -1) {
            str = str.substring(0, index + 1) + str.substring(index + 1, index + 2).toUpperCase() + str.substring(index + 2);
            index = str.indexOf(' ', index + 1);
        }
        System.out.println("The capitalized string is: " + str);
    }
    static void findLongestWord(String sentence) {
        String[] words = sentence.split(" ");
        String longestWord = "";
        int maxLength = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > maxLength) {
                maxLength = words[i].length();
                longestWord = words[i];
            }
        }
        System.out.println("The longest word is: " + longestWord + " which has " + maxLength + " characters.");
    }
    static void containsOnlyDigits(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                System.out.println("The string is not a digit");
                return;
            }
        }
        System.out.println("The string is a digit");
    }
    //////////////////////////////////////////////////conditions
    static void positiveNegativeZero(int x){
        if (x>0){
            System.out.println("number is positive");
        } else if (x<0) {
            System.out.println("number is negative");
        }
        else{
            System.out.println("number is zero");
        }
    }
    static void findLargestNumber(int n1,int n2,int n3){
        if(n1>=n2&&n1>=n3){
            System.out.println(n1+" is the greatest");
        }
        else if(n2>=n3&&n2>=n1){
            System.out.println(n2+" is the greatest");
        }
        else{
            System.out.println(n3+" is the greatest");
        }
    }
    static void isLeapYear(int x){
        if(x%4==0){
            System.out.println(x+" is leap year");
        }
        else{
            System.out.println(x+" is not leap year");
        }
    }
    static void vowelOrConsonants(Character x){
        if (x=='a'||x=='o'||x=='u'||x=='e'||x=='i'||x=='A'||x=='O'||x=='U'||x=='E'||x=='I'){
            System.out.println(x+" is vowel");
        }
        else{
            System.out.println(x+" is consonant");
        }
    }
    static void findRoots(int a, int b , int c){
        if (b*b>4*a*c){
            double root1 = (-b+Math.pow(b*b-4*a*c,0.5))/2*a;
            double root2 = (-b-Math.pow(b*b-4*a*c,0.5))/2*a;
            System.out.println("the roots are real:");
            System.out.println("the first root is: "+root1);
            System.out.println("the second root is: "+root2);
        }
        else{
            double discriminant = b * b - 4 * a * c;
            double realPart = -b / (2.0 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("The roots are imaginary:");
            System.out.println("Root 1: " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root 2: " + realPart + " - " + imaginaryPart + "i");
        }
    }
    static void gradCheck(int grade){
        if (grade>90&&grade<=100){
            System.out.println("The grade is A");
        }
        else if (grade>80&&grade<=90){
            System.out.println("The grade is B");
        }
        else if (grade>60&&grade<=80){
            System.out.println("The grade is C");
        }
        else if (grade>50&&grade<=60){
            System.out.println("The grade is D");
        }
        else if (grade<50&&grade>=0){
            System.out.println("The grade is F");
        }
        else{
            System.out.println("the grade is not valid");
        }
    }
    static void divisibleBy5and3(int x){
        if(x%3==0&&x%5==0){
            System.out.println(x+" is divisible by 5 and 3");
        }
        else{
            System.out.println(x+" is not divisible by 3 and 5");
        }
    }
    static void smallestNumber(int x1, int x2, int x3, int x4) {
        if (x1 < x2) {
            if (x1 < x3) {
                if (x1 < x4) {
                    System.out.println(x1 + " is smallest");
                } else {
                    System.out.println(x4 + " is smallest");
                }
            } else {
                if (x3 < x4) {
                    System.out.println(x3 + " is smallest");
                } else {
                    System.out.println(x4 + " is smallest");
                }
            }
        } else {
            if (x2 < x3) {
                if (x2 < x4) {
                    System.out.println(x2 + " is smallest");
                } else {
                    System.out.println(x4 + " is smallest");
                }
            } else {
                if (x3 < x4) {
                    System.out.println(x3 + " is smallest");
                } else {
                    System.out.println(x4 + " is smallest");
                }
            }
        }
    }
    static void evenOrOdd(int x){
        if(x%2==0)
            System.out.println(x+" is even");
        else
            System.out.println(x+" is odd");
    }
    static void billCalculation(int usage,int rate){
        if (rate==1){
            double bill = usage*1.5;
            System.out.println("The bill is: "+bill + " EGP");
        }
        else if (rate==2){
            double bill = usage*2.5;
            System.out.println("The bill is: "+bill+" EGP");
        }
        else if (rate==3){
            double bill = usage*3.5;
            System.out.println("The bill is: "+bill+" EGP");
        }
        else{
            System.out.println("the rate is not valid");
        }
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        //////////////////////////////////////////////loops
        //printNumbers();
        //printEvenNumbers();
        //sumOfNaturalNumbers();
        //multiplicationTable(2);
        //numberOfDigits(100);
        //reverseNumber(123);
        //printFibonacciSeries(10);
        //factorial(5);
        //isPalindrome(16461);
        //GCD(18,9);
        //////////////////////////////////////////////Arrays
        int[] arr = {5,7,8,4,3,6,8,12,9,8,4,4};
        //largestElement(arr);
        //smallestElement(arr);
        //sumOfAllElements(arr);
        //reverseArray(arr);
        int [] arr1 = {1,2,3,4,5};
        int [] arr2 = {1,2,3,4,5};
        //isEqual(arr1,arr2);
        //isEqual(arr,arr2);
        //secondLargestElement(arr);
        //ascendingSort(arr);
        //descendingSort(arr);
        //elementFrequency(arr);
        //mergeTwoArrays(arr1,arr2);
        //////////////////////////////////////////////strings
        //isStringPalindrome("abcba");
        //countVowelsAndConsonants("kareem");
        //reverseString("kareem");
        //isAnagram("kareem","meerak");
        //findFirstNonRepeatingChar("swiss");
        //replaceWhiteSpcases("kareem mohamed shawki");
        //occurrencesOfSpecificChar("kareem",'e');
        //capitalize("kareem mohamed shawki");
        //findLongestWord("kareem mohamed shawki");
        //containsOnlyDigits("12345");
        //////////////////////////////////////////////conditions
        //positiveNegativeZero(0);
        //findLargestNumber(10,15,12);
        //isLeapYear(2004);
        //vowelOrConsonants('a');
        //findRoots(1,1,1);
        //gradCheck(85);
        //divisibleBy5and3(15);
        //smallestNumber(10,20,30,40);
        //evenOrOdd(2);
        //billCalculation(100,2);
    }
}