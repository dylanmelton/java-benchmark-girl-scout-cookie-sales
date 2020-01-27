package app;

// public class App {
// public static void main(String[] args) throws Exception {
// System.out.println("Hello Java");
// }
// }
import java.util.Scanner;

class Input {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Last Name: ");
        String name = input.next();

        System.out.print("Address: ");
        String address = input.next();

        System.out.print("Phone Number/Email: ");
        String phone = input.next();
    }
}

class CookieInput {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(
                "Donate cookie packages, Thanks-A-Lot, Girl Scout S'mores, Lemonades, Shortbread, Thin Mints, Peanut Butter Patties, Caramel deLites, Peanut Butter Sandwich");

        System.out.print("Which do you want: ");
        String cookie = input.next();
    }
}