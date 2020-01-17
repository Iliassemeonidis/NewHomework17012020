package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PostOffice {
    private HashMap<Address, ArrayList<Post>> map;
    public PostOffice(HashMap<Address, ArrayList<Post>> map) {
        this.map = map;
    }



    public void startDeliver() {
        Scanner scn = new Scanner(System.in);
        System.out.println("введите авдерс");

            for (Map.Entry<Address, ArrayList<Post>>  ent : map.entrySet()) {
                if (ent.getKey().equals( new Address(scn.next(), scn.next(), scn.nextInt(), scn.nextInt()))) {
                System.out.println(ent.getValue() + " доставлена");
            }
        }

    }

    public HashMap<Address, ArrayList<Post>> getMap() {
        return map;
    }
}
