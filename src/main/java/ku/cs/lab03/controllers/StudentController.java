package ku.cs.lab03.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import ku.cs.lab03.models.Student;

public class StudentController {
    @FXML
    private Label nameLabel;

    @FXML
    public void initialize(){
        Student student = new Student("6510405342", "Kittiphat");
        showStudeent(student);
    }

    private void showStudeent(Student student) {
        nameLabel.setText(student.getName());
    }
}
