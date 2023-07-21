//Jhennifer Ap. Candido de Andrade

import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame{

    public Principal(){
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Principal = new javax.swing.JLabel();
        Subtitulo = new javax.swing.JLabel();
        MenuProdutos = new javax.swing.JMenuBar();
        Menu = new javax.swing.JMenu();
        ProdDessecacao = new javax.swing.JMenuItem();
        ProdPlantio = new javax.swing.JMenuItem();
        ProdPulverizacao = new javax.swing.JMenuItem();
        ProdCobertura = new javax.swing.JMenuItem();
        Sair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Principal.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        Principal.setText("A.Agro");

        Subtitulo.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        Subtitulo.setText("A maneira mais fácil de gerenciar sua plantação");

        Menu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Menu.setText("Produtos");
        Menu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Menu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        ProdDessecacao.setText("Produto Dessecacao");
        ProdDessecacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProdDessecacaoActionPerformed(evt);
            }
        });
        Menu.add(ProdDessecacao);

        ProdPlantio.setText("Produto Plantio");
        ProdPlantio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProdPlantioActionPerformed(evt);
            }
        });
        Menu.add(ProdPlantio);

        ProdPulverizacao.setText("Produto Pulverizacao");
        ProdPulverizacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProdPulverizacaoActionPerformed(evt);
            }
        });
        Menu.add(ProdPulverizacao);

        ProdCobertura.setText("Produto Cobertura");
        ProdCobertura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProdCoberturaActionPerformed(evt);
            }
        });
        Menu.add(ProdCobertura);

        Sair.setText("Sair");
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });
        Menu.add(Sair);

        MenuProdutos.add(Menu);

        setJMenuBar(MenuProdutos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(Principal))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(Subtitulo)))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(Principal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Subtitulo)
                .addContainerGap(179, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ProdDessecacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProdDessecacaoActionPerformed
        abreCadProdDessecacao();
    }//GEN-LAST:event_ProdDessecacaoActionPerformed

    private void ProdPlantioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProdPlantioActionPerformed
        abreCadProdPlantio();
    }//GEN-LAST:event_ProdPlantioActionPerformed

    private void ProdPulverizacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProdPulverizacaoActionPerformed
        abreCadProdPulverizacao();
    }//GEN-LAST:event_ProdPulverizacaoActionPerformed

    private void ProdCoberturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProdCoberturaActionPerformed
        abreCadCobertura();
    }//GEN-LAST:event_ProdCoberturaActionPerformed

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        sair();
    }//GEN-LAST:event_SairActionPerformed

    
    public void abreCadProdDessecacao(){
        CadProdDessecacao.getCadProdDessecacao().setVisible(true);
    }
    
    public void abreCadProdPlantio(){
        CadProdPlantio.getCadProdPlantio().setVisible(true);
    }
    
    public void abreCadProdPulverizacao(){
        CadProdPulverizacao.getCadProdPulverizacao().setVisible(true);
    }
    
    public void abreCadCobertura(){
        CadCobertura.getCadCobertura().setVisible(true);
    }
    
    public void sair(){
        int respSair = JOptionPane.showConfirmDialog(null, "Deseja sair?", "SAIR", 0);
        
        if(respSair == 0){
            dispose();
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Menu;
    private javax.swing.JMenuBar MenuProdutos;
    private javax.swing.JLabel Principal;
    private javax.swing.JMenuItem ProdCobertura;
    private javax.swing.JMenuItem ProdDessecacao;
    private javax.swing.JMenuItem ProdPlantio;
    private javax.swing.JMenuItem ProdPulverizacao;
    private javax.swing.JMenuItem Sair;
    private javax.swing.JLabel Subtitulo;
    // End of variables declaration//GEN-END:variables
}
