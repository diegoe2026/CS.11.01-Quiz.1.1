import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner SCAN = new Scanner (System.in);
        int age;
        String fn;
        String favouriteFood;
        System.out.println("age please:");
        age = SCAN.nextInt();
        System.out.println("whats ur first name:");
        fn = SCAN.next();
        System.out.println("whats ur fav food:");
        favouriteFood = SCAN.next();
        System.out.println("first name:" + fn);
        System.out.println("age: " + age);
        System.out.println("Favourite food: " + favouriteFood);
    }

}