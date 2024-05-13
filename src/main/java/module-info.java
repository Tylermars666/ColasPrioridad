module com.example.colas_prioridad {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.uq.taller_cola to javafx.fxml;
    opens com.uq.taller_cola.AtencionClientes to javafx.fxml;
    opens com.uq.taller_cola.Procesos to javafx.fxml;


    exports com.uq.taller_cola;
    exports com.uq.taller_cola.AtencionClientes;
}