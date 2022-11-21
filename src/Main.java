import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            int c,i=2;
            Scanner sc=new Scanner(System.in);
            String[] name=new String[2];
            String[] roll_no=new String[2];
            String[] ad_num=new String[2];
            String[] college=new String[2];
        do {
            System.out.println("1.Add Students\n2.List all the student\n3.Search a student with admission number\n4.Delete a student with admission number\n5.Exit");
            System.out.println("Enter your choice:");
            c = sc.nextInt();
            switch (c) {
                case 1:
                    for (int a = 0; a < 2; a++){
                        System.out.println("Student Details");
                        System.out.println("Student name");
                        name[a] = sc.next();
                        System.out.println("Roll number");
                        roll_no[a] = sc.next();
                        System.out.println("Admission number");
                        ad_num[a] = sc.next();
                        System.out.println("College");
                        college[a] = sc.next();
                    }
                    break;
                default:
                    System.out.println("Invalid entry");
            }

        }while (c!=5);
    }
}