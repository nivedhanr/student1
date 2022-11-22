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
                case 2:
                    System.out.println("Student Details");
                    for(int a=0;a<2;a++) {
                        System.out.println("Student name"+name[a]);
                        System.out.println("Roll number"+roll_no[a]);
                        System.out.println("Admission number"+ad_num[a]);
                        System.out.println("College"+college[a]);
                        System.out.println("");
                    }
                    break;
                case 3:
                    System.out.println("Enter the Admission number:");
                    int s=sc.nextInt();
                    boolean f=false;
                    for(int a=0;a<2;a++){
                        if(ad_num[a] == s){
                            f=true;
                        }
                    }
                    if(f==true){
                        for(int a=0;a<2;a++){
                            System.out.println("Student admission no"+ad_num[a]);
                            System.out.println("Student name"+name[a]);
                            System.out.println("Student roll number"+roll_no[a]);
                            System.out.println("College"+college[a]);
                            System.out.println("");

                        }
                    }
                    else{
                        System.out.println("Data is not found");
                    }
                    break;
                case 4:
                    System.out.println("Enter the Admission number:");
                    int g=sc.nextInt();
                    int count=0;
                    boolean f1=false;
                    for(int a=0;a<2;a++){
                        if(ad_num[a] == g){
                            f1=true;
                        }
                        count++;
                    }
                    if(f1==true){
                        for(int a=count;a<count;a++){
                            ad_num[a]=ad_num[a+1];
                            name[a]=name[a+1];
                            roll_no[a]=roll_no[a+1];
                            college[a]=college[a+1];
                        }
                    }
                    for(int a=0;a<1;a++){
                        System.out.println("Student admission no"+ad_num[a]);
                        System.out.println("Student name"+name[a]);
                        System.out.println("Student roll number"+roll_no[a]);
                        System.out.println("College"+college[a]);
                        System.out.println("");

                    }
                    break;



                default:
                    System.out.println("Invalid entry");
            }

        }while (c!=5);
    }
}