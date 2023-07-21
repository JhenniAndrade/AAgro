//Jhennifer Ap. Candido de Andrade

public abstract class Produto{	

    //Atributos
    private String nome;
    private String codigo;
    protected double valor;
    private String tipo;
    protected double quantidade;
    protected double dose;
    private Vendedor vendedor;


    //Construtores - Polimorfismo por sobrecarga
    public Produto(){
	    nome = "";
	    codigo = "";
	    valor = 0.0;
	    tipo = "";
	    quantidade = 0.0;
	    dose = 0.0;
	    vendedor = new Vendedor();
    }

    public Produto(String nome, String codigo, double valor, String tipo, double quantidade, double dose, Vendedor vendedor){
	    this.nome = nome;
	    this.codigo = codigo;
	    this.valor = valor;
	    this.tipo = tipo;
	    this.quantidade = quantidade;
	    this.dose = dose;
	    this.vendedor = vendedor;
    }	


    //Getters
    public String getNome(){
	    return nome;
    }

    public String getCodigo(){
	    return codigo;
    }

    public double getValor(){
	    return valor;
    }

    public String getTipo(){
	    return tipo;
    }

    public double getQuantidade(){
	    return quantidade;
    }

    public double getDose(){
	    return dose;
    }

    public Vendedor getVendedor(){
	    return vendedor;
    }


    //Setters
    public void setNome(String nome){
	    this.nome = nome;
    }

    public void setCodigo(String codigo){
        this.codigo = codigo;
    }

    public void setValor(double valor){
	    this.valor = valor;
    }

    public void setTipo(String tipo){
	    this.tipo = tipo;
    }

    public void setQuantidade(double quantidade){
	    this.quantidade = quantidade;
    }

    public void setDose(double dose){
	    this.dose = dose;
    }

    public void setVendedor(Vendedor vendedor){
	    this.vendedor = vendedor;
    }


    //Metodo abstrato
    public abstract double calcProduto();
}

