package hust.soict.globalict.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class NewPaintController {

    @FXML
    private Pane drawingAreaPane;

    @FXML
    private RadioButton eraserbutton;

    @FXML
    private RadioButton penbutton;

    @FXML
    private ToggleGroup toggle;

    private boolean pen = true;

    @FXML
    void chooseTools(ActionEvent event) {
        if (penbutton.isSelected())
            pen = true;
        else if(eraserbutton.isSelected())
            pen = false;
    }

    @FXML
    void clearButtonPressed(ActionEvent event) {
        drawingAreaPane.getChildren().clear();
    }

    @FXML
    void drawingAreaMouseDragged(MouseEvent event) {
        if (pen == true) {
            Circle newCircle = new Circle(event.getX(), event.getY(), 4, Color.BLACK);
            drawingAreaPane.getChildren().add(newCircle);
        } else if(pen == false){
            Circle newCircle = new Circle(event.getX(), event.getY(), 4, Color.WHITE);
            drawingAreaPane.getChildren().add(newCircle);
        }
    }
}
