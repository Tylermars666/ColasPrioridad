package com.uq.taller_cola.Procesos;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class TransaccionController implements Initializable {

    @FXML
    private ComboBox<TipoTransaccion> cmbTipo;

    @FXML
    private TextField txtCliente;

    @FXML
    private TextField txtNameCliente;

    @FXML
    private TextField txtID;

    private ObservableList<TipoTransaccion> observableTransaccion;

    TipoTransaccion tipo;


    @FXML
    void tipoTransaccion(ActionEvent event) {

        tipo = cmbTipo.getSelectionModel().getSelectedItem();
        
    }

    @FXML
    void comfirmarDatos(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/uq/taller_cola/Cliente.fxml"));

        Scene scene = new Scene(loader.load());
        Stage stage = new Stage();
        stage.setTitle("Cliente");
        stage.setScene(scene);

        ClienteController controller = loader.getController();
        stage.show();
        controller.listener(txtNameCliente.getText(), txtID.getText());

    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        observableTransaccion = FXCollections.observableArrayList(TipoTransaccion.APERTURA_CUENTA,TipoTransaccion.CONSULTA_SALDO,TipoTransaccion.SOLICITUD_CREDITO);
        cmbTipo.setItems(observableTransaccion);

    }
}
