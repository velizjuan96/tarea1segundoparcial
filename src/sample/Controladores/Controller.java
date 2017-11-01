package sample.Controladores;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import sample.Modelos.Personas;

import java.awt.*;

public class Controller {

    public TextField buscar;
    public Label nombre;
    public Label apellido;
    public Label edad;


    public void enviar(ActionEvent actionEvent) {

        Personas.Primernombre(buscar.getText());

    }
}
