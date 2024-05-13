package com.uq.taller_cola.Procesos;

import com.uq.taller_cola.AtencionClientes.Prioridad;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class ClienteController implements Initializable {

    @FXML
     private ComboBox<Prioridad> cmbPrioridad;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtTurno;

    @FXML
    private TextField txtid;

    @FXML
    void id(ActionEvent event) {

    }

    @FXML
    void nombre(ActionEvent event) {

    }

    private ObservableList <Prioridad> observableCliente;

    Prioridad prioridadCliente;

    @FXML
    void prioridadCliente (ActionEvent event) {

     //prioridadCliente = cmbPrioridad.getSelectionModel().getSelectedItem();

    }

    @FXML
    void salir(ActionEvent event){

    }

    public void initialize(URL url, ResourceBundle resourceBundle) {

        observableCliente = FXCollections.observableArrayList(Prioridad.EMBARAZADA,Prioridad.TERCERAEDAD,Prioridad.DISCAPACITADO,Prioridad.VIP,Prioridad.SIN_INCONVENIENTES);
        cmbPrioridad.setItems(observableCliente);

    }

}
