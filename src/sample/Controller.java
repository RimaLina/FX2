package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Random;

public class Controller {

    @FXML
    private TextField input;
    @FXML
    private Label text;

    private int count;


    public void guessNumber(ActionEvent event){


        Random rand = new Random();
        int randomNumber = rand.nextInt(10)+1;
        int numb = 0;

        String defaultValue = input.getText();
        try{
            numb = Integer.valueOf(defaultValue);
            if (numb==randomNumber){
                text.setText("Atspejai"+ " "+ randomNumber);

            }
            else{
                text.setText("Neatspejai" + " " + randomNumber);
                input.setText("");

            }

        }catch (NumberFormatException e){
            count++;
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Ivesk skaiciu");
            alert.show();

            if (count > 5){
                Alert alert1 = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("Durnas?");
                alert.show();
            }
        }

    }

    public void exist(ActionEvent event){
       System.exit(0);
    }

}
