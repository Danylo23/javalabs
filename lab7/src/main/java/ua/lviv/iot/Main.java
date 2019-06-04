package ua.lviv.iot;

import java.util.Scanner;

public final class Main {

    private Main() {

    }

    public static void main(final String[] args) {

        StringProcessor test = new StringProcessor();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter");
        String input = sc.nextLine();

        test.addToList("Samsung");
        test.addToList("LG");
        test.addToList("Philips");
        test.addToList("Xiaomi");

        test.showResults(test.deleteArticles(input));


    }

}
