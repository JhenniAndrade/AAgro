//Jhennifer Ap. Candido de Andrade

import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class CadProdDessecacao extends javax.swing.JFrame{

    private ProdutoDessecacao p1 = new ProdutoDessecacao();
    
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    
    private static CadProdDessecacao cadProd1Unico;
    
    private CadProdDessecacao(){
        initComponents();
    }

    public static CadProdDessecacao getCadProdDessecacao(){
        if(cadProd1Unico == null){
            cadProd1Unico = new CadProdDessecacao();
        }
        return cadProd1Unico;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Cadastro = new javax.swing.JLabel();
        Codigo = new javax.swing.JLabel();
        Nome = new javax.swing.JLabel();
        Valor = new javax.swing.JLabel();
        Especificacao = new javax.swing.JLabel();
        Quantidade = new javax.swing.JLabel();
        Data = new javax.swing.JLabel();
        Dose = new javax.swing.JLabel();
        Cnpj = new javax.swing.JLabel();
        NomeVend = new javax.swing.JLabel();
        NomeLoja = new javax.swing.JLabel();
        cxNome = new javax.swing.JTextField();
        cxValor = new javax.swing.JTextField();
        cxEspecificacao = new javax.swing.JTextField();
        cxQuantidade = new javax.swing.JTextField();
        cxDose = new javax.swing.JTextField();
        cxNomeVend = new javax.swing.JTextField();
        cxNomeLoja = new javax.swing.JTextField();
        Cadastrar = new javax.swing.JButton();
        Consultar = new javax.swing.JButton();
        Alterar = new javax.swing.JButton();
        Excluir = new javax.swing.JButton();
        Produtos = new javax.swing.JComboBox<>();
        cxData = new javax.swing.JTextField();
        cxCnpj = new javax.swing.JTextField();
        Limpar = new javax.swing.JButton();
        Sair = new javax.swing.JButton();
        cxCodigo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Cadastro.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Cadastro.setText("Cadastro Produto Dessecacao");

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
        Data.setText("Data dessecacao (00/00/0000)");

        Dose.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        Dose.setText("Dosagem");

        Cnpj.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        Cnpj.setText("CNPJ da loja forncedora");

        NomeVend.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        NomeVend.setText("Nome do vendedor");

        NomeLoja.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        NomeLoja.setText("Loja fornecedora");

        Cadastrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Cadastrar.setText("Cadastrar");
        Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarActionPerformed(evt);
            }
        });

        Consultar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Consultar.setText("Consultar Codigo");
        Consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarActionPerformed(evt);
            }
        });

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

        cxData.setToolTipText("");

        Limpar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Limpar.setText("Limpar");
        Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparActionPerformed(evt);
            }
        });

        Sair.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Sair.setText("Sair");
        Sair.setMaximumSize(new java.awt.Dimension(71, 25));
        Sair.setMinimumSize(new java.awt.Dimension(71, 25));
        Sair.setPreferredSize(new java.awt.Dimension(25, 25));
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(322, 322, 322))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(Cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94)
                        .addComponent(Consultar)
                        .addGap(95, 95, 95)
                        .addComponent(Alterar)
                        .addGap(92, 92, 92)
                        .addComponent(Excluir))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(399, 399, 399)
                        .addComponent(Limpar)
                        .addGap(63, 63, 63)
                        .addComponent(Sair, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(NomeLoja)
                            .addComponent(Dose)
                            .addComponent(Data)
                            .addComponent(Quantidade)
                            .addComponent(Especificacao)
                            .addComponent(Valor)
                            .addComponent(Nome)
                            .addComponent(Codigo)
                            .addComponent(Cnpj)
                            .addComponent(NomeVend))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cxNome, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cxCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cxValor, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cxQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cxEspecificacao, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cxData, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cxDose, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cxCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cxNomeVend, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cxNomeLoja, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(Produtos, javax.swing.GroupLayout.PREFERRED_SIZE, 910, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(Cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Codigo)
                    .addComponent(cxCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cxNome, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nome))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cxValor, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Valor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cxEspecificacao, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Especificacao))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cxQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Quantidade))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cxData, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Data))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cxDose, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Dose))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cxCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cnpj))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cxNomeVend, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NomeVend))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cxNomeLoja, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NomeLoja))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Consultar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(Produtos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Limpar)
                    .addComponent(Sair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparActionPerformed
        limpar();
    }//GEN-LAST:event_LimparActionPerformed

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        sair();
    }//GEN-LAST:event_SairActionPerformed

    private void CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarActionPerformed
        cadProdDessecacao();
        lista();
    }//GEN-LAST:event_CadastrarActionPerformed

    private void ConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarActionPerformed
        consProdDessecacao();
    }//GEN-LAST:event_ConsultarActionPerformed

    private void AlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlterarActionPerformed
        altProdDessecacao();
        lista();
    }//GEN-LAST:event_AlterarActionPerformed

    private void ProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProdutosActionPerformed
        selectProd1();
    }//GEN-LAST:event_ProdutosActionPerformed

    private void ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirActionPerformed
        excluir();
        lista();
    }//GEN-LAST:event_ExcluirActionPerformed

    public void lista(){
        Produtos.removeAllItems();
        Produtos.addItem("Escolha um Produto");
        
        for(ProdutoDessecacao p1 : BDProdDessecacao.getBDProdDessecacao().getBdProd1()){
            Produtos.addItem("Codigo: "+p1.getCodigo()+"   -   Nome: "+p1.getNome()+"   -   Especificacao: "+p1.getTipo()+"   -   Valor total da compra: "+p1.calcProduto()+" reais"+"   -   Data dessecacao: "+formato.format(p1.getDataDessecacao())+"   -   Custo por alqueire: "+p1.calcDose()+" reais"+"   -   Loja fornecedora: "+p1.getVendedor().getNomeLoja());
        }
    }
    
    public void selectProd1(){
        if(Produtos.getSelectedIndex()>=1){
            String valLin = Produtos.getSelectedItem().toString();
            JOptionPane.showMessageDialog(null, "Produto escolhido: \n\n"+valLin, "PRODUTO", 1);
        }
    }
    
    public void altProdDessecacao(){
        p1 = new ProdutoDessecacao();
        
        p1.setCodigo(cxCodigo.getText());
        
        p1 = BDProdDessecacao.getBDProdDessecacao().alteraProd1(p1);
        
        if(p1 != null){
            cxNome.setText(p1.getNome());
            cxValor.setText(Double.toString(p1.getValor()));
            cxEspecificacao.setText(p1.getTipo());
            cxQuantidade.setText(Double.toString(p1.getQuantidade()));
            cxData.setText(formato.format(p1.getDataDessecacao()));
            cxDose.setText(Double.toString(p1.getDose()));
            cxCnpj.setText(p1.getVendedor().getCnpj());
            cxNomeVend.setText(p1.getVendedor().getNomeVend());
            cxNomeLoja.setText(p1.getVendedor().getNomeLoja());
            
            JOptionPane.showMessageDialog(null, "Produto alterado com sucesso", "ALTERAR", JOptionPane.INFORMATION_MESSAGE);
            limpar();          
        }
        else{
            JOptionPane.showMessageDialog(null, "Produto nao cadastrado", "ERRO", JOptionPane.ERROR_MESSAGE );
            limpar();
        }   
    }
    
    public void consProdDessecacao(){
        p1 = new ProdutoDessecacao();
        
        p1.setCodigo(cxCodigo.getText());
        
        p1 = BDProdDessecacao.getBDProdDessecacao().consCod1(p1);
        
        if(p1 != null){
            cxNome.setText(p1.getNome());
            cxValor.setText(Double.toString(p1.getValor()));
            cxEspecificacao.setText(p1.getTipo());
            cxQuantidade.setText(Double.toString(p1.getQuantidade()));
            cxData.setText(formato.format(p1.getDataDessecacao()));
            cxDose.setText(Double.toString(p1.getDose()));
            cxCnpj.setText(p1.getVendedor().getCnpj());
            cxNomeVend.setText(p1.getVendedor().getNomeVend());
            cxNomeLoja.setText(p1.getVendedor().getNomeLoja());
            
            JOptionPane.showMessageDialog(null, "Produto cadastrado", "CONSULTAR", JOptionPane.INFORMATION_MESSAGE );
            limpar();          
        }
        else{
            JOptionPane.showMessageDialog(null, "Produto nao cadastrado", "ERRO", JOptionPane.ERROR_MESSAGE);
            limpar();
        }
    }
    
    public void cadProdDessecacao(){
        p1 = new ProdutoDessecacao();
        
        p1.setCodigo(cxCodigo.getText());
        p1.setNome(cxNome.getText());
        p1.setValor(Double.parseDouble(cxValor.getText().replaceAll("," , ".")));
        p1.setTipo(cxEspecificacao.getText());
        p1.setQuantidade(Double.parseDouble(cxQuantidade.getText().replaceAll("," , ".")));
        
        try{
            p1.setDataDessecacao(formato.parse(cxData.getText()));
        }
        catch(ParseException pe){
            JOptionPane.showMessageDialog(null, "Data invalida", "ERRO", JOptionPane.ERROR);
        }
        
        p1.setDose(Double.parseDouble(cxDose.getText().replaceAll("," , ".")));
        p1.getVendedor().setCnpj(cxCnpj.getText());
        p1.getVendedor().setNomeVend(cxNomeVend.getText());
        p1.getVendedor().setNomeLoja(cxNomeLoja.getText());
        
        p1 = BDProdDessecacao.getBDProdDessecacao().setBdProd1(p1);
        
        if(p1 != null){
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
        p1 = new ProdutoDessecacao();
        p1.setCodigo(cxCodigo.getText());
        
        p1 = BDProdDessecacao.getBDProdDessecacao().consCod1(p1);
        
        if(p1 != null){
            cxCodigo.setText(p1.getCodigo());
            int x = JOptionPane.showConfirmDialog(null, "Deseja excluir esse produto?", "EXCLUIR", JOptionPane.YES_NO_CANCEL_OPTION);
            if(x == 0){
                BDProdDessecacao.getBDProdDessecacao().deleteProd1(p1);
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
