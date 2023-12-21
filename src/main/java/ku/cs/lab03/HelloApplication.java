package ku.cs.lab03;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import ku.cs.lab03.services.FXRouter;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXRouter.bind(this, stage, "6510405342 - Lab03");
        configRoute();
        FXRouter.goTo("student");
    }

    private static void configRoute() {
        final String VIEW_PATH = "ku/cs/lab03/views/";

        FXRouter.when("hello", VIEW_PATH + "hello-view.fxml");
        FXRouter.when("student", VIEW_PATH + "student.fxml");
    }

    public static void main(String[] args) {
        launch();
    }
}