package com.company;

import javax.swing.text.html.parser.Entity;
import java.util.*;

public class Main {

    public static void main(String[] args) {

//        Создать класс Address с private полями
//            город
//        улица
//           дом
//        квартира
//        Остальную структуру Address нужно дописать по необходимости
//
//        Создать класс Client с private полями
//         имя
//        адрес
//        Остальную структуру Client нужно дописать по необходимости
//
//        Создать класс Post(посылка) с private полями
//        название содержимого посылки
//        адрес получателя
//        Остальную структуру Post нужно дописать по необходимости
//
//        Создать класс PostOffice (почтовое отделение) с private полями
//        карта типа HashMap, где ключом является адрес, а значением - список посылок (HashMap<Address, ArrayList<Post»)
//        Создать метод startDeliver, который запускаем процесс доставки посылок
//        Остальную структуру PostOffice нужно дописать по необходимости
//
//        В мейне создать клиентов, почтовое отделение, заполнить почтовое отделение посылками и раздать все посылки их клиентам.
//       Симитировать ситуации, когда на посылке указан адресс неверно.
//       В этом случае после раздачи посылок нужно вывести список оставшихся посылок с не найденным адресом.

        Address address = new Address("Москва", "Никитска", 1, 2);
        Client client = new Client("Сргей", address);
        Post post = new Post("Книги",client);
        ArrayList<Post> list = new ArrayList<>();
        list.add(post);
        HashMap<Address, ArrayList<Post>> map = new HashMap<>();
        map.put(address, list);



         PostOffice postOffice = new PostOffice(map);
         postOffice.startDeliver();

//
//
//
//
//
//        Создать библиотеку книг, упорядоченную в алфавитном порядке по фамилии автора.
//        Зная фамилию автора, пользователь должен иметь возможность получить доступ ко всем его книгам.
//
//        Создать класс Author с private полем surname - фамилия автора.
//        Реализовать интерфейс Comparable и метод compareTo
//        Остальную структуру класса Author нужно дописать по необходимости
//
//        Создать класс Page(страница книги) с private полями
//        номер страницы
//        текст страницы
//        Остальную структуру класса Page нужно дописать по необходимости
//
//        Создать класс Book(книга) с private полями:
//        название книги
//        список страниц
//        Остальную структуру Book нужно дописать по необходимости
//
//        Чтобы обеспечить доступ с списку книг по фамилии автора нужна структура на основе интерфейса Map.
//        Библиотека должна быть упорядочена в алфавитном порядке, значит,
//        ключи карты должны быть отсортированы в алфавитном порядке.
//        Такую функциональность предоставляет класс TreeMap.
//        Ключом должен быть автор, а значением - список книг.
//        В итоге, библиотека будет выглядеть следующим образом: TreeMap<Author, ArrayList<Book» lib;
//
//        В мейне создать библиотеку и заполнить ее значениями:
//                - Сгенерировать число n в диапазоне от 5 до 10 - число авторов.
//                - Для каждого автора сгенерировать число m от 3 до 5 - число книг.
//                - Для каждой книги сгенерировать число z от 2 до 5 - число страниц.
//
//                Создать консольное меню для пользователя:
//        1. Вывести всех авторов (выводятся фамилии авторов в алфавитном порядке)
//        2. Вывести список книг у автора (выводится название книг выбранного автора)
//        3. Вывести содержание книги у автора (выводится номер страниц и их текст для выбранной книги у выбранного автора)
//        4. Выход.

//        Scanner scn = new Scanner(System.in);
//        TreeMap<Author, ArrayList<Book>> lib = new TreeMap<>();
//        Random rnd = new Random();
//        int authors = rnd.nextInt(3) + 2;
//
//        ArrayList<Book> listBook;
//        ArrayList<Page> p;
//        for (int j = 0; j < authors; j++) {
//            listBook = new ArrayList<>();
//            int books = rnd.nextInt(3) + 1;
//            int pages = rnd.nextInt(5) + 2;
//            for (int i = 0; i < books; i++) {
//                int b = books - i;
//                System.out.println("кол-во книг = " + (b));
//                System.out.println("write name of book");
//                String book = scn.next();
//                p = new ArrayList<>();
//                for (int k = 0; k < pages; k++) {
//                    System.out.println("напишите такст на странице" + (pages - k) + " в книге " + b);
//                    p.add(new Page(k, scn.next()));
//                }
//                listBook.add(new Book(book, p));
//            }
//            System.out.println("напишите имя автора");
//            lib.put(new Author(scn.next()), listBook);
//
//        }
//
//        for (Map.Entry<Author, ArrayList<Book>> ent : lib.entrySet()) {
//            System.out.println(ent.getKey() + "" + ent.getValue());
//        }
//
//        int userNumber = 0;
//        while (userNumber != 4) {
//
//            System.out.println(
//                    "1. Вывести всех авторов (выводятся фамилии авторов в алфавитном порядке)\n" +
//                            "2. Вывести список книг у автора (выводится название книг выбранного автора)\n" +
//                            "3. Вывести содержание книги у автора (выводится номер страниц и их текст для выбранной книги у выбранного автора)\n" +
//                            "4. Выход.");
//            System.out.println("Write what do you wont");
//            userNumber = scn.nextInt();
//            switch (userNumber) {
//                case (1):
//                    for (Map.Entry m : lib.entrySet()) {
//                        System.out.println(m.getKey().toString());
//                    }
//
//                    break;
//                case (2):
//                    System.out.println("Введите автора");
//                    Author author = new Author(scn.next());
//                    for (Map.Entry<Author, ArrayList<Book>> m : lib.entrySet()) {
//                        if (lib.containsKey(author)) {
//                            for (int i = 0; i < lib.get(author).size(); i++) {
//                                System.out.println(m.getValue().iterator().next().getNameBook());
//                            }
//                        }
//                    }
//                    break;
//                case (3):
//
//
//                default:
//                    System.out.println("bay");
//                    break;
//            }
//        }
    }
}







    


    



