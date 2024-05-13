/*package com.uq.taller_cola.AtencionClientes;

import com.uq.taller_cola.Procesos.ProcesoController;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.PriorityQueue;

public class PersonaController {
    @FXML
    private TextField nombreField;
    @FXML
    private Button addButton;
    @FXML
    private ListView<Persona> personasListView;
    @FXML
    private ChoiceBox<Prioridad> prioridadChoiceBox;

    private PriorityQueue<Persona> personas = new PriorityQueue<>(new PersonaComparator());

    @FXML
    public void initialize() {
        prioridadChoiceBox.getItems().addAll(Prioridad.values());
        prioridadChoiceBox.setValue(Prioridad.SIN_INCONVENIENTES);

        addButton.setOnAction(event -> {
            String nombre = nombreField.getText().trim();
            if (nombre.isEmpty()) {
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Advertencia");
                alert.setHeaderText(null);
                alert.setContentText("Por favor, ingrese un nombre.");
                alert.showAndWait();
                return;
            }

            Persona nuevaPersona = new Persona(nombre, prioridadChoiceBox.getValue());
            personas.add(nuevaPersona);
            actualizarListView();
            nombreField.clear();
        });

        personasListView.setCellFactory(listView -> new ListCell<Persona>() {
            @Override
            protected void updateItem(Persona item, boolean empty) {
                super.updateItem(item, empty);
                if (empty || item == null) {
                    setText(null);
                } else {
                    setText(item.getNombre() + " (" + item.getPrioridad() + ")");
                }
            }
        });
    }

    private void actualizarListView() {
        personasListView.getItems().clear();
        PriorityQueue<Persona> copiaCola = new PriorityQueue<>(personas);
        while (!copiaCola.isEmpty()) {
            personasListView.getItems().add(copiaCola.poll());
        }
    }

    @FXML
    private void Accion() {
        Persona personaSeleccionada = personasListView.getSelectionModel().getSelectedItem();
        if (personaSeleccionada != null) {
            openNuevaVentana(personaSeleccionada);
        } else {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Advertencia");
            alert.setHeaderText(null);
            alert.setContentText("Por favor, seleccione una persona.");
            alert.showAndWait();
        }
    }

    private void openNuevaVentana(Persona persona) {
        try {
            // Cargar el archivo FXML de la nueva ventana
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/uq/taller_cola/ProcesosView.fxml"));
            Parent root = loader.load();

            // Obtener el controlador de la nueva ventana
            ProcesoController controller = loader.getController();

            // Establecer la información de la persona en el controlador de la nueva ventana
            controller.setPersonaActiva(persona);

            // Crear un nuevo Stage y establecer su escena
            Stage stage = new Stage();
            stage.setScene(new Scene(root));

            // Mostrar la nueva ventana
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
*/