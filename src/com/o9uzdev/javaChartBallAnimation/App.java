package com.o9uzdev.javaChartBallAnimation;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application{
    @Override
    public void start(Stage primaryStage) {
        BallPane ballPane = new BallPane();

        // Pause and resume animation
        ballPane.setOnMousePressed(e -> ballPane.pause());
        ballPane.setOnMouseReleased(e -> ballPane.play());

        ballPane.setFocusTraversable(true);
        ballPane.setOnKeyPressed(e -> {
            switch (e.getCode()) {
                case UP:
                    ballPane.increaseSpeed();
                    break;
                case DOWN:
                    ballPane.decreaseSpeed();
                    break;
            }
        });

        // Create a scene and place it in the stage
        Scene scene = new Scene(ballPane, 250, 150);
        primaryStage.setTitle("Ball Animation"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage

        ballPane.requestFocus();
    }
}