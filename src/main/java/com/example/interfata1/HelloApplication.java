package com.example.interfata1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.image.Image;

import java.io.IOException;


public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.setResizable(false);
        stage.setTitle("Interfata aplicatie MySQL");
        stage.getIcons().add(new Image("D:\\an2\\sem1\\bd\\Interfata1\\src\\main\\java\\java.png"));
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}