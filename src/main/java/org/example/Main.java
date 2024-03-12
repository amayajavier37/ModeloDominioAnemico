package org.example;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        /*Clase no Anemica
         * En este caso la clase unicamente se inicializa y toda la logica del objeto esta en la clase
         * lo resulta mas facil enteder el funcionamiento de la clase, y su logica de negocio esta dentro de la clase
         * asi que si se hacen cambio en la clase no deberia cambiar nada en su implementacion*/
        Tiempo hoy = new Tiempo();
        hoy.imprimirFechaL();
        hoy.imprimirFechaC();

        /* Clase Anemica
         * En el caso de la clase anemica la clase no tiene su logica dentro de la clase solo se puede cargar
         * datos con getters y setters lo que no permite que se hagan validaciones(o se realicen de forma externa)
         * y hay mucho codigo que va en servicio extreno a la clase, lo que dificulta su comprencion y mantenimiento*/
        TiempoAnemico hoyAnemico = new TiempoAnemico();
        hoyAnemico.setFecha(new Date());
        Date fecha = hoyAnemico.getFecha();
        SimpleDateFormat formatoLargo = new SimpleDateFormat("EEEE d 'de' MMMM 'de' yyyy");
        String formatLargo = formatoLargo.format(fecha);
        System.out.println(formatLargo);
        SimpleDateFormat formatoCorto = new SimpleDateFormat("dd/MM/yyyy");
        String formatCorto = formatoCorto.format(fecha);
        System.out.println(formatCorto);

        /*Record*/
        TiempoRecord tiempoRecord = new TiempoRecord(new Date());
        tiempoRecord.imprimirFechaL();
        tiempoRecord.imprimirFechaC();
    }
}