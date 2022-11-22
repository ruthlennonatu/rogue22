package com.example.javafxdevops;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class loginController {
    @FXML
    private Button cancelButton;
    @FXML
    private Label loginMessageLabel;
    @FXML
    private TextField usernameTextField;
    @FXML
    private PasswordField passwordPasswordField;
    @FXML
    public void loginButtonOnAction(ActionEvent e){

    if (usernameTextField.getText().isBlank() == false && passwordPasswordField.getText().isBlank()==false)
    {
        validateLogin();


    }
    else{
        loginMessageLabel.setText("Enter valid username and password");
    }
    }
    @FXML
    private void cancelButtonOnAction(ActionEvent e){
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }
    public void validateLogin(){
        DatabaseConnection connect = new DatabaseConnection();
        Connection connectionDB = connect.getConnection();
        String verifyLogin = "SELECT count(1) FROM useraccounts WHERE username = '" +usernameTextField.getText() + "' AND password ='"+ passwordPasswordField.getText()+"'";
        try {
            Statement statement = connectionDB.createStatement();
            ResultSet queryResult = statement.executeQuery(verifyLogin);

            while (queryResult.next()){
                if(queryResult.getInt(1)==1)
                {
                    createAccountForm();

                }else{
                    loginMessageLabel.setText("Invalid Login");
                }
            }

        }catch (Exception e){
            e.printStackTrace();
            e.getCause();
        }

    }
    //method to handle the register
    public void createAccountForm(){
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("registerUser.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 600, 400);
            Stage registerStage = new Stage();
            registerStage.setTitle("DevOps");
            registerStage.setScene(scene);
            registerStage.show();

        }
        catch(Exception e){
            e.printStackTrace();
            e.getCause();
        }

    }

}