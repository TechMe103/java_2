import java.util.Scanner;

public class StudentClasses {
    public static class Student {
        String name;
        int rno;
        double percent;

        // Constructor for Student class
        public Student(String name, int rno, double percent) {
            this.name = name;
            this.rno = rno;
            this.percent = percent;
        }


    }

    public static void fun(Student s1) {
        System.out.println(s1.name);
    }
    private int roll;
    public void setrno(int rno){
        
        rno= roll;
    }
    private int rno;
    public int getrno(){
        return rno;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Assuming we want to read some input
        System.out.print("Enter a number: ");
        int input = sc.nextInt(); // Store the input (even if it's not used later)
        
        // Creating a Student object using the constructor
        Student s1 = new Student("Sanika", 30, 93.67);
        
        // Print student details
        System.out.println("Name: " + s1.name);
        System.out.println("Roll Number: " + s1.rno);
        System.out.println("Percentage: " + s1.percent);
        //System.out.println(s1.getrno());
        
        // Call the fun method
        fun(s1);
        
        // Close the Scanner
        sc.close();
    }
}
