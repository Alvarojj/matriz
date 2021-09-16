package multmatriz;

import javax.swing.JOptionPane;

public class Multmatriz {

    public static void main(String[] args) {
        //variables
        int ef1, ec1, ef2, ec2;
        int ei, ek, ez, esuma;
        int me1[][] = new int[20][20];
        int me2[][] = new int[20][20];
        int me3[][] = new int[20][20];
        //Programa principal
        ef1 = Integer.parseInt(JOptionPane.showInputDialog("¿Filas matriz 1?"));
        ec1 = Integer.parseInt(JOptionPane.showInputDialog("¿Columnas matriz 1?"));
        Leer(me1, ef1, ec1);

        ef2 = Integer.parseInt(JOptionPane.showInputDialog("¿Filas matriz 2?"));
        ec2 = Integer.parseInt(JOptionPane.showInputDialog("¿Columnas matriz 2?"));
        Leer(me2, ef2, ec2);
        if (ec1 == ef2) {
            multiplicar(ef1,ec2, me1, me2, me3);
            Escribirm(me1, ef1, ec1, "matriz 1");
            Escribirm(me2, ef2, ec2, "matriz 2");
            Escribirm(me3, ef1, ec2, "matriz 3");

        } else {
            JOptionPane.showMessageDialog(null, "No se pueden multiplicar las matrices", "Lo siento", JOptionPane.INFORMATION_MESSAGE);
        }

    }

    //procedimientos
    public static void Leer(int mat[][], int fila, int columnas) {
        // variables locales
        int ei, ek;

        // Proceso
        for (ei = 1; ei <= fila; ei++) {
            for (ek = 1; ek <= columnas; ek++) {
                mat[ei][ek] = Integer.parseInt(JOptionPane.showInputDialog("elemento" + ei + " , " + ek));
            }
        }
    }

    public static void Escribirm(int mat[][], int filas, int columnas, String smj) {
        int ei, ek;
        String salida;
        salida = "";
        for (ei = 1; ei <= filas; ei++) {
            for (ek = 1; ek <= columnas; ek++) {
                salida = salida + mat[ei][ek] + "   ";
            }
            salida = salida + "\n";
        }
        JOptionPane.showMessageDialog(null, salida, smj, JOptionPane.INFORMATION_MESSAGE);
    }

    public static void multiplicar(int filas1, int columna2,int mat1[][], int mat2[][], int mat3[][]) {
        int esuma, ei,ek,ez;
        for (ei = 1; ei <= filas1; ei++) {
            for (ek = 1; ek <= columna2; ek++) {
                esuma = 0;
                for (ez = 1; ez <= filas1; ez++) {
                    esuma = esuma + mat1[ei][ez] * mat2[ez][ek];

                }
                mat3[ei][ek] = esuma;
            }
        }
    }
}
