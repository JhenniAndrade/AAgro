//Jhennifer Ap. Candido de Andrade

import java.util.ArrayList;
import java.util.List;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import java.text.ParseException;

public class BDCobertura{
    private List <Cobertura> bdProd4 = new ArrayList <Cobertura>();
    
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    
    private static BDCobertura BDCoberturaUnico;
            
    private BDCobertura(){
    }
            
    public static BDCobertura getBDCobertura(){
        if(BDCoberturaUnico == null){
            BDCoberturaUnico = new BDCobertura();
        }
        return BDCoberturaUnico;   
    }
    
    public List<Cobertura> getBdProd4(){
        return bdProd4;
    }
    
    public Cobertura setBdProd4(Cobertura p4){
        if(consCod4(p4) == null){
            bdProd4.add(p4);
            return p4;
	}else{
            return null;
        }
    }
    
    public Cobertura consCod4(Cobertura p4){
	for(int i = 0; i < bdProd4.size(); i++){
            if(bdProd4.get(i).getCodigo().equals(p4.getCodigo())){
		return bdProd4.get(i);
            }
	}
	return null;
    }
    
    public Cobertura deleteProd4(Cobertura p4){
        Cobertura prod4 = consCod4(p4);
            if(prod4 != null){
                bdProd4.remove(prod4);
                return null;
            }else{
                return p4;
            }	
    }
    
    public Cobertura alteraProd4(Cobertura p4){
	for(int i = 0; i < bdProd4.size(); i++){
            if(p4.getCodigo().equals(bdProd4.get(i).getCodigo())){
                String nome = JOptionPane.showInputDialog(null, "Nome do produto", "ALTERAR", JOptionPane.QUESTION_MESSAGE);
                p4.setNome(nome);
                bdProd4.set(i, p4); 
                String valor = JOptionPane.showInputDialog(null, "Preco", "ALTERAR", JOptionPane.QUESTION_MESSAGE);
                p4.setValor(Double.parseDouble(valor.replaceAll("," , ".")));
                bdProd4.set(i, p4);
                String tipo = JOptionPane.showInputDialog(null, "Especificacao", "ALTERAR", JOptionPane.QUESTION_MESSAGE);
                p4.setTipo(tipo);
                bdProd4.set(i, p4);
                String quantidade = JOptionPane.showInputDialog(null, "Quantidade comprada", "ALTERAR", JOptionPane.QUESTION_MESSAGE);
                p4.setQuantidade(Double.parseDouble(quantidade.replaceAll("," , ".")));
                bdProd4.set(i, p4);
                
                try{
                    String data4 = JOptionPane.showInputDialog(null, "Data da aplicacao da cobertura (00/00/0000)", "ALTERAR", JOptionPane.QUESTION_MESSAGE);
                    p4.setDataCobertura(formato.parse(data4));
                }
                catch(ParseException pe){
                    JOptionPane.showMessageDialog(null, "Data invalida", "ERRO", JOptionPane.ERROR);
                }
                
                String dose = JOptionPane.showInputDialog(null, "Dosagem utilizada por alqueire", "ALTERAR", JOptionPane.QUESTION_MESSAGE);
                p4.setDose(Double.parseDouble(dose.replaceAll("," , ".")));
                bdProd4.set(i, p4);
                String cnpj = JOptionPane.showInputDialog(null, "CNPJ da empresa fornecedora", "ALTERAR", JOptionPane.QUESTION_MESSAGE);
                p4.getVendedor().setCnpj(cnpj);
                bdProd4.set(i, p4);
                String nomeVend = JOptionPane.showInputDialog(null, "Nome do vendedor", "ALTERAR", JOptionPane.QUESTION_MESSAGE);
                p4.getVendedor().setNomeVend(nomeVend);
                bdProd4.set(i, p4);
                String nomeLoja = JOptionPane.showInputDialog(null, "Loja fornecedora", "ALTERAR", JOptionPane.QUESTION_MESSAGE);
                p4.getVendedor().setNomeLoja(nomeLoja);
                bdProd4.set(i, p4);
                
                return bdProd4.get(i);
            }
	}
        return null;
    }
}

