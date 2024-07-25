import java.util.Scanner;
class Students{
    Scanner input = new Scanner(System.in);
    Student theStudent[] = new Student[5];
    int count = 0;
    void addStudent(Student s)
    {
        for (int i = 0; i < count; i++) {

            if (s.regNo.equalsIgnoreCase(theStudent[i].regNo)) {
                System.out.println("Student of Reg No " + s.regNo + " is Already Registered.");
                return;
            }
        }
        if (count <= 50) {
            theStudent[count] = s;
            count++;
            System.out.println("Student added Successfully.");
        }
    }

    public void showAllStudent()
    {
        System.out.println("Student Name\tReg Number\t\t dept \t\t Year");
        for (int i = 0; i < count; i++) {
            System.out.println(theStudent[i].studName + "\t\t\t" + theStudent[i].regNo +"\t\t" + theStudent[i].dept + "\t\t"
            + theStudent[i].year);
        }
    }

    int isStudent()
    {
        System.out.println("Enter Reg Number:");
        String regNo = input.nextLine();
        for (int i = 0; i < count; i++) {
            if (theStudent[i].regNo.equalsIgnoreCase(regNo)) {
                return i;
            }
        }
        System.out.println("Student is not Registered.");
        System.out.println("Get Registered First.");
        return -1;
    }
}