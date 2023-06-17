package com.example;

import com.google.gson.Gson;

public class App {
    public static void main(String[] args) {
        String name = "Daniil";
        String lastName = "Vavshko";

        Gson gson = new Gson();
        String json = gson.toJson(new Person(name, lastName));

        System.out.println(json);
    }
}
