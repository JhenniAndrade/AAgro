//Jhennifer Ap. Candido de Andrade

import java.util.Date;

public class Cobertura extends Produto implements Calc{

    //Atributos
    private Date dataCobertura;


    //Construtores - Polimorfismo por sobrecarga
    public Cobertura(){
	    dataCobertura = null;
    }

    public Cobertura(Date dataCobertura){
	    this.dataCobertura = dataCobertura;
    }


    //Getters
    public Date getDataCobertura(){
	    return dataCobertura;
    }


    //Setters
    public void setDataCobertura(Date dataCobertura){
	    this.dataCobertura = dataCobertura;
    }


    //Metodo da interface implementado na classe Cobertura
    public double calcDose(){
	    double custo = valor * dose;
        return custo;
    }


    //Sobrescricao do metodo abstrato
    public double calcProduto(){
        double total = valor * quantidade;
        return total;
    }
}
