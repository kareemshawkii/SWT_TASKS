public class Main {
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
    static void checkLeapYear(int x){
        if(x%4==0){
            System.out.println("the year is a leap year");
        }
        if(x%4!=0){
            System.out.println("the year is not leap year");
        }
    }
    static void calculate(double num1, double num2, char operator) {
        if (operator == '+') {
            System.out.println("Result: " + (num1 + num2));
        }
        if (operator == '-') {
            System.out.println("Result: " + (num1 - num2));
        }
        if (operator == '*') {
            System.out.println("Result: " + (num1 * num2));
        }
        if (operator == '/') {
            if (num2 != 0) {
                System.out.println("Result: " + (num1 / num2));
            }
            if (num2 == 0) {
                System.out.println("Error: Division by zero is not allowed.");
            }
        }
        if (operator != '*'&& operator != '/' && operator != '+' && operator != '-') {
            System.out.println("invalid operator");
        }
    }
    static void isTringleValid(int x,int y,int z){
      if((x+y+z)==180) {
          System.out.println("Tringle is valid");
      }
      if((x+y+z)!=180) {
            System.out.println("Tringle is not valid");
      }
    }
    static void isCharVowel(char c){
        if (c == 'a'||c=='A') {
            System.out.println("char "+c+" is vowel");
        }
        if (c == 'e'||c=='E') {
            System.out.println("char "+c+" is vowel");
        }
        if (c == 'i'||c=='I') {
            System.out.println("char "+c+" is vowel");
        }
        if (c == 'o'||c=='O') {
            System.out.println("char "+c+" is vowel");
        }
        if (c == 'u'||c=='U') {
            System.out.println("char "+c+" is vowel");
        }
        if(c != 'a'&&c!='A'&&c != 'e'&&c!='E'&&c != 'i'&&c!='I'&&c != 'o'&&c!='O'&&c != 'u'&&c!='U'){
            System.out.println("char "+c+" is consonant");
        }

    }
    static void ageCheck(int x){
        if(x>=30&&x<50){
            System.out.println("you are old enough");
        }
        if(x>=50){
            System.out.println("you are so enough");
        }
        if(x<30&&x>0){
            System.out.println("you are young");
        }
        if(x<0){
            System.out.println("The age is not valid");
        }
    }
    static void evenOrOdd(int x){
        if(x>0) {
            x = x % 2;
            if (x == 0) {
                System.out.println("number is even and positive");
            }
            if (x == 1) {
                System.out.println("number is odd and positive");
            }
        }
        if(x<0){
            System.out.println("number is negative and invalid");
        }
    }
    static void grade(int x){
        if(x>=97&&x<=100){
            System.out.println("grade of "+x+" is A+");
        }
        if(x<97&&x>=93){
            System.out.println("grade of "+x+" is A");
        }
        if(x<93&&x>=89){
            System.out.println("grade of "+x+" is A-");
        }
        if(x<89&&x>=86){
            System.out.println("grade of "+x+" is B+");
        }
        if(x<86&&x>=82){
            System.out.println("grade of "+x+" is B");
        }
        if(x<82&&x>=79){
            System.out.println("grade of "+x+" is B-");
        }
        if(x<79&&x>=76){
            System.out.println("grade of "+x+" is C+");
        }
        if(x<76&&x>=72){
            System.out.println("grade of "+x+" is C");
        }
        if(x<72&&x>=69){
            System.out.println("grade of "+x+" is C-");
        }
        if(x<69&&x>=66){
            System.out.println("grade of "+x+" is D+");
        }
        if(x<66&&x>=63){
            System.out.println("grade of "+x+" is D");
        }
        if(x<63&&x>=60){
            System.out.println("grade of "+x+" is D-");
        }
        if(x<60&&x>=0){
            System.out.println("grade of "+x+" is F");
        }
        if(x<0){
            System.out.println("the grade of "+x+" is not valid");
        }
        if(x>100){
            System.out.println("the grade of "+x+" is not valid");
        }
    }


    public static void main(String[] args) {
     System.out.println("--------------------------");
     largestNumber(3,2,4);
     largestNumber(6,5,7);
     System.out.println("--------------------------");
     checkLeapYear(2004);
     checkLeapYear(2008);
     checkLeapYear(2009);
     System.out.println("--------------------------");
     calculate(1.5,2,'*');
     calculate(4,2,'/');
     calculate(3,3,'+');
     calculate(4,2,'-');
     calculate(4,2,'%');
     System.out.println("--------------------------");
     isTringleValid(60,30,90);
     isTringleValid(100,10,180);
     System.out.println("--------------------------");
     isCharVowel('a');
     isCharVowel('A');
     isCharVowel('e');
     isCharVowel('E');
     isCharVowel('i');
     isCharVowel('I');
     isCharVowel('o');
     isCharVowel('O');
     isCharVowel('u');
     isCharVowel('U');
     isCharVowel('z');
     isCharVowel('N');
     System.out.println("--------------------------");
     ageCheck(30);
     ageCheck(45);
     ageCheck(60);
     ageCheck(50);
     ageCheck(10);
     ageCheck(-50);
     System.out.println("--------------------------");
     evenOrOdd(40);
     evenOrOdd(13);
     evenOrOdd(-13);
     System.out.println("--------------------------");
     grade(100);
     grade(99);
     grade(96);
     grade(90);
     grade(88);
     grade(82);
     grade(79);
     grade(76);
     grade(75);
     grade(70);
     grade(67);
     grade(65);
     grade(60);
     grade(50);
     grade(0);
     grade(-50);
     grade(101);
     System.out.println("--------------------------");
    }
}
