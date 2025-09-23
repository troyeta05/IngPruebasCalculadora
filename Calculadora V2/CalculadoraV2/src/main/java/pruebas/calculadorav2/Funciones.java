/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebas.calculadorav2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author leotr
 */

public class Funciones {
    Historial his = new Historial();
    
    private int noOperacion = 0;
    private String resul = "0";
    private String opera = "";
    StringBuilder ope =  new StringBuilder();
    
    public String mostrarMemoria() {
        return getResul();
    }
    
    public void operacionesMemoria(String opMemoria) {
        double aux = 0.0;
        if (opMemoria.equals("C")) {
            setResul("0");
        } else if (opMemoria.equals("S")) {
            aux = Double.parseDouble(getResul()) + 10.0;
            setResul(String.format("%.2f", aux));
        } else if (opMemoria.equals("M")) {
            aux = Double.parseDouble(getResul()) - 10.0;
            setResul(String.format("%.2f", aux));
        }
    }
    
    public String resultado() {
        opera = ope.toString();
        if (opera.isEmpty()) {
            clearE();
            return "No hay operaciones";
        }
        if (!operacionValida(opera)) {
            clearE();
            return "Syntax error";
        }
        if (indeterminada(opera)) {
            clearE();
            return "Indeterminación";
        }
        if (divisionPorCero(opera)) {
            clearE();
            return "Math error: división por cero";
        }
        setResul(evaluarOperacion(opera));
        his.agregarOperacion(opera+" = "+getResul());
        clearE();
        return getResul();
    }
    
    public String evaluarOperacion(String operacion) {
        try {
            operacion = operacion.replace(" ", "").replace("x", "x");
            operacion = resolverMultiplicacionDivision(operacion);
            operacion = resolverSumaResta(operacion);
            return String.format("%.2f", Double.parseDouble(operacion));
        } catch (Exception e) {
            return "Syntax error";
        }
    }

    public String resolverMultiplicacionDivision(String opera) {
        Pattern pattern = Pattern.compile("(-?\\d+(\\.\\d+)?)([x/])(-?\\d+(\\.\\d+)?)");
        Matcher matcher = pattern.matcher(opera);
        while (matcher.find()) {
            double a = Double.parseDouble(matcher.group(1));
            String operador = matcher.group(3);
            double b = Double.parseDouble(matcher.group(4));
            double resultado = operador.equals("x") ? a * b : a / b;
            String subExpr = matcher.group(0);
            opera = opera.replace(subExpr, String.format("%.2f", resultado));
            matcher = pattern.matcher(opera);
        }

        return opera;
    }

    public String resolverSumaResta(String opera) {
        Pattern pattern = Pattern.compile("(-?\\d+(\\.\\d+)?)([+-])(-?\\d+(\\.\\d+)?)");
        Matcher matcher = pattern.matcher(opera);
        while (matcher.find()) {
            double a = Double.parseDouble(matcher.group(1));
            String operador = matcher.group(3);
            double b = Double.parseDouble(matcher.group(4));
            double resultado = operador.equals("+") ? a + b : a - b;

            String subExpr = matcher.group(0);
            opera = opera.replace(subExpr, String.format("%.2f", resultado));
            matcher = pattern.matcher(opera);
        }
        return opera;
    }
    
    public boolean indeterminada(String operacion) {
        String[] partes = operacion.split("[+\\-x]");
        for (String parte : partes) {
            if (parte.contains("/")) {
                String[] division = parte.split("/");
                if (division.length == 2) {
                    String dividendo = division[0].trim();
                    String divisor = division[1].trim();
                    if ((dividendo.equals("0") || dividendo.equals("0.0")) &&
                        (divisor.equals("0") || divisor.equals("0.0"))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public boolean divisionPorCero(String operacion) {
        String[] partes = operacion.split("[+\\-x]");
        for (String parte : partes) {
            if (parte.contains("/")) {
                String[] division = parte.split("/");
                if (division.length == 2) {
                    String divisor = division[1].trim();
                    if (divisor.equals("0") || divisor.equals("0.0")) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public boolean operacionValida(String operacion) {
        return !syntaxError(operacion) && !puntosDuplicado(operacion);
    }

    public boolean syntaxError(String operacion) {
        for (int i = 0; i < operacion.length() - 1; i++) {
            char actual = operacion.charAt(i);
            char siguiente = operacion.charAt(i + 1);

            if ((actual == '+' && siguiente == '+') ||
                (actual == '-' && siguiente == '-') ||
                (actual == '/' && siguiente == '/') ||
                (actual == 'x' && siguiente == 'x')) {
                return true;
            }
        }
        return false;
    }
    
    public boolean contieneOperadoresDuplicados(String operacion) {
        return operacion.matches(".*(\\+\\+|--|//|xx).*");
    }
    
    public boolean puntosDuplicado(String operacion) {
        String[] operandos = operacion.split("[+\\-x/]");
        for (String op : operandos) {
            int contadorPuntos = 0;
            for (char c : op.toCharArray()) {
                if (c == '.') {
                    contadorPuntos++;
                    if (contadorPuntos > 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public void clearE() {
        if (!ope.isEmpty()) {
            ope.setLength(0);
        }
    }
    
    public void clear() {
        if (!ope.isEmpty()) {
            ope.deleteCharAt(ope.length() - 1);
        }
    }

    public void setPantalla(String numSim) {
        ope.append(numSim);
    }
    
    public StringBuilder getPantalla() {
        return ope;
    }
    
    public int getNoOperacion() {
        return noOperacion;
    }

    public void setNoOperacion(int aumDec) {
        if (aumDec == 0) {
            this.noOperacion = getNoOperacion() + 1;
        }
        else {
            this.noOperacion = getNoOperacion() - 1;
        }
    }
    
    public String mostrarHistorial(int aumDec) {
        setNoOperacion(aumDec);
        return his.obtenerOperacion(getNoOperacion());
    } 

    public String getResul() {
        return resul;
    }

    public void setResul(String resul) {
        this.resul = resul;
    }
    
}
