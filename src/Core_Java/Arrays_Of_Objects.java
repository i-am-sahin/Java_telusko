package Core_Java;
 class Student{
    String Name;
    int Roll;
    int Marks;
}
public class Arrays_Of_Objects {
    public static void main(String[] args) {

        Student s1 = new Student();

        s1.Name = "Sahin";
        s1.Marks = 65;
        s1.Roll = 1;

        Student s2 = new Student();

        s2.Name = "Sayak";
        s2.Marks = 85;
        s2.Roll = 2;

        Student s3 = new Student();

        s3.Name = "Abc";
        s3.Marks = 95;
        s3.Roll = 3;

        //Arrays Of Objects

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        for(int i = 0; i < students.length;i++){
            System.out.println(students[i].Name + " : " + students[i].Roll + " : " + students[i].Marks);
        }
        for(Student i : students){
            System.out.println(i.Name + " : " + i.Roll + " : " + i.Marks);
        }


    }
}
