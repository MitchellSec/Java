package Estudos.Variaveis;

import javax.swing.*;

public class Aula05EstruturaCondicionais03 {
    static void main(String[] args) {

        double salario = 3000.00;

        String doar = "Vou Doar 500 reais";
        String naoDoar = "Não tenho o suficiente pra doar";
        String resultado;

        if (salario > 5000){
            resultado = doar;

        }else{
            resultado = naoDoar;
        }
        System.out.println(resultado);
    }
}
