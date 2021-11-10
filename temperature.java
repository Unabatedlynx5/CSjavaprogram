import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        System.out.print("Temperature in Celsius: ");
        int celsius = input.nextInt();

        double ferhenheit = (celsius * 9/5) + 32;
        double kelvin = celsius -  273.15;

        System.out.println("The temperature is " + ferhenheit + " degrees fahrenheit.");
        System.out.println("The temperature is " + kelvin + " degrees Kelvin.");
    }
}
