import java.util.Scanner;
public class Student {
    String studName;
    String regNo;
    String dept;
    int year;
     Scanner input = new Scanner(System.in);
     Student(){
        System.out.println("Enter the Student Name: ");
        this.studName = input.nextLine();
        System.out.println("Enter the Register Number: ");
        this.regNo = input.nextLine();
        System.out.println("Enter the Department: ");
        this.dept = input.nextLine();
        System.out.println("Enter the Year ");
        this.year = input.nextInt();
     }
}