/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Classe herdeira de Veiculo para gerar um objeto do tipo Carro
 * @author 2830482311021
 */
public class Carro extends Veiculo {
    float potencia;
    int volumePM;
    int numPass;
    
    //construtor do objeto Carro
    public Carro(String marca, String modelo, int ano, float preço, float potencia, int volumerPM, int numPass){
        super(marca, modelo, ano, preço); //devolver para a superclasse os seus parâmetros
        this.potencia = potencia;
        this.volumePM = volumerPM;
        this.numPass = numPass;
    }
    
    //Método comum para exibir os dados do carro
    public void exibirDadosCarro(){
        super.exibirDadosVeiculo();
        System.out.println("Potência: " + potencia);
        System.out.println("Volume do Porta malas: " + volumePM + "L");
        System.out.println("Número de passageiros: " + numPass);
    }
}
