package br.com.rruffer.library;

import java.io.IOException;

import br.com.rruffer.library.util.ConstantesUtil;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML(ConstantesUtil.PRIMARY_VIEW));
        //scene.getStylesheets().add(getClass().getResource(ConstantesUtil.CSS).toExternalForm());
        stage.setScene(scene);
        stage.show();
    }

    public static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

//    private static Parent loadFXML(String fxml) throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
//        return fxmlLoader.load();
//    
    
    private static Parent loadFXML(String fxml) throws IOException {
    	return FXMLLoader.load(App.class.getResource(fxml));
    }

    public static void main(String[] args) {
        launch();
    }

}