import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Jane Austin");
        person.setAddress("Daugavas 15");
        person.setCity("Daugavpils");
        person.setState("Latvia");
        person.setPostalCode("LV-1001");

        Person person1 = new Person();
        person1.setName("Dane Joe");
        person1.setAddress("Denver str");
        person1.setCity("Manchester");
        person1.setState("England");
        person1.setPostalCode("BT3900");

        Person person2 = new Person();
        person2.setName("Dane Joe");
        person2.setAddress("Denver str");
        person2.setCity("Manchester");
        person2.setState("England");
        person2.setPostalCode("BT3900");


        Package twoDayPackage = new TwoDayPackage(person, person1, 1.5d, 5.00d, 10.00d);
        System.out.println("Cost for two day delivery: " + twoDayPackage.calculateCost());

        Package twoDayPackage2 = new TwoDayPackage(person2, person1, 3d, 5.00, 10.00);
        System.out.println("Cost for two day delivery: " + twoDayPackage2.calculateCost());

        Package twoDayPackage3 = new TwoDayPackage(person2, person, 5, 5.00, 10.00);
        System.out.println("Cost for two day delivery: " + twoDayPackage3.calculateCost());

        Package overnightPackage = new OvernightPackage(person, person2, 1.5, 5, 10.00);
        System.out.println("Cost for one night delivery: " + overnightPackage.calculateCost());

        Package overnightPackage2 = new OvernightPackage(person2, person, 2, 5, 10.00);
        System.out.println("Cost for one night delivery: " + overnightPackage2.calculateCost());

        Package overnightPackage3 = new OvernightPackage(person1, person2, 0.5, 5, 10.00);
        System.out.println("Cost for one night delivery: " + overnightPackage3.calculateCost());


        List<Package> listOfPackages = List.of(twoDayPackage, twoDayPackage2, twoDayPackage3, overnightPackage, overnightPackage2, overnightPackage3);
        System.out.println("===================== SHIPPING'S SUMMARY ===================== ");
        printShippingInfo(listOfPackages);

    }

    public static void printShippingInfo(List<Package> packageList){
        double sum = 0;

        for(Package p : packageList){
            System.out.println("From: ");
            System.out.println(p.getSender());
            System.out.println("\nTo: ");
            System.out.println(p.getRecipient());
            System.out.printf("\nShipping costs: %.2f EUR", p.calculateCost());
            System.out.println("\n---------------------------------------------------------------");
            sum += p.calculateCost();
        }
        System.out.printf("Total costs for all shippings: %.2f EUR", sum);
    }
}
