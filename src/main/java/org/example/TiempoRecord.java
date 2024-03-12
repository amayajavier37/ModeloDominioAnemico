package org.example;

import java.text.SimpleDateFormat;
import java.util.Date;

public record TiempoRecord(Date fecha) {
    public TiempoRecord {
        if (fecha == null) {
            throw new IllegalArgumentException("La fecha no puede ser nula");
        }
    }

    public void imprimirFechaL() {
        SimpleDateFormat formato = new SimpleDateFormat("EEEE d 'de' MMMM 'de' yyyy");
        String format = formato.format(fecha);
        System.out.println(format);
    }

    public void imprimirFechaC() {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String format = formato.format(fecha);
        System.out.println(format);
    }
}
