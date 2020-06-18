package com.ecobike;

import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        File ecoBike = new File("src\\com\\ecobike\\ecobike.txt");

        infOutput output = new infOutput();
        infInput input = new infInput();
        Search search = new Search();
        String userChoice;

        System.out.println("Welcome to main menu");
        System.out.println("====================");
        System.out.println("Choose option: ");
        System.out.println("1 - Show the entire EcoBike catalog");
        System.out.println("2 - Add a new folding bike");
        System.out.println("3 - Add a new speedelec");
        System.out.println("4 - Add a new e-bike");
        System.out.println("5 - Find the first item of a particular brand");
        System.out.println("6 - Stop the program\n");

        Scanner in = new Scanner(System.in);
        userChoice = in.next();
        String[] readyLine;

        //основываясь на userChoice выбираем в меню функционал, который интересует пользователя
        switch (userChoice) {

            case ("1"):
                output.output(ecoBike);
                break;

            case ("2"):
                readyLine = input.inputData(ecoBike, "FOLDING BIKE");
                input.dataWriter(readyLine, ecoBike);
                break;

            case ("3"):
                readyLine = input.inputData(ecoBike, "SPEEDELEC");
                input.dataWriter(readyLine, ecoBike);
                break;

            case ("4"):
                readyLine = input.inputData(ecoBike, "E-BIKE");
                input.dataWriter(readyLine, ecoBike);
                break;

            case ("5"):
                String userBrand;
                System.out.print("Input brand: ");
                userBrand = in.next();
                search.searchFunc(ecoBike, userBrand);
                break;

            case ("6"):
                System.exit(0);
        }
    }
}

