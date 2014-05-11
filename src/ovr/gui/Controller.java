package ovr.gui;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import ovr.Coordinate;

public class Controller {
    public TextField xField;
    public TextField yField;
    public TextField zField;
    public TextField xStep;
    public TextField yStep;
    public TextField zStep;
    public TextField alphaField;
    public TextField bettaField;
    public TextField zettaField;
    public TextField alphaStep;
    public TextField bettaStep;
    public TextField zettaStep;
    public Label result;
    private Coordinate coordinate;

    public void initialize() {
        coordinate = new Coordinate();
        coordinate.setX(Double.valueOf(xField.getText()));
        coordinate.setY(Double.valueOf(yField.getText()));
        coordinate.setZ(Double.valueOf(zField.getText()));
        refreshResult();
    }

    public void onXLeft(ActionEvent actionEvent) {
        double newX =  Double.valueOf(xField.getText()) - Double.valueOf(xStep.getText());
        coordinate.setX(newX);
        xField.setText(String.valueOf(newX));
        refreshResult();
    }

    public void onXRight(ActionEvent actionEvent) {
        double newX =  Double.valueOf(xField.getText()) + Double.valueOf(xStep.getText());
        coordinate.setX(newX);
        xField.setText(String.valueOf(newX));
        refreshResult();
    }

    public void onYLeft(ActionEvent actionEvent) {
        double newY =  Double.valueOf(yField.getText()) - Double.valueOf(yStep.getText());
        coordinate.setY(newY);
        yField.setText(String.valueOf(newY));
        refreshResult();
    }

    public void onYRight(ActionEvent actionEvent) {
        double newY =  Double.valueOf(yField.getText()) + Double.valueOf(yStep.getText());
        coordinate.setY(newY);
        yField.setText(String.valueOf(newY));
        refreshResult();
    }

    public void onZLeft(ActionEvent actionEvent) {
        double newZ =  Double.valueOf(zField.getText()) - Double.valueOf(zStep.getText());
        coordinate.setZ(newZ);
        zField.setText(String.valueOf(newZ));
        refreshResult();
    }

    public void onZRight(ActionEvent actionEvent) {
        double newZ =  Double.valueOf(zField.getText()) + Double.valueOf(zStep.getText());
        coordinate.setZ(newZ);
        zField.setText(String.valueOf(newZ));
        refreshResult();
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    public void onAlphaLeft(ActionEvent actionEvent) {
        double newAlpha =  Double.valueOf(alphaField.getText()) - Double.valueOf(alphaStep.getText());
        coordinate.setAlpha(newAlpha);
        alphaField.setText(String.valueOf(newAlpha));
        refreshResult();
    }

    public void onAlphaRight(ActionEvent actionEvent) {
        double newAlpha =  Double.valueOf(alphaField.getText()) + Double.valueOf(alphaStep.getText());
        coordinate.setAlpha(newAlpha);
        alphaField.setText(String.valueOf(newAlpha));
        refreshResult();
    }

    public void onBettaLeft(ActionEvent actionEvent) {
        double newBetta =  Double.valueOf(bettaField.getText()) - Double.valueOf(bettaStep.getText());
        coordinate.setBetta(newBetta);
        bettaField.setText(String.valueOf(newBetta));
        refreshResult();
    }

    public void onBettaRight(ActionEvent actionEvent) {
        double newBetta =  Double.valueOf(bettaField.getText()) + Double.valueOf(bettaStep.getText());
        coordinate.setBetta(newBetta);
        bettaField.setText(String.valueOf(newBetta));
        refreshResult();
    }

    public void onZettaLeft(ActionEvent actionEvent) {
        double newZetta =  Double.valueOf(zettaField.getText()) - Double.valueOf(zettaStep.getText());
        coordinate.setZetta(newZetta);
        zettaField.setText(String.valueOf(newZetta));
        refreshResult();
    }

    public void onZettaRight(ActionEvent actionEvent) {
        double newZetta =  Double.valueOf(zettaField.getText()) + Double.valueOf(zettaStep.getText());
        coordinate.setZetta(newZetta);
        zettaField.setText(String.valueOf(newZetta));
        refreshResult();
    }

    public void onUndefinedClick(ActionEvent actionEvent) {
         coordinate.setUndefined();
        refreshResult();
    }

    private void refreshResult(){
        result.setText(coordinate.toString());
    }
}
