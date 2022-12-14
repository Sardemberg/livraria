/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package livraria.view.livros;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import livraria.models.Livro;
import livraria.controllers.LivroController;
import livraria.controllers.AutorController;
import livraria.models.Autor;

/**
 *
 * @author admin
 */
public class BookUpdate extends javax.swing.JFrame {
    Livro livro = new Livro();
    /**
     * Creates new form BookUpdate
     */
    public BookUpdate(Livro livro) {
        this.livro = livro;
        initComponents();
    }

    private BookUpdate() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        inputCode = new javax.swing.JTextField();
        inputName = new javax.swing.JTextField();
        inputLingua = new javax.swing.JTextField();
        inputAno = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        autorCbb = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Atualizar Livro");
        jLabel1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        inputCode.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        inputCode.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputCode.setText("Novo c??digo");
        inputCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputCodeActionPerformed(evt);
            }
        });

        inputName.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        inputName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputName.setText("Novo nome");
        inputName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNameActionPerformed(evt);
            }
        });

        inputLingua.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        inputLingua.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputLingua.setText("Nova l??ngua escrita");
        inputLingua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputLinguaActionPerformed(evt);
            }
        });

        inputAno.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        inputAno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputAno.setText("Novo ano");
        inputAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputAnoActionPerformed(evt);
            }
        });

        jButton1.setText("Atualizar Livro");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 153)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        autorCbb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o autor" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 708, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(autorCbb, 0, 244, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(inputAno)
                        .addComponent(inputLingua)
                        .addComponent(inputName)
                        .addComponent(inputCode)
                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)))
                .addGap(229, 229, 229))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(inputCode, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inputName, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inputLingua, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inputAno, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(autorCbb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void inputCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputCodeActionPerformed

    private void inputNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNameActionPerformed

    private void inputLinguaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputLinguaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputLinguaActionPerformed

    private void inputAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputAnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputAnoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Livro livro = new Livro();
        LivroController controllerLivro = new LivroController();
        
        livro.setId(this.livro.getId());
        livro.setAno(Integer.parseInt(inputAno.getText()));
        livro.setCodigo(inputCode.getText());
        livro.setNome(inputName.getText());
        livro.setLingua(inputLingua.getText());
        livro.setAutor((String) autorCbb.getSelectedItem());
        
        boolean result = controllerLivro.update(livro);
        
        if(result){
            JOptionPane.showMessageDialog(null, "Livro atualizado com sucesso!");
            this.show(false);
        }else{
            JOptionPane.showMessageDialog(null, "Erro ao atualizar livro");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel1AncestorAdded
        inputCode.setText(this.livro.getCodigo());
        inputName.setText(this.livro.getNome());
        inputAno.setText(String.valueOf(this.livro.getAno()));
        inputLingua.setText(this.livro.getLingua());
        
        AutorController autorController = new AutorController();
        ArrayList<Autor> autores = autorController.showAll();
        
        for(Autor autor: autores){
           autorCbb.addItem(autor.getNome());
        }
    }//GEN-LAST:event_jLabel1AncestorAdded

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
            java.util.logging.Logger.getLogger(BookUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookUpdate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> autorCbb;
    private javax.swing.JTextField inputAno;
    private javax.swing.JTextField inputCode;
    private javax.swing.JTextField inputLingua;
    private javax.swing.JTextField inputName;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
