package com.manan.todolist;

import com.manan.todolist.datamodel.TodoData;
import com.manan.todolist.datamodel.TodoItem;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class DialogController {
    @FXML
    private TextField shortDescription;

    @FXML
    private TextArea detailsarea;
    @FXML
    private DatePicker deadlinedate;

    public TodoItem processresult(){
        String shortdescription= shortDescription.getText().trim();
        String details = detailsarea.getText().trim();
        LocalDate date=deadlinedate.getValue(); //Local Date is used for retreaving the dates.

        TodoItem item=new TodoItem(shortdescription,details,date);
        TodoData.getInstance().addTodoitem(item);
        return item;
    }
}
