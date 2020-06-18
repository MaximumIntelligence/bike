package com.ecobike;

import java.io.*;

public class infOutput {
    public void output(File ecoBike) {

        //Инициализация переменной BufferedReader ISR'ом
        BufferedReader buffReader;
        buffReader = new BufferedReader(new InputStreamReader(System.in));


        //Инициализация переменной BufferedReader FileReader'ом с нашим файлом ecoBike
        BufferedReader ourReader = null;
        try {
            ourReader = new BufferedReader(new FileReader(ecoBike));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        String name = null; //переменная для сохранения строки с предложенным выбором y/n
        String line = null; //переменная для сохранения строки, считаной из файла
        System.out.println("Print File " + ecoBike.getName() + "? y/n");


        try {
            name = buffReader.readLine();//читаем  строку выше
        } catch (IOException e) {
            e.printStackTrace();
        }


        if(name.equals("y")) { //если пользователь нажал y
            while (true) {
                try {
                    //если line не присваивается результат работы readline(),
                    if ((line = ourReader.readLine()) == null)
                        break; //то мы прекращаем
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println(line); //выводим наши строки
            }
        }
    }
}
