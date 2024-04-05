package com.mirea.kt.example;

import java.util.Scanner;

public class Practical {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите путь к файлу: ");
        String path = scanner.nextLine();
        LoadRunnable loadRunnable = new LoadRunnable(path);
        Thread thread = new Thread(loadRunnable);
        thread.start();
    }
}