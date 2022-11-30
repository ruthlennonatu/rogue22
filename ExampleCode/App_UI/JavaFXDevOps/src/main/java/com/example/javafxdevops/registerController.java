package com.example.javafxdevops;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import java.io.File;
import java.net.URL;
import java.sql.Connection;
import java.sql.Statement;
import javafx.fxml.FXML;
import javafx.stage.Stage;

public class registerController {
    @FXML
    private Button closeButton;
    @FXML
    private Label registrationMessageLabel;
    @FXML
    private PasswordField setPasswordPasswordField;
    @FXML
    private PasswordField confirmPasswordPasswordField;
    @FXML
    private Label passwordMatchLabel;
    @FXML
    private TextField firstNameTextField;
    @FXML
    private TextField lastNameTextField;
    @FXML
    private TextField setusernameTextField;


    public void registerButtonOnAction(ActionEvent event){
        if(setPasswordPasswordField.getText().equals(confirmPasswordPasswordField.getText()))
        {
            passwordMatchLabel.setText("Passwords Match");

        }
        else
        {
            passwordMatchLabel.setText("Passwords do not match!");
        }
        registerUser();
    }
    public void closeButtonOnAction(ActionEvent event) {
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
        Platform.exit();
    }
    public void registerUser(){
        DatabaseConnection connection = new DatabaseConnection();
        Connection connectionDB = connection.getConnection();
        String firstName = firstNameTextField.getText();
        String lastName = lastNameTextField.getText();
        String userName = setusernameTextField.getText();
        String password = setPasswordPasswordField.getText();


        String insertFields = "INSERT INTO useraccounts (firstName, lastName, userName, password) VALUES ('";
        String insertValues =firstName + "','" + lastName + "','" + userName + "','"+ password+"')";
        String insertRegister = insertFields +insertValues;

        try
        {
            Statement statement = connectionDB.createStatement();
            statement.executeUpdate(insertRegister);
            registrationMessageLabel.setText("Registered Successfully");

        }
        catch(Exception e){
            e.printStackTrace();
            e.getCause();
        }
    }
}