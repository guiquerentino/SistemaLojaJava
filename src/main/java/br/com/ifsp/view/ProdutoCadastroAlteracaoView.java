package br.com.ifsp.view;

import br.com.ifsp.controller.ProdutoController;
import br.com.ifsp.fonts.FontManager;
import br.com.ifsp.model.Produto;
import br.com.ifsp.model.Validacao;

import java.awt.Font;
import javax.swing.JOptionPane;


public class ProdutoCadastroAlteracaoView extends javax.swing.JInternalFrame {

    public ProdutoCadastroAlteracaoView() {
        initComponents();
    }

    //CÓDIGO GERADOR DA INTERFACE
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpCabecalho = new javax.swing.JPanel();
        lbCabecalho = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cboCategoria = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCusto = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtValor = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescricao = new javax.swing.JTextArea();
        btnSair = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        lbPreencherAutomatico = new javax.swing.JLabel();

        setBackground(null);
        setBorder(null);
        setMaximumSize(new java.awt.Dimension(853, 514));
        setMinimumSize(new java.awt.Dimension(853, 514));
        setPreferredSize(new java.awt.Dimension(853, 514));
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jpCabecalho.setBackground(new java.awt.Color(17, 128, 216));
        jpCabecalho.setForeground(new java.awt.Color(255, 255, 255));
        jpCabecalho.setMaximumSize(new java.awt.Dimension(853, 29));
        jpCabecalho.setMinimumSize(new java.awt.Dimension(853, 29));
        jpCabecalho.setPreferredSize(new java.awt.Dimension(853, 29));

        lbCabecalho.setForeground(new java.awt.Color(255, 255, 255));
        lbCabecalho.setText("Cadastro de Produto");
        lbCabecalho.setMaximumSize(new java.awt.Dimension(853, 29));
        lbCabecalho.setMinimumSize(new java.awt.Dimension(853, 29));
        lbCabecalho.setPreferredSize(new java.awt.Dimension(853, 29));

