package com.ecobike;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Search {
    public void searchFunc(File eco, String userBrand) {

        Scanner scanner = null;

        try {
            scanner = new Scanner(eco);

        } catch (
                IOException e) {
            e.getMessage();
        }

        //Сканим файл, пока hasNextLine - true.
        while (scanner.hasNextLine()) {
            //В буфферную переменную закидываем строку файла
            String buffer = scanner.nextLine();

            //если содержимое буфферной переменной имеет в своём составе бренд, который ввёл пользователь, то
            //мы выводим данную строку
            if (buffer.contains(userBrand)) {
                System.out.println(buffer);
                break;
            }
        }
    }
}