import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String student;
        int math;
        int eng;
        int bio;
        int phy;
        int che;
        double total;
        double average;


        System.out.print("Enter your full-name: ");
        student = scanner.nextLine();
        System.out.print("Enter your score in Mathematics: ");
        math = scanner.nextInt();
        System.out.print("Enter your score in English language: ");
        eng = scanner.nextInt();
        System.out.print("Enter your score in Physics: ");
        phy = scanner.nextInt();
        System.out.print("Enter your score in Biology: ");
        bio = scanner.nextInt();
        System.out.print("Enter your score in Chemistry: ");
        che = scanner.nextInt();

        total = math + eng + phy + bio + che;
        average = total / 5;
        if (math < 40 || eng < 40 || phy < 40|| bio < 40 || che < 40){
            System.out.println("Grade F");
            System.out.println("Status: Failed");
        }
        else {
            if (average >= 80){
                System.out.println("Grade A");
            }
            else if (average >= 70) {
                System.out.println("Grade B");
            }
            else if (average >= 60) {
                System.out.println("Grade C");
            }
            else if (average >= 50) {
                System.out.println("Grade D");
            }
        }
        String result = average >= 50 ? "Status: Pass" : "Status: Failed";
        System.out.println(result);
        }
    }
