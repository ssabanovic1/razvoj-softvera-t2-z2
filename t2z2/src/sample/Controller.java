package sample;

import javafx.event.ActionEvent;

import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Controller {
    public TextField podatak;
    public TextArea tekst;

    public int sumaCifara(int broj) {
        int suma=0;
        while(broj>0){
            suma = suma + broj%10;
            broj = broj/10;
        }
        return suma;
    }

    public void Unesi(ActionEvent actionEvent){
        String vrijednost = podatak.getText();
        int broj = Integer.parseInt(vrijednost);
        int brojac=1;
        String ipodatak = new String();
        for (int i=1; i<=broj; i++) {
            if (brojac==10) {
                ipodatak = ipodatak + "\n";
                brojac=0;
            }
            if (i%sumaCifara(i)==0) {
                ipodatak = ipodatak + i + ", ";
                brojac++;
            }
        }
        tekst.setText(ipodatak);
    }
}
