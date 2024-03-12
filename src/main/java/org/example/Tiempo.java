package org.example;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Tiempo {
    private Date fecha;

    public Tiempo() {
        this.fecha = new Date();
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
