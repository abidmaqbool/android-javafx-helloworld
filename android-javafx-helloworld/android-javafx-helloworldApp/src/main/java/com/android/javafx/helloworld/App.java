package com.android.javafx.helloworld;

import com.gluonhq.charm.down.common.PlatformFactory;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        VBox root = new VBox(10);
        root.setPrefSize(335, 600);

        Scene scene;
        if (PlatformFactory.getPlatform().getName().equals(PlatformFactory.ANDROID)) {
            Rectangle2D visualBounds = Screen.getPrimary().getVisualBounds();
            scene = new Scene(root, visualBounds.getWidth(), visualBounds.getHeight());
        } else {
            scene = new Scene(root);

            stage.setTitle("Android JavaFX Hello World App");
        }

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
