class student {
    int roll_no;
    String studentName;
}
public class main{
    public static void main(String[] args){
        student obj1= new student();
        obj1.roll_no=1;
        obj1.studentName="Sanika";
        System.out.println(obj1.roll_no);
        System.out.println(obj1.studentName);
    }
}
