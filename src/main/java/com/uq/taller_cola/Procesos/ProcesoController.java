/*package com.uq.taller_cola.Procesos;

import com.uq.taller_cola.AtencionClientes.Persona;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.*;
import java.util.PriorityQueue;

public class ProcesoController {
    @FXML
    private ChoiceBox<TipoProceso> tipoChoiceBox;
    @FXML
    private ChoiceBox<DetalleProceso> detalleChoiceBox;
    @FXML
    private Button addButton;
    @FXML
    private ListView<String> procesosListView;
    @FXML
    private Label cliente;
    @FXML
    private Label condicion;

    private PriorityQueue<Proceso> colaProcesos = new PriorityQueue<>(new ProcesoComparator());
    private Persona personaActiva;
    @FXML
    public void initialize() {
        tipoChoiceBox.getItems().addAll(TipoProceso.values());
        detalleChoiceBox.getItems().addAll(DetalleProceso.values());

        tipoChoiceBox.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            updateDetallesBasedOnTipo(newValue);
        });

        addButton.setOnAction(event -> {
            TipoProceso tipo = tipoChoiceBox.getValue();
            DetalleProceso detalle = detalleChoiceBox.getValue();
            if (tipo != null && detalle != null && personaActiva != null) {
                Proceso nuevoProceso = new Proceso(tipo, detalle);
                colaProcesos.add(nuevoProceso);
                procesosListView.getItems().add(personaActiva.getNombre() + ": " + nuevoProceso);
                actualizarListView();
            } else {
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Advertencia");
                alert.setHeaderText(null);
                alert.setContentText("Por favor, seleccione tanto el tipo como el detalle y asegúrese de que una persona está seleccionada.");
                alert.showAndWait();
            }
        });
    }

    private void actualizarListView() {
        procesosListView.getItems().clear();
        PriorityQueue<Proceso> copiaCola = new PriorityQueue<>(colaProcesos);
        while (!copiaCola.isEmpty()) {
            Proceso proceso = copiaCola.poll();
            procesosListView.getItems().add(personaActiva.getNombre() + ": " + proceso);
        }
    }

    private void updateDetallesBasedOnTipo(TipoProceso tipo) {
        detalleChoiceBox.getItems().clear();
        switch (tipo) {
            case QUEJA:
                detalleChoiceBox.getItems().addAll(DetalleProceso.LEY_1755, DetalleProceso.DERECHO_DE_PETICION);
                break;
            case PETICION:
                detalleChoiceBox.getItems().addAll(DetalleProceso.AUMENTO_PLAN, DetalleProceso.CANCELAR_PLAN);
                break;
            case REQUERIMIENTO_ESPECIAL:
                detalleChoiceBox.getItems().addAll(DetalleProceso.FISCALIA, DetalleProceso.PROCURADURIA, DetalleProceso.OTROS);
                break;
        }
    }

    public void setPersonaActiva(Persona personaActiva) {
        this.personaActiva = personaActiva;
        cliente.setText(personaActiva.getNombre());
        condicion.setText(personaActiva.getPrioridad().toString());
    }

}
*/