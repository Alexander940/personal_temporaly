package main;

import javafx.application.Application;
import javafx.stage.Stage;
import ui.MainWindow;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        MainWindow mainWindow = new MainWindow();
        mainWindow.show();
    }
}
