package com.o9uzdev.javaChartBallAnimation;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        BallPane ballPane = new BallPane();
        // Create a scene and place it in the stage
        Scene scene = new Scene(ballPane, 640, 480);
        stage.setTitle("Ball Animation"); // Set the stage title
        stage.setScene(scene); // Place the scene in the stage
        stage.show(); // Display the stage
    }
}
