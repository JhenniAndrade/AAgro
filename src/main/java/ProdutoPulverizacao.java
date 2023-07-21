//Jhennifer Ap. Candido de Andrade

import java.util.Date;

public class ProdutoPulverizacao extends Produto implements Calc{

    //Atributos
    private Date dataPulverizacao;


    //Construtores - Polimorfismo por sobrecarga
    public ProdutoPulverizacao(){
	    dataPulverizacao = null;
    }

    public ProdutoPulverizacao(Date dataPulverizacao){
	    this.dataPulverizacao = dataPulverizacao;
    }


    //Getters
    public Date getDataPulverizacao(){
	    return dataPulverizacao;
    }


    //Setters
    public void setDataPulverizacao(Date dataPulverizacao){
	    this.dataPulverizacao = dataPulverizacao;
    }


    //Metodo da interface implementado na classe ProdutoPulverizacao
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
