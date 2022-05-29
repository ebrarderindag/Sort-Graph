package SortGraph;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ebrar
 */
public class Graph extends Application {

    static double matrix[][] = new double[7][2];

    @Override
    public void start(Stage stage) throws Exception {
        init(stage);

    }

    public Graph() {

    }

    public void init(Stage stage) {
        HBox root = new HBox();
        Scene scene = new Scene(root, 450, 350);

        CategoryAxis xAxis = new CategoryAxis();
        xAxis.setLabel("Size of Array");

        NumberAxis yAxis = new NumberAxis();
        yAxis.setLabel("Sorting Time");

        LineChart<String, Number> lineChart = new LineChart<String, Number>(xAxis, yAxis);
        lineChart.setTitle("SORTING GRAPH");

        XYChart.Series<String, Number> data = new XYChart.Series<>();
        data.getData().add(new XYChart.Data<String, Number>("10", matrix[0][1]));
        data.getData().add(new XYChart.Data<String, Number>("100", matrix[1][1]));
        data.getData().add(new XYChart.Data<String, Number>("1000", matrix[2][1]));
        data.getData().add(new XYChart.Data<String, Number>("10000", matrix[3][1]));
        data.getData().add(new XYChart.Data<String, Number>("50000", matrix[4][1]));
        data.getData().add(new XYChart.Data<String, Number>("100000", matrix[5][1]));
        data.getData().add(new XYChart.Data<String, Number>("500000", matrix[6][1]));

        lineChart.getData().add(data);
        root.getChildren().add(lineChart);

        stage.setTitle("Sorting");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {

        launch();
    }

}
