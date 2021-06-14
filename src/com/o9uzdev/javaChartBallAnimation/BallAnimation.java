package com.o9uzdev.javaChartBallAnimation;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class BallAnimation extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        BallPane ballPane = new BallPane();

        Scene scene = new Scene(ballPane, 250, 150);
        stage.setTitle("Ball Animation"); // Set the stage title
        stage.setScene(scene); // Place the scene in the stage
        stage.show(); // Display the stage

        ballPane.requestFocus();
    }
}
