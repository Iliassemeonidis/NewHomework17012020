package com.company;

import java.io.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
static Statement stmt;
    public static void main(String[] args){
        //Сделать калькултяор из файла
        /*
        Выводить выражение, его результат

         */



//        try{
//            Scanner scn = new Scanner(new File("calc.txt"));
//
//            while (scn.hasNextLine()) {
//                String [] arr = scn.nextLine().split(";");
//                String znak = arr[0];
//                int namber1 = Integer.valueOf(arr[1]);
//                int namber2 = Integer.valueOf(arr[2]);
//                int result = 0;
//                if(znak.equals("+")){
//                    result = namber1 + namber2;
//                }else if(znak.equals("-")){
//                    result = namber1 - namber2;
//                }
//                else if(znak.equals("*")){
//                    result = namber1 * namber2;
//                }
//                else if(znak.equals("/")){
//                    result = namber1 / namber2;
//                }
//
//
//                System.out.println(String.format("%d %s %d = %d", namber1, znak, namber2, result));
//
//            }
//
//        }
//        catch (Exception e){
//            e.printStackTrace();
//        }



        /*
        5
        -2
        9
        -2
       1
         */

        //первый спосбок
//        try {
//            Scanner scn = new Scanner(new File("max.txt"));
//
//            int max= 0;
//            int min = 0;
//            if(scn.hasNextInt()){
//                max = scn.nextInt();
//                min = max;
//            }
//
//            while (scn.hasNextInt()) {
//                int currentValue = scn.nextInt();
//                if(max<currentValue){
//                    max = currentValue;
//                }
//                if(min>currentValue){
//                    min=currentValue;
//                }
//
//            }
//            System.out.println("Minimum = "+ min + " Msx" + max);
//        }
//        catch(Exception e){
//            e.printStackTrace();
//        }

//второй способ (через массив)
//        try {
//            Scanner scn = new Scanner(new File("max.txt"));
//
//            int sice = 0;
//            while (scn.hasNextInt()) {
//                System.out.println(scn.nextInt() + " ;" + sice);
//                sice++;
//            }
//            int [] arr =new int [sice];
//            scn = new Scanner(new File("max.txt"));
//            System.out.println("#$#####");
//            for (int i = 0; i < arr.length; i++) {
//                arr[i]=scn.nextInt();
//            }
//            int max= arr[0];
//            int min = arr[0];
//
//            for (int i = 0; i < arr.length; i++) {
//                if (max < arr[i]) {
//                    max=arr[i];
//                }
//                if (min > arr[i]) {
//                    min=arr[i];
//                }
//            }
//
//
//
//            System.out.println("Minimum = "+ min + " Msx" + max);
//        }
//        catch(Exception e){
//            e.printStackTrace();
//        }


        //считать в массив только уникальные числа

//        int[] arr = {1,1,8,9};
//        int size = 0;
//        for (int i = 0; i < arr.length; i++) {
//            int val = arr[i];
//            int count = 0;
//            for (int j = 0; j < arr.length; j++) {
//                if(val == arr[j]){
//                    count++;
//                }
//            }
//            if(count==1){
//                size++;
//            }
//        }
//
//        int[] arr2 = new int[size];
//        int index = 0;
//        for (int i = 0; i < arr.length; i++) {
//            int val = arr[i];
//            int count = 0;
//            for (int j = 0; j < arr.length; j++) {
//                if(val == arr[j]){
//                    count++;
//                }
//            }
//            if(count>1){
//                System.out.println("Элемент повторяется");
//            }else{
//                arr2[index] = val;
//                index++;
//            }
//        }
//
//        for (int i = 0; i < arr2.length; i++) {
//            System.out.println(arr2[i]);
//        }
//




//        try {
//
//            Scanner scn = new Scanner(new File("max.txt"));
//
//            int sice = 0;
//            while (scn.hasNextInt()) {
//                scn.nextInt();
//                sice++;
//            }
//            int [] arr =new int [sice];
//
//            scn = new Scanner(new File("max.txt"));
//            System.out.println("#$#####");
//            for (int i = 0; i < arr.length; i++) {
//                arr[i]=scn.nextInt();
//            }
//            int nambr = 0;
//            for (int i = 0; i < arr.length; i++) {
//                int count =0;
//
//                for (int j = 0; j < arr.length; j++) {
//                   if( arr[i]==arr[j]){
//                       count++;
//                   }
//
//                }
//                if(count==1){
//                    nambr++;
//
//                }
//
//            }
//            int[] arr1 = new int [nambr];
//            int index = 0;
//
//            for (int i = 0; i < arr.length; i++) {
//                int count =0;
//
//                for (int j = 0; j < arr.length; j++) {
//                    if( arr[i]==arr[j]){
//                        count++;
//                    }
//
//                }
//                if(count==1){
//                    arr1[index]=arr[i];
//                    index++;
//                }
//            }
//            for (int i = 0; i < arr1.length; i++) {
//                System.out.println(arr1[i]);
//            }
//
//
//
//        }
//        catch(Exception e){
//            e.printStackTrace();
//        }


        //Записть не только чисто уникальные значения, но и по одному экземпляру повторяющихся чисел
        //1 1 8 1
//        try {
//
//            Scanner scn = new Scanner(new File("max.txt"));
//
//            int sice = 0;
//            while (scn.hasNextInt()) {
//                scn.nextInt();
//                sice++;
//            }
//            int [] arr =new int [sice];
//            String[] tmpArr = new String[sice];
//            int tmpIndex=0;
//
//            scn = new Scanner(new File("max.txt"));
//            System.out.println("#$#####");
//            for (int i = 0; i < arr.length; i++) {
//                arr[i]=scn.nextInt();
//            }
//            int nambr = 0;
//            for (int i = 0; i < arr.length; i++) {
//                int count =0;
//
//                for (int j = 0; j < arr.length; j++) {
//                    if( arr[i]==arr[j]){
//                        count++;
//                    }
//
//                }
//                if(count==1){
//                    tmpArr[tmpIndex] = String.valueOf(arr[i]);
//                    tmpIndex++;
//                    nambr++;
//
//
//                }else{
//
//                    int tmpCount = 0;
//                    for (int j = 0; j < tmpArr.length; j++) {
//
//                        String val = String.valueOf(arr[i]);
//                        if(tmpArr[j]!=null) {
//                            if (val.equals(tmpArr[j])) {
//                                tmpCount++;
//                            }
//                        }
//                    }
//                    if(tmpCount==0){
//                        tmpArr[tmpIndex] = String.valueOf(arr[i]);
//                        nambr++;
//                        tmpIndex++;
//
//                    }
//                }
//
//            }
//            int[] arr1 = new int [nambr];
//            //1 8 null null
//            //2
//            for (int i = 0; i < arr1.length; i++) {
//                    arr1[i] = Integer.valueOf(tmpArr[i]);
//            }
//            for (int i = 0; i < arr1.length; i++) {
//                System.out.println(arr1[i]);
//            }
//
//
//
//        }
//        catch(Exception e){
//            e.printStackTrace();
//        }

 ///////////// ////////////////////////////////////////////////////////////////////////////////////////////


        // Начало дз  !!!


        // Пробный вариант задачи
        // Записал в массив из файла только уникальные значения, не используя объект класса юзер!!!!!
//        try {
//            Scanner scn = new Scanner(new File("user.txt"));
//            int index = 0;
//            while (scn.hasNextLine()) {
//                scn.nextLine();
//                index++;
//            }
//
//
//            int namber = 0;
//            String [] arr = new String[index];
//            String[] userTest = new String[index];
//            int usrtIndex = 0;
//
//            scn = new Scanner(new File("user.txt"));
//            for (int i = 0; i < arr.length; i++) {
//                arr[i] = scn.nextLine();
////                System.out.println(arr[i]);
//            }
//
//            for (int i = 0; i < arr.length; i++) {
//                int count  = 0;
//                for (int j = 0; j < arr.length; j++) {
//                    if (arr[i].equals(arr[j])) {
//                        count++;
//                    }
//                }
//                     if(count==1){
//                        userTest[usrtIndex] = arr[i];
//                        usrtIndex++;
//                        namber++;
//
//                    }
//                     else {
//                         int userStepCount = 0;
//                         for (int j = 0; j < userTest.length; j++) {
//                             if(arr[i].equals(userTest[j])){
//                                 userStepCount++;
//                             }
//                         }
//                         if(userStepCount==0){
//                             userTest[usrtIndex]=arr[i];
//                             usrtIndex++;
//                             namber++;
//                         }
//                     }
//
//                }
//
//                String [] arr2 = new String[namber];
//            User [] users = new User[namber];
//
//            for (int i = 0; i < arr2.length; i++) {
//                arr2[i]=userTest[i];
//                System.out.println(arr2[i]);
//            }
////
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        //// Создать массив и записать в него из файла только уникальыне значения.
        /// На этот раз использовать объект Юзер

//        try {
//            Scanner scn = new Scanner(new File("user.txt"));
//            int index = 0;
//            while (scn.hasNextLine()) {
//                scn.nextLine();
//                index++;
//            }
//
//
//            int namber = 0;
//            int usrtIndex = 0;
//            User[] userTest = new User[index];
//
//            User[]users = new User[index];
//            scn = new Scanner(new File("user.txt"));
//            for (int i = 0; i < users.length; i++) {
//                String []  arr = scn.nextLine().split(";");
//                String logo = arr [0];
//                String pass = arr[1];
//                String name = arr[2];
//                users[i]= new User(logo,pass,name);
////                System.out.println(users[i]);
//            }
//            for (int i = 0; i < userTest.length; i++) {
//                userTest[i]=new User("null","null","null");
//            }
//
//            for (int i = 0; i < users.length; i++) {
//                int count  = 0;
//                for (int j = 0; j < users.length; j++) {
//                    if (users[i].equals(users[j])){
//                        count++;
//                    }
//                }
//                if(count==1){
//                    userTest[usrtIndex] = new User(users[i].login,users[i].password,users[i].name);
//                    usrtIndex++;
//                    namber++;
//
//                }
//                else {
//                    int userStepCount = 0;
//                    for (int j = 0; j < userTest.length; j++) {
//                        if (users[i].equals(userTest[j])){
//                            userStepCount++;
//                        }
//                    }
//                    if(userStepCount==0){
//                        userTest[usrtIndex]=new User(users[i].login,users[i].password,users[i].name);;
//                        usrtIndex++;
//                        namber++;
//                    }
//                }
//
//            }
//
//           User [] arr2 = new User[namber];
//            for (int i = 0; i < arr2.length; i++) {
//                arr2[i]= new User(userTest[i].login,userTest[i].password,userTest[i].name) ;
//                System.out.println(arr2[i]);
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        ///// Задча с числами из файла

//        try{
//            Scanner scn = new Scanner(new File("nambers.txt"));
//
//            int countLengthFile = 0;
//
//            while (scn.hasNextInt()) {
//                scn.nextInt();
//                countLengthFile++;
//
//            }
//            int count = 0;
//            int countNew = 0;
//            int [] arr = new int [countLengthFile];
//            int [] nambers = new int[countLengthFile];
//            int idexNambers =0;
//            scn = new Scanner(new File("nambers.txt"));
//            for (int i = 0; i < arr.length; i++) {
//                arr[i] = scn.nextInt();
//                if(arr[i]>0){
//                    count++;
//                }
////                System.out.println(arr[i]);
//            }
//




// зад.2
//            int max = arr[0];
//            int min = arr[0];
//            for (int i = 0; i < arr.length; i++) {
//                if(max<arr[i]){
//                    max=arr[i];
//                }
//                if(min>arr[i]){
//                    min=arr[i];
//                }
//            }
//            System.out.println("max "  + max + " min" + min);
/// зад.3

//            int [] namb = new int[count];
//            int ind = 0;
//            for (int i = 0; i < arr.length; i++) {
//                if(arr[i]>0){
//                    namb[ind] = arr[i];
//                    System.out.println(namb[ind]);
//                    ind++;
//                }
//            }

/// зпд.4

//            arr = new int [countLengthFile];
//            scn = new Scanner(new File("nambers.txt"));
//            for (int i = arr.length-1; i >=0 ; i--) {
//                arr[i]= scn.nextInt();
//
//            }
//            for (int i = 0; i < arr.length; i++) {
//                System.out.println(arr[i]);
//            }


/// зад.5

//            for (int i = 0; i < arr.length; i++) {
//                int iddex = 0;
//                for (int j = 0; j < arr.length; j++) {
//                    if(arr[i]==arr[j]){
//                        iddex++;
//                    }
//                }
//                if(iddex==1){
//                    nambers[idexNambers]=arr[i];
//                    idexNambers++;
//                    countNew++;
//
//                }
//                else {
//                    int countt=0;
//                    for (int j = 0; j < nambers.length; j++) {
//                        if (arr[i]==nambers[j]){
//                            countt++;
//                        }
//
//                    } if(countt==0){
//                        nambers[idexNambers] = arr[i];
//                        idexNambers++;
//                        countNew++;
//                    }
//                }
//            }
//            int [] arrNew = new int [countNew];
//            for (int i = 0; i < arrNew.length; i++) {
//                arrNew[i]=nambers[i];
//                System.out.println(arrNew[i]);
//            }







//        }catch (Exception e){
//            e.printStackTrace();
//        }

//   ///////////////////////////////////////////////////////////////
//        Создать файл user3.txt со значениями:
//                admin;admin123;Ivan
//                test;test123;Petr
//                mylogin1;mypass123;Semen
//                admin;admin123;Ivan
//                mylogin1;mypass123;Semen
//                igorLog;igorPass;Igor
//                user1;user1pass;Victor
//                igorLog;igorPass;Igor
////
////        В этом файле 5 уникальных пользователей. Всего в файле 8 строк. Это имитация некорректно заполненного файла.
////        Нужно записать этих пользователей с помощью Java в таблицу user в mysql.
//
//         Когда это будет выполнено, нужно реализовать меню:
//        1. Войти
//        2. Регистрация
//        3. Выход
//        Программа должна завершаться только при выбора пункта Выход.
//
//        При выборе пункта 1 в меню программа должна запросить логин и пароль у пользователя в консоли.
//        Если введенные логин и пароль существуют в таблице,
//        то пользователь успешно авторизован и на консоль просто выводится текст приветствия "Здравствуйте, [имя пользователя]!"
//        Если введенные данные не найдены в таблице, то у пользователя должно быть три попытки для входа.

//
//        ResultSet rs;
//        try {
//            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/userssdb", "root", "");
//
//            stmt = connection.createStatement();
//            Scanner scn = new Scanner(new File ("user3.txt"));
//            while (scn.hasNextLine()) {
//                String[]arr = scn.nextLine().split(";");
//                String sql =  String.format("insert into userss (login, pasword, name) values('%s', '%s', '%s')", arr[0], arr[1], arr[2]);
////                System.out.println(sql);
////                stmt.executeUpdate(sql);
//
//            }
//
//            int userChois = 0;
//            String userLogin = "";
//            String userPass = "";
//            String userName = "";
//            while (userChois!=3){
//                Scanner scanner = new Scanner(System.in);
//                System.out.println("Hello pleas write, what do you need!");
//                System.out.println(" 1. Войти"+"\n"+ " 2. Регистрация "+"\n"+"3. Выход");
//                userChois = scanner.nextInt();
//
//                if(userChois==1){
//                    System.out.println("Pleas write your login");
//                    userLogin = scanner.next();
//                    System.out.println("Pleas write your pass");
//                    userPass = scanner.next();
//                    rs = stmt.executeQuery("select name, login, pasword from Userss where pasword = '" + userPass + "' and login = '" + userLogin + "' ");
//                    rs.next();
//
//                    try {
//                        String login = rs.getString("login");
//                        if (login.equals(userLogin)) {
//                            System.out.println("Вы вошли. Добро пожаловать, " + rs.getString("name"));
//                        } else {
//                            System.out.println("Неверный логин или пароль");
//                        }
//                    }
//                    catch(Exception e){
//                        System.out.println("Нет данных в таблице логинов");
//                    }
//                }
//                else if (userChois==2){
//                    System.out.println("Write your name");
//                    userName = scanner.next();
//                    System.out.println("Pleas write your login");
//                    userLogin = scanner.next();
//                    System.out.println("Pleas write your pass");
//                    userPass = scanner.next();
//
//                    stmt.executeUpdate("insert into Userss (name, pasword, login) values('" + userName + "', '" + userPass + "', '" + userLogin + "');");
//                    System.out.println("Вы зарегистрированны");
//
//                }
//
//            }
//            System.out.println("Good bay");
//
//
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//////////////// Home work ex 1.
//        try{
//            Scanner scn = new Scanner(new File("count.txt"));
//            ArrayList<Integer> list = new ArrayList<>();
//            int summ = 0;
//            while (scn.hasNextInt()) {
//
//                list.add(scn.nextInt());
//            }
//            for (int i = 0; i < list.size(); i++) {
//                summ+=list.get(i);
//               // System.out.println(list.get(i));
//            }
//            System.out.println(summ);
//
//            int max  = list.get(0);
//            int min = list.get(0);
//            for (int i = 0; i < list.size(); i++) {
//                if(max<list.get(i)){
//                    max=list.get(i);
//                }
//                if(min>list.get(i)){
//                    min=list.get(i);
//                }
//            }
//            System.out.println("min = "+ min+ " max = "+ max);
//
//
//
//        }
//        catch (Exception e){
//            e.printStackTrace();
//        }
/////////////////////ex2
//        try{
//            Scanner scn = new Scanner(new File("poet.txt"));
//
//            ArrayList<String> list = new ArrayList<>();
//            while (scn.hasNextLine()) {
//
//                String[] arr = scn.nextLine().split(";");
//                for (int i = 0; i < arr.length; i++) {
//                    list.add(arr[i]);
//                }
//            }
//
//            for (int i = 0; i < list.size(); i++) {
//                System.out.println(list.get(i));
//            }
//
//
//
//        }catch (Exception e){
//            e.printStackTrace();
//        }

///////////// ex 3

//        3.Создать консольное меню:
//
//        1. Вывести всех авторов
//        2. Добавить автора
//        3. Удалить автора
//        4. Выход
//
//        При запуске программы все авторы из файла в пункте 2 должны быть считаны в программу.
//                При завершении программы все изменения должны быть сохранены в том же файле
//        try {
//            Scanner scn = new Scanner(new File("poet.txt"));
//            FileWriter fw = new FileWriter("poet.txt", true);
//            ArrayList<String> list = new ArrayList<>();
//            while (scn.hasNextLine()) {
//                list.add(scn.nextLine());
//            }
//            int userChoes = 0;
//            while (userChoes != 4) {
//                scn = new Scanner(System.in);
//                System.out.println("pleas choos what do you need");
//                System.out.println("1. Вывести всех авторов\n" + "2. Добавить автора\n" + "3. Удалить автора\n" + "4. Выход");
//                userChoes = scn.nextInt();
//
//                if (userChoes == 1) {
//                    for (int i = 0; i < list.size(); i++) {
//                        System.out.println(list.get(i));
//                    }
//                } else if (userChoes == 2) {
//                    scn = new Scanner(System.in);
//                    System.out.println("Write new poet");
//                    String userPoet = scn.nextLine();
//                    list.add(userPoet);
//                    fw.write(userPoet+"\n");
//                } else if (userChoes == 3) {
//                    scn = new Scanner(System.in);
//                    System.out.println("What dou you need to delete??");
//                    String userDeletePoet = scn.nextLine();
//                    //не эффективно
////                    for (int i = 0; i < list.size(); i++) {
////                        if (userDeletePoet.equals(list.get(i))) {
////                            list.remove(list.get(i));
////                        }
////
////                    }
//                    //другой вариант:
////                    int index = list.indexOf(userDeletePoet);
////                    if(index!=-1){
////                        list.remove(index);
////                    }
//                    //самый эффективный вариант:
//                    list.remove(userDeletePoet);
//                }else if(userChoes == 4){
//                    fw = new FileWriter("poet.txt");
//                    for (int i = 0; i < list.size(); i++) {
//                        fw.write(list.get(i)+"\n");
//                    }
//                }
//
//            }
//            fw.close();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        //пример
//        try {
//            FileWriter fw  = new FileWriter("poet.txt", true);
//            fw.write("Пушкин\n");
//            fw.write("ДОстоевский\n");
//            fw.write( "Толстой\n");
//            fw.close();
//
//            fw  = new FileWriter("poet.txt", true);
//            fw.write("test");
//            fw.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        try {
//            Scanner scn = new Scanner(new File("poet.txt"));
//
//            ArrayList<String> list = new ArrayList<>();
//
//            while (scn.hasNextLine()) {
//                String[] arr = scn.nextLine().split(";");
//                list.add(arr[0]);
//
//            }
//            FileWriter write = new FileWriter("poet.txt");
//
//            String a = "hfhfjfjk";
//            list.add(a);
//            write.write("a");
//            scn = new Scanner(new File("poet.txt"));
//            for (int i = 0; i < list.size(); i++) {
//
//                System.out.println(list.get(i));
//            }
//
////
////            scn = new Scanner(System.in);
//
//
//            Александр Пушкин;
//            Лев Толстой;
//            Фелор Достоевский;
//            Антон Чехов
//
//
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }



        ////// ex 4

