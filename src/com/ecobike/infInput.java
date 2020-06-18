package com.ecobike;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class infInput {

    public String[] inputData(File ecoBike, String typeOfBike) {
        Scanner scan = new Scanner(System.in);
        String vendor, color;
        boolean isAllowLight;
        int batteryCap, gearNum, price, undeclared;

        //Требуем ввода от пользователя для дальнейшей записи данных в массив String,
        // который после будет записан в файл ecobike.txt
        System.out.print("Vendor: ");
        vendor = scan.next();

        System.out.print("Gear number: ");
        gearNum = scan.nextShort();

        System.out.print("Battery capacity: ");
        batteryCap = scan.nextInt();

        System.out.print("Light (true/false)");
        isAllowLight = scan.nextBoolean();

        System.out.print("Color: ");
        color = scan.next();

        System.out.print("Undeclared (int)");
        undeclared = scan.nextInt();

        System.out.print("Price: ");
        price = scan.nextInt();
        System.out.print("\n");


        //Возвращаем String массив с данными, которые ввёл пользователь
        return new String[]{typeOfBike, vendor, color, String.valueOf(isAllowLight),
                String.valueOf(batteryCap), String.valueOf(gearNum), String.valueOf(price), String.valueOf(undeclared)};

    }
    //Метод для записи данных в файл с массива, который пришёл в main, а после был передан в метод dataWriter
    public void dataWriter(String [] readyLine, File ecoBike){
        //конвертируем наш массив в String элемент для подальшей записи через BufferedWriter
        String convertedToString = Arrays.toString(readyLine);

        FileWriter fr = null;
        try {
            fr = new FileWriter(ecoBike, true);
        } catch (IOException e) {
            e.printStackTrace();
        }

        BufferedWriter bw = new BufferedWriter(fr);

        try {
            bw.write(convertedToString);
            bw.newLine();

        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            bw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}