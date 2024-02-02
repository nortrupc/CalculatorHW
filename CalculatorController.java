package week3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

public class CalculatorController {
    @FXML
    Button one;
    @FXML
    Button two;
    @FXML
    Button three;
    @FXML
    Button four;
    @FXML
    Button five;
    @FXML
    Button six;
    @FXML
    Button seven;
    @FXML
    Button eight;
    @FXML
    Button zero;
    @FXML
    Button divide;
    @FXML
    Button plus;
    @FXML
    Button minus;
    @FXML
    Button multiply;
    @FXML
    Button equals;
    @FXML
    Button clear;
    @FXML
    HBox box;
    @FXML
    Label numOne;
    @FXML
    Label method;
    @FXML
    Label numTwo;
    @FXML
    Label output;
    private String input;
    private String num1 = "";
    private String num2 = "";

    public void plusControl(ActionEvent actionEvent) {
        input = "p";
        method.setText("+");
    }

    public void minusControl(ActionEvent actionEvent) {
        input = "m";
        method.setText("-");
    }

    public void dividControl(ActionEvent actionEvent) {
        input = "d";
        method.setText("/");
    }

    public void multiplyControl(ActionEvent actionEvent) {
        input = "t";
        method.setText("*");
    }

    public void equalsControl(ActionEvent actionEvent) {
        double numone = Double.parseDouble(num1);
        double numtwo = Double.parseDouble(num2);
        switch (input) {
            case "p" ->{
                double sum = numone + numtwo;
                output.setText(String.valueOf(sum));
            }
            case "m" -> {
                double sum = numone - numtwo;
                output.setText(String.valueOf(sum));
            }
            case "d" -> {
                double sum = numone / numtwo;
                output.setText(String.valueOf(sum));
            }
            default -> {
                double sum = numone * numtwo;
                output.setText(String.valueOf(sum));
            }

        }
    }

    public void oneControl(ActionEvent actionEvent) {
        if (input == null){
            num1 += "1";
            numOne.setText("");
            numOne.setText(num1);
        } else {
            num2 += "1";
            numTwo.setText("");
            numTwo.setText(num2);
        }

    }

    public void twoControl(ActionEvent actionEvent) {
        if (input == null){
            num1 += "2";
            numOne.setText("");
            numOne.setText(num1);
        } else {
            num2 += "2";
            numTwo.setText("");
            numTwo.setText(num2);
        }
    }

    public void threecontrol(ActionEvent actionEvent) {
        if (input == null){
            num1 += "3";
            numOne.setText("");
            numOne.setText(num1);
        } else {
            num2 += "3";
            numTwo.setText("");
            numTwo.setText(num2);
        }
    }

    public void fourControl(ActionEvent actionEvent) {
        if (input == null){
            num1 += "4";
            numOne.setText("");
            numOne.setText(num1);
        } else {
            num2 += "4";
            numTwo.setText("");
            numTwo.setText(num2);
        }
    }

    public void fiveControl(ActionEvent actionEvent) {
        if (input == null){
            num1 += "5";
            numOne.setText("");
            numOne.setText(num1);
        } else {
            num2 += "5";
            numTwo.setText("");
            numTwo.setText(num2);
        }
    }

    public void sixControl(ActionEvent actionEvent) {
        if (input == null){
            num1 += "6";
            numOne.setText("");
            numOne.setText(num1);
        } else {
            num2 += "6";
            numTwo.setText("");
            numTwo.setText(num2);
        }
    }

    public void sevenControl(ActionEvent actionEvent) {
        if (input == null){
            num1 += "7";
            numOne.setText("");
            numOne.setText(num1);
        } else {
            num2 += "7";
            numTwo.setText("");
            numTwo.setText(num2);
        }
    }

    public void eightControl(ActionEvent actionEvent) {
        if (input == null){
            num1 += "8";
            numOne.setText("");
            numOne.setText(num1);
        } else {
            num2 += "8";
            numTwo.setText("");
            numTwo.setText(num2);
        }
    }

    public void nineCntrol(ActionEvent actionEvent) {
        if (input == null){
            num1 += "9";
            numOne.setText("");
            numOne.setText(num1);
        } else {
            num2 += "9";
            numTwo.setText("");
            numTwo.setText(num2);
        }
    }

    public void zeroControl(ActionEvent actionEvent) {
        if (input == null){
            num1 += "0";
            numOne.setText("");
            numOne.setText(num1);
        } else {
            num2 += "0";
            numTwo.setText("");
            numTwo.setText(num2);
        }
    }

    public void clearControl(ActionEvent actionEvent) {
        method.setText("");
        output.setText("");
        numOne.setText("");
        numTwo.setText("");
        num1 = "";
        num2 = "";
        input = null;
    }
}
