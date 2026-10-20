package com.mycompany.denominacionesbilletes;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class DenominacionesController implements Initializable {

    @FXML
    private TextField txtdinero;

    @FXML
    private Button btnLimpiar;

    @FXML
    private Button btnDesglosar;

    @FXML
    private Label Billete500;

    @FXML
    private Label Billete200;

    @FXML
    private Label Billete100;

    @FXML
    private Label Billete50;

    @FXML
    private Label Billete20;

    @FXML
    private Label Moneda10;

    @FXML
    private Label Moneda5;

    @FXML
    private Label Moneda2;

    @FXML
    private Label Moneda1;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    @FXML
    private void Desglosar(ActionEvent event) {

        try {

            int dinero = Integer.parseInt(txtdinero.getText());

            int b500 = dinero / 500;
            dinero %= 500;

            int b200 = dinero / 200;
            dinero %= 200;

            int b100 = dinero / 100;
            dinero %= 100;

            int b50 = dinero / 50;
            dinero %= 50;

            int b20 = dinero / 20;
            dinero %= 20;

            int m10 = dinero / 10;
            dinero %= 10;

            int m5 = dinero / 5;
            dinero %= 5;

            int m2 = dinero / 2;
            dinero %= 2;

            int m1 = dinero;

            Billete500.setText(String.valueOf(b500));
            Billete200.setText(String.valueOf(b200));
            Billete100.setText(String.valueOf(b100));
            Billete50.setText(String.valueOf(b50));
            Billete20.setText(String.valueOf(b20));

            Moneda10.setText(String.valueOf(m10));
            Moneda5.setText(String.valueOf(m5));
            Moneda2.setText(String.valueOf(m2));
            Moneda1.setText(String.valueOf(m1));

        } catch (NumberFormatException e) {

Billete500.setText("0");
Billete200.setText("0");
Billete100.setText("0");
Billete50.setText("0");
Billete20.setText("0");

Moneda10.setText("0");
Moneda5.setText("0");
Moneda2.setText("0");
Moneda1.setText("0");
        }
    }

    @FXML
    private void Limpiar(ActionEvent event) {

        txtdinero.clear();

        Billete500.setText("0");
        Billete200.setText("0");
        Billete100.setText("0");
        Billete50.setText("0");
        Billete20.setText("0");

        Moneda10.setText("0");
        Moneda5.setText("0");
        Moneda2.setText("0");
        Moneda1.setText("0");

        txtdinero.requestFocus();
    }
}