package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) {
//        int userNumber = 0;
//        Set<String> treeSet = new LinkedHashSet<>();
//        String fileName = "films.txt";
//        Scanner scn = new Scanner(System.in);
//        try {
//            Scanner scanner = new Scanner(new File(fileName));
//            while (userNumber != 3) {
//                System.out.println(
//                        "1. Добавить фильм (добавляет любое называние фильма: как уникальное, так и нет и сохраняет в файл)\n" +
//                        "2. Вывести список фильмов (считывает только уникальные названия фильмов из файла и выводит на консоль)\n" +
//                        "3. Выход (программа должна завершаться при выборе пункта 3)");
//                System.out.println("Write what do you wont");
//                userNumber = scn.nextInt();
//                switch (userNumber) {
//                    case 1:
//                        FileWriter fw = new FileWriter(fileName,true);
//                        for (int i = 0; i < 3; i++) {
//                            System.out.println("What film will you wont to see?");
//                            scn = new Scanner(System.in);
//                            fw.write(scn.nextLine()+""+"\n");
//                        }
//                        fw.close();
//                        break;
//                    case 2:
//                        while (scanner.hasNextLine()) {
//                            treeSet.add(scanner.nextLine());
//                        }
//                        for (String films : treeSet) {
//                            System.out.println(films);
//                        }
//                        break;
//                    default:
//                        System.out.println("bay");
//                        break;
//                }
//
//            }
//
//            scanner.close();
//
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        /*
        2. Создать аудио плей лист пользователя. Пользователь добавляет музыкальные треки
         с коносли, вводя название трека и имя автора. Пользователь может случайно ввести трек,
         который уже есть в плей листе, в этом случае он не должен быть добавлен.
         Хранение уникальных значений легко реализоваться с помощью любого класса,
         реализующего интерфейс Set (HashSet, LinkedListSet, TreeSet). Нужно выбрать наиболее подходящий
        класс (навернаяка треки лучше хранить в алфавитном порядке по автору).
         Чтобы класс знал, как сортировать объекты, не забудьте реализовать интерфейс Comparable.


В мейне создать консольное меню
1. Добавить трек
2. Вывести все треки в алфавитном порядке по автору
3. Выход (при выборе все уникальные треки сохраняются в файл и программа завершает работу)
         */
//
        int number =0;
        Set <String> set = new TreeSet<>();
        String fileName = "play.txt";// jsjsjs
        try {
            Scanner scn = new Scanner(new File(fileName));
            while (number != 3) {
                Scanner scanner = new Scanner(System.in);
                System.out.println(
                        "1. Добавить трек\n" +
                        "2. Вывести все треки в алфавитном порядке по автору\n" +
                        "3. Выход (при выборе все уникальные треки сохраняются в файл и программа завершает работу)");

                System.out.println("write number");
                number = scanner.nextInt();
                switch (number) {
                    case 1:

                        FileWriter fw = new FileWriter(fileName,true);
                        for (int i = 0; i <3 ; i++) {
                            scanner = new Scanner(System.in);
                            System.out.println("Write truck");
                            fw.write(scanner.nextLine()+" "+"\n");
                        }
                        fw.close();
                        break;
                    case 2:
                        while (scn.hasNextLine()) {
                            set.add(scn.nextLine());
                        }
                        for (String truk : set) {
                            System.out.println(truk);
                        }
                        break;
                    default:
                        fw = new FileWriter(fileName,true);
                        for (String nameTruk : set) {
                            fw.write(nameTruk+ ""+"\n");
                        }
                        System.out.println("bay");
                        fw.close();
                        break;
                }

            }


            scn.close();


        } catch (Exception e) {
            e.printStackTrace();
        }


        // write your code here
    }

}
