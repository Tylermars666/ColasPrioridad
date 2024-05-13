package com.uq.taller_cola.Procesos;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class TransaccionController implements Initializable {

    @FXML
    private Label LblCliente;

    @FXML
    private Label LblDetalle;

    @FXML
    private Label LblTipo;

    @FXML
    private ComboBox<TipoTransaccion> cmbTipo;

    @FXML
    private TextField txtCliente;

    @FXML
    private TextField txtDetalle;

    private ObservableList<TipoTransaccion> observableTransaccion;

    @FXML
    void Cliente(ActionEvent event) {

    }

    @FXML
    void Detalle(ActionEvent event) {

    }

    @FXML
    void tipoTransaccion(ActionEvent event) {



    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        observableTransaccion = FXCollections.observableArrayList(TipoTransaccion.APERTURA_CUENTA,TipoTransaccion.CONSULTA_SALDO,TipoTransaccion.SOLICITUD_CREDITO);
        cmbTipo.setItems(observableTransaccion);

    }
}
