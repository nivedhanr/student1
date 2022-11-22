import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.Scanner;
class Student {

    String StudentName;
    int AdNo;
    int RollNo;
    String CollegeName;

    public Student(String studentName, int adNo, int rollNo, String collegeName) {
        this.StudentName = studentName;
        this.AdNo = adNo;
        this.RollNo = rollNo;
        this.CollegeName = collegeName;
    }
}
public class Main {
    public static void main(String[] args) {
        ArrayList<Student> Studarr = new ArrayList<Student>();
        ArrayList<String> jsonarray = new ArrayList<String>();

        while (true) {
            System.out.println("Select an option \n1.Add Student\n2.View Student\n3.Search Student\n4.Delete Student\n5.Exit\n6.Json Array");
            Scanner xy = new Scanner(System.in);
            int option = xy.nextInt();
            if (option == 5) {
                System.out.println("You are exiting from the program");
                System.exit(0);
            } else {
                switch (option) {
                    case 1:
                        System.out.println("Enter Students details");
                        Scanner XY = new Scanner(System.in);
                        System.out.println("Enter name");
                        String ab = XY.next();
                        System.out.println("Enter AdNo");
                        int cd = XY.nextInt();
                        System.out.println("Enter RollNo");
                        int ef = XY.nextInt();
                        System.out.println("Enter College");
                        String gh = XY.next();
                        Student S = new Student(ab, cd, ef, gh);
                        Studarr.add(S);
                        jsonarray.add(new Gson().toJson(S));
                        break;
                    case 2 :
                        System.out.println(jsonarray);
                        for (Student std : Studarr) {
                            System.out.println("Print Student Details " );
                            System.out.println(std.StudentName);
                            System.out.println(std.AdNo);
                            System.out.println(std.RollNo);
                            System.out.println(std.CollegeName);


                        }
                        break;
                    case 3 :
                        System.out.println("Enter Add No");
                        Scanner sc = new Scanner(System.in);
                        int addno1 = sc.nextInt();
                        for (Student S1 : Studarr) {
                            if (addno1 == S1.AdNo){
                                System.out.println("Details of student with ad no " + addno1 + "is ");
                                System.out.println(S1.StudentName);
                                System.out.println(S1.AdNo);
                                System.out.println(S1.RollNo);
                                System.out.println(S1.CollegeName);
                                break;
                            }
                            else {
                                System.out.println("Student not found");
                            }
                        }
                        break;
                    case 4 :
                        System.out.println("Enter Student Ad no");
                        Scanner xz = new Scanner(System.in);
                        int addno2 = xz.nextInt();
                        for (Student S1 : Studarr){
                            if (addno2 == S1.AdNo){
                                Studarr.remove(S1);
                                System.out.println("Student deleted is:");
                                System.out.println(S1.StudentName);
                                System.out.println(S1.AdNo);
                                System.out.println(S1.RollNo);
                                System.out.println(S1.CollegeName);
                                break;
                            }
                        }
                        break;
                    case 6:
                        System.out.println(jsonarray);
                        break;
                }
            }
        }
    }
}