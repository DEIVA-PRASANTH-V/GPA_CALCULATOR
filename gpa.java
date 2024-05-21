import java.util.InputMismatchException;
import java.util.Scanner;

class Main
{
    public static void main(String[] args) {
        int credits1=0,credits2=0,credits3=0,credits4=0,credits5=0,add_credits;
        float grade_points1=0,grade_points2=0,grade_points3=0,grade_points4=0,
                grade_points5=0,cgp1,cgp2,cgp3,cgp4,cgp5,add_of_cp_1_2,gpa;
        int a = 1;
        while (a==1) {
            System.out.println("\t==============");
            System.out.println("\tGPA CALCULATOR");
            System.out.println("\t==============");
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Credit1:");
                credits1 = scanner.nextInt();
                Scanner scanner1 = new Scanner(System.in);
                System.out.println("Grade points1:");
                grade_points1 = scanner1.nextFloat();

                Scanner scanner2 = new Scanner(System.in);
                System.out.println("Credit2:");
                credits2 = scanner2.nextInt();
                Scanner scanner3 = new Scanner(System.in);
                System.out.println("Grade points2:");
                grade_points2 = scanner3.nextFloat();

                Scanner scanner4 = new Scanner(System.in);
                System.out.println("Credit2:");
                credits3 = scanner2.nextInt();
                Scanner scanner5 = new Scanner(System.in);
                System.out.println("Grade points2:");
                grade_points3 = scanner3.nextFloat();

                Scanner scanner6 = new Scanner(System.in);
                System.out.println("Credit2:");
                credits4 = scanner2.nextInt();
                Scanner scanner7 = new Scanner(System.in);
                System.out.println("Grade points2:");
                grade_points4 = scanner3.nextFloat();

                Scanner scanner8 = new Scanner(System.in);
                System.out.println("Credit2:");
                credits5 = scanner2.nextInt();
                Scanner scanner9 = new Scanner(System.in);
                System.out.println("Grade points2:");
                grade_points5 = scanner3.nextFloat();

            } catch (InputMismatchException e) {
                System.out.println("enter a valid input");
            }

            // adding of credits
            add_credits = credits1 + credits2 + credits3 + credits4 + credits5;
            // multiply the credits with grade points
            cgp1 = credits1 * grade_points1;
            cgp2 = credits2 * grade_points2;
            cgp3 = credits3 * grade_points3;
            cgp4 = credits4 * grade_points4;
            cgp5 = credits5 * grade_points5;


            add_of_cp_1_2 = cgp1 + cgp2 + cgp3 + cgp4 + cgp5;
            gpa = add_of_cp_1_2 / add_credits;

            System.out.println("your GPA:" + gpa);
        }
    }
