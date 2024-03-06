package com.example.interfata1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private TreeView treeView;
    @FXML
    private BorderPane borderPane;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        TreeItem<String> rootItem=new TreeItem<>("Exercitii-subiect_15", new ImageView(new Image("D:\\an2\\sem1\\bd\\Interfata1\\src\\main\\java\\folder_mare.png")));

        TreeItem<String> branchItem1=new TreeItem<>("Ex_3", new ImageView(new Image("D:\\an2\\sem1\\bd\\Interfata1\\src\\main\\java\\folder.png")));
        TreeItem<String> branchItem2=new TreeItem<>("Ex_4", new ImageView(new Image("D:\\an2\\sem1\\bd\\Interfata1\\src\\main\\java\\folder.png")));
        TreeItem<String> branchItem3=new TreeItem<>("Ex_5", new ImageView(new Image("D:\\an2\\sem1\\bd\\Interfata1\\src\\main\\java\\folder.png")));
        TreeItem<String> branchItem4=new TreeItem<>("Ex_6", new ImageView(new Image("D:\\an2\\sem1\\bd\\Interfata1\\src\\main\\java\\folder.png")));

        TreeItem<String> leafItem1=new TreeItem<>("a.", new ImageView(new Image("D:\\an2\\sem1\\bd\\Interfata1\\src\\main\\java\\mysql.png")));
        TreeItem<String> leafItem2=new TreeItem<>("b.", new ImageView(new Image("D:\\an2\\sem1\\bd\\Interfata1\\src\\main\\java\\mysql.png")));
        TreeItem<String> leafItem3=new TreeItem<>("a.", new ImageView(new Image("D:\\an2\\sem1\\bd\\Interfata1\\src\\main\\java\\mysql.png")));
        TreeItem<String> leafItem4=new TreeItem<>("b.", new ImageView(new Image("D:\\an2\\sem1\\bd\\Interfata1\\src\\main\\java\\mysql.png")));
        TreeItem<String> leafItem5=new TreeItem<>("a.", new ImageView(new Image("D:\\an2\\sem1\\bd\\Interfata1\\src\\main\\java\\mysql.png")));
        TreeItem<String> leafItem6=new TreeItem<>("b.", new ImageView(new Image("D:\\an2\\sem1\\bd\\Interfata1\\src\\main\\java\\mysql.png")));
        TreeItem<String> leafItem7=new TreeItem<>("a.", new ImageView(new Image("D:\\an2\\sem1\\bd\\Interfata1\\src\\main\\java\\mysql.png")));
        TreeItem<String> leafItem8=new TreeItem<>("b.", new ImageView(new Image("D:\\an2\\sem1\\bd\\Interfata1\\src\\main\\java\\mysql.png")));

        branchItem1.getChildren().addAll(leafItem1, leafItem2);
        branchItem2.getChildren().addAll(leafItem3, leafItem4);
        branchItem3.getChildren().addAll(leafItem5, leafItem6);
        branchItem4.getChildren().addAll(leafItem7, leafItem8);
        rootItem.getChildren().addAll(branchItem1,branchItem2,branchItem3,branchItem4);
        treeView.setRoot(rootItem);
    }
    @FXML
    public void selectItem() throws IOException {
        TreeItem<String> item= (TreeItem<String>) treeView.getSelectionModel().getSelectedItem();
        if (item != null && "a.".equals(item.getValue()) && "Ex_3".equals(item.getParent().getValue())) {
            AnchorPane view= FXMLLoader.load(getClass().getResource("ex3.a.fxml"));
            borderPane.setCenter(view);
        }
        if (item != null && "b.".equals(item.getValue()) && "Ex_3".equals(item.getParent().getValue())) {
            AnchorPane view= FXMLLoader.load(getClass().getResource("ex3.b.fxml"));
            borderPane.setCenter(view);
        }
        if (item != null && "a.".equals(item.getValue()) && "Ex_4".equals(item.getParent().getValue())) {
            AnchorPane view= FXMLLoader.load(getClass().getResource("ex4.a.fxml"));
            borderPane.setCenter(view);
        }
        if (item != null && "b.".equals(item.getValue()) && "Ex_4".equals(item.getParent().getValue())) {
            AnchorPane view= FXMLLoader.load(getClass().getResource("ex4.b.fxml"));
            borderPane.setCenter(view);
        }
        if (item != null && "a.".equals(item.getValue()) && "Ex_5".equals(item.getParent().getValue())) {
            AnchorPane view= FXMLLoader.load(getClass().getResource("ex5.a.fxml"));
            borderPane.setCenter(view);
        }
        if (item != null && "b.".equals(item.getValue()) && "Ex_5".equals(item.getParent().getValue())) {
            AnchorPane view= FXMLLoader.load(getClass().getResource("ex5.b.fxml"));
            borderPane.setCenter(view);
        }
        if (item != null && "a.".equals(item.getValue()) && "Ex_6".equals(item.getParent().getValue())) {
            AnchorPane view= FXMLLoader.load(getClass().getResource("ex6.a.fxml"));
            borderPane.setCenter(view);
        }
        if (item != null && "b.".equals(item.getValue()) && "Ex_6".equals(item.getParent().getValue())) {
            AnchorPane view= FXMLLoader.load(getClass().getResource("ex6.b.fxml"));
            borderPane.setCenter(view);
        }
        if (item != null && "Exercitii-subiect_15".equals(item.getValue())) {
            AnchorPane view= FXMLLoader.load(getClass().getResource("centruinitial.fxml"));
            borderPane.setCenter(view);
        }
        if (item != null && "Ex_3".equals(item.getValue())) {
            AnchorPane view= FXMLLoader.load(getClass().getResource("alegesubpct.fxml"));
            borderPane.setCenter(view);
        }
        if (item != null && "Ex_4".equals(item.getValue())) {
            AnchorPane view= FXMLLoader.load(getClass().getResource("alegesubpct.fxml"));
            borderPane.setCenter(view);
        }
        if (item != null && "Ex_5".equals(item.getValue())) {
            AnchorPane view= FXMLLoader.load(getClass().getResource("alegesubpct.fxml"));
            borderPane.setCenter(view);
        }
        if (item != null && "Ex_6".equals(item.getValue())) {
            AnchorPane view= FXMLLoader.load(getClass().getResource("alegesubpct.fxml"));
            borderPane.setCenter(view);
        }
    }


}