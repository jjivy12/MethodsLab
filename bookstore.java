import java.util.*;


public class bookstore {
    static String Name = "What The Books";
    static String Address = "123 ABC LN";
    static Integer SqFeet = 1900;
    static String usedBooks = "No";
    static String newBooks = "Yes, We keep the new books!";
    static String storeHours = "7am - 10pm";
    static String storeSchedule = "Monday-Saturday";
    public static void main(String[] args) {
        // Scanner userInput = new Scanner(System.in);
        System.out.println("What is the address?");
        getAddress();
        System.out.println("Is the store open today?");
        getStoreSchedule();
        System.out.println("What time does it close?");
        getStoreHours();
        System.out.println("How big is the store?");
        storeSize();
        System.out.println("Does the store have new or used books?");
        bookTypes();
    }
    public static void getAddress() {
        System.out.println(Address);
    }
    public static void getStoreSchedule() {
        System.out.println("We are open " + storeSchedule);
    }
    public static void getStoreHours() {
        System.out.println("Our store hours are from " + storeHours);
    }
    public static void storeSize() {
        System.out.println(SqFeet + " Square Feet");
    }
    public static void bookTypes() {
        System.out.println(usedBooks);
    }
}