import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Stadium stadium1 = new Stadium();
        Stadium stadium2 = new Stadium(5000, "Arena Lviv", 3000, "Lviv");
        Stadium stadium3 = new Stadium(5000, "Arena Lviv", 3000, "Lviv",750, 1500, 6000, 5);
        System.out.println(stadium1.toString());
        System.out.println(stadium2.toString());
        System.out.println(stadium3.toString());
        stadium1.toString();
        stadium2.toString();
        stadium3.toString();
    }

}



