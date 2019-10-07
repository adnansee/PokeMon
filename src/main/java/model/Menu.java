package model;

import services.CalcController;

import java.util.Scanner;

public class Menu {

    private User user = new User();
    private CalcController calcController1 = new CalcController();

    public Menu() {
    }

    public void start() {

        System.out.println("Please enter name:");
        Scanner sc = new Scanner(System.in);
        user.setUserName(sc.nextLine());
        System.out.println("WELCOME " + user.getUserName());


        System.out.println("WHATS NEXT?\n");
        System.out.println("Press\n" + "1 for List Names" + "\n" + "2 for Details" + "\n" + "3 for Type" + "\n" + "4 for exit" + "\n");
        int choice = Integer.parseInt(sc.nextLine());

        switch (choice) {
            case 1:
                calcController1.showListNames();
                break;
            case 2:
                calcController1.showDetails();
                break;
            case 3:
                calcController1.showType();
                break;
            case 4:
                System.out.println("Exiting Program");
                break;
        }
    }
}
