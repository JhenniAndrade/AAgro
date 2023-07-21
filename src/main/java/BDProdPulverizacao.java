//Jhennifer Ap. Candido de Andrade 

import java.util.ArrayList;
import java.util.List;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import java.text.ParseException;

public class BDProdPulverizacao{
    private List <ProdutoPulverizacao> bdProd3 = new ArrayList <ProdutoPulverizacao>();
    
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    
    private static BDProdPulverizacao BDPulverizacaoUnico;
            
    private BDProdPulverizacao(){
    }
            
    public static BDProdPulverizacao getBDProdPulverizacao(){
        if(BDPulverizacaoUnico == null){
            BDPulverizacaoUnico = new BDProdPulverizacao();
        }
        return BDPulverizacaoUnico;   
    }
    
    public List<ProdutoPulverizacao> getBdProd3(){
        return bdProd3;
    }
    
    public ProdutoPulverizacao setBdProd3(ProdutoPulverizacao p3){
        if(consCod3(p3) == null){
            bdProd3.add(p3);
            return p3;
	}else{
            return null;
        }
    }
    
    public ProdutoPulverizacao consCod3(ProdutoPulverizacao p3){
	for(int i = 0; i < bdProd3.size(); i++){
            if(bdProd3.get(i).getCodigo().equals(p3.getCodigo())){
		return bdProd3.get(i);
            }
	}
	return null;
    }
    
    public ProdutoPulverizacao deleteProd3(ProdutoPulverizacao p3){
        ProdutoPulverizacao prod3 = consCod3(p3);
            if(prod3 != null){
                bdProd3.remove(prod3);
                return null;
            }else{
                return p3;
            }	
    }
    
    public ProdutoPulverizacao alteraProd3(ProdutoPulverizacao p3){
	for(int i = 0; i < bdProd3.size(); i++){
            if(p3.getCodigo().equals(bdProd3.get(i).getCodigo())){
                String nome = JOptionPane.showInputDialog(null, "Nome do produto", "ALTERAR", JOptionPane.QUESTION_MESSAGE);
                p3.setNome(nome);
                bdProd3.set(i, p3); 
                String valor = JOptionPane.showInputDialog(null, "Preco", "ALTERAR", JOptionPane.QUESTION_MESSAGE);
                p3.setValor(Double.parseDouble(valor.replaceAll("," , ".")));
                bdProd3.set(i, p3);
                String tipo = JOptionPane.showInputDialog(null, "Especificacao", "ALTERAR", JOptionPane.QUESTION_MESSAGE);
                p3.setTipo(tipo);
                bdProd3.set(i, p3);
                String quantidade = JOptionPane.showInputDialog(null, "Quantidade comprada", "ALTERAR", JOptionPane.QUESTION_MESSAGE);
                p3.setQuantidade(Double.parseDouble(quantidade.replaceAll("," , ".")));
                bdProd3.set(i, p3);
                
                try{
                    String data3 = JOptionPane.showInputDialog(null, "Data da pulverizacao (00/00/0000)", "ALTERAR", JOptionPane.QUESTION_MESSAGE);
                    p3.setDataPulverizacao(formato.parse(data3));
                }
                catch(ParseException pe){
                    JOptionPane.showMessageDialog(null, "Data invalida", "ERRO", JOptionPane.ERROR);
                }
                
                String dose = JOptionPane.showInputDialog(null, "Dosagem utilizada por alqueire", "ALTERAR", JOptionPane.QUESTION_MESSAGE);
                p3.setDose(Double.parseDouble(dose.replaceAll("," , ".")));
                bdProd3.set(i, p3);
                String cnpj = JOptionPane.showInputDialog(null, "CNPJ da empresa fornecedora", "ALTERAR", JOptionPane.QUESTION_MESSAGE);
                p3.getVendedor().setCnpj(cnpj);
                bdProd3.set(i, p3);
                String nomeVend = JOptionPane.showInputDialog(null, "Nome do vendedor", "ALTERAR", JOptionPane.QUESTION_MESSAGE);
                p3.getVendedor().setNomeVend(nomeVend);
                bdProd3.set(i, p3);
                String nomeLoja = JOptionPane.showInputDialog(null, "Loja fornecedora", "ALTERAR", JOptionPane.QUESTION_MESSAGE);
                p3.getVendedor().setNomeLoja(nomeLoja);
                bdProd3.set(i, p3);
                
                return bdProd3.get(i);
            }
	}
        return null;
    }
}

