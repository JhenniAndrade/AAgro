//Jhennifer Ap. Candido de Andrade

import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class CadProdPulverizacao extends javax.swing.JFrame{

    private ProdutoPulverizacao p3 = new ProdutoPulverizacao();
    
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    
    private static CadProdPulverizacao cadProd3Unico;
    
    private CadProdPulverizacao(){
        initComponents();
    }

    public static CadProdPulverizacao getCadProdPulverizacao(){
        if(cadProd3Unico == null){
            cadProd3Unico = new CadProdPulverizacao();
        }
        return cadProd3Unico;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Cadastro = new javax.swing.JLabel();
        cxNomeLoja = new javax.swing.JTextField();
        Codigo = new javax.swing.JLabel();
        Nome = new javax.swing.JLabel();
        Valor = new javax.swing.JLabel();
        Especificacao = new javax.swing.JLabel();
        Quantidade = new javax.swing.JLabel();
        Data = new javax.swing.JLabel();
        Dose = new javax.swing.JLabel();
        Alterar = new javax.swing.JButton();
        Excluir = new javax.swing.JButton();
        cxCodigo = new javax.swing.JTextField();
        Produtos = new javax.swing.JComboBox<>();
        cxData = new javax.swing.JTextField();
        Limpar = new javax.swing.JButton();
        cxCnpj = new javax.swing.JTextField();
        Sair = new javax.swing.JButton();
        Cnpj = new javax.swing.JLabel();
        Cadastrar = new javax.swing.JButton();
        NomeVend = new javax.swing.JLabel();
        Consultar = new javax.swing.JButton();
        NomeLoja = new javax.swing.JLabel();
        cxNome = new javax.swing.JTextField();
        cxValor = new javax.swing.JTextField();
        cxEspecificacao = new javax.swing.JTextField();
        cxQuantidade = new javax.swing.JTextField();
        cxDose = new javax.swing.JTextField();
        cxNomeVend = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Cadastro.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Cadastro.setText("Cadastro Produto Pulverizacao");

        Codigo.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        Codigo.setText("Codigo");

        Nome.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        Nome.setText("Nome");

        Valor.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        Valor.setText("Preco");

        Especificacao.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        Especificacao.setText("Especificacao");

        Quantidade.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        Quantidade.setText("Quantidade comprada");

        Data.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        Data.setText("Data pulverizacao (00/00/0000)");

        Dose.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        Dose.setText("Dosagem");

        Alterar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Alterar.setText("Alterar Codigo");
        Alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlterarActionPerformed(evt);
            }
        });

        Excluir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Excluir.setText("Excluir Codigo");
        Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirActionPerformed(evt);
            }
        });

        Produtos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Produtos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Produtos" }));
        Produtos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProdutosActionPerformed(evt);
            }
        });

        Limpar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Limpar.setText("Limpar");
        Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparActionPerformed(evt);
            }
        });

        Sair.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Sair.setText("Sair");
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });

        Cnpj.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        Cnpj.setText("CNPJ da loja forncedora");

        Cadastrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Cadastrar.setText("Cadastrar");
        Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarActionPerformed(evt);
            }
        });

        NomeVend.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        NomeVend.setText("Nome do vendedor");

        Consultar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Consultar.setText("Consultar Codigo");
        Consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarActionPerformed(evt);
            }
        });

        NomeLoja.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        NomeLoja.setText("Loja fornecedora");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(Produtos, javax.swing.GroupLayout.PREFERRED_SIZE, 910, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Dose)
                                    .addComponent(Cnpj)
                                    .addComponent(Data)
                                    .addComponent(Quantidade)
                                    .addComponent(NomeVend)
                                    .addComponent(NomeLoja)
                                    .addComponent(Especificacao)
                                    .addComponent(Valor)
                                    .addComponent(Nome)
                                    .addComponent(Codigo))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cxQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cxEspecificacao, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cxNome, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cxCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cxValor, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cxData, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cxDose, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cxCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cxNomeVend, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cxNomeLoja, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(395, 395, 395)
                        .addComponent(Limpar)
                        .addGap(76, 76, 76)
                        .addComponent(Sair, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Cadastro)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)
                        .addComponent(Consultar)
                        .addGap(105, 105, 105)
                        .addComponent(Alterar)
                        .addGap(14, 14, 14)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Excluir)
                .addGap(133, 133, 133))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Cadastro)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cxCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Codigo))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cxNome, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nome))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cxValor, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Valor))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cxEspecificacao, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Especificacao))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cxQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Quantidade))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cxData, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Data))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cxDose, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Dose))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cxCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cnpj))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cxNomeVend, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NomeVend))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cxNomeLoja, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NomeLoja))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Consultar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(Produtos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Limpar)
                    .addComponent(Sair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlterarActionPerformed
        altProdPulverizacao();
        lista();
    }//GEN-LAST:event_AlterarActionPerformed

    private void ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirActionPerformed
        excluir();
        lista();
    }//GEN-LAST:event_ExcluirActionPerformed

    private void ProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProdutosActionPerformed
        selectProd3();
    }//GEN-LAST:event_ProdutosActionPerformed

    private void LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparActionPerformed
        limpar();
    }//GEN-LAST:event_LimparActionPerformed

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        sair();
    }//GEN-LAST:event_SairActionPerformed

    private void CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarActionPerformed
        cadProdPulverizacao();
        lista();
    }//GEN-LAST:event_CadastrarActionPerformed

    private void ConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarActionPerformed
        consProdPulverizacao();
    }//GEN-LAST:event_ConsultarActionPerformed

    public void lista(){
        Produtos.removeAllItems();
        Produtos.addItem("Escolha um Produto");
        
        for(ProdutoPulverizacao p3 : BDProdPulverizacao.getBDProdPulverizacao().getBdProd3()){
            Produtos.addItem("Codigo: "+p3.getCodigo()+"   -   Nome: "+p3.getNome()+"   -   Especificacao: "+p3.getTipo()+"   -   Valor total da compra: "+p3.calcProduto()+" reais"+"   -   Data pulverizacao: "+formato.format(p3.getDataPulverizacao())+"   -   Custo por alqueire: "+p3.calcDose()+" reais"+"   -   Loja fornecedora: "+p3.getVendedor().getNomeLoja());
        }
    }
    
    public void selectProd3(){
        if(Produtos.getSelectedIndex()>=1){
            String valLin = Produtos.getSelectedItem().toString();
            JOptionPane.showMessageDialog(null, "Produto escolhido: "+valLin, "PRODUTO", 1);
        }
    }
    
    public void altProdPulverizacao(){
        p3 = new ProdutoPulverizacao();
        
        p3.setCodigo(cxCodigo.getText());
        
        p3 = BDProdPulverizacao.getBDProdPulverizacao().alteraProd3(p3);
        
        if(p3 != null){
            cxNome.setText(p3.getNome());
            cxValor.setText(Double.toString(p3.getValor()));
            cxEspecificacao.setText(p3.getTipo());
            cxQuantidade.setText(Double.toString(p3.getQuantidade()));
            cxData.setText(formato.format(p3.getDataPulverizacao()));
            cxDose.setText(Double.toString(p3.getDose()));
            cxCnpj.setText(p3.getVendedor().getCnpj());
            cxNomeVend.setText(p3.getVendedor().getNomeVend());
            cxNomeLoja.setText(p3.getVendedor().getNomeLoja());
            
            JOptionPane.showMessageDialog(null, "Produto alterado com sucesso", "ALTERAR", JOptionPane.INFORMATION_MESSAGE);
            limpar();          
        }
        else{
            JOptionPane.showMessageDialog(null, "Produto nao cadastrado", "ERRO", JOptionPane.ERROR_MESSAGE );
            limpar();
        }   
    }
    
    public void consProdPulverizacao(){
        p3 = new ProdutoPulverizacao();
        
        p3.setCodigo(cxCodigo.getText());
        
        p3 = BDProdPulverizacao.getBDProdPulverizacao().consCod3(p3);
        
        if(p3 != null){
            cxNome.setText(p3.getNome());
            cxValor.setText(Double.toString(p3.getValor()));
            cxEspecificacao.setText(p3.getTipo());
            cxQuantidade.setText(Double.toString(p3.getQuantidade()));
            cxData.setText(formato.format(p3.getDataPulverizacao()));
            cxDose.setText(Double.toString(p3.getDose()));
            cxCnpj.setText(p3.getVendedor().getCnpj());
            cxNomeVend.setText(p3.getVendedor().getNomeVend());
            cxNomeLoja.setText(p3.getVendedor().getNomeLoja());
            
            JOptionPane.showMessageDialog(null, "Produto cadastrado", "CONSULTAR", JOptionPane.INFORMATION_MESSAGE );
            limpar();          
        }
        else{
            JOptionPane.showMessageDialog(null, "Produto nao cadastrado", "ERRO", JOptionPane.ERROR_MESSAGE);
            limpar();
        }
    }
    
    public void cadProdPulverizacao(){
        p3 = new ProdutoPulverizacao();
        
        p3.setCodigo(cxCodigo.getText());
        p3.setNome(cxNome.getText());
        p3.setValor(Double.parseDouble(cxValor.getText().replaceAll("," , ".")));
        p3.setTipo(cxEspecificacao.getText());
        p3.setQuantidade(Double.parseDouble(cxQuantidade.getText().replaceAll("," , ".")));
        
        try{
            p3.setDataPulverizacao(formato.parse(cxData.getText()));
        }
        catch(ParseException pe){
            JOptionPane.showMessageDialog(null, "Data invalida", "ERRO", JOptionPane.ERROR);
        }
        
        p3.setDose(Double.parseDouble(cxDose.getText().replaceAll("," , ".")));
        p3.getVendedor().setCnpj(cxCnpj.getText());
        p3.getVendedor().setNomeVend(cxNomeVend.getText());
        p3.getVendedor().setNomeLoja(cxNomeLoja.getText());
        
        p3 = BDProdPulverizacao.getBDProdPulverizacao().setBdProd3(p3);
        
        if(p3 != null){
            JOptionPane.showMessageDialog(null, "Produto cadastrado", "CADASTRO", JOptionPane.INFORMATION_MESSAGE);
            limpar();          
        }
        else{
            JOptionPane.showMessageDialog(null, "Codigo ja cadastrado", "ERRO", JOptionPane.ERROR_MESSAGE);
            limpar();
        }
    }
    
    public void limpar(){
        cxCodigo.setText("");
        cxNome.setText("");
        cxValor.setText("");
        cxEspecificacao.setText("");
        cxQuantidade.setText("");
        cxData.setText("");
        cxDose.setText("");
        cxCnpj.setText("");
        cxNomeVend.setText("");
        cxNomeLoja.setText("");
        
        cxCodigo.requestFocus();
    }
    
    public void sair(){
        int respSair = JOptionPane.showConfirmDialog(null, "Deseja sair?", "SAIR", 0);
            if(respSair == 0){
                dispose();
            }
    }
    
    public void excluir(){
        p3 = new ProdutoPulverizacao();
        p3.setCodigo(cxCodigo.getText());
        
        p3 = BDProdPulverizacao.getBDProdPulverizacao().consCod3(p3);
        
        if(p3 != null){
            cxCodigo.setText(p3.getCodigo());
            int x = JOptionPane.showConfirmDialog(null, "Deseja excluir esse produto?", "EXCLUIR", JOptionPane.YES_NO_CANCEL_OPTION);
            if(x == 0){
                BDProdPulverizacao.getBDProdPulverizacao().deleteProd3(p3);
                JOptionPane.showMessageDialog(null, "Produto excluido", "EXCLUIR", 1);                        
                limpar();
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Produto nao cadastrado", "ERRO", 0);        
            limpar();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Alterar;
    private javax.swing.JButton Cadastrar;
    private javax.swing.JLabel Cadastro;
    private javax.swing.JLabel Cnpj;
    private javax.swing.JLabel Codigo;
    private javax.swing.JButton Consultar;
    private javax.swing.JLabel Data;
    private javax.swing.JLabel Dose;
    private javax.swing.JLabel Especificacao;
    private javax.swing.JButton Excluir;
    private javax.swing.JButton Limpar;
    private javax.swing.JLabel Nome;
    private javax.swing.JLabel NomeLoja;
    private javax.swing.JLabel NomeVend;
    private javax.swing.JComboBox<String> Produtos;
    private javax.swing.JLabel Quantidade;
    private javax.swing.JButton Sair;
    private javax.swing.JLabel Valor;
    private javax.swing.JTextField cxCnpj;
    private javax.swing.JTextField cxCodigo;
    private javax.swing.JTextField cxData;
    private javax.swing.JTextField cxDose;
    private javax.swing.JTextField cxEspecificacao;
    private javax.swing.JTextField cxNome;
    private javax.swing.JTextField cxNomeLoja;
    private javax.swing.JTextField cxNomeVend;
    private javax.swing.JTextField cxQuantidade;
    private javax.swing.JTextField cxValor;
    // End of variables declaration//GEN-END:variables
}
