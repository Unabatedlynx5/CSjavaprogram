import java.util.Scanner;

public class adult {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        
        System.out.print("Name: ");
        String name = obj.nextLine();
        
        System.out.print("Age: ");
        int age = obj.nextInt();

        int ageAdult = 18 - age;
        
        if (ageAdult < 0) {
            System.out.println(name + ", you are an adult");
        }
        else {
            System.out.println(name + " has " + ageAdult + " years until " + name + " are an adult");
        }

    }
}
