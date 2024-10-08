/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 2830482311021
 */
public class Concessionaria {
    public static void main(String[] args) {
        Carro carro = new Carro("Wolksvagen", "Nivus", 2024, 87990, 1.0f, 415, 4);
        Caminhao caminhao = new Caminhao("Mercedes", "Acrtros 2653", 2007, 1261600, "Walkaround", 4, 6, false);
        System.out.println("\n");
        carro.exibirDadosCarro();              
        caminhao.exibirDadosCaminhao();
    }//fim do main
}//fim da classe
