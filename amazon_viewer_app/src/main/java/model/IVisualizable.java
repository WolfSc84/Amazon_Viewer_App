package model;

import java.util.Date;

public interface IVisualizable {

    /**
     * Este metodo captura el tiempo exacto de inicio de visualizacion.
     *
     * @param var1 Es un objeto de tipo {@code Date} con el tiempo de inicio exacto.
     * @return Devuelve la fecha y hora capturada.
     */
    Date startToSee(Date var1);

    /**
     * Este metodo captura el tiempo exacto de inicio y final de la visualizacion.
     *
     * @param var1 Es un objeto de tipo {@code Date} con el tiempo de inicio exacto.
     * @return Devuelve la fecha y hora capturada.
     */
    void stopToSee(Date var1, Date var2);
}
