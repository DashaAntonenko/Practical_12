package com.mirea.kt.example;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class LoadRunnable implements Runnable {
    private String path;
    public LoadRunnable(String path) {
        this.path = path;
    }
    public void run() {
        FileInputStream fis;
        if (this.path != null && new File(this.path).exists()) {
            try {
                fis = new FileInputStream(this.path);
                ObjectInputStream ois = new ObjectInputStream(fis);
                Message message = (Message) ois.readObject();
                ois.close();
                System.out.println(message.toString());
            }catch (Exception ex) {
                System.out.println("Ошибка при загрузке объекта из файла: " + this.path);
                ex.printStackTrace();
            }
        }
    }
}