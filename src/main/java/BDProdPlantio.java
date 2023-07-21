//Jhennifer Ap. Candido de Andrade

import java.util.ArrayList;
import java.util.List;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import java.text.ParseException;

public class BDProdPlantio{
    private List <ProdutoPlantio> bdProd2 = new ArrayList <ProdutoPlantio>();
    
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    
    private static BDProdPlantio BDPlantioUnico;
            
    private BDProdPlantio(){
    }
            
    public static BDProdPlantio getBDProdPlantio(){
        if(BDPlantioUnico == null){
            BDPlantioUnico = new BDProdPlantio();
        }
        return BDPlantioUnico;   
    }
    
    public List<ProdutoPlantio> getBdProd2(){
        return bdProd2;
    }
    
    public ProdutoPlantio setBdProd2(ProdutoPlantio p2){
        if(consCod2(p2) == null){
            bdProd2.add(p2);
            return p2;
	}else{
            return null;
        }
    }
    
    public ProdutoPlantio consCod2(ProdutoPlantio p2){
	for(int i = 0; i < bdProd2.size(); i++){
            if(bdProd2.get(i).getCodigo().equals(p2.getCodigo())){
		return bdProd2.get(i);
            }
	}
	return null;
    }
    
    public ProdutoPlantio deleteProd2(ProdutoPlantio p2){
        ProdutoPlantio prod2 = consCod2(p2);
            if(prod2 != null){
                bdProd2.remove(prod2);
                return null;
            }else{
                return p2;
            }	
    }
    
    public ProdutoPlantio alteraProd2(ProdutoPlantio p2){
	for(int i = 0; i < bdProd2.size(); i++){
            if(p2.getCodigo().equals(bdProd2.get(i).getCodigo())){
                String nome = JOptionPane.showInputDialog(null, "Nome do produto", "ALTERAR", JOptionPane.QUESTION_MESSAGE);
                p2.setNome(nome);
                bdProd2.set(i, p2); 
                String valor = JOptionPane.showInputDialog(null, "Preco", "ALTERAR", JOptionPane.QUESTION_MESSAGE);
                p2.setValor(Double.parseDouble(valor.replaceAll("," , ".")));
                bdProd2.set(i, p2);
                String tipo = JOptionPane.showInputDialog(null, "Especificacao", "ALTERAR", JOptionPane.QUESTION_MESSAGE);
                p2.setTipo(tipo);
                bdProd2.set(i, p2);
                String quantidade = JOptionPane.showInputDialog(null, "Quantidade comprada", "ALTERAR", JOptionPane.QUESTION_MESSAGE);
                p2.setQuantidade(Double.parseDouble(quantidade.replaceAll("," , ".")));
                bdProd2.set(i, p2);
                
                try{
                    String data2 = JOptionPane.showInputDialog(null, "Data do plantio (00/00/0000)", "ALTERAR", JOptionPane.QUESTION_MESSAGE);
                    p2.setDataPlantio(formato.parse(data2));
                }
                catch(ParseException pe){
                    JOptionPane.showMessageDialog(null, "Data invalida", "ERRO", JOptionPane.ERROR);
                }
                
                String dose = JOptionPane.showInputDialog(null, "Dosagem utilizada por alqueire", "ALTERAR", JOptionPane.QUESTION_MESSAGE);
                p2.setDose(Double.parseDouble(dose.replaceAll("," , ".")));
                bdProd2.set(i, p2);
                String cnpj = JOptionPane.showInputDialog(null, "CNPJ da empresa fornecedora", "ALTERAR", JOptionPane.QUESTION_MESSAGE);
                p2.getVendedor().setCnpj(cnpj);
                bdProd2.set(i, p2);
                String nomeVend = JOptionPane.showInputDialog(null, "Nome do vendedor", "ALTERAR", JOptionPane.QUESTION_MESSAGE);
                p2.getVendedor().setNomeVend(nomeVend);
                bdProd2.set(i, p2);
                String nomeLoja = JOptionPane.showInputDialog(null, "Loja fornecedora", "ALTERAR", JOptionPane.QUESTION_MESSAGE);
                p2.getVendedor().setNomeLoja(nomeLoja);
                bdProd2.set(i, p2);
                
                return bdProd2.get(i);
            }
	}
        return null;
    }
}

