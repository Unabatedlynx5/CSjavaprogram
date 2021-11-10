import java.util.Scanner;

class cars {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int milesDriven;
        int lastOilChange;
        int milesTillOilChange;
        boolean needOilChange;

        System.out.print("Miles Driven:");
        milesDriven = myObj.nextInt();
        
        System.out.print("Miles since last oil change:");
        lastOilChange = myObj.nextInt();
        
        System.out.print("How many miles till you need an oil change :");
        milesTillOilChange = myObj.nextInt();
        
        milesTillOilChange = 100;
        if (milesDriven-lastOilChange>=milesTillOilChange) {
            needOilChange = true;
            
        }
        else {
            needOilChange = false;
        }
        System.out.println("");
        if (needOilChange = true) {
            System.out.println("I need an oil change!");
        }
        else if (needOilChange = false) {
            System.out.println("I do not need an oil change.");
        }
        System.out.println("");

    }
     
}