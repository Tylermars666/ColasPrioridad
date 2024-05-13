package com.uq.taller_cola.AtencionClientes;
import java.util.Comparator;

public class TransaccionComparator implements Comparator<Transaccion> {
    @Override
    public int compare(Transaccion t1, Transaccion t2) {
        int tipoComp = t1.getTipo().compareTo(t2.getTipo());
        if (tipoComp != 0) return tipoComp;
        return t1.getCliente().getPrioridad().compareTo(t2.getCliente().getPrioridad());
    }
}
