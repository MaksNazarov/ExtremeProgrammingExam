package com.example.app.controller;

import com.example.app.client.Client;
import com.example.app.model.Model;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class AppController {
    Client client;
    Model model;
    @FXML private TextField message;

    @FXML
    private Button sendButton;

    @FXML
    private TextArea inputArea;

    @FXML
    private VBox messageBox;

    @FXML
    public void initialize() {

    }

    @FXML
    void onSendButtonClicked() {
        String message = model.getMessage();
        client.send(message);
    }

    @FXML
    void displayMessage() {

    }
}
