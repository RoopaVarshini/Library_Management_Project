import java.util.Scanner;
public class Book {
    int bookSno;
    String bookName;
    String authorName;
    Scanner input = new Scanner(System.in);
    Book(){ 
        System.out.println("Enter the BookSno: ");
        this.bookSno = input.nextInt();
        input.nextLine();
        System.out.println("Enter the Book Name: ");
        this.bookName = input.nextLine();
        System.out.println("Enter the Author Name: ");
        this.authorName = input.nextLine();
    }
}