//        try {
//            Scanner scn = new Scanner(new File("rithmos.txt"));
//            ArrayList<Integer> list = new ArrayList<>();
//            while (scn.hasNextLine()) {
//                String[] arr = scn.nextLine().split(";");
//                list.add(Integer.valueOf(arr[0]));
//            }
//
//            int max = list.get(0);
//            int min = list.get(0);
//
//            for (int i = 0; i < list.size(); i++) {
//
//                if(max<list.get(i)){
//                    max=list.get(i);
//                }
//                if (min > list.get(i)) {
//                    min = list.get(i);
//                }
//
//            }
//            System.out.println("min ="+ min + " max = "+ max);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
        ////////////// ex 5 завис на exel файле
//        . Создать вручную excel файл с содержымым:
//        Александр Пушкик;1799;Евгений Онегин:Капитанская дочка:Пиковая дама
//        Лев Толстой;1828;Анна Коренина:Война и мир
//        Федор Достоевский;Братья Карамазовы:Преступление и наказание:Игрок:Записки из подполья
//
//        Данные в файле имеют следующий формат:
//        автор;год рождения;книга1:книга2:....:книгаN
//        У каждого автора может быть любое количество книг, перечисленные через двоеточие
//
//        Сохранить созданный ексель в формате csv. Далее, написать программу, работающую с этим csv.
//        (csv - Это файл, который является одновременно текстовым, его можно открыт через блокнот/wordpad и проч и одновременно такой файл поддерживается excel)
//
//        Создать меню
//        1. Вывести список авторов и их произведения
//        2. Вывести произведения по фамилии автора
//        3. Добавить произведение автору
//        4. Удалить произведение у автора
//        5. Добавить автора
//        6. Удалить автора
//        7. Выход
//
//        При запуске программы данные из файла должны быть считаны в программу.
//                При завершении программы все изменения должны быть сохранены в том же файле


