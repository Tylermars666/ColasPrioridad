package com.uq.taller_cola.AtencionClientes;

import java.util.Comparator;

public class ClienteComparator implements Comparator<Cliente> {
    @Override
    public int compare(Cliente c1, Cliente c2) {
        return c1.getPrioridad().compareTo(c2.getPrioridad());
    }
}
