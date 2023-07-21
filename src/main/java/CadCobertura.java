//Jhennifer Ap. Candido de Andrade

import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class CadCobertura extends javax.swing.JFrame{

    private Cobertura p4 = new Cobertura();
    
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    
    private static CadCobertura cadProd4Unico;
    
    private CadCobertura(){
        initComponents();
    }

    public static CadCobertura getCadCobertura(){
        if(cadProd4Unico == null){
            cadProd4Unico = new CadCobertura();
        }
        return cadProd4Unico;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Cadastro = new javax.swing.JLabel();
        cxNomeLoja = new javax.swing.JTextField();
        cxNome = new javax.swing.JTextField();
        cxValor = new javax.swing.JTextField();
        cxEspecificacao = new javax.swing.JTextField();
        cxQuantidade = new javax.swing.JTextField();
        cxDose = new javax.swing.JTextField();
        cxNomeVend = new javax.swing.JTextField();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Cadastro.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        Cadastro.setText("Cadastro Produto Cobertura");

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
        Data.setText("Data cobertura (00/00/0000)");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Codigo)
                                    .addComponent(Nome)
                                    .addComponent(Valor)
                                    .addComponent(Especificacao)
                                    .addComponent(Quantidade)
                                    .addComponent(Dose)
                                    .addComponent(NomeLoja)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(Cnpj, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(NomeVend))))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(Data)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cxNomeVend, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cxData, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cxQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cxEspecificacao, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cxValor, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cxNome, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cxCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cxDose, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cxCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cxNomeLoja, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97)
                        .addComponent(Consultar)
                        .addGap(93, 93, 93)
                        .addComponent(Alterar)
                        .addGap(93, 93, 93)))
                .addComponent(Excluir)
                .addGap(132, 132, 132))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(402, 402, 402)
                        .addComponent(Limpar)
                        .addGap(66, 66, 66)
                        .addComponent(Sair, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(330, 330, 330)
                        .addComponent(Cadastro))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(Produtos, javax.swing.GroupLayout.PREFERRED_SIZE, 910, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cxCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Codigo))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cxNome, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nome))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cxValor, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Valor))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cxEspecificacao, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Especificacao))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cxQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Quantidade))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cxData, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Data))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cxDose, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Dose))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cxCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cnpj))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cxNomeVend, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NomeVend))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cxNomeLoja, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NomeLoja))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Consultar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
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
        altProdCobertura();
        lista();
    }//GEN-LAST:event_AlterarActionPerformed

    private void ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirActionPerformed
        excluir();
        lista();
    }//GEN-LAST:event_ExcluirActionPerformed

    private void ProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProdutosActionPerformed
        selectProd4();
    }//GEN-LAST:event_ProdutosActionPerformed

    private void LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparActionPerformed
        limpar();
    }//GEN-LAST:event_LimparActionPerformed

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        sair();
    }//GEN-LAST:event_SairActionPerformed

    private void CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarActionPerformed
        cadProdCobertura();
        lista();
    }//GEN-LAST:event_CadastrarActionPerformed

    private void ConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarActionPerformed
        consProdCobertura();
    }//GEN-LAST:event_ConsultarActionPerformed

    public void lista(){
        Produtos.removeAllItems();
        Produtos.addItem("Escolha um Produto");
        
        for(Cobertura p4 : BDCobertura.getBDCobertura().getBdProd4()){
            Produtos.addItem("Codigo: "+p4.getCodigo()+"   -   Nome: "+p4.getNome()+"   -   Especificacao: "+p4.getTipo()+"   -   Valor total da compra: "+p4.calcProduto()+" reais"+"   -   Data cobertura: "+formato.format(p4.getDataCobertura())+"   -   Custo por alqueire: "+p4.calcDose()+" reais"+"   -   Loja fornecedora: "+p4.getVendedor().getNomeLoja());
        }
    }
    
    public void selectProd4(){
        if(Produtos.getSelectedIndex()>=1){
            String valLin = Produtos.getSelectedItem().toString();
            JOptionPane.showMessageDialog(null, "Produto escolhido: "+valLin, "PRODUTO", 1);
        }
    }
    
    public void altProdCobertura(){
        p4 = new Cobertura();
        
        p4.setCodigo(cxCodigo.getText());
        
        p4 = BDCobertura.getBDCobertura().alteraProd4(p4);
        
        if(p4 != null){
            cxNome.setText(p4.getNome());
            cxValor.setText(Double.toString(p4.getValor()));
            cxEspecificacao.setText(p4.getTipo());
            cxQuantidade.setText(Double.toString(p4.getQuantidade()));
            cxData.setText(formato.format(p4.getDataCobertura()));
            cxDose.setText(Double.toString(p4.getDose()));
            cxCnpj.setText(p4.getVendedor().getCnpj());
            cxNomeVend.setText(p4.getVendedor().getNomeVend());
            cxNomeLoja.setText(p4.getVendedor().getNomeLoja());
            
            JOptionPane.showMessageDialog(null, "Produto alterado com sucesso", "ALTERAR", JOptionPane.INFORMATION_MESSAGE);
            limpar();          
        }
        else{
            JOptionPane.showMessageDialog(null, "Produto nao cadastrado", "ERRO", JOptionPane.ERROR_MESSAGE );
            limpar();
        }   
    }
    
    public void consProdCobertura(){
        p4 = new Cobertura();
        
        p4.setCodigo(cxCodigo.getText());
        
        p4 = BDCobertura.getBDCobertura().consCod4(p4);
        
        if(p4 != null){
            cxNome.setText(p4.getNome());
            cxValor.setText(Double.toString(p4.getValor()));
            cxEspecificacao.setText(p4.getTipo());
            cxQuantidade.setText(Double.toString(p4.getQuantidade()));
            cxData.setText(formato.format(p4.getDataCobertura()));
            cxDose.setText(Double.toString(p4.getDose()));
            cxCnpj.setText(p4.getVendedor().getCnpj());
            cxNomeVend.setText(p4.getVendedor().getNomeVend());
            cxNomeLoja.setText(p4.getVendedor().getNomeLoja());
            
            JOptionPane.showMessageDialog(null, "Produto cadastrado", "CONSULTAR", JOptionPane.INFORMATION_MESSAGE );
            limpar();          
        }
        else{
            JOptionPane.showMessageDialog(null, "Produto nao cadastrado", "ERRO", JOptionPane.ERROR_MESSAGE);
            limpar();
        }
    }
    
    public void cadProdCobertura(){
        p4 = new Cobertura();
        
        p4.setCodigo(cxCodigo.getText());
        p4.setNome(cxNome.getText());
        p4.setValor(Double.parseDouble(cxValor.getText().replaceAll("," , ".")));
        p4.setTipo(cxEspecificacao.getText());
        p4.setQuantidade(Double.parseDouble(cxQuantidade.getText().replaceAll("," , ".")));
        
        try{
            p4.setDataCobertura(formato.parse(cxData.getText()));
        }
        catch(ParseException pe){
            JOptionPane.showMessageDialog(null, "Data invalida", "ERRO", JOptionPane.ERROR);
        }
        
        p4.setDose(Double.parseDouble(cxDose.getText().replaceAll("," , ".")));
        p4.getVendedor().setCnpj(cxCnpj.getText());
        p4.getVendedor().setNomeVend(cxNomeVend.getText());
        p4.getVendedor().setNomeLoja(cxNomeLoja.getText());
        
        p4 = BDCobertura.getBDCobertura().setBdProd4(p4);
        
        if(p4 != null){
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
        p4 = new Cobertura();
        p4.setCodigo(cxCodigo.getText());
        
        p4 = BDCobertura.getBDCobertura().consCod4(p4);
        
        if(p4 != null){
            cxCodigo.setText(p4.getCodigo());
            int x = JOptionPane.showConfirmDialog(null, "Deseja excluir esse produto?", "EXCLUIR", JOptionPane.YES_NO_CANCEL_OPTION);
            if(x == 0){
                BDCobertura.getBDCobertura().deleteProd4(p4);
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
