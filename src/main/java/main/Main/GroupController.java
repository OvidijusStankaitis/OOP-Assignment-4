package main.Main;

import Data.Student;
import Data.StudentGroup;
import Data.StudentGroupData;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class GroupController {
    @FXML
    private TextField groupField;

    public StudentGroup processResults() {
        String groupName = groupField.getText().trim();
        ObservableList<Student> studentList = FXCollections.observableArrayList();

        StudentGroup newGroup = new StudentGroup(groupName, studentList);
        StudentGroupData.getInstance().addStudentGroup(newGroup);
        return newGroup;
    }
}
