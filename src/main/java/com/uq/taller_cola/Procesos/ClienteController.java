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

     prioridadCliente = cmbPrioridad.getSelectionModel().getSelectedItem();

     switch (prioridadCliente){

         case EMBARAZADA : this.txtTurno.setText("1");
         break;

         case VIP : this.txtTurno.setText("2");
         break;

         case DISCAPACITADO : this.txtTurno.setText("3");
         break;

         case TERCERAEDAD : this.txtTurno.setText("4");
         break;

         case SIN_INCONVENIENTES : this.txtTurno.setText("5");
         break;

     }


    }

    @FXML
    void salir(ActionEvent event){

    }

    public void initialize(URL url, ResourceBundle resourceBundle) {

        observableCliente = FXCollections.observableArrayList(Prioridad.EMBARAZADA,Prioridad.TERCERAEDAD,Prioridad.DISCAPACITADO,Prioridad.VIP,Prioridad.SIN_INCONVENIENTES);
        cmbPrioridad.setItems(observableCliente);

    }

}
