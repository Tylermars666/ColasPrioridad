
package com.uq.taller_cola.AtencionClientes;
import com.uq.taller_cola.Procesos.*;

public class Transaccion {
    private TipoTransaccion tipo;
    private String detalle;
    private Cliente cliente;

    public Transaccion(TipoTransaccion tipo, String detalle, Cliente cliente) {
        this.tipo = tipo;
        this.detalle = detalle;
        this.cliente = cliente;
    }

    public TipoTransaccion getTipo() {
        return tipo;
    }

    public String getDetalle() {
        return detalle;
    }

    public Cliente getCliente() {
        return cliente;
    }

    @Override
    public String toString() {
        return String.format("Transaccion [tipo=%s, detalle=%s, cliente=%s]", tipo, detalle, cliente);
    }
}
