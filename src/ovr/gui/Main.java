package ovr.gui;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import ovr.UDPServer;


public class Main extends Application {
    private static Controller controller;

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("sample.fxml"));
        Parent root = (Parent) fxmlLoader.load();
        controller = fxmlLoader.getController();
        primaryStage.setTitle("Coordinate");
        primaryStage.setScene(new Scene(root));

        primaryStage.show();
        final UDPServer udpServer = new UDPServer();
        udpServer.setDaemon(true);
        udpServer.setController(controller);
        udpServer.start();
        primaryStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
            @Override
            public void handle(WindowEvent windowEvent) {
                udpServer.abort();
            }
        });
    }


    public static void main(String[] args) {
        launch(args);
    }
}
