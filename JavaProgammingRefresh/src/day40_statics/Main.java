package day40_statics;

public class Main {
    public static void main(String[] args) {

        Address address = new Address("10821", "10th Ave", "Seattle", "WA", "98146");
        System.out.println(address.toString());

        System.out.println("Address.countryName = " + Address.countryName);
    }
}
