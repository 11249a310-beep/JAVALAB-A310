import java.util.Scanner;
class Student {
    int rollNo;
    String name;
    void getStudentDetails() {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Roll Number:");
        rollNo=sc.nextInt();
        sc.nextLine();
        System.out.print("enter student name:");
        name=sc.nextLine();
    }
    void displayStudentDetails() {
        System.out.println("\nRoll Number:"+rollNo);
        System.out.println("Student Name:" +name);
    }
}
class Marks extends Student {
    int m1,m2,m3,m4,m5;
    void getmarks() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter mark 1:");
        m1=sc.nextInt();
        System.out.print("Enter mark 2:");
        m2=sc.nextInt();
        System.out.print("Enter mark 3:");
        m3=sc.nextInt();
        System.out.print("Enter mark 4:");
        m4=sc.nextInt();
        System.out.print("Enter mark 5:");
        m5=sc.nextInt();
    }
}
class Result extends Marks {
    int total;
    double average;
    String grade;
    void calculateResult() {
        total=m1+m2+m3+m4+m5;
        average=total/5.0;
        if (average>=90)
        grade="a";
        else if (average>=75)
        grade="b";
        else if(average>=60)
        grade="c";
        else if(average>=50)
        grade ="Fail";
    }
    void displayResult() {
        displayStudentDetails() ;
            System.out.println("Total Marks:"+total);
            System.out.println("Average:"+average);
            System.out.println("Grade:"+grade);
        }
    }
    public class Multilevel {
        public static void main(String[] args) {
            Result r=new Result ();
            r.getStudentDetails();
            r.getmarks();
            r.calculateResult();
            r.displayResult();
        }
    }
