package com.invento.invento;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Parent root=FXMLLoader.load(getClass().getResource("login.fxml"));
        stage.initStyle(StageStyle.DECORATED);
        //stage.setTitle("Hello!");
        stage.setScene(new Scene(root,939,559.49));
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}