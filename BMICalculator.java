import java.util.Scanner;

public class BMICalculator{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        double m, kg, bmi, inches, mtoinches, inchesperm, lbsperkg, lbstok; 

        inchesperm = 39.3701;
        lbsperkg = 2.20462;

        System.out.print("Your height in m: " );
        m = keyboard.nextDouble();
                
        System.out.print("Your weight in kg: ");
        kg = keyboard.nextDouble();


        bmi = kg / (m*m);
        mtoinches =  m *  inchesperm;
        lbstok =  kg * lbsperkg;


        System.out.println("Your BMI is " + bmi );
        System.out.println("Your height in inches is " + mtoinches );
        System.out.println("Your height in inches is " + lbstok );


    }
}