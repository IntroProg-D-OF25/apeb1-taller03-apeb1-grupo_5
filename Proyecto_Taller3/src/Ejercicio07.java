public class Ejercicio07 {
    public static void main(String[] args) {
        double v1, v2, v3, v4, v5, v6, v7, v8;
        boolean resultado;
        
        v1 = Math.sqrt(81)+9;
        v2 = 3;
        v3 = 9;
        v4 = 10;
        v5 = 1;
        v6 = 100;
        v7 = 25;
        v8 = Math.sqrt(100);
        // Se cambio el simbolo de operacion + por el simbolo logico >= para poder comparar.  
        resultado = ((v1/v2) == v3) || (v4 > v5) && ((v6/v7)>=v8);
        System.out.println("resultado = " + resultado);
    }
}
