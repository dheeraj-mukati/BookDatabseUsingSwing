/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookClientGui.GUI;

import bookClientGui.JtableModel.SearchDataTableModel;
import bookClientGui.db.QueryData;
import bookClientGui.util.GUIUtil;
import javax.swing.DefaultListModel;

/**
 *
 * @author dheeraj
 */
public class RetrieveDataJpanel extends javax.swing.JPanel {

    /**
     * Creates new form RetrieveDataJpanel
     */
    
    String tableNames [];
    QueryData queryData;

    DefaultListModel selectColumnListModel = new DefaultListModel();
    DefaultListModel selectConstraintColumnListModel = new DefaultListModel();
    DefaultListModel finalConstraintListModel = new DefaultListModel();
    
    String selectConstraintJcomboBoxValues [] =  new String[]{">",">=","<","<=","="};
    
    public RetrieveDataJpanel() {
        
        queryData = new QueryData();
        tableNames = queryData.getTableName();
        
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

        jComboBox2 = new javax.swing.JComboBox();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        selectTableJcomboBox = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        selectColumnJlist = new javax.swing.JList();
        insertColumnJbutton = new javax.swing.JButton();
        selectConstraintJcomboBox = new javax.swing.JComboBox();
        constraintValueJtextfield = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        selectConstraintColumnJlist = new javax.swing.JList();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        andOperatorRadioButton = new javax.swing.JRadioButton();
        orOperatorRadioButton = new javax.swing.JRadioButton();
        insertOperatorJbutton = new javax.swing.JButton();
        retrieveDataJbutton = new javax.swing.JButton();
        removeConstraintJbutton = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        insertConstraintColumnJbutton = new javax.swing.JButton();
        clearConstraintJbutton = new javax.swing.JButton();
        recordsCountJlabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        finalConstraintJlist = new javax.swing.JList();
        deleteColumnJbutton = new javax.swing.JButton();

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        selectTableJcomboBox.setModel(new javax.swing.DefaultComboBoxModel(tableNames));
        selectTableJcomboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectTableJcomboBoxActionPerformed(evt);
            }
        });

        selectColumnJlist.setModel(selectColumnListModel);
        jScrollPane1.setViewportView(selectColumnJlist);

        insertColumnJbutton.setText(">>");
        insertColumnJbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertColumnJbuttonActionPerformed(evt);
            }
        });

        selectConstraintJcomboBox.setModel(new javax.swing.DefaultComboBoxModel(selectConstraintJcomboBoxValues));
        selectConstraintJcomboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectConstraintJcomboBoxActionPerformed(evt);
            }
        });

        constraintValueJtextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                constraintValueJtextfieldActionPerformed(evt);
            }
        });

        selectConstraintColumnJlist.setModel(selectConstraintColumnListModel);
        jScrollPane2.setViewportView(selectConstraintColumnJlist);

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        andOperatorRadioButton.setText("And");
        buttonGroup1.add(andOperatorRadioButton);

        orOperatorRadioButton.setText("Or");
        buttonGroup1.add(orOperatorRadioButton);

        insertOperatorJbutton.setText(">>");
        insertOperatorJbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertOperatorJbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(andOperatorRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(orOperatorRadioButton)
                .addGap(26, 26, 26))
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(insertOperatorJbutton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(andOperatorRadioButton)
                    .addComponent(orOperatorRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(insertOperatorJbutton)
                .addContainerGap())
        );
        jLayeredPane1.setLayer(andOperatorRadioButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(orOperatorRadioButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(insertOperatorJbutton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        retrieveDataJbutton.setText("Retrieve");
        retrieveDataJbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retrieveDataJbuttonActionPerformed(evt);
            }
        });

        removeConstraintJbutton.setText("Remove");
        removeConstraintJbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeConstraintJbuttonActionPerformed(evt);
            }
        });

        jTable1.setModel(new SearchDataTableModel(

            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            },
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            }

        ));
        jScrollPane4.setViewportView(jTable1);

        insertConstraintColumnJbutton.setText(">>");
        insertConstraintColumnJbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertConstraintColumnJbuttonActionPerformed(evt);
            }
        });

        clearConstraintJbutton.setText("Clear");
        clearConstraintJbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearConstraintJbuttonActionPerformed(evt);
            }
        });

        recordsCountJlabel.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        recordsCountJlabel.setForeground(new java.awt.Color(153, 153, 255));

        jLabel2.setText("Select Constraint column: ");

        jLabel3.setText("Constraint: ");

        jLabel4.setText("Value:");

        jLabel5.setText("Select Table and Column: ");

        finalConstraintJlist.setModel(finalConstraintListModel);
        jScrollPane5.setViewportView(finalConstraintJlist);

        deleteColumnJbutton.setText("<<");
        deleteColumnJbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteColumnJbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(selectTableJcomboBox, 0, 124, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(insertColumnJbutton)
                            .addComponent(deleteColumnJbutton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addGap(32, 32, 32)
                                                .addComponent(jLabel4))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(selectConstraintJcomboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(12, 12, 12)
                                                .addComponent(constraintValueJtextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(70, 70, 70)
                                        .addComponent(insertConstraintColumnJbutton)))))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(retrieveDataJbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(removeConstraintJbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(clearConstraintJbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(113, 113, 113))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(recordsCountJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(removeConstraintJbutton)
                        .addGap(18, 18, 18)
                        .addComponent(clearConstraintJbutton)
                        .addGap(18, 18, 18)
                        .addComponent(retrieveDataJbutton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(selectTableJcomboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(insertColumnJbutton)
                                .addGap(18, 18, 18)
                                .addComponent(deleteColumnJbutton)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(selectConstraintJcomboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(constraintValueJtextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(insertConstraintColumnJbutton)
                                .addGap(6, 6, 6)
                                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(recordsCountJlabel)
                .addGap(27, 27, 27))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void insertOperatorJbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertOperatorJbuttonActionPerformed
        if(orOperatorRadioButton.isSelected()){
            finalConstraintListModel.addElement(" OR ");
        }else if(andOperatorRadioButton.isSelected()){
            finalConstraintListModel.addElement(" AND ");
        }
    }//GEN-LAST:event_insertOperatorJbuttonActionPerformed

    private void clearConstraintJbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearConstraintJbuttonActionPerformed
        finalConstraintListModel.removeAllElements();
    }//GEN-LAST:event_clearConstraintJbuttonActionPerformed

    private void constraintValueJtextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_constraintValueJtextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_constraintValueJtextfieldActionPerformed

    private void selectTableJcomboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectTableJcomboBoxActionPerformed
       
        String tableName = (String)selectTableJcomboBox.getSelectedItem();
        String [] columnNames = queryData.getColumnNames(tableName, "RetrieveData");
        
        selectColumnListModel.removeAllElements();
        
        for (int i = 0; i < columnNames.length; i++) {
            selectColumnListModel.addElement(columnNames[i]);
        }
        
    }//GEN-LAST:event_selectTableJcomboBoxActionPerformed

    private void insertColumnJbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertColumnJbuttonActionPerformed
        
        String selectedColumnName = (String)selectColumnJlist.getSelectedValue();
        if(selectedColumnName != null){
            selectConstraintColumnListModel.addElement(selectTableJcomboBox.getSelectedItem()+"."+selectedColumnName);
        } 
    }//GEN-LAST:event_insertColumnJbuttonActionPerformed

    private void selectConstraintJcomboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectConstraintJcomboBoxActionPerformed
        constraintValueJtextfield.setText("");
    }//GEN-LAST:event_selectConstraintJcomboBoxActionPerformed

    private void insertConstraintColumnJbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertConstraintColumnJbuttonActionPerformed
        
        String selectedConstraintColumn = (String)selectConstraintColumnJlist.getSelectedValue();
        if(selectedConstraintColumn != null ){
            String constraint = (String)selectConstraintJcomboBox.getSelectedItem();
            String constraintValue = constraintValueJtextfield.getText();
            finalConstraintListModel.addElement(selectedConstraintColumn + constraint + constraintValue);
        }else{
            new GUIUtil().showPlainDialog("Please Select Column!", this);
        }
        
        
    }//GEN-LAST:event_insertConstraintColumnJbuttonActionPerformed

    private void fillTable(String query){
        Object [][] searchedData = queryData.retrieveData(query);
        jTable1.setModel(new SearchDataTableModel(queryData.getColumnNamesforSearchData(query), searchedData));
        
        if(searchedData != null){
            recordsCountJlabel.setText(searchedData.length+" Records Found");
        } 
    }
    
    private void retrieveDataJbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retrieveDataJbuttonActionPerformed
       String mainQuery = ""; 
       String selectedConstraint = "";
       int constraintColumnSize = selectConstraintColumnListModel.size();
       
        for (int i = 0; i < constraintColumnSize; i++) {
            selectedConstraint = selectedConstraint + (String)selectConstraintColumnListModel.get(i) +",";
        }
        
        String selectedConstraintList = "";
        int finalConstraintsSize = finalConstraintListModel.size();
        
        for (int i = 0; i < finalConstraintsSize; i++) {
            selectedConstraintList = selectedConstraintList + (String)finalConstraintListModel.get(i);
        }
        String whereClause = "";
        if(selectedConstraintList.length() > 0){
            whereClause = "WHERE " + selectedConstraintList;
        }
       mainQuery = "SELECT distinct "+selectedConstraint.substring(0, selectedConstraint.length() - 1)+" FROM Titles , Authors  "+ whereClause;
        fillTable(mainQuery);
    }//GEN-LAST:event_retrieveDataJbuttonActionPerformed

    private void removeConstraintJbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeConstraintJbuttonActionPerformed
        String selectedValue = (String)finalConstraintJlist.getSelectedValue();
        if(selectedValue != null){
            finalConstraintListModel.removeElement(selectedValue);
        }else{
            new GUIUtil().showPlainDialog("Please select value to remove!", this);
        }
        
    }//GEN-LAST:event_removeConstraintJbuttonActionPerformed

    private void deleteColumnJbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteColumnJbuttonActionPerformed
       String selectedValue = (String)selectConstraintColumnJlist.getSelectedValue();
        if(selectedValue != null){
            selectConstraintColumnListModel.removeElement(selectedValue);
        }else{
            new GUIUtil().showPlainDialog("Please select value to remove!", this);
        }
    }//GEN-LAST:event_deleteColumnJbuttonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton andOperatorRadioButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JButton clearConstraintJbutton;
    private javax.swing.JTextField constraintValueJtextfield;
    private javax.swing.JButton deleteColumnJbutton;
    private javax.swing.JList finalConstraintJlist;
    private javax.swing.JButton insertColumnJbutton;
    private javax.swing.JButton insertConstraintColumnJbutton;
    private javax.swing.JButton insertOperatorJbutton;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton orOperatorRadioButton;
    private javax.swing.JLabel recordsCountJlabel;
    private javax.swing.JButton removeConstraintJbutton;
    private javax.swing.JButton retrieveDataJbutton;
    private javax.swing.JList selectColumnJlist;
    private javax.swing.JList selectConstraintColumnJlist;
    private javax.swing.JComboBox selectConstraintJcomboBox;
    private javax.swing.JComboBox selectTableJcomboBox;
    // End of variables declaration//GEN-END:variables
}
