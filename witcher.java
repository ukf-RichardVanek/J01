package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polyline;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Group root = new Group();
       Scene scene = new Scene(root,600,400);
        primaryStage.setTitle("Hello World");
        scene.setFill(Color.BLACK);

        Polyline znak1= new Polyline();
       znak1.setStroke(Color.FUCHSIA);
       znak1.setStrokeWidth(3);
        znak1.getPoints().addAll(new Double[]{
                100.0,200.0,
                120.0,180.0,
                70.0,180.0,
                120.0,240.0,
                70.0,240.0,
                85.0,220.0});
        root.getChildren().add(znak1);

        Polyline znak2 = new Polyline();
        znak2.setStrokeWidth(3);
        znak2.setStroke(Color.YELLOW);
        znak2.getPoints().addAll(new Double[]{
                195.0,200.0,
                210.0,200.0,
                220.0,180.0,
                170.0,180.0,
                195.0,240.0,
                205.0,220.0});
        root.getChildren().add(znak2);


        Polyline znak3 = new Polyline();
        znak3.setStrokeWidth(3);
        znak3.setStroke(Color.RED);
        znak3.getPoints().addAll(new Double[]{
                295.0,180.0,
                270.0,240.0,
                320.0,240.0,
                305.0,205.0,});
        root.getChildren().add(znak3);

        Polyline znak4 = new Polyline();
        znak4.setStrokeWidth(3);
        znak4.setStroke(Color.GREEN);
        znak4.getPoints().addAll(new Double[]{
                415.0,180.0,
                365.0,180.0,
                390.0,240.0,
                405.0,205.0,});
        root.getChildren().add(znak4);

        Polyline znak5 = new Polyline();
        znak5.setStrokeWidth(3);
        znak5.setStroke(Color.TURQUOISE);
        znak5.getPoints().addAll(new Double[]{
                487.0,200.0,
                495.0,180.0,
                520.0,240.0,
                470.0,240.0,
                480.0,220.0,
                495.0,220.0});
        root.getChildren().add(znak5);

        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
