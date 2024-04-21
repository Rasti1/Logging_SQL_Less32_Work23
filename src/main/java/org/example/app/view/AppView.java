package org.example.app.view;

import java.util.Scanner;

public class AppView {

    static final Scanner sc = new Scanner(System.in);

    public int getMenu() {
        System.out.print("""
                OPTIONS:
                1 - Create user.
                2 - Read users.
                3 - Update users.
                4 - Delete users.
                5 - Read user by id.
                0 - Close the App.
                """);
        System.out.print("Input your option: ");
        int option = sc.nextInt();
        sc.nextLine();
        return option;
    }

    public void getOutput(String message) {
        System.out.println(message);
    }
}