        javax.swing.GroupLayout jpCabecalhoLayout = new javax.swing.GroupLayout(jpCabecalho);
        jpCabecalho.setLayout(jpCabecalhoLayout);
        jpCabecalhoLayout.setHorizontalGroup(
            jpCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCabecalhoLayout.createSequentialGroup()
                .addComponent(lbCabecalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpCabecalhoLayout.setVerticalGroup(
            jpCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbCabecalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nome");

        txtNome.setBackground(null);
        txtNome.setPreferredSize(new java.awt.Dimension(14, 22));

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Categoria");

        cboCategoria.setBackground(java.awt.Color.white);
        cboCategoria.setForeground(new java.awt.Color(0, 0, 0));
        cboCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Higiene", "Cosmeticos", "Utensílios", "Maquiagem", "Remédios" }));
        cboCategoria.setPreferredSize(new java.awt.Dimension(95, 22));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Quantidade");

        txtQuantidade.setBackground(null);
        txtQuantidade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtQuantidade.setMaximumSize(new java.awt.Dimension(2147483647, 22));
        txtQuantidade.setMinimumSize(new java.awt.Dimension(4, 22));
        txtQuantidade.setPreferredSize(new java.awt.Dimension(4, 22));

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Custo");

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("R$");

        txtCusto.setBackground(null);
        txtCusto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtCusto.setMaximumSize(new java.awt.Dimension(2147483647, 22));
        txtCusto.setMinimumSize(new java.awt.Dimension(4, 22));
        txtCusto.setPreferredSize(new java.awt.Dimension(4, 22));

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Valor");

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("R$");

        txtValor.setBackground(null);
        txtValor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtValor.setMaximumSize(new java.awt.Dimension(2147483647, 22));
        txtValor.setMinimumSize(new java.awt.Dimension(4, 22));
        txtValor.setPreferredSize(new java.awt.Dimension(4, 22));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Descrição");

        txtDescricao.setBackground(java.awt.Color.white);
        txtDescricao.setColumns(20);
        txtDescricao.setRows(5);
        jScrollPane1.setViewportView(txtDescricao);

        btnSair.setBackground(new java.awt.Color(102, 102, 102));
        btnSair.setForeground(new java.awt.Color(255, 255, 255));
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnSalvar.setBackground(new java.awt.Color(0, 102, 51));
        btnSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvar.setText("OK");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        lbPreencherAutomatico.setBackground(new java.awt.Color(255, 255, 255));
        lbPreencherAutomatico.setForeground(new java.awt.Color(255, 255, 255));
        lbPreencherAutomatico.setText("Preencher");
        lbPreencherAutomatico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbPreencherAutomaticoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jpCabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(cboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(txtCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbPreencherAutomatico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpCabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8)
                                .addComponent(jLabel7)
                                .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtCusto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSalvar)
                        .addComponent(btnSair))
                    .addComponent(lbPreencherAutomatico, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
  

    private Produto produto = null;
    
    private boolean modoEdicao = false;
    
    private Integer idProduto;
    
    private String cabecario;
    
     public Produto getProduto() {
        return produto;
    }
    
    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
    public boolean isModoEdicao() {
        return modoEdicao;
    }
    
    public void setModoEdicao(boolean modoEdicao) {
        this.modoEdicao = modoEdicao;
    }

    public Integer getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }

    public String getCabecario() {
        return cabecario;
    }

    public void setCabecario(String cabecario) {
        this.cabecario = cabecario;
    }
    
    public void limparFormulario(){
        txtNome.setText("");
        cboCategoria.setSelectedIndex(0); 
        txtQuantidade.setText("");
        txtCusto.setText("");
        txtValor.setText("");
        txtDescricao.setText("");
    }
    
    public void carregarDadosTela(){
  
        if (modoEdicao && produto != null) 
        {
            txtNome.setText(produto.getNome());
            
         
            for (int i = 0; i < cboCategoria.getItemCount(); i++) 
            {
                if (cboCategoria.getItemAt(i).equals(produto.getCategoria())) 
                {
                    cboCategoria.setSelectedIndex(i);
                    break;
                }
            }
       
            txtQuantidade.setValue(produto.getQuantidade());
            txtCusto.setValue(produto.getCusto());
            txtValor.setValue(produto.getValor());
            
            txtDescricao.setText(produto.getDescricao());
        }
    }

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        
   
        String produtoPreenchido = Validacao.ProdutoCamposVazios(txtNome.getText(),
            txtQuantidade.getText(), txtCusto.getText(), txtValor.getText());
        
       
        if (produtoPreenchido.equalsIgnoreCase("") || produtoPreenchido == "")
        {
            
         
            String produtoTamanhoOK = Validacao.ProdutoCamposTamanho(txtNome.getText(),
            txtQuantidade.getText(), txtCusto.getText(), txtValor.getText());
            
         
            if (produtoTamanhoOK.equalsIgnoreCase("") || produtoTamanhoOK == "")
            {
            
                String respostaController = null;

               
                if (!modoEdicao){
               
                    produto = new Produto();
                }

            
                produto.setNome(txtNome.getText());
                produto.setCategoria(cboCategoria.getSelectedItem().toString());
                produto.setQuantidade(Integer.parseInt(txtQuantidade.getText()));
                produto.setCusto(Float.parseFloat(txtCusto.getText().replaceAll(",", ".")));
                produto.setValor(Float.parseFloat(txtValor.getText().replaceAll(",", ".")));
                produto.setDescricao(txtDescricao.getText());

                if (!modoEdicao)
                {
              
                    respostaController = ProdutoController.salvar(produto);
                }
                else
                {
                    respostaController = ProdutoController.atualizar(produto);
                }

          
                if (respostaController == null)//se a resposta for positiva
                {
                    if (!modoEdicao)
                    {
                        JOptionPane.showMessageDialog(rootPane,
                            "Produto cadastrado com sucesso!",
                            "Confirmação",
                            JOptionPane.INFORMATION_MESSAGE);
                    } 
                    else
                    {
                        JOptionPane.showMessageDialog(rootPane,
                            "Produto atualizado com sucesso!",
                            "Confirmação",
                            JOptionPane.INFORMATION_MESSAGE);    
                        this.dispose();
                    }
                  
                    limparFormulario();
                }
                else
                {
                   
                    JOptionPane.showMessageDialog(rootPane, 
                            respostaController
                                +"\n Procure o administrador do sistema!",
                            "Erro", 
                            JOptionPane.ERROR_MESSAGE);
                }
            }
            else
            {
                JOptionPane.showMessageDialog(rootPane, 
                    "Os campos abaixo ultrapassaram os limites de caracteres:" 
                            + produtoTamanhoOK + 
                            "\nPreencha os campo corretamente e tente novamente!",
                    "Erro", JOptionPane.INFORMATION_MESSAGE);
            }
            
        }
        else
        {
            JOptionPane.showMessageDialog(this,"O(s) campo(s) abaixo:\n"+produtoPreenchido+
                "Não foram preenchidos, preencha-os e tente novamente!");
        }
    }//GEN-LAST:event_btnSalvarActionPerformed
    

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed
    

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
      
        lbCabecalho.setText(cabecario);
        
        
        FontManager fontManager = new FontManager();
        Font futuraPT20Bold = fontManager.carregarFont("/fontes/FuturaPT.otf", Font.BOLD, 20);
        lbCabecalho.setFont(futuraPT20Bold);
    }//GEN-LAST:event_formInternalFrameOpened
    
    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
    
        lbCabecalho.setText(cabecario);
    }//GEN-LAST:event_formComponentShown

 
    private void lbPreencherAutomaticoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbPreencherAutomaticoMouseClicked
        txtNome.setText("Shampoo");
        cboCategoria.setSelectedIndex(1);
        txtQuantidade.setValue(20);
        txtCusto.setValue(19);
        txtValor.setValue(24.50);
        txtDescricao.setText("Lote com data de validade para 07/08/2021");
        
    }//GEN-LAST:event_lbPreencherAutomaticoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cboCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpCabecalho;
    private javax.swing.JLabel lbCabecalho;
    private javax.swing.JLabel lbPreencherAutomatico;
    private javax.swing.JFormattedTextField txtCusto;
    private javax.swing.JTextArea txtDescricao;
    private javax.swing.JTextField txtNome;
    private javax.swing.JFormattedTextField txtQuantidade;
    private javax.swing.JFormattedTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
