/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebas.calculadorav2;

import java.util.ArrayList;

/**
 *
 * @author leotr
 */
public class Historial {
    private ArrayList<String> operaciones = new ArrayList<>();

    public void agregarOperacion(String operacion) {
        operaciones.add(operacion);
    }

    public String obtenerOperacion(int noOperacion) {
        if (operaciones.isEmpty()) {
            return "Sin operaciones registradas";
        }
        if (noOperacion < 0) {
            noOperacion = 0;
        }
        if (noOperacion >= operaciones.size()) {
            noOperacion = operaciones.size() - 1;
        }
        return operaciones.get(noOperacion);
    }
}
