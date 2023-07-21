//Jhennifer Ap. Candido de Andrade

import java.util.ArrayList;
import java.util.List;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import java.text.ParseException;

public class BDProdDessecacao{
    private List <ProdutoDessecacao> bdProd1 = new ArrayList <ProdutoDessecacao>();
    
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    
    private static BDProdDessecacao BDDessecacaoUnico;
            
    private BDProdDessecacao(){
    }
            
    public static BDProdDessecacao getBDProdDessecacao(){
        if(BDDessecacaoUnico == null){
            BDDessecacaoUnico = new BDProdDessecacao();
        }
        return BDDessecacaoUnico;   
    }
    
    public List<ProdutoDessecacao> getBdProd1(){
        return bdProd1;
    }
    
    public ProdutoDessecacao setBdProd1(ProdutoDessecacao p1){
        if(consCod1(p1) == null){
            bdProd1.add(p1);
            return p1;
	}else{
            return null;
        }
    }
    
    public ProdutoDessecacao consCod1(ProdutoDessecacao p1){
	for(int i = 0; i < bdProd1.size(); i++){
            if(bdProd1.get(i).getCodigo().equals(p1.getCodigo())){
		return bdProd1.get(i);
            }
	}
	return null;
    }
    
    public ProdutoDessecacao deleteProd1(ProdutoDessecacao p1){
        ProdutoDessecacao prod1 = consCod1(p1);
            if(prod1 != null){
                bdProd1.remove(prod1);
                return null;
            }else{
                return p1;
            }	
    }
    
    public ProdutoDessecacao alteraProd1(ProdutoDessecacao p1){
	for(int i = 0; i < bdProd1.size(); i++){
            if(p1.getCodigo().equals(bdProd1.get(i).getCodigo())){
                String nome = JOptionPane.showInputDialog(null, "Nome do produto", "ALTERAR", JOptionPane.QUESTION_MESSAGE);
                p1.setNome(nome);
                bdProd1.set(i, p1); 
                String valor = JOptionPane.showInputDialog(null, "Preco", "ALTERAR", JOptionPane.QUESTION_MESSAGE);
                p1.setValor(Double.parseDouble(valor.replaceAll("," , ".")));
                bdProd1.set(i, p1);
                String tipo = JOptionPane.showInputDialog(null, "Especificacao", "ALTERAR", JOptionPane.QUESTION_MESSAGE);
                p1.setTipo(tipo);
                bdProd1.set(i, p1);
                String quantidade = JOptionPane.showInputDialog(null, "Quantidade comprada", "ALTERAR", JOptionPane.QUESTION_MESSAGE);
                p1.setQuantidade(Double.parseDouble(quantidade.replaceAll("," , ".")));
                bdProd1.set(i, p1);
                
                try{
                    String data1 = JOptionPane.showInputDialog(null, "Data da dessecacao pre-plantio (00/00/0000)", "ALTERAR", JOptionPane.QUESTION_MESSAGE);
                    p1.setDataDessecacao(formato.parse(data1));
                }
                catch(ParseException pe){
                    JOptionPane.showMessageDialog(null, "Data invalida", "ERRO", JOptionPane.ERROR);
                }
                
                String dose = JOptionPane.showInputDialog(null, "Dosagem utilizada por alqueire", "ALTERAR", JOptionPane.QUESTION_MESSAGE);
                p1.setDose(Double.parseDouble(dose.replaceAll("," , ".")));
                bdProd1.set(i, p1);
                String cnpj = JOptionPane.showInputDialog(null, "CNPJ da empresa fornecedora", "ALTERAR", JOptionPane.QUESTION_MESSAGE);
                p1.getVendedor().setCnpj(cnpj);
                bdProd1.set(i, p1);
                String nomeVend = JOptionPane.showInputDialog(null, "Nome do vendedor", "ALTERAR", JOptionPane.QUESTION_MESSAGE);
                p1.getVendedor().setNomeVend(nomeVend);
                bdProd1.set(i, p1);
                String nomeLoja = JOptionPane.showInputDialog(null, "Loja fornecedora", "ALTERAR", JOptionPane.QUESTION_MESSAGE);
                p1.getVendedor().setNomeLoja(nomeLoja);
                bdProd1.set(i, p1);
                
                return bdProd1.get(i);
            }
	}
        return null;
    }
}
