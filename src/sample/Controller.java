package src.sample;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable{

    @FXML
    private Pane banklogo;

    Image visa = new javafx.scene.image.Image("visa.png");
    Image mastercard = new javafx.scene.image.Image("MasterCard.png");
    Image amex = new javafx.scene.image.Image("amex.jpg");
    Image jcb = new javafx.scene.image.Image("jcb.png");
    Image notvalid = new Image("null.jpg");
    ImageView logo = new ImageView();

    public void typinginput(ActionEvent evt){
        banklogo.getChildren().clear();
        TextField cn = (TextField) evt.getSource();
        String cninput = cn.getText();
        String digit1 = cninput.substring(0,1);
        String digit2 = cninput.substring(1,2);


        // visa logo
        if(digit1.equals("4")){
            logo.setImage(visa);
            logo.setFitHeight(28);
            logo.setFitWidth(32);

        }
        //amex logo
        else if(digit1.equals("3") && digit2.equals("4") ||digit1.equals("3") && digit2.equals("7")){
            logo.setImage(amex);
            logo.setFitHeight(28);
            logo.setFitWidth(32);
        }
        //mastercard logo
        else if(digit1.equals("5")){
            logo.setImage(mastercard);
            logo.setFitHeight(28);
            logo.setFitWidth(32);
        }
        //jcb logo
        else if(digit1.equals("3") && digit2.equals("5")){
            logo.setImage(jcb);
            logo.setFitHeight(28);
            logo.setFitWidth(32);
        }
        //error logo
        else{
            logo.setImage(notvalid);
            logo.setFitHeight(28);
            logo.setFitWidth(32);
        }
        banklogo.getChildren().add(logo);
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