//        try {
//            Scanner scn = new Scanner(new File("book.csv"),"CP1251");
//            ArrayList<Author> authors = new ArrayList<>();
//            while (scn.hasNextLine()) {
//                String[] arr = scn.nextLine().split(";");
//                Author author = new Author();
//                author.name = arr[0];
//                author.birthYear = Integer.valueOf(arr[1]);
//                String books = arr[2];
//                arr = books.split(":");
//                for (int i = 0; i < arr.length; i++) {
//                    author.books.add(arr[i]);
//                }
//                authors.add(author);
//            }
//            System.out.println(authors);
//
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
/////////////////////////// задача номер 6
//        try {
//            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/poetbd", "root", "");
//            Statement st =connection.createStatement();
//
//
//
////            st.executeUpdate("insert into poet(name,year,book) values('Pushkin', 1799, 'Pikovay Dama');");
////            st.executeUpdate("insert into poet(name,year,book) values('Dostoevskiy', 1821, 'Idiot');");
////            st.executeUpdate("insert into poet(name,year,book) values('Chehov', 1860, 'Toska');");
//
//            Scanner scn = new Scanner(System.in);
//            int userNamber = 0;
//
//            while (userNamber != 7) {
//                System.out.println("Put what do you want");
//                System.out.println((
//                        "1. Вывести список авторов и их произведения\n" +
//                        "2. Вывести произведения по фамилии автора\n" +
//                        "3. Добавить произведение автору\n" +
//                        "4. Удалить произведение у автора\n" +
//                        "5. Добавить автора\n" +
//                        "6. Удалить автора\n" +
//                        "7. Выход"));
//                userNamber = scn.nextInt();
//                if (userNamber == 1) {
//
//                    ResultSet res = st.executeQuery("select name, book from poet");
//                    while (res.next()) {
//
//                        System.out.println(res.getString("name")+ " "+  res.getString("book"));
//                    }
//
//                } else if (userNamber == 2) {
//                    System.out.println("Pleas write poet's name ");
//                    String poetsName = scn.next();
//
//                    ResultSet res = st.executeQuery("select book from poet where name = '" + poetsName + "'");
//
//                    System.out.println(res.next());
//                    System.out.println(res.getString("book"));
//
//
//                } else if (userNamber == 3) {
//                    scn = new Scanner(System.in);
//                    System.out.println("Введите Фамилию Поэта");
//                    String poetName = scn.nextLine();
//                    System.out.println("Введите книгу этого автора");
//                    String book = scn.nextLine();
//                    System.out.println("Введите date this book");
//                    String year = scn.nextLine();
//                    if(year.length()==0){
//                        //st.executeUpdate("insert into poet (name, year, book) values('"+ poetName + "',null, '" +book + "');");// можно ли не вписывать значения в колонку с годом ??
//                        st.executeUpdate("insert into poet (name, book) values('"+ poetName + "', '" +book + "');");// можно ли не вписывать значения в колонку с годом ??
//                    }else{
//                        st.executeUpdate("insert into poet (name, year, book) values('"+ poetName + "',"+year+" , '" +book + "');");// можно ли не вписывать значения в колонку с годом ??
//                    }
//
//                } else if (userNamber == 4) {
////           // как обозначить в запросе книгу у конкретного автора , скажем если разные автора но название книги совпадает
//                    System.out.println("Введите книгу которую хотите удалить");
//                    String book = scn.next();
//                    st.executeUpdate("delete from poet where book = '" + book + "'");
//
//                } else if (userNamber == 5) {
//
//                    System.out.println("Введите Фамилию Поэта которого хотите добавить");
//                    String poetName = scn.next();
//                    System.out.println("Введите книгу этого автора");
//                    String book = scn.next();
//                    System.out.println("Введите date this book");
//                    String year = scn.next();
//                    st.executeUpdate("insert into poet (name, year, book) values('"+ poetName + "',"+year+" , '" +book + "');");
//
//
//                } else if (userNamber == 6) {
//                    System.out.println("Введите автора которого хотите удалить");
//                    String poetName = scn.next();
//                    st.executeUpdate("delete from poet where name = '" + poetName + "'");
//
//                }
//
//
//            }
//
//
//
//
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
////////////////////////// ex 7

