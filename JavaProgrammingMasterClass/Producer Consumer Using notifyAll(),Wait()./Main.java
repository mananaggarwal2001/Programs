package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Message message = new Message();
        (new Thread(new Write(message))).start();
        (new Thread(new Reader(message))).start();
    }
}

class Message {
    private String message;
    boolean isempty = true;

    public synchronized String read() {    // Consumer
        while (isempty) {
            try {
                wait();
            } catch (InterruptedException e) {

            }
        }
        isempty = true;
        notifyAll();
        return message;
    }

    public synchronized void write(String message) {    // Producer
        while (!isempty) {
            try {
                wait();
            } catch (InterruptedException e) {

            }
        }
        isempty = false;
        this.message = message;
        notifyAll();
    }

}

class Write implements Runnable {
    private final Message message;


    public Write(Message message) {
        this.message = message;
    }

    String[] messages = {
            "My name is manan aggarwal",
            "I love to play cricket",
            "I am 19 years old",
            "I Want to travel whole World"
    };

    int length=messages.length;

    public void run() {

        Random random = new Random();
        for (int i = 0; i < length; i++) {
            message.write(messages[i]);
            System.out.println(messages[i]);
            try {
                Thread.sleep(random.nextInt(1000));
            } catch (InterruptedException e) {
                System.out.println("Aborted the sleeping Of the Thread");
            }
        }
        message.write("Finished");
    }
}

class Reader implements Runnable {
    private Message message;

    public Reader(Message message) {
        this.message = message;
    }

    public void run() {
        Random random = new Random();
        for (String message = this.message.read(); !this.message.read().equals("Finished");
             message = this.message.read()) {
            System.out.println(message);
            try {
                Thread.sleep(random.nextInt(1000));
            } catch (InterruptedException e) {
                System.out.println("Aborted Sleeping of the for loop");
            }
        }
    }
}