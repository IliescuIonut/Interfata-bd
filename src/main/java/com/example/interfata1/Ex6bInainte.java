package com.example.interfata1;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class Ex6bInainte{

    private Stage stage;
    private Scene scene;

    public void schimba_scena(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("sql6b.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}