//        try {
//
//            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/picturebd", "root", "");
//            Statement st = connection.createStatement();
////
//            //st.executeUpdate("insert into picture (number, price,nameOfPicture, artist, yearOfCreation, saller, buyer) values(1, 450000, 'Salvator Mundi', 'Leonardo da Vinci', 1500, 'Dmitry Rybolovlev', 'Badr bin Abdullah Al Saud' );");
////            st.executeUpdate("insert into picture (number, price,nameOfPicture, artist, yearOfCreation, saller, buyer) values(2, 300000, 'Interchange',     'Willem de Kooning ', 1955, 'David Geffen', 'Kenneth C. Griffin' );");
////            st.executeUpdate("insert into picture (number, price,nameOfPicture, artist, yearOfCreation, saller, buyer) values(3, 250000, 'The Card Players', 'Paul Cézanne', 1892, 'George Embiricos', 'State of Qatar' );");
////            st.executeUpdate("insert into picture (number, price,nameOfPicture, artist, yearOfCreation, saller, buyer) values(4, 210000, 'Nafea Faa Ipoipo', 'Paul Gauguin', 1892, 'Rudolf Staechelin ', 'State of Qatar ' );");
////            st.executeUpdate("insert into picture (number, price,nameOfPicture, artist, yearOfCreation, saller, buyer) values(5, 200000, 'Number 17A', 'Jackson Pollock', 1948, 'David Geffen Foundation  ', 'Kenneth C. Griffin  ' );");
////            st.executeUpdate("insert into picture (number, price,nameOfPicture, artist, yearOfCreation, saller, buyer) values(6, 179000, 'Les Femmes d\\'Alger', 'Pablo Picasso', 1955, 'Private collection ', 'Hamad bin Jassim bin Jaber Al Thani' );");
////            st.executeUpdate("insert into picture (number, price,nameOfPicture, artist, yearOfCreation, saller, buyer) values(7, 155000, 'Le Rêve', 'Pablo Picasso', 1932, 'Steve Wynn', 'Steven A. Cohen ' );");
//            //
//
////            Нужно написать консольное меню
////            1. Вывести информацию о всех картинах
////            2. Добавить новую картину
////            3. Удалить картину
////            4. Вывести картины одного автора
////            5. Отсортировать картины по цене по возрастанию
////            6. Вывести картины, где покупатель не аноним
////            7. Вывести картины, где указан продавец и покупатель не аноним
////            8. Выход
//
//            int userNamber = 0;
//            Scanner scn = new Scanner(System.in);
//
//            while (userNamber!=8){
//                System.out.println("Write what do you wont");
//                System.out.println(("1. Вывести информацию о всех картинах\n" +
//                        "2. Добавить новую картину\n" +
//                        "3. Удалить картину\n" +
//                        "4. Вывести картины одного автора\n" +
//                        "5. Отсортировать картины по цене по возрастанию\n" +
//                        "6. Вывести картины, где покупатель не аноним\n" +
//                        "7. Вывести картины, где указан продавец и покупатель не аноним\n" +
//                        "8. Выход"));
//                userNamber = scn.nextInt();
//                if (userNamber == 1) {
//                    ResultSet res = st.executeQuery("select number, price, nameOfPicture, artist, yearOfCreation, saller, buyer from picture");
//                    while (res.next()) {
//                        System.out.println(res.getInt("number")+" "+res.getInt("price")+" "+ res.getString("nameOfPicture")+" "+ res.getString("artist")+" "+res.getInt("yearOfCreation")+" "+ res.getString("saller")+" "+res.getString("buyer"));
//                    }
//                }
//                else if (userNamber == 2) {
//                    System.out.println("What picture do you wont to put??");
//                    String picture = scn.next();
//                    /// далее я встявлю произвольные значения
//                    st.executeUpdate("insert into picture (number, price,nameOfPicture, artist, yearOfCreation, saller, buyer) values(8, 350000, '"+picture+"', 'Leonardo', 1400, 'Dmitry ', ' Saud' );");
//
//                } else if (userNamber == 3) {
//                    System.out.println("What picture do you wont to delete?");
//                    String deletePicture = scn.next();
//                    st.executeUpdate("delete from picture where nameOfPicture = '"+ deletePicture +"'");
//                } else if (userNamber == 4) {
//                    System.out.println("What author do wont to see? ");
//                    String author = scn.next();/// проблема так как нехт лайн  не работает по этому находит только автора состоящего из из одного слова
//                    ResultSet res = st.executeQuery("select number, price, nameOfPicture, artist, yearOfCreation, saller, buyer from picture where artist = '"+author+"'");
//                    while (res.next()) {
//                        System.out.println(res.getInt("number")+" "+res.getInt("price")+
//                                ""+res.getString("nameOfPicture")+" "+ res.getString("artist")+
//                                " "+ res.getInt("yearOfCreation")+" "+res.getString("saller")+" "+res.getString("buyer"));
//                        //
//                    }
//                } else if (userNamber == 5) {
//                    ResultSet res = st.executeQuery("select number, price, nameOfPicture, artist, yearOfCreation, saller, buyer from picture  ");
//
//                    while (res.next()) {
//                        /// не совсем понятно
//                    }
//
//                } else if (userNamber == 6) {
//                    ResultSet res = st.executeQuery("select number, price, nameOfPicture, artist, yearOfCreation, saller, buyer from picture where saller != 'Private collection'  ");
//                    while (res.next()) {
//                        System.out.println(res.getInt("number")+" "+res.getInt("price")+" "+ res.getString("nameOfPicture")+" "+ res.getString("artist")+" "+res.getInt("yearOfCreation")+" "+ res.getString("saller")+" "+res.getString("buyer"));
//                    }
//                } else if (userNamber == 7) {
//                    ResultSet res = st.executeQuery("select number, price, nameOfPicture, artist, yearOfCreation, saller, buyer from picture where saller != 'Private collection' and buyer!='Private collection'  ");
//                    while (res.next()) {
//                        System.out.println(res.getInt("number")+" "+res.getInt("price")+" "+ res.getString("nameOfPicture")+" "+ res.getString("artist")+" "+res.getInt("yearOfCreation")+" "+ res.getString("saller")+" "+res.getString("buyer"));
//                    }
//                }
//
//
//            }
//            System.out.println("Good bye!!!");
//
//
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

