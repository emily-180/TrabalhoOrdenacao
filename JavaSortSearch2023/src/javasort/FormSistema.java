package javasort;
import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormSistema extends javax.swing.JFrame {
    ArrayList<Dados> lista = new ArrayList<>();
   // Definir os comparadores
    Comparator<Dados> comparaData = (Dados d1, Dados d2) -> d1.getData().compareTo(d2.getData()); 
    Comparator<Dados> comparaQuantVeiculos = (Dados d1, Dados d2) -> d1.getQuantVeiculos()- d2.getQuantVeiculos();
    Comparator<Dados> comparaCausa = (Dados d1, Dados d2) -> d1.getCausa().compareTo(d2.getCausa()); 
    Comparator<Dados> comparaUf = (Dados d1, Dados d2) -> d1.getUf().compareTo(d2.getUf()); 
    public FormSistema() {
        initComponents();
        carregaArquivo();
        mostra();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblProx = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnOrdNome = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaDados = new javax.swing.JTable();
        cbOrdena = new javax.swing.JComboBox<>();
        txtBusca2 = new javax.swing.JTextField();
        btnBuscaCidade = new javax.swing.JButton();
        btnLinear = new javax.swing.JRadioButton();
        btnBinaria = new javax.swing.JRadioButton();
        txtBusca1 = new javax.swing.JTextField();
        btnLinear2 = new javax.swing.JRadioButton();
        btnBinaria2 = new javax.swing.JRadioButton();
        btnBuscaCausa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));

        lblProx.setBackground(new java.awt.Color(0, 0, 0));
        lblProx.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 32)); // NOI18N
        lblProx.setForeground(new java.awt.Color(255, 255, 255));
        lblProx.setText("Incidentes de Trânsito no Brasil (PRF 2022)");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javasort/carro-de-acidente (2).png"))); // NOI18N

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 24))); // NOI18N

        btnOrdNome.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        btnOrdNome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javasort/check-list (1).png"))); // NOI18N
        btnOrdNome.setText("Ordenar");
        btnOrdNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdNomeActionPerformed(evt);
            }
        });

        tabelaDados.setAutoCreateRowSorter(true);
        tabelaDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Data", "Horario", "UF", "br", "Municipio", "Causa", "Tipo", "Classificacao", "Fase do dia", "Condicao", "Quatidade de Veiculo"
            }
        ));
        jScrollPane1.setViewportView(tabelaDados);

        cbOrdena.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Data", "Município", "Quantidade de Veiculos", "Causa", "UF" }));

        btnBuscaCidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javasort/task.png"))); // NOI18N
        btnBuscaCidade.setText("Busca Municipio");
        btnBuscaCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaCidadeActionPerformed(evt);
            }
        });

        buttonGroup1.add(btnLinear);
        btnLinear.setText("Linear");

        buttonGroup1.add(btnBinaria);
        btnBinaria.setText("Binária");

        txtBusca1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBusca1ActionPerformed(evt);
            }
        });

        buttonGroup2.add(btnLinear2);
        btnLinear2.setText("Linear");

        buttonGroup2.add(btnBinaria2);
        btnBinaria2.setText("Binária");

        btnBuscaCausa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javasort/task.png"))); // NOI18N
        btnBuscaCausa.setText("Buscar Causa");
        btnBuscaCausa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaCausaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 879, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnOrdNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbOrdena, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBusca2, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(btnLinear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBinaria)
                        .addGap(56, 56, 56))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(btnLinear2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBinaria2)
                        .addGap(53, 53, 53))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(btnBuscaCidade))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBusca1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(btnBuscaCausa)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(cbOrdena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnOrdNome, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnLinear)
                                    .addComponent(btnBinaria))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBuscaCidade)
                                .addGap(18, 18, 18)
                                .addComponent(txtBusca2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(143, 143, 143)
                                .addComponent(txtBusca1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLinear2)
                            .addComponent(btnBinaria2))
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscaCausa)))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblProx, javax.swing.GroupLayout.PREFERRED_SIZE, 890, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 58, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblProx, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void carregaArquivo(){
     String csvFile = "Dados_PRF_2022.csv";
        String line = "";
        String[] leitura = null;
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                Dados acidente = new Dados();
                leitura = line.split(",");
                acidente.setData(leitura[0]);
                acidente.setHorario(leitura[1]);
                acidente.setUf(leitura[2]);
                acidente.setBr(Integer.parseInt(leitura[3]));
                acidente.setMunicipio(leitura[4]);
                acidente.setCausa(leitura[5]);
                acidente.setTipo(leitura[6]);
                acidente.setClassificacao(leitura[7]);
                acidente.setFaseDia(leitura[8]);
                acidente.setCondicoesMetereologicas(leitura[9]);
                acidente.setQuantVeiculos(Integer.parseInt(leitura[10]));
                lista.add(acidente); 
            }// fim percurso no arquivo
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //https://www.kaggle.com/datasets/tgomesjuliana/police-traffic-incidents
    void mostra(){
        //limpando a tabela
        tabelaDados.setModel(new DefaultTableModel(null,new String[]{"Data","Horário", "Uf", "br","Município", "Causa", "Tipo", "Classificação", "Fase do dia", "Condições Metereológicas", "Veículos"}));
       
        DefaultTableModel model = (DefaultTableModel)tabelaDados.getModel();
        Object rowData[] = new Object[11];// qtd colunas
        for(Dados d: lista)
        {
            rowData[0] = d.getData();
            rowData[1] = d.getHorario();
            rowData[2] = d.getUf();
            rowData[3] = d.getBr();
            rowData[4] = d.getMunicipio();
            rowData[5] = d.getCausa();
            rowData[6] = d.getTipo();
            rowData[7] = d.getClassificacao();
            rowData[8] = d.getFaseDia();
            rowData[9] = d.getCondicoesMetereologicas();
            rowData[10] = d.getQuantVeiculos();
            model.addRow(rowData);
        }// fim preenche modelo
    }// fim mostra
   
    private void btnOrdNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdNomeActionPerformed
       // switch case para escolher por qual comparador ordenar
       switch(cbOrdena.getSelectedIndex()){
            case 0:
               lista.sort(comparaData);
               break;
            case 1:
                Collections.sort(lista); //Cidade comparador padrão definido
                break;
            case 2:
                lista.sort(comparaQuantVeiculos);
                break;
            case 3:
                lista.sort(comparaCausa);
                break;
            case 4:
                lista.sort(comparaUf);
                break;
       }
        mostra();
    }//GEN-LAST:event_btnOrdNomeActionPerformed

    private void btnBuscaCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaCidadeActionPerformed
        Dados dadoBusca = new Dados();
        dadoBusca.setMunicipio(txtBusca1.getText());
        int r=-1;
        int comp=0;
        if(btnLinear.isSelected()){
           for (Dados d : lista) {
                comp++; 
                if (d.equals(dadoBusca)) {
                    r = lista.indexOf(d);
                    break;  
                }
           }
        }else if(btnBinaria.isSelected()){
             for (Dados d : lista) {
                comp++;
                if (d.equals(dadoBusca)) {
                    r = Collections.binarySearch(lista, dadoBusca);
                    break; 
                }
             }
        }
        if(r == -1)
            JOptionPane.showMessageDialog(null, "Nao encontrado! "+ r + " Quantidade de comparações: "+ comp );
        else
            JOptionPane.showMessageDialog(null, "Encontrado, index: "+ r + " Quantidade de comparações: " + comp);
    }//GEN-LAST:event_btnBuscaCidadeActionPerformed

    
    private void txtBusca1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBusca1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBusca1ActionPerformed

    private void btnBuscaCausaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaCausaActionPerformed
        Dados dadoBusca = new Dados();
        dadoBusca.setCausa(txtBusca2.getText());
        int r=-1;
        int comp=0;
        if(btnLinear2.isSelected()){
           for (Dados d : lista) {
                comp++; 
                if (d.equals(dadoBusca)) {
                    r = lista.indexOf(d);
                    break;  
                }
           }
        }else if(btnBinaria2.isSelected()){
             for (Dados d : lista) {
                comp++; 
                if (d.equals(dadoBusca)) {
                    r = Collections.binarySearch(lista, dadoBusca);
                    break; 
                }
             }
        }
        if(r == -1)
            JOptionPane.showMessageDialog(null, "Nao encontrado! "+ r + " Quantidade de comparações: "+ comp );
        else
            JOptionPane.showMessageDialog(null, "Encontrado, index: "+ r + " Quantidade de comparações: " + comp);
    }//GEN-LAST:event_btnBuscaCausaActionPerformed

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormSistema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btnBinaria;
    private javax.swing.JRadioButton btnBinaria2;
    private javax.swing.JButton btnBuscaCausa;
    private javax.swing.JButton btnBuscaCidade;
    private javax.swing.JRadioButton btnLinear;
    private javax.swing.JRadioButton btnLinear2;
    private javax.swing.JButton btnOrdNome;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cbOrdena;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblProx;
    private javax.swing.JTable tabelaDados;
    private javax.swing.JTextField txtBusca1;
    private javax.swing.JTextField txtBusca2;
    // End of variables declaration//GEN-END:variables
}
