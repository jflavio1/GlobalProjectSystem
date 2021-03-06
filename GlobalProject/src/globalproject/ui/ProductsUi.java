/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package globalproject.ui;

import globalproject.BaseModuleWindows;
import globalproject.BaseWindows;
import globalproject.data.ProductsRepositoryImpl;
import globalproject.domain.Product;
import globalproject.domain.ProductsRepository;
import java.util.ArrayList;
import javax.swing.JButton;

/**
 *
 * @author joseflavio
 */
public class ProductsUi extends BaseModuleWindows {

    private ProductsRepository repository = new ProductsRepositoryImpl();
   
    /**
     * Creates new form ProductsUI
     */
    public ProductsUi() {
        initComponents();
        runBackButton();
        initUI();
    }
    
    @Override
    protected void initUI() {
        
        producstui_lbl_title.setText(strings.getString("products_lbl_title"));
        
        ArrayList<Product> lista = (ArrayList<Product>) this.repository.getAll();
        
        StringBuilder sb = new StringBuilder();
        
        String prodCodeTitle = "Cod Producto";
        String prodNameTitle = "Product Name";
        String prodPriceTitle = "Product Price";
        sb.append(prodCodeTitle+"\t\t" + prodNameTitle +"\t\t" + prodPriceTitle +"\r\n");
        
        for (int i = 0; i < lista.size(); i++) {
            
            String prodCode = lista.get(i).getProdCode();
            String prodName = lista.get(i).getProdName();
            String prodPrice = String.valueOf(lista.get(i).getProdPrice());
            
            sb.append(prodCode+"\t\t" + prodName +"\t\t" + prodPrice +"\r\n");
            sb.append("\r\n");
        }
        productsui_lbl_list.setText(sb.toString());
        
    }
    
    public void setRepository(ProductsRepository repository) {
        this.repository = repository;
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        producstui_lbl_title = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        productsui_lbl_list = new javax.swing.JTextArea();
        productsui_btn_back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        producstui_lbl_title.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        producstui_lbl_title.setText("Productos");
        producstui_lbl_title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        productsui_lbl_list.setColumns(20);
        productsui_lbl_list.setRows(5);
        jScrollPane1.setViewportView(productsui_lbl_list);

        productsui_btn_back.setText(".......");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(productsui_btn_back)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
                    .addComponent(producstui_lbl_title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(producstui_lbl_title)
                    .addComponent(productsui_btn_back))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        Menu menu = new Menu();
        menu.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

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
            java.util.logging.Logger.getLogger(ProductsUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductsUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductsUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductsUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductsUi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel producstui_lbl_title;
    private javax.swing.JButton productsui_btn_back;
    private javax.swing.JTextArea productsui_lbl_list;
    // End of variables declaration//GEN-END:variables

    @Override
    public JButton getBackButton() {
        return productsui_btn_back;
    }

}
