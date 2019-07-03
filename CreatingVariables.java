public class CreatingVariables{
    public static void main(String[] args){
        int x, y, age, income;
        double seconds, e, checking, minute;
        String firstName, lastName, title, job;

        x = 10;
        y = 400;
        age = 39;
        income = 17000;

        seconds = 4.71;
        e = 2.71828182845904523536;
        checking = 1.89;
        minute = 20.5;

        firstName = "Graham";
        lastName = "Mitchell";
        title = "Mr. ";
        job = "instructional associate";

        System.out.println( "The variable x contains " + x );
        System.out.println( "The value " + y + " is stored in the variable y. " );
        System.out.println( "The experiment took " + seconds + " seconds." );
        System.out.println( "A favorite irrational # Euler's number: " + e );
        System.out.println( "Hopefully you have more than $" + checking + "!" );
        System.out.println( "My name's " + title + " " + firstName + lastName );
        System.out.println( "My income for 10 weeks is: " + income + "." + " I need a " + minute + " minute " + "nap. " + "I work as an " + job + "."  );
    }
}