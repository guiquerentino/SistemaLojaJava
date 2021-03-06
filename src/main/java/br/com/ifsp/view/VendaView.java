package br.com.ifsp.view;

import br.com.ifsp.controller.ClienteController;
import br.com.ifsp.controller.ItensVendaController;
import br.com.ifsp.controller.ProdutoController;
import br.com.ifsp.controller.VendaController;
import br.com.ifsp.fonts.FontManager;
import br.com.ifsp.model.Cliente;
import br.com.ifsp.model.ItemVenda;
import br.com.ifsp.model.Produto;
import br.com.ifsp.model.Validacao;
import br.com.ifsp.model.Venda;

import java.awt.Color;
import java.awt.Font;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

public class VendaView extends javax.swing.JInternalFrame {
    public VendaView() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpCabecalho = new javax.swing.JPanel();
        lbCabecalho = new javax.swing.JLabel();
        lbVendaLogo = new javax.swing.JLabel();
        lbSairVenda = new javax.swing.JLabel();
        lbProdutoNome = new javax.swing.JLabel();
        txtProdutoNome = new javax.swing.JTextField();
        lbProdutoQuantidade = new javax.swing.JLabel();
        jsProdutoQuantidade = new javax.swing.JSpinner();
        lbProdutoValorUnitario = new javax.swing.JLabel();
        txtProdutoValorUnitario = new javax.swing.JTextField();
        lbProdutoValorTotal = new javax.swing.JLabel();
        txtProdutoValorTotal = new javax.swing.JTextField();
        lbVendaClienteCpf = new javax.swing.JLabel();
        txtCpf = new javax.swing.JFormattedTextField();
        btAdicionarItem = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaVenda = new javax.swing.JTable();
        jpDadosCliente = new javax.swing.JPanel();
        txtClienteNomeInfo = new javax.swing.JTextField();
        txtClienteCpfInfo = new javax.swing.JTextField();
        txtClienteCidadeInfo = new javax.swing.JTextField();
        txtClienteLogradouroInfo = new javax.swing.JTextField();
        txtClienteNumeroInfo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cbDinheiro = new javax.swing.JCheckBox();
        txtPagamentoDinheiro = new javax.swing.JFormattedTextField();
        cbCart??o = new javax.swing.JCheckBox();
        txtPagamentoCartao = new javax.swing.JFormattedTextField();
        jpSubtotal = new javax.swing.JPanel();
        lbSubtotal = new javax.swing.JLabel();
        txtSubtotal = new javax.swing.JTextField();
        btRegistrarVenda = new javax.swing.JButton();
        btRemoverItem = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setMaximumSize(new java.awt.Dimension(853, 514));
        setMinimumSize(new java.awt.Dimension(853, 514));
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
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

        lbCabecalho.setBackground(new java.awt.Color(17, 128, 216));
        lbCabecalho.setForeground(new java.awt.Color(255, 255, 255));
        lbCabecalho.setText("Venda n?? 320");
        lbCabecalho.setMaximumSize(new java.awt.Dimension(853, 29));
        lbCabecalho.setMinimumSize(new java.awt.Dimension(853, 29));
        lbCabecalho.setPreferredSize(new java.awt.Dimension(853, 29));

        lbVendaLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/venda.png"))); // NOI18N

