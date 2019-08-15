package calculator;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Calculator extends Application {
    @Override
    public void start(Stage primaryStage) {
        //Create GUI Elements
        GridPane root = new GridPane();
        root.setPrefWidth(300);
        root.setPadding(new Insets(4));
        root.setHgap(5);
        root.setVgap(5);
        TextField inputBox = new TextField();
        inputBox.setAlignment(Pos.CENTER_RIGHT);
        Label outputBox = new Label("0.0");
        root.add(inputBox, 0, 0, 4, 1);
        root.add(outputBox, 0, 1, 4, 1);
        Button button7 = new Button("7");
        button7.setPrefWidth(GridPane.REMAINING);
        root.add(button7, 0, 2, 1, 1);
        Button button8 = new Button("8");
        button8.setPrefWidth(GridPane.REMAINING);
        root.add(button8, 1, 2, 1, 1);
        Button button9 = new Button("9");
        button9.setPrefWidth(GridPane.REMAINING);
        root.add(button9, 2, 2, 1, 1);
        Button buttonPlus = new Button("+");
        buttonPlus.setPrefWidth(GridPane.REMAINING);
        root.add(buttonPlus, 3, 2, 1, 1);
        
        Button button4 = new Button("4");
        button4.setPrefWidth(GridPane.REMAINING);
        root.add(button4, 0, 3, 1, 1);
        Button button5 = new Button("5");
        button5.setPrefWidth(GridPane.REMAINING);
        root.add(button5, 1, 3, 1, 1);
        Button button6 = new Button("6");
        button6.setPrefWidth(GridPane.REMAINING);
        root.add(button6, 2, 3, 1, 1);
        Button buttonTimes = new Button("x");
        buttonTimes.setPrefWidth(GridPane.REMAINING);
        root.add(buttonTimes, 3, 3, 1, 1);
        
        Button button1 = new Button("1");
        button1.setPrefWidth(GridPane.REMAINING);
        root.add(button1, 0, 4, 1, 1);
        Button button2 = new Button("2");
        button2.setPrefWidth(GridPane.REMAINING);
        root.add(button2, 1, 4, 1, 1);
        Button button3 = new Button("3");
        button3.setPrefWidth(GridPane.REMAINING);
        root.add(button3, 2, 4, 1, 1);
        Button buttonMinus = new Button("-");
        buttonMinus.setPrefWidth(GridPane.REMAINING);
        root.add(buttonMinus, 3, 4, 1, 1);
        
        Button button0 = new Button("0");
        button0.setPrefWidth(GridPane.REMAINING);
        root.add(button0, 0, 5, 1, 1);
        Button buttonDot = new Button(".");
        buttonDot.setPrefWidth(GridPane.REMAINING);
        root.add(buttonDot, 1, 5, 1, 1);
        Button buttonEqual = new Button("6");
        buttonEqual.setPrefWidth(GridPane.REMAINING);
        root.add(buttonEqual, 2, 5, 1, 1);
        Button buttonDivision = new Button("/");
        buttonDivision.setPrefWidth(GridPane.REMAINING);
        root.add(buttonDivision, 3, 5, 1, 1);
        
        //Events
        button7.setOnAction(e -> {
            inputBox.setText(inputBox.getText() + "7");
        });
        
        button8.setOnAction(e -> {
            inputBox.setText(inputBox.getText() + "8");
        });
        
        button9.setOnAction(e -> {
            inputBox.setText(inputBox.getText() + "9");
        });
        
        button4.setOnAction(e -> {
            inputBox.setText(inputBox.getText() + "4");
        });
        
        button5.setOnAction(e -> {
            inputBox.setText(inputBox.getText() + "5");
        });
        
        button6.setOnAction(e -> {
            inputBox.setText(inputBox.getText() + "6");
        });
        
        button1.setOnMouseClicked(e -> {
            inputBox.setText(inputBox.getText() + "1");
        });
        
        button2.setOnAction(e -> {
            inputBox.setText(inputBox.getText() + "2");
        });
        
        button3.setOnAction(e -> {
            inputBox.setText(inputBox.getText() + "3");
        });
        
        button0.setOnAction(e -> {
            if (!inputBox.getText().equals("")) {
                inputBox.setText(inputBox.getText() + "0");
            }
        });
        
        buttonDot.setOnAction(e -> {
            if (!inputBox.getText().equals("")) {
                if (!inputBox.getText().matches("\\d+\\.{1}\\d*"))
                    inputBox.setText(inputBox.getText() + ".");
            }
        });
        
        
        //Operators
        buttonPlus.setOnAction(e -> {
            if (!inputBox.getText().equals("")) {
                double currentValue = Double.parseDouble(inputBox.getText());
                double currentOutputValue = Double.parseDouble(outputBox.getText());
                outputBox.setText(Double.toString(currentValue + currentOutputValue));
                inputBox.clear();
            }
        });
        
        buttonTimes.setOnAction(e -> {
            if (!inputBox.getText().equals("")) {
                double currentValue = Double.parseDouble(inputBox.getText());
                double currentOutputValue = Double.parseDouble(outputBox.getText());
                outputBox.setText(Double.toString(currentValue * currentOutputValue));
                inputBox.clear();
            }
        });
        
        buttonMinus.setOnAction(e -> {
            if (!inputBox.getText().equals("")) {
                double currentValue = Double.parseDouble(inputBox.getText());
                double currentOutputValue = Double.parseDouble(outputBox.getText());
                outputBox.setText(Double.toString(currentValue - currentOutputValue));
                inputBox.clear();
            }
        });
        
        buttonDivision.setOnAction(e -> {
            if (!inputBox.getText().equals("")) {
                double currentValue = Double.parseDouble(inputBox.getText());
                double currentOutputValue = Double.parseDouble(outputBox.getText());
                currentOutputValue = currentOutputValue == 0 ? 1 : currentOutputValue;
                outputBox.setText(Double.toString(currentValue / currentOutputValue));
                inputBox.clear();
            }
        });
                
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Calculator");
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
