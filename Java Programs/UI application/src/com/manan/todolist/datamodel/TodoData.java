package com.manan.todolist.datamodel;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;

public class TodoData {         //Singleton class formation
    private static TodoData instance;
    private static String filename="Todolistitems.txt";

    private ObservableList<TodoItem> todoitems;
    private DateTimeFormatter formatter;



    public static TodoData getInstance(){
        if(instance==null)
            instance=new TodoData();


        return instance;
    }

    private TodoData(){
        formatter=DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
    }

    public ObservableList<TodoItem> getTodoitems() {
        return todoitems;
    }

    public void setTodoitems(ObservableList<TodoItem> todoitems) {

        this.todoitems = todoitems;
    }
    public TodoItem loadTodoitems() throws IOException{
        todoitems = FXCollections.observableArrayList(); // for readable purpose only.
        Path path= Paths.get(filename);

        BufferedReader br= Files.newBufferedReader(path);
        String input;
        try{
            while((input= br.readLine())!=null){
                String[] items=input.split("\t");

                String shortdescription=items[0];
                String details=items[1];
                String datestring=items[2];

                LocalDate date= LocalDate.parse(datestring,formatter);
                TodoItem todoItem=new TodoItem(shortdescription,details,date);
                todoitems.add(todoItem);

            }

        }finally {
            if(br !=null){
                br.close();
            }
        }
        return null;
    }
    public void storetodoitems() throws IOException{
        Path path=Paths.get(filename);
        BufferedWriter bf=Files.newBufferedWriter(path);
        try{
            Iterator<TodoItem> itemIterator=todoitems.iterator();
            while(itemIterator.hasNext()){
                TodoItem item=itemIterator.next();
                bf.write(String.format("%s\t%s\t%s" , item.getShortdescription(),item.getDetails(),item.getDeadline().format(formatter)));
                bf.newLine();
            }


        }finally {
            if(bf !=null){
                bf.close();
            }

        }
    }
    public void addTodoitem(TodoItem item){
      todoitems.add(item);
    }

    public void deletetodoitem(TodoItem item){
        todoitems.remove(item);
    }
}
