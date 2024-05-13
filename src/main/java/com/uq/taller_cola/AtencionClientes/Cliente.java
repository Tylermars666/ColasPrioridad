package com.uq.taller_cola.AtencionClientes;

public class Cliente {
    private String nombre;
    private String id;
    private Prioridad prioridad;

    public Cliente(String nombre, String id, Prioridad prioridad) {
        this.nombre = nombre;
        this.id = id;
        this.prioridad = prioridad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }

    public Prioridad getPrioridad() {
        return prioridad;
    }

    @Override
    public String toString() {
        return String.format("Cliente [nombre=%s, id=%s, prioridad=%s]", nombre, id, prioridad);
    }
}
