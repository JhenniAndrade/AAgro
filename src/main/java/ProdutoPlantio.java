//Jhennifer Ap. Candido de Andrade

import java.util.Date;

public class ProdutoPlantio extends Produto implements Calc{

    //Atributos
    private Date dataPlantio;


    //Construtores - Polimorfismo por sobrecarga
    public ProdutoPlantio(){
	    dataPlantio = null;
    }

    public ProdutoPlantio(Date dataPlantio){
	    this.dataPlantio = dataPlantio;
    }


    //Getters
    public Date getDataPlantio(){
	    return dataPlantio;
    }


    //Setters
    public void setDataPlantio(Date dataPlantio){
	    this.dataPlantio = dataPlantio;
    }


    //Metodo da interface implementado na classe ProdutoPlantio
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