        lbSairVenda.setForeground(new java.awt.Color(255, 255, 255));
        lbSairVenda.setText("Sair");
        lbSairVenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbSairVendaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpCabecalhoLayout = new javax.swing.GroupLayout(jpCabecalho);
        jpCabecalho.setLayout(jpCabecalhoLayout);
        jpCabecalhoLayout.setHorizontalGroup(
            jpCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCabecalhoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbVendaLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbCabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(lbSairVenda)
                .addContainerGap())
        );
        jpCabecalhoLayout.setVerticalGroup(
            jpCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lbCabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(lbSairVenda))
            .addComponent(lbVendaLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        lbProdutoNome.setText("Produto");

        txtProdutoNome.setEditable(false);
        txtProdutoNome.setText("Clique aqui para pesquisar o produto...");
        txtProdutoNome.setMinimumSize(new java.awt.Dimension(14, 25));
        txtProdutoNome.setPreferredSize(new java.awt.Dimension(14, 25));
        txtProdutoNome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtProdutoNomeMouseClicked(evt);
            }
        });

        lbProdutoQuantidade.setText("Quantidade");

        jsProdutoQuantidade.setMinimumSize(new java.awt.Dimension(14, 25));
        jsProdutoQuantidade.setPreferredSize(new java.awt.Dimension(14, 25));
        jsProdutoQuantidade.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jsProdutoQuantidadeStateChanged(evt);
            }
        });
        jsProdutoQuantidade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jsProdutoQuantidadeFocusLost(evt);
            }
        });

        lbProdutoValorUnitario.setText("Valor unitario");

        txtProdutoValorUnitario.setEditable(false);
        txtProdutoValorUnitario.setText("0");
        txtProdutoValorUnitario.setMinimumSize(new java.awt.Dimension(14, 25));
        txtProdutoValorUnitario.setPreferredSize(new java.awt.Dimension(14, 25));

        lbProdutoValorTotal.setText("Valor Total");

        txtProdutoValorTotal.setEditable(false);
        txtProdutoValorTotal.setText("0");
        txtProdutoValorTotal.setMinimumSize(new java.awt.Dimension(14, 25));
        txtProdutoValorTotal.setPreferredSize(new java.awt.Dimension(14, 25));

        lbVendaClienteCpf.setText("CPF Cliente");

        txtCpf.setBackground(java.awt.Color.white);
        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpf.setMaximumSize(new java.awt.Dimension(2147483647, 26));
        txtCpf.setMinimumSize(new java.awt.Dimension(4, 26));
        txtCpf.setPreferredSize(new java.awt.Dimension(47, 26));
        txtCpf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCpfFocusLost(evt);
            }
        });

        btAdicionarItem.setBackground(new java.awt.Color(17, 128, 216));
        btAdicionarItem.setForeground(new java.awt.Color(255, 255, 255));
        btAdicionarItem.setText("Adicionar Item");
        btAdicionarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarItemActionPerformed(evt);
            }
        });

        tabelaVenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id do Item", "id do Produto", "Nome", "Quantidade", "Valor unit??rio", "Valor total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaVenda.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabelaVenda);
        if (tabelaVenda.getColumnModel().getColumnCount() > 0) {
            tabelaVenda.getColumnModel().getColumn(0).setResizable(false);
            tabelaVenda.getColumnModel().getColumn(0).setPreferredWidth(3);
            tabelaVenda.getColumnModel().getColumn(1).setResizable(false);
            tabelaVenda.getColumnModel().getColumn(1).setPreferredWidth(3);
            tabelaVenda.getColumnModel().getColumn(2).setResizable(false);
            tabelaVenda.getColumnModel().getColumn(3).setResizable(false);
            tabelaVenda.getColumnModel().getColumn(3).setPreferredWidth(3);
            tabelaVenda.getColumnModel().getColumn(4).setResizable(false);
            tabelaVenda.getColumnModel().getColumn(4).setPreferredWidth(6);
            tabelaVenda.getColumnModel().getColumn(5).setResizable(false);
            tabelaVenda.getColumnModel().getColumn(5).setPreferredWidth(6);
        }

        jpDadosCliente.setBackground(new java.awt.Color(204, 204, 204));
        jpDadosCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jpDadosCliente.setMaximumSize(new java.awt.Dimension(182, 134));
        jpDadosCliente.setMinimumSize(new java.awt.Dimension(182, 134));

        txtClienteNomeInfo.setEditable(false);
        txtClienteNomeInfo.setMaximumSize(new java.awt.Dimension(172, 15));
        txtClienteNomeInfo.setMinimumSize(new java.awt.Dimension(172, 15));
        txtClienteNomeInfo.setPreferredSize(new java.awt.Dimension(172, 15));

        txtClienteCpfInfo.setEditable(false);
        txtClienteCpfInfo.setMaximumSize(new java.awt.Dimension(172, 15));
        txtClienteCpfInfo.setMinimumSize(new java.awt.Dimension(172, 15));
        txtClienteCpfInfo.setPreferredSize(new java.awt.Dimension(172, 15));

        txtClienteCidadeInfo.setEditable(false);
        txtClienteCidadeInfo.setMaximumSize(new java.awt.Dimension(172, 15));
        txtClienteCidadeInfo.setMinimumSize(new java.awt.Dimension(172, 15));
        txtClienteCidadeInfo.setPreferredSize(new java.awt.Dimension(172, 15));

        txtClienteLogradouroInfo.setEditable(false);
        txtClienteLogradouroInfo.setMaximumSize(new java.awt.Dimension(172, 15));
        txtClienteLogradouroInfo.setMinimumSize(new java.awt.Dimension(172, 15));
        txtClienteLogradouroInfo.setPreferredSize(new java.awt.Dimension(172, 15));

        txtClienteNumeroInfo.setEditable(false);
        txtClienteNumeroInfo.setMaximumSize(new java.awt.Dimension(172, 15));
        txtClienteNumeroInfo.setMinimumSize(new java.awt.Dimension(172, 15));
        txtClienteNumeroInfo.setPreferredSize(new java.awt.Dimension(172, 15));

        javax.swing.GroupLayout jpDadosClienteLayout = new javax.swing.GroupLayout(jpDadosCliente);
        jpDadosCliente.setLayout(jpDadosClienteLayout);
        jpDadosClienteLayout.setHorizontalGroup(
            jpDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtClienteNomeInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpDadosClienteLayout.createSequentialGroup()
                .addGroup(jpDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtClienteCpfInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtClienteCidadeInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtClienteLogradouroInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtClienteNumeroInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jpDadosClienteLayout.setVerticalGroup(
            jpDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpDadosClienteLayout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(txtClienteNomeInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtClienteCpfInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtClienteCidadeInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtClienteLogradouroInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtClienteNumeroInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Pagamento em:");

        cbDinheiro.setBackground(new java.awt.Color(255, 255, 255));
        cbDinheiro.setForeground(new java.awt.Color(51, 51, 51));
        cbDinheiro.setText("Dinheiro");
        cbDinheiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDinheiroActionPerformed(evt);
            }
        });

        txtPagamentoDinheiro.setEditable(false);
        txtPagamentoDinheiro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtPagamentoDinheiro.setText("0");
        txtPagamentoDinheiro.setMaximumSize(new java.awt.Dimension(101, 24));
        txtPagamentoDinheiro.setMinimumSize(new java.awt.Dimension(101, 24));
        txtPagamentoDinheiro.setPreferredSize(new java.awt.Dimension(101, 24));
        txtPagamentoDinheiro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPagamentoDinheiroFocusLost(evt);
            }
        });

        cbCart??o.setBackground(new java.awt.Color(255, 255, 255));
        cbCart??o.setForeground(new java.awt.Color(51, 51, 51));
        cbCart??o.setText("Cart??o");
        cbCart??o.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCart??oActionPerformed(evt);
            }
        });

        txtPagamentoCartao.setEditable(false);
        txtPagamentoCartao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtPagamentoCartao.setText("0");
        txtPagamentoCartao.setMaximumSize(new java.awt.Dimension(101, 24));
        txtPagamentoCartao.setMinimumSize(new java.awt.Dimension(101, 24));
        txtPagamentoCartao.setPreferredSize(new java.awt.Dimension(101, 24));
        txtPagamentoCartao.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPagamentoCartaoFocusLost(evt);
            }
        });

        jpSubtotal.setBackground(new java.awt.Color(153, 153, 153));

        lbSubtotal.setForeground(new java.awt.Color(0, 0, 0));
        lbSubtotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbSubtotal.setText("SUBTOTAL DA COMPRA");

        txtSubtotal.setEditable(false);
        txtSubtotal.setBackground(new java.awt.Color(153, 153, 153));
        txtSubtotal.setForeground(new java.awt.Color(0, 0, 0));
        txtSubtotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSubtotal.setText("0");
        txtSubtotal.setBorder(null);

        javax.swing.GroupLayout jpSubtotalLayout = new javax.swing.GroupLayout(jpSubtotal);
        jpSubtotal.setLayout(jpSubtotalLayout);
        jpSubtotalLayout.setHorizontalGroup(
            jpSubtotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpSubtotalLayout.createSequentialGroup()
                .addComponent(lbSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtSubtotal, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE))
        );
        jpSubtotalLayout.setVerticalGroup(
            jpSubtotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbSubtotal, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
            .addComponent(txtSubtotal)
        );

        btRegistrarVenda.setBackground(new java.awt.Color(0, 102, 51));
        btRegistrarVenda.setForeground(new java.awt.Color(255, 255, 255));
        btRegistrarVenda.setText("Registrar Venda");
        btRegistrarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRegistrarVendaActionPerformed(evt);
            }
        });

        btRemoverItem.setBackground(new java.awt.Color(153, 0, 0));
        btRemoverItem.setForeground(new java.awt.Color(255, 255, 255));
        btRemoverItem.setText("Remover Item");
        btRemoverItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverItemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpCabecalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbProdutoNome)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtProdutoNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jsProdutoQuantidade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbProdutoQuantidade, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtProdutoValorUnitario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbProdutoValorUnitario, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbProdutoValorTotal)
                            .addComponent(txtProdutoValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbVendaClienteCpf)))
                    .addComponent(jpSubtotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btAdicionarItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btRegistrarVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpDadosCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btRemoverItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbDinheiro)
                                    .addComponent(cbCart??o))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPagamentoDinheiro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtPagamentoCartao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpCabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbProdutoValorUnitario)
                        .addComponent(lbProdutoQuantidade)
                        .addComponent(lbProdutoValorTotal))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lbProdutoNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtProdutoValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jsProdutoQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtProdutoValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtProdutoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbVendaClienteCpf)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btAdicionarItem, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btRemoverItem, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jpDadosCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbDinheiro)
                            .addComponent(txtPagamentoDinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbCart??o)
                            .addComponent(txtPagamentoCartao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btRegistrarVenda, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                    .addComponent(jpSubtotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private VendaConsultaProdutoView consultaProduto;
public MenuView menuView;  
private DefaultTableModel tableModel;
private Produto produto;
private Venda venda;
    public void alteraQuantidade(){
    
        Produto produtoTela = new Produto();
        produtoTela.setNome(txtProdutoNome.getText());
        produtoTela.setQuantidade((Integer) jsProdutoQuantidade.getValue());
        produtoTela.setValor(Float.parseFloat(txtProdutoValorUnitario.getText()));
        Float valorTotal = 0f;
        
        if (produtoTela.getQuantidade()<1 || produtoTela.getQuantidade() >999){
            jsProdutoQuantidade.setValue(1);
            produtoTela.setQuantidade(1);
        }
        
        valorTotal = produtoTela.getQuantidade()*produtoTela.getValor();
        txtProdutoValorTotal.setText(valorTotal.toString());
    }
    
    public boolean verificaEstoque(){
        Produto produtoTela = new Produto();
        produtoTela.setNome(txtProdutoNome.getText());
        produtoTela.setQuantidade((Integer) jsProdutoQuantidade.getValue());
        produtoTela.setValor(Float.parseFloat(txtProdutoValorUnitario.getText()));
        
        Integer quantidadeNaLista = 0;
        
        for(int i = 0; i+1 <=tabelaVenda.getModel().getRowCount(); i++){
            
            if(produto != null){
                if(produto.getId() == (Integer) tabelaVenda.getValueAt(i, 1)){
                    quantidadeNaLista += (Integer) tabelaVenda.getValueAt(i, 3);
                }
            }
        }
        
        if(produto != null && produto.getId() != null){
            if(produto.getQuantidade()<(produtoTela.getQuantidade()+quantidadeNaLista)){
                return false;
            }
        }
        return true;
    }
    
    public void atualizaSubtotal(){
        Float subtotal =0f;
       
        for(int i = 1; i <=tableModel.getRowCount(); i++){
            subtotal += (Float) tabelaVenda.getValueAt(i-1, 5);   
        }
        
        txtSubtotal.setText(subtotal.toString());
    }
    
    public void atualizaIndiceVenda(){
        Venda venda = new Venda();
        
        venda = VendaController.obterUltima();
        Integer ultimaVenda = venda.getId();
        
        if(ultimaVenda == null){
            lbCabecalho.setText("Venda n?? 1");
        }
        else{
            ultimaVenda += 1;
            lbCabecalho.setText("Venda n?? "+ultimaVenda);
        }
    }
    
    public void limpaTelaVenda(){
        txtProdutoNome.setText("Clique aqui para pesquisar o produto...");
        jsProdutoQuantidade.setValue(0);
        txtProdutoValorUnitario.setText("0");
        txtProdutoValorTotal.setText("0");
        
        txtCpf.setText("");
        txtClienteNomeInfo.setText("");
        txtClienteCpfInfo.setText("");
        txtClienteCidadeInfo.setText("");
        txtClienteLogradouroInfo.setText("");
        txtClienteNumeroInfo.setText("");
        
        cbDinheiro.setSelected(false);
        cbCart??o.setSelected(false);
        txtPagamentoDinheiro.setValue(0);
        txtPagamentoCartao.setValue(0);
        txtPagamentoDinheiro.setEditable(false);
        txtPagamentoCartao.setEditable(false);
        txtSubtotal.setText("0");
                
        tableModel = (DefaultTableModel) tabelaVenda.getModel();
        
        tableModel.setRowCount(0);
        
    
        consultaProduto.setProduto(null);
    }
    
    public boolean verificaValorCartao(){
        Float subtotal = Float.parseFloat(txtSubtotal.getText().replaceAll(",", "."));
        Float valorCartao = Float.parseFloat(txtPagamentoCartao.getText().replaceAll(",", "."));
        if (valorCartao>subtotal){
            return false;
        }
        return true;
    }
    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        tabelaVenda.getTableHeader().setBackground(new Color(017, 128, 216));
        tabelaVenda.getTableHeader().setForeground(Color.white);
        
        tabelaVenda.setForeground(Color.black);
        
        FontManager fontManager = new FontManager();
        Font futuraPT20Bold = fontManager.carregarFont("/fontes/FuturaPT.otf", Font.BOLD, 20);
        lbCabecalho.setFont(futuraPT20Bold);
        lbSubtotal.setFont(futuraPT20Bold);
        txtSubtotal.setFont(futuraPT20Bold);
        
        jsProdutoQuantidade.setValue(1);
        
        atualizaIndiceVenda();
    }//GEN-LAST:event_formInternalFrameOpened
    
    private void txtProdutoNomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtProdutoNomeMouseClicked
                
        if(consultaProduto == null )
        {   
            consultaProduto = new VendaConsultaProdutoView();
            
            consultaProduto.setLocation(170, 100);
        }
        
        if(!consultaProduto.isVisible())
        {    
            menuView.getDskPainelPrincipal().add(consultaProduto);//ESTAAAAA DANDO ERRRRROOOOOOO VER COM PROFESSOR
            consultaProduto.setVisible(true);
        }
        
        consultaProduto.toFront();
        
        ((BasicInternalFrameUI)consultaProduto.getUI()).setNorthPane(null);        
    }//GEN-LAST:event_txtProdutoNomeMouseClicked
       
    private void lbSairVendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbSairVendaMouseClicked
        this.dispose();
        
        limpaTelaVenda();
    }//GEN-LAST:event_lbSairVendaMouseClicked
    
    private void txtCpfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCpfFocusLost
        
        Cliente cliente = ClienteController.obter2(txtCpf.getText());

        if(cliente != null)
        {
            txtClienteNomeInfo.setText(cliente.getNome());
            txtClienteCpfInfo.setText(cliente.getCpf());
            txtClienteCidadeInfo.setText(cliente.getCidade());
            txtClienteLogradouroInfo.setText(cliente.getLogradouro());
            txtClienteNumeroInfo.setText(cliente.getNumero());
            
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, 
                "O Cliente n??o foi encontrado! \n\n"
                        + "Para cadastrar o Cliente v?? para Menu > Cadastrar Cliente.",
                "N??o encontrado", 
                JOptionPane.INFORMATION_MESSAGE);
            
            txtClienteNomeInfo.setText("");
            txtClienteCpfInfo.setText("");
            txtClienteCidadeInfo.setText("");
            txtClienteLogradouroInfo.setText("");
            txtClienteNumeroInfo.setText("");
        }
        
    }//GEN-LAST:event_txtCpfFocusLost
    
    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        produto = new Produto();
        
        try{
        
            produto.setId(consultaProduto.getProduto().getId());
            produto.setNome(consultaProduto.getProduto().getNome());
            produto.setQuantidade(consultaProduto.getProduto().getQuantidade());
            produto.setValor(consultaProduto.getProduto().getValor());

            txtProdutoNome.setText(produto.getNome());
            txtProdutoValorUnitario.setText(produto.getValor().toString());
            jsProdutoQuantidade.setValue(1);
            alteraQuantidade();
            
        }
        catch(Exception e){
            
        }
    }//GEN-LAST:event_formInternalFrameActivated
    
    private void jsProdutoQuantidadeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jsProdutoQuantidadeStateChanged
       alteraQuantidade();
    }//GEN-LAST:event_jsProdutoQuantidadeStateChanged
    
    private void jsProdutoQuantidadeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jsProdutoQuantidadeFocusLost
        alteraQuantidade();
    }//GEN-LAST:event_jsProdutoQuantidadeFocusLost
    
    private void btAdicionarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarItemActionPerformed
        tableModel = (DefaultTableModel) tabelaVenda.getModel();
        if (verificaEstoque()){
            
            if (!txtProdutoNome.getText().equalsIgnoreCase("Clique aqui para pesquisar o produto...")) 
            {
                Integer idItem;

                Integer ultimaLinha = tabelaVenda.getModel().getRowCount();
                if(ultimaLinha < 1){
                    idItem = 1;
                }
                else{
                    idItem = (Integer) tabelaVenda.getValueAt(ultimaLinha-1, 0);
                    idItem +=1;
                }

                Object[] dadosTabela = new Object[6];
                dadosTabela[0] = idItem;
                dadosTabela[1] = produto.getId();
                dadosTabela[2] = produto.getNome();
                dadosTabela[3] = (Integer) jsProdutoQuantidade.getValue();
                dadosTabela[4] = produto.getValor();
                dadosTabela[5] = Float.parseFloat(txtProdutoValorTotal.getText());

                tableModel.addRow(dadosTabela);

                atualizaSubtotal();
            }
        }else{
        
            JOptionPane.showMessageDialog(rootPane, 
                "Usu??rio, a quantidade de produtos solicitadas n??o existem em estoque! \n"
                        + "A quantidade deste produto em estoque ?? "+produto.getQuantidade()+".",
                "Aten????o", 
                JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btAdicionarItemActionPerformed
    

    private void btRemoverItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverItemActionPerformed
        try{
            int row = tabelaVenda.getSelectedRow();

            tableModel.removeRow(row);
            
            atualizaSubtotal();
        }
        catch(Exception e){}
        
    }//GEN-LAST:event_btRemoverItemActionPerformed
    
    private void btRegistrarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRegistrarVendaActionPerformed
        venda = new Venda();
        Float valorTotal = 0f;
        Float valorFaltante = 0f;
        Float troco = 0f;
        Integer vendaIndex = Integer.parseInt(lbCabecalho.getText().replaceAll("Venda n?? ", ""));
        String respostaController = null;
        String respostaController2 = null;
        String respostaController3 = null;

        
        if(tabelaVenda.getModel().getRowCount()<1){
            JOptionPane.showMessageDialog(rootPane,
                "Voc?? precisa adicionar itens no carrinho!",
                "Atenc??o",
                JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if(!cbCart??o.isSelected() && !cbDinheiro.isSelected()){
           JOptionPane.showMessageDialog(rootPane,
                 "Voc?? deve selecionar uma forma de pagamento!",
                 "Aten????o",
                 JOptionPane.ERROR_MESSAGE);
             return;
        }
        
        if(!Validacao.vendaCliente(txtClienteNomeInfo.getText(), txtClienteCpfInfo.getText(),
                txtClienteCidadeInfo.getText(), txtClienteLogradouroInfo.getText(), 
                txtClienteNumeroInfo.getText())){
            
            int respostaConfirmacao = JOptionPane.showConfirmDialog(
                    rootPane,
                    "N??o existe cliente na venda.\n\n"
                            + "Deseja continuar?",
                    "Confirma????o", 
                    JOptionPane.YES_NO_OPTION);

            if (respostaConfirmacao == JOptionPane.NO_OPTION) 
            {
                return;
            }
        }
        
        if(!verificaValorCartao()){
            JOptionPane.showMessageDialog(rootPane,
                "O Valor de pagamento em cart??o n??o pode ser maior que o subtotal da venda!",
                "Atenc??o",
                JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        venda.setId(Integer.parseInt(lbCabecalho.getText().replaceAll("Venda n?? ", "")));
        java.util.Date data = new Date();
        venda.setData(data);
        venda.setSubtotal(Float.parseFloat(txtSubtotal.getText()));
        venda.setPagamentoDinheiro(Float.parseFloat(txtPagamentoDinheiro.getText().replaceAll(",", ".")));
        venda.setPagamentoCartao(Float.parseFloat(txtPagamentoCartao.getText().replaceAll(",", ".")));
        
        for(int i = 0; i+1 <=tabelaVenda.getModel().getRowCount(); i++){
            ItemVenda itemVenda = new ItemVenda();
            itemVenda.setIdVenda(venda.getId());
            itemVenda.setIdItem((Integer) tabelaVenda.getValueAt(i, 0));
            itemVenda.setId((Integer) tabelaVenda.getValueAt(i, 1));
            itemVenda.setNome((String) tabelaVenda.getValueAt(i, 2)); 
            itemVenda.setQuantidade((Integer) tabelaVenda.getValueAt(i, 3));
            itemVenda.setValor((Float) tabelaVenda.getValueAt(i, 4));
            itemVenda.setValorTotal(itemVenda.getQuantidade()*itemVenda.getValor());
            
            venda.adicionarItem(itemVenda);
        }
        
        venda.getCliente().setNome(txtClienteNomeInfo.getText());
        venda.getCliente().setCpf(txtClienteCpfInfo.getText());
        venda.getCliente().setCidade(txtClienteCidadeInfo.getText());
        venda.getCliente().setLogradouro(txtClienteLogradouroInfo.getText());
        venda.getCliente().setNumero(txtClienteNumeroInfo.getText());
       
        if(venda.getPagamentoCartao()+venda.getPagamentoDinheiro() >= venda.getSubtotal()){

            respostaController = VendaController.salvar(venda);
            
            if (respostaController == null)
            {
                for(int i = 0; i < venda.getItensVenda().size(); i++) {
                    
                    respostaController2 = ItensVendaController.salvar(venda.getItensVenda().get(i));
                    Produto produtoAtualizado = ProdutoController.obter(venda.getItensVenda().get(i).getId());
                    produtoAtualizado.setQuantidade(produtoAtualizado.getQuantidade() - venda.getItensVenda().get(i).getQuantidade());
                    respostaController3 = ProdutoController.atualizar(produtoAtualizado);
                }
                
                troco = (venda.getPagamentoCartao()+venda.getPagamentoDinheiro())-venda.getSubtotal();
                JOptionPane.showMessageDialog(rootPane,
                    "Venda n??mero "+vendaIndex+ " registrada!\n\n"+
                        "Subtotal da compra R$"+venda.getSubtotal()+"\n"+
                        "Total pago em Dinheiro R$"+venda.getPagamentoDinheiro()+"\n"+
                        "Total pago em Cart??o R$"+venda.getPagamentoCartao()+"\n"+
                        "Troco R$"+troco+"\n\n"+
                        "Agora voc?? pode consultar sua venda em:\n"+ 
                        "Menu > Relat??rio",
                    "Informe de registro",
                    JOptionPane.INFORMATION_MESSAGE);

           
                limpaTelaVenda();

            
                atualizaIndiceVenda();
            }
            else
            {
               
                JOptionPane.showMessageDialog(rootPane, 
                    respostaController
                        +"\n Procure o administrador do sistema!",
                    "Erro", 
                    JOptionPane.ERROR_MESSAGE);
            } 
        }else{
            valorFaltante = venda.getSubtotal()-(venda.getPagamentoCartao()+venda.getPagamentoDinheiro());
            JOptionPane.showMessageDialog(rootPane, 
                "Subtotal da compra R$"+venda.getSubtotal()+"\n"+
                "Total em Dinheiro R$"+venda.getPagamentoDinheiro()+"\n"+
                "Total em Cart??o R$"+venda.getPagamentoCartao()+"\n\n"+
                "Faltam R$"+valorFaltante+"\n\n"+
                "Complete o e tente novamente.",
                "Venda n??o registrada", 
                JOptionPane.ERROR_MESSAGE);
        }       
    }//GEN-LAST:event_btRegistrarVendaActionPerformed
    
    private void cbDinheiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDinheiroActionPerformed
        if(cbDinheiro.isSelected()){
            txtPagamentoDinheiro.setEditable(true);
        }
        else{
            txtPagamentoDinheiro.setEditable(false);
        }
        txtPagamentoDinheiro.setValue(0);
    }//GEN-LAST:event_cbDinheiroActionPerformed
    
    private void cbCart??oActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCart??oActionPerformed
        if(cbCart??o.isSelected()){
            txtPagamentoCartao.setEditable(true);
        }
        else{
            txtPagamentoCartao.setEditable(false);
        }
        txtPagamentoCartao.setValue(0);
    }//GEN-LAST:event_cbCart??oActionPerformed
    
    private void txtPagamentoDinheiroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPagamentoDinheiroFocusLost
        if (txtPagamentoDinheiro.getText().length()>10){
            txtPagamentoDinheiro.setValue(0);
        }
    }//GEN-LAST:event_txtPagamentoDinheiroFocusLost
    
    private void txtPagamentoCartaoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPagamentoCartaoFocusLost
        if (txtPagamentoCartao.getText().length()>10){
            txtPagamentoCartao.setValue(0);
        }
        if(!verificaValorCartao()){
            JOptionPane.showMessageDialog(rootPane,
                "O Valor de pagamento em cart??o n??o pode ser maior que o subtotal da venda!",
                "Atenc??o",
                JOptionPane.ERROR_MESSAGE);
            txtPagamentoCartao.setValue(0);
        }
    }//GEN-LAST:event_txtPagamentoCartaoFocusLost
    
    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        atualizaIndiceVenda();
    }//GEN-LAST:event_formComponentShown
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdicionarItem;
    private javax.swing.JButton btRegistrarVenda;
    private javax.swing.JButton btRemoverItem;
    private javax.swing.JCheckBox cbCart??o;
    private javax.swing.JCheckBox cbDinheiro;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpCabecalho;
    private javax.swing.JPanel jpDadosCliente;
    private javax.swing.JPanel jpSubtotal;
    private javax.swing.JSpinner jsProdutoQuantidade;
    private javax.swing.JLabel lbCabecalho;
    private javax.swing.JLabel lbProdutoNome;
    private javax.swing.JLabel lbProdutoQuantidade;
    private javax.swing.JLabel lbProdutoValorTotal;
    private javax.swing.JLabel lbProdutoValorUnitario;
    private javax.swing.JLabel lbSairVenda;
    private javax.swing.JLabel lbSubtotal;
    private javax.swing.JLabel lbVendaClienteCpf;
    private javax.swing.JLabel lbVendaLogo;
    private javax.swing.JTable tabelaVenda;
    private javax.swing.JTextField txtClienteCidadeInfo;
    private javax.swing.JTextField txtClienteCpfInfo;
    private javax.swing.JTextField txtClienteLogradouroInfo;
    private javax.swing.JTextField txtClienteNomeInfo;
    private javax.swing.JTextField txtClienteNumeroInfo;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JFormattedTextField txtPagamentoCartao;
    private javax.swing.JFormattedTextField txtPagamentoDinheiro;
    private javax.swing.JTextField txtProdutoNome;
    private javax.swing.JTextField txtProdutoValorTotal;
    private javax.swing.JTextField txtProdutoValorUnitario;
    private javax.swing.JTextField txtSubtotal;
    // End of variables declaration//GEN-END:variables
}
