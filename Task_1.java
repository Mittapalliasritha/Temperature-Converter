import java.util.*;

class Task_1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Temperature value:");
        double temp = sc.nextDouble();
        System.out.print("Enter the unit(C for Celsius, F for Fahrenheit):");
        char unit = sc.next().toUpperCase().charAt(0);
        // perform conversion
        // Celsius to Fahrenheit
        if (unit == 'C') {
            double f = (temp * 9 / 5) + 32;
            System.out.printf("%2f degree celsius is equal to %2f degree fahrenheit", temp, f);

        }
        // Fahrenheit to celsius
        else if (unit == 'F') {
            double c = (temp - 32) * 5 / 9;
            System.out.printf("%2f degree f is equal to %2f degree c", temp, c);
        } else {
            System.out.println("Invalid unit! please enter C for celsius or F for Fahrenheit. ");
        }
        sc.close();

    }
}