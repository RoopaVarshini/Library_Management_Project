import java.util.Scanner;
public class Library {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		Books ob = new Books();
		Students obStudent = new Students();
		int choice;
		do {

			System.out.println("Enter the choice: ");
			choice = input.nextInt();
			switch (choice) {
			case 1:
				Book b = new Book();
				ob.addBook(b);
				break;
            case 2:
                ob.searchBybookSno();
                break;
            case 3:
                ob.authorName();
                break;
            case 4:
                ob.showAllBooks();
                break;
			case 5:
                Student s = new Student();
                obStudent.addStudent(s);
                break;
			case 6:
                obStudent.showAllStudent();
                break;
			default:
			}
		}while (choice != 0);
        input.close();
	}
}