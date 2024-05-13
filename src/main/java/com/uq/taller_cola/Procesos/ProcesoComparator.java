/*package com.uq.taller_cola.Procesos;

import java.util.Comparator;

public class ProcesoComparator implements Comparator<Proceso> {
    @Override
    public int compare(Proceso p1, Proceso p2) {
        // Obtener la prioridad de los detalles de los procesos
        int prio1 = obtenerPrioridad(p1.getDetalle());
        int prio2 = obtenerPrioridad(p2.getDetalle());

        // Comparar prioridades
        if (prio1 != prio2) {
            return Integer.compare(prio1, prio2);
        }

        // Si los detalles tienen la misma prioridad, comparar por tipo de proceso
        return p1.getTipo().compareTo(p2.getTipo());
    }

    // Método para asignar prioridades a los detalles de proceso
    private int obtenerPrioridad(DetalleProceso detalle) {
        switch (detalle) {
            // Primer nivel de prioridad: Requerimientos especiales
            case FISCALIA:
            case PROCURADURIA:
            case OTROS:
                return 1;
            // Segundo nivel de prioridad: Peticiones
            case AUMENTO_PLAN:
            case CANCELAR_PLAN:
                return 2;
            // Tercer nivel de prioridad: Quejas
            case LEY_1755:
            case DERECHO_DE_PETICION:
                return 3;
            default:
                return 0; // Para cualquier otro detalle no previsto
        }
    }
}
*/