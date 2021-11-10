import java.util.Scanner;

public class label {
    
    public static void main(String[] args) {
        
        Scanner info = new Scanner(System.in);
        System.out.print("\nName: ");
        String name = info.nextLine();
        System.out.print("Address: ");
        String address = info.nextLine();
        System.out.print("City: ");
        String city = info.nextLine();
        System.out.print("State: ");
        String state = info.nextLine();
        System.out.print("Zip Code: ");
        String zip = info.nextLine();
        System.out.println("\n" + name);
        System.out.println(address);
        System.out.println(city + " " + state + ", " + zip);


    }
}
