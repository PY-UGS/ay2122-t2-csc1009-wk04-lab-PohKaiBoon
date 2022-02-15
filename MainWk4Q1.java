import java.util.Scanner;

public class MainWk4Q1 {
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");

        double pounds = sc.nextDouble();

        System.out.print("Enter height in inches: ");

        double inches = sc.nextDouble();


        BMI bmi1= new BMI(pounds, inches);
        bmi1.calculateBMI();
        bmi1.determineBMI();
        
    }
}
