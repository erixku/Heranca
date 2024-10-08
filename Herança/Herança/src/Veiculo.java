/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * classe para demonstrar o princípio de herança em uma modelagem para automóveis
 * @author Erick Gomes Barbosa
 */
public class Veiculo {
    String marca;
    String modelo;
    int ano;
    float preço;
    
    //Construtor da classe Veículo

    public Veiculo(String marca, String modelo, int ano, float preço) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.preço = preço;
    }
    
    public void exibirDadosVeiculo(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano de fabricação: " + ano);
        System.out.println("Preço: " + preço);
    }
}
