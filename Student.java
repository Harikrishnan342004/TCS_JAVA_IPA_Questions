import java.util.Scanner;
import java.util.Stack;

class Student {
    int studentId;
    String studentName;
    double studentMarks;

    //constructor
    public  Student( int studentId,  String studentName , double studentMarks )
    {
       this.studentId = studentId;
       this.studentName = studentName;
       this.studentMarks = studentMarks;
    }
}
public class studentSearch{

    public static void findStudent( Student[] students , String name)
    {
        for(Student student : students )
        {
           if( student.studentName.equalsIgnoreCase(name) )
           {
              System.out.println("StudentID :"+ student.studentId);
              return;
           }
        }
    System.out.println("No Student Found");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        System.out.println("Enter the count:");
        int N = sc.nextInt();
        sc.nextLine();

        Student[] students = new Student[N];
        
        for( int i = 0; i < N ; i++ )
        {
           System.out.println("Enter the student ID: ");
           int id = sc.nextInt();

           sc.nextLine();
           
           System.out.println("Enter the student Name: ");
           String name = sc.nextLine();

           System.out.println("Enter the student Mark:");
           int marks = sc.nextInt();

           students[i] = new Student( id ,  name , marks );

    }
    System.out.println("Enter the name of student: ");
    sc.nextLine();
    String searchName = sc.nextLine();
    findStudent(students, searchName);

    sc.close();
    }
}

