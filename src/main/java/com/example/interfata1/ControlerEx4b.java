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

public class ControlerEx4b implements Initializable{
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
                ResultSet resultSet = statement.executeQuery("SELECT A.nrcard AS nrcard1, B.nrcard AS nrcard2, A.data_ora\n" +
                        "FROM Miscari A\n" +
                        "JOIN Miscari B ON A.data_ora = B.data_ora AND A.nrcard < B.nrcard;\n");

                StringBuilder textAreaContent = new StringBuilder();
                textAreaContent.append("NrCard1                     ").append("NrCard2                    ").append("  Data_Ora\n");
                while (resultSet.next()) {
                    String nrcard1 = resultSet.getString("nrcard1");
                    String nrcard2 = resultSet.getString("nrcard2");
                    String data_ora = resultSet.getString("data_ora");
                    textAreaContent.append(nrcard1+ "   ").append(nrcard2+"    ").append(data_ora+"\n");
                }

                // Set the content to the TextArea
                textArea.setText(textAreaContent.toString());

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