//////////// ex 8
//        8. Создать файл с любым текстом и подсчитать, сколько раз в нем встречается каждое слово
//        (Для этого можно использовать HashMap, где ключом сделать слово, а значением - количество повторений)
//              и при очередном повторении нужно увеличивать это число на 1

//

//Занятие
//        Scanner scn = new Scanner(System.in);
//            System.out.println("введите перый текст");
//            scn.next();
//            scn = new Scanner(System.in);
//            System.out.println("Введите второй");
//            scn.nextLine();

//        //Создать калькулятор
//        System.out.println("ведите число");
//        if(scn.hasNextInt()){
//            int a = scn.nextInt();
//            System.out.println("a = "+a);
//        }
//        scn = new Scanner(System.in);
//        String res = scn.next();
//        System.out.println("res = "+res);


        //как работает nextLine:
        /*
        я ввел с консоли: hello\n
        next считал: hello
        во внутреннем буфере осталось: \n
        когда я вызваю nextLine после next, он считывает не с консоли,а из буфера \n и поэтому складывается ощущение, что он не работает
         */




        //вставка с id
//        try {
//            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/poetbd?characterEncoding=utf8", "root", "");
//            Statement st = connection.createStatement();
//            st.executeUpdate("insert into poet2(name,year) values('Достоевский', 1801);");
//        }catch(Exception e){
//            e.printStackTrace();
//
//        }

