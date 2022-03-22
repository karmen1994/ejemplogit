package com.mycompany.actividad5_ets;

/**
 * @date 17 mar. 2022
 * @autor Carmen Nieves Hernández González
 * @version 1.0
 Nombre de la Clase : PracticaPMD
 */
public class PracticaPMD {
 public static void main(String[] args) {

        
        int altura = 89;
        if (altura > 89) {
            System.out.println("Eres muy alto");
        }
        PracticaPMD ejemPMD = new PracticaPMD();
        ejemPMD.metodoDobleReturn();

    }


    public boolean metodoDobleReturn() {
        int iValor = 10;
        return iValor == 5;
        
    }
}
