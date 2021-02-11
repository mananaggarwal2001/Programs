package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static final String EOF = "EOF";

    public static void main(String[] args) {
    ArrayBlockingQueue<String> buffer = new ArrayBlockingQueue<String>(6);
        ExecutorService executorService = Executors.newFixedThreadPool(3);


    Producer producer = new Producer(buffer,ThreadColor.ANSI_GREEN);
    consumer consumer1 = new consumer(buffer,ThreadColor.ANSI_BLACK);
    consumer consumer2 = new consumer(buffer,ThreadColor.ANSI_RED);

    executorService.execute(producer);
    executorService.execute(consumer1);
    executorService.execute(consumer2);

        Future<String> future = executorService.submit(new Callable<String>() {   // Returns the value of type future of the
                                                                                  //Thread that was running in the background when
                                                                                  // Completed until that it frozen the main Thread
            @Override
            public String call() throws Exception {
                System.out.println(ThreadColor.ANSI_CYAN + "I'm Been printed from the callable class");
                return "This is a callable result";
            }
        });

        try {
            future.get();
        }catch (InterruptedException | ExecutionException e){
            System.out.println(e.getMessage());
        }

        executorService.shutdown();
    }
}

class Producer implements Runnable {
    private ArrayBlockingQueue<String> buffer;
    private String color;

    public Producer(ArrayBlockingQueue<String> buffer, String color) {
        this.buffer = buffer;
        this.color = color;
    }

    public void run() {
        Random random = new Random();
        String[] numbers = {"1", "2", "3", "4", "5"};

        for (String singleNum : numbers) {
            try {
                System.out.println(color + "Adding: " + singleNum);
                buffer.put(singleNum);
                Thread.sleep(random.nextInt(1000));
            } catch (InterruptedException e) {
                System.out.println("Producer Disturbed While Producing the Things");
            }
        }

        System.out.println(color + "Adding EOF and Exiting");
        try {
            buffer.put("EOF");
        } catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}


class consumer implements Runnable {
    private ArrayBlockingQueue<String> buffer;
    private String color;

    public consumer(ArrayBlockingQueue<String> buffer, String color) {
        this.buffer = buffer;
        this.color = color;
    }

    public void run() {

        int counter = 0;
        while (true) {
//            lock.lock();

            synchronized (buffer) {
                try {
                    if (buffer.isEmpty()) {
                        continue;
                    }
                    System.out.println(color + " The Counter is: " + counter);
                    if (buffer.peek().equals(Main.EOF)) {
                        System.out.println("EOF have come Exiting.......");
                        break;
                    } else {
                        System.out.println(color + "Removed " + buffer.take());
                    }

                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}

