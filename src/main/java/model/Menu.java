package model;

import NexDB.PokemonAbstractDAO;
import services.CalcController;

import java.util.Scanner;

public class Menu {

    private Trainer user = new Trainer();
    private CalcController calcController1 = new CalcController();
    private PokemonAbstractDAO pokemonAbstractDAO;


    public Menu() {
    }

    public void start() {

        System.out.println("Please enter name:");
        Scanner sc = new Scanner(System.in);
        user.setUserName(sc.nextLine());
        System.out.println("WELCOME " + user.getUserName());


        {
            System.out.println("WHATS NEXT?\n");
            System.out.println("Press\n" + "1 for List Names" + "\n" + "2 for Details" + "\n" + "3 for Type" + "\n" + "4 for DB edit" + "\n" + "5 for delete" + "\n"+ "6 for getting one entry" + "\n"+ "7 for exit" + "\n");
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
                    calcController1.editDB1();
                    break;
                case 5:
                    calcController1.deleteDB();
                    break;
                case 6:
                    calcController1.getPokemon();
                    break;
                case 7:
                    System.out.println("Exiting Program");
            }
        }
    }
}


