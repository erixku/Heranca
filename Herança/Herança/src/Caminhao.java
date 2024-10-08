/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 2830482311021
 */
public class Caminhao extends Veiculo {
    String tipoCarroceria;
    int numEixos;
    int qtdePneus;
    boolean refrigerado;

    public Caminhao(String marca, String modelo, int ano, float preço, String tipoCarroceria, int numEixos, int qtdePneus, boolean refrigerado) {
        super(marca, modelo, ano, preço);
        this.tipoCarroceria = tipoCarroceria;
        this.numEixos = numEixos;
        this.qtdePneus = qtdePneus;
        this.refrigerado = refrigerado;
    }
    
    public void exibirDadosCaminhao(){
        super.exibirDadosVeiculo();
        System.out.println("Tipo de Carroceria: " + tipoCarroceria);
        System.out.println("Números de Eixos: " + numEixos);
        System.out.println("Quantidade de Pneus: " + qtdePneus);
        System.out.println("É refrigerado: " + (refrigerado?"Sim":"Não")); //IF ternário, ele pergunta se o refrigerado é verdadeiro, então fica <parametro de comparação>?<verdadeiro>:<falso>
    }
}
