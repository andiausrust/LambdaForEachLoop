package com.andi;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> nameList = new ArrayList<>();

        nameList.add("Andi");
        nameList.add("Michi");
        nameList.add("Elias");
        nameList.add("Hannah");

        nameList.forEach(
                p -> System.out.println(p)
        );

    }
}