//        try {
//            Scanner scn = new Scanner(new File("book.csv"),"CP1251");
//            ArrayList<Author> authors = new ArrayList<>();
//            while (scn.hasNextLine()) {
//                String[] arr = scn.nextLine().split(";");
//                Author author = new Author();
//                author.name = arr[0];
//                author.birthYear = Integer.valueOf(arr[1]);
//                String books = arr[2];
//                arr = books.split(":");
//                for (int i = 0; i < arr.length; i++) {
//                    author.books.add(arr[i]);
//                }
//                authors.add(author);
//            }
//            System.out.println(authors);
//
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }


///// ex 5
//        5. Создать вручную excel файл с содержымым:
//        Александр Пушкик;1799;Евгений Онегин:Капитанская дочка:Пиковая дама
//        Лев Толстой;1828;Анна Коренина:Война и мир
//        Федор Достоевский;Братья Карамазовы:Преступление и наказание:Игрок:Записки из подполья
//
//        Данные в файле имеют следующий формат:
//        автор;год рождения;книга1:книга2:....:книгаN
//        У каждого автора может быть любое количество книг, перечисленные через двоеточие
//
//        Сохранить созданный ексель в формате csv. Далее, написать программу,
//        работающую с этим csv. (csv - Это файл, который является одновременно текстовым,
//        его можно открыт через блокнот/wordpad и проч и одновременно такой файл поддерживается excel)
//
//        Создать меню
//        1. Вывести список авторов и их произведения
//        2. Вывести произведения по фамилии автора
//        3. Добавить произведение автору
//        4. Удалить произведение у автора
//        5. Добавить автора
//        6. Удалить автора
//        7. Выход
//
//        При запуске программы данные из файла должны быть считаны в программу.
//                При завершении программы все изменения должны быть сохранены в том же файле

        try {

            Scanner scn = new Scanner(new File("poetBook.csv"), "CP1251");
//
            ArrayList<Author> authors = new ArrayList<>();


            while (scn.hasNextLine()) {
                String[] arr = scn.nextLine().split(";");
                Author author = new Author();
                author.name = arr[0];
                author.birthYear = Integer.valueOf(arr[1]);
                String book = arr[2];
                arr = book.split(":");
                Collections.addAll(author.books, arr);
                authors.add(author);
            }

            int userNamber = 0;

            while (userNamber != 7) {
                System.out.println((
                        "1. Вывести список авторов и их произведения\n" +
                        "2. Вывести произведения по фамилии автора\n" +
                        "3. Добавить произведение автору\n" +
                        "4. Удалить произведение у автора\n" +
                        "5. Добавить автора\n" +
                        "6. Удалить автора\n" +
                        "7. Выход"));
                System.out.println("Write what do you want");
                scn = new Scanner(System.in);
                userNamber=scn.nextInt();
                if (userNamber == 1) {
                    for (int i = 0; i < authors.size(); i++) {
                        System.out.println(authors.get(i));
                    }
                } else if (userNamber == 2) {
                    scn = new Scanner(System.in);
                    System.out.println("What author do you wont to see??");
                    String author = scn.nextLine();
                    for (int i = 0; i < authors.size(); i++) {
                        if (author.equals(authors.get(i).name)){
                            System.out.println(authors.get(i));
                        }
                    }

                } else if (userNamber == 3) {
                    scn = new Scanner(System.in);
                    Author au = new Author();
                    System.out.println("Which author do you wont to add book??");
                    String author = scn.nextLine();
                    System.out.println("What book do you wont to add in your author?");
                    String books = scn.nextLine();
                    for (int i = 0; i < authors.size(); i++) {
                        if (author.equals(authors.get(i).name)) {
                            authors.get(i).books.add(books);
                        }
                    }
                } else if (userNamber == 4) {
                    scn = new Scanner(System.in);
                    Author au = new Author();
                    System.out.println("Which author do you wont to delete book??");
                    String author = scn.nextLine();
                    System.out.println("What book do you wont to delete in your author?");
                    String books = scn.nextLine();
                    for (int i = 0; i < authors.size(); i++) {
                        if (author.equals(authors.get(i).name)) {
                            authors.get(i).books.remove(books);
                        }
                    }

                } else if (userNamber == 5) {
                    scn = new Scanner(System.in);
                    Author au = new Author();
                    System.out.println("Which author do you wont to add??");
                    String author = scn.nextLine();
                    System.out.println("Write years");
                    int years = scn.nextInt();
                    au.name = author;
                    au.birthYear = years;
                    authors.add(au);

                } else if (userNamber == 6) {
                    scn = new Scanner(System.in);
                    Author au = new Author();
                    System.out.println("Which author do you wont to delete??");
                    String author =scn.nextLine();
                    au.name=author;

                    //реализация remove
//                    for (int i = 0; i < authors.size(); i++) {
//                        if(authors.get(i).equals(author)){
//                            authors.remove(i);
//                        }
//                    }

                    authors.remove(au);
                }

                else if (userNamber == 7) {
                    FileWriter fw = new FileWriter("poetBook.csv");

                    for (Author author : authors) {
                        fw.write(author + "\n");

                    }
                    fw.close();
                }




            }
//
//
//
//
//
//
//        } catch (Exception e) {
//            e.printStackTrace();
//
//        }
//

//
         //        Нужно написать консольное меню
////            1. Вывести информацию о всех картинах
////            2. Добавить новую картину
////            3. Удалить картину
////            4. Вывести картины одного автора
////            5. Отсортировать картины по цене по возрастанию
////            6. Вывести картины, где покупатель не аноним
////            7. Вывести картины, где указан продавец и покупатель не аноним
////            8. Выход

//        try {
//
//
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

    }
}
