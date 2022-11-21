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
            System.out.println("1.Add employee\n2.View employee\n3.Search employee\n4.Delete employee\n5.Exit");
            System.out.println("Enter your choice:");
            c = sc.nextInt();
        }while (c!=5);
    }
}