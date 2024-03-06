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

public class Ex5b implements Initializable{
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
                ResultSet resultSet = statement.executeQuery("SELECT nrcard\n" +
                        "FROM Carduri C1\n" +
                        "WHERE limita IN (\n" +
                        "    SELECT limita\n" +
                        "    FROM Carduri C2\n" +
                        "    WHERE C2.nrcard = '1111222233334444'\n" +
                        ");\n");

                StringBuilder textAreaContent = new StringBuilder();
                textAreaContent.append("NrCard \n");
                while (resultSet.next()) {
                    String nrcard = resultSet.getString("nrcard");
                    textAreaContent.append(nrcard+ "\n");
                }

                // Set the content to the TextArea
                textArea.setText(textAreaContent.toString());

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
