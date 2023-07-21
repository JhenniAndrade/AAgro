//Jhennifer Ap. Candido de Andrade

public class Vendedor{
	
    //Atributos
    private String cnpj;
    private String nomeVend;
    private String nomeLoja;


    //Construtores - Polimorfismo por sobrecarga
    public Vendedor(){
        cnpj = "";
	    nomeVend = "";
	    nomeLoja = "";
    }

    public Vendedor(String cnpj, String nomeVend, String nomeLoja){
	    this.cnpj = cnpj;
	    this.nomeVend = nomeVend;
	    this.nomeLoja = nomeLoja;
    }


    //Getters
    public String getCnpj(){
	    return cnpj;
    }
	
    public String getNomeVend(){
        return nomeVend;
    }

    public String getNomeLoja(){
	    return nomeLoja;
    }


    //Setters
    public void setCnpj(String cnpj){
	    this.cnpj = cnpj;
    }

    public void setNomeVend(String nomeVend){
	    this.nomeVend = nomeVend;
    }

    public void setNomeLoja(String nomeLoja){
	    this.nomeLoja = nomeLoja;
    }
}
