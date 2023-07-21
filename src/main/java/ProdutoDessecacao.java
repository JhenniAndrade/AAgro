//Jhennifer Ap. Candido de Andrade 

import java.util.Date;

public class ProdutoDessecacao extends Produto implements Calc{

    //Atributos
    private Date dataDessecacao;


    //Construtores - Polimorfismo por sobrecarga
    public ProdutoDessecacao(){
	    dataDessecacao = null;
    }

    public ProdutoDessecacao(Date dataDessecacao){
	    this.dataDessecacao = dataDessecacao;
    }


    //Getters
    public Date getDataDessecacao(){
	    return dataDessecacao;
    }


    //Setters
    public void setDataDessecacao(Date dataDessecacao){
	    this.dataDessecacao = dataDessecacao;
    }


    //Metodo da interface implementado na classe ProdutoDessecacao
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

