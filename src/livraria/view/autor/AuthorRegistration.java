/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package livraria.view.autor;

import livraria.models.Autor;
import livraria.controllers.AutorController;
import java.sql.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class AuthorRegistration extends javax.swing.JFrame {

    /**
     * Creates new form AuthorRegistration
     */
    public AuthorRegistration() {
        initComponents();
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
        nameAutor = new javax.swing.JTextField();
        nascimentoAutor = new javax.swing.JTextField();
        nacionalidadeAutor = new javax.swing.JTextField();
        cadastrarAutor = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        biografiaAutor = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro Autor");

        nameAutor.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        nameAutor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nameAutor.setText("Nome");
        nameAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameAutorActionPerformed(evt);
            }
        });

        nascimentoAutor.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        nascimentoAutor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nascimentoAutor.setText("Data de Nascimento");
        nascimentoAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nascimentoAutorActionPerformed(evt);
            }
        });

        nacionalidadeAutor.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        nacionalidadeAutor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nacionalidadeAutor.setText("Nacionalidade");
        nacionalidadeAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nacionalidadeAutorActionPerformed(evt);
            }
        });

        cadastrarAutor.setText("Cadastrar Autor");
        cadastrarAutor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 153)));
        cadastrarAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarAutorActionPerformed(evt);
            }
        });

        biografiaAutor.setColumns(20);
        biografiaAutor.setLineWrap(true);
        biografiaAutor.setRows(5);
        biografiaAutor.setText("\tBiografia");
        biografiaAutor.setToolTipText("");
        biografiaAutor.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane1.setViewportView(biografiaAutor);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(232, 232, 232)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nacionalidadeAutor)
                    .addComponent(nascimentoAutor)
                    .addComponent(nameAutor)
                    .addComponent(cadastrarAutor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(232, 232, 232))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(nameAutor, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nascimentoAutor, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nacionalidadeAutor, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(cadastrarAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameAutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameAutorActionPerformed

    private void nascimentoAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nascimentoAutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nascimentoAutorActionPerformed

    private void nacionalidadeAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nacionalidadeAutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nacionalidadeAutorActionPerformed

    private void cadastrarAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarAutorActionPerformed
        Autor autor = new Autor();
        AutorController controllerAutor = new AutorController();
        
        Date data_nasc = Date.valueOf(nascimentoAutor.getText());
        
        autor.setNome(nameAutor.getText());
        autor.setBiografia(biografiaAutor.getText());
        autor.setData_nasc(data_nasc);
        autor.setNacionalidade(nacionalidadeAutor.getText());
        
        boolean result = controllerAutor.create(autor);
        
        if(result){
            JOptionPane.showMessageDialog(null, "Autor cadastrado com sucesso!");
        }else{
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao cadastrar o livro");
        }
    }//GEN-LAST:event_cadastrarAutorActionPerformed

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
            java.util.logging.Logger.getLogger(AuthorRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AuthorRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AuthorRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AuthorRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AuthorRegistration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea biografiaAutor;
    private javax.swing.JButton cadastrarAutor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nacionalidadeAutor;
    private javax.swing.JTextField nameAutor;
    private javax.swing.JTextField nascimentoAutor;
    // End of variables declaration//GEN-END:variables
}