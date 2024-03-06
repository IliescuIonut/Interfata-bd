package com.example.interfata1;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

public class ControlerEx4a implements Initializable{
    @FXML
    private TextArea textArea;

    private Stage stage;
    private Scene scene;



    public void schimba_scena2(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try {
            Connection connection = Conexiune.getConnection();
            if (connection != null) {

                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT DISTINCT P.nume, C.tip\n" +
                        "FROM Persoane P\n" +
                        "JOIN Conturi CO ON P.idpers = CO.idpers\n" +
                        "JOIN Carduri C ON CO.nrcont = C.nrcont\n" +
                        "WHERE C.tip = 'VISA';");

                StringBuilder textAreaContent = new StringBuilder();
                textAreaContent.append("Nume            ").append(" Tip").append("\n");
                while (resultSet.next()) {
                    String nume = resultSet.getString("nume");
                    String tip = resultSet.getString("tip");
                    textAreaContent.append(nume+ "    ").append(tip).append("\n");
                }

                // Set the content to the TextArea
                textArea.setText(textAreaContent.toString());

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
