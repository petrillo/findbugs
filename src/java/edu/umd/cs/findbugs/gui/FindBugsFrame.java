/*
 * FindBugsFrame.java
 *
 * Created on March 30, 2003, 12:05 PM
 */

package edu.umd.cs.findbugs.gui;

import java.awt.CardLayout;

/**
 * This frame contains all of the controls used by the FindBugs GUI.
 * I suppose this code should be modularized some more, maybe turning some of
 * component into Bean classes.  However, this is my first Swing program,
 * so I'm taking the most straightforward approach I can.
 *
 * @author David Hovemeyer
 */
public class FindBugsFrame extends javax.swing.JFrame {
    
    /** Creates new form FindBugsFrame */
    public FindBugsFrame() {
	initComponents();
        this.viewPanelLayout = (CardLayout) viewPanel.getLayout();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    private void initComponents() {//GEN-BEGIN:initComponents
        java.awt.GridBagConstraints gridBagConstraints;

        jSplitPane1 = new javax.swing.JSplitPane();
        navigatorTree = new javax.swing.JTree();
        viewPanel = new javax.swing.JPanel();
        bugTree = new javax.swing.JTree();
        reportPanel = new javax.swing.JPanel();
        editProjectPanel = new javax.swing.JPanel();
        jarFileLabel = new javax.swing.JLabel();
        jarNameTextField = new javax.swing.JTextField();
        addJarButton = new javax.swing.JButton();
        jarFileListLabel = new javax.swing.JLabel();
        jarFileList = new javax.swing.JList();
        sourceDirLabel = new javax.swing.JLabel();
        srcDirTextField = new javax.swing.JTextField();
        addSourceDirButton = new javax.swing.JButton();
        sourceDirListLabel = new javax.swing.JLabel();
        sourceDirList = new javax.swing.JList();
        removeJarButton = new javax.swing.JButton();
        removeSrcDirButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        browseJarButton = new javax.swing.JButton();
        browseSrcDirButton = new javax.swing.JButton();
        editProjectLabel = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

        jSplitPane1.setLeftComponent(navigatorTree);

        viewPanel.setLayout(new java.awt.CardLayout());

        viewPanel.add(bugTree, "BugTree");

        viewPanel.add(reportPanel, "ReportPanel");

        editProjectPanel.setLayout(new java.awt.GridBagLayout());

        jarFileLabel.setText("Jar file:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        editProjectPanel.add(jarFileLabel, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        editProjectPanel.add(jarNameTextField, gridBagConstraints);

        addJarButton.setText("Add");
        addJarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJarButtonActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        editProjectPanel.add(addJarButton, gridBagConstraints);

        jarFileListLabel.setText("Jar Files:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        editProjectPanel.add(jarFileListLabel, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.5;
        editProjectPanel.add(jarFileList, gridBagConstraints);

        sourceDirLabel.setText("Source Dir:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        editProjectPanel.add(sourceDirLabel, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        editProjectPanel.add(srcDirTextField, gridBagConstraints);

        addSourceDirButton.setText("Add");
        addSourceDirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSourceDirButtonActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        editProjectPanel.add(addSourceDirButton, gridBagConstraints);

        sourceDirListLabel.setText("Source Dirs:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        editProjectPanel.add(sourceDirListLabel, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.5;
        editProjectPanel.add(sourceDirList, gridBagConstraints);

        removeJarButton.setText("Remove");
        removeJarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeJarButtonActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        editProjectPanel.add(removeJarButton, gridBagConstraints);

        removeSrcDirButton.setText("Remove");
        removeSrcDirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeSrcDirButtonActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        editProjectPanel.add(removeSrcDirButton, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(3, 0, 3, 0);
        editProjectPanel.add(jSeparator1, gridBagConstraints);

        browseJarButton.setText("...");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        editProjectPanel.add(browseJarButton, gridBagConstraints);

        browseSrcDirButton.setText("...");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        editProjectPanel.add(browseSrcDirButton, gridBagConstraints);

        editProjectLabel.setBackground(new java.awt.Color(0, 0, 204));
        editProjectLabel.setFont(new java.awt.Font("Dialog", 1, 24));
        editProjectLabel.setForeground(new java.awt.Color(255, 255, 255));
        editProjectLabel.setText("Edit Project");
        editProjectLabel.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        editProjectPanel.add(editProjectLabel, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(3, 0, 3, 0);
        editProjectPanel.add(jSeparator2, gridBagConstraints);

        viewPanel.add(editProjectPanel, "EditProjectPanel");

        jSplitPane1.setRightComponent(viewPanel);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }//GEN-END:initComponents

    private void removeSrcDirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeSrcDirButtonActionPerformed
	// if (sourceDirList.hasCurrentSelect()) {
	//   Project project = getCurrentProject();
	//   String currSelection = sourceDirList.getCurrentSelection();
	//   project.removeSourceDirectory(currSelection);
	//   sourceDirList.removeCurrentSelection();
	// }
    }//GEN-LAST:event_removeSrcDirButtonActionPerformed

    private void removeJarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeJarButtonActionPerformed
	// if (jarList.hasCurrentSelection()) {
	//   Project project = getCurrentProject();
	//   String currSelection = jarList.getCurrentSelection();
	//   project.removeJarFile(currSelection);
	//   jarList.removeCurrentSelection();
	// }
    }//GEN-LAST:event_removeJarButtonActionPerformed

    private void addSourceDirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSourceDirButtonActionPerformed
	// if (!sourceDirTextField.isEmpty()) {
	//    Project project = getCurrentProject();
	//    String sourceDir = sourceDirTextField.getValue();
	//    project.addSourceDir(sourceDir);
	//    sourceDirTextField.clear();
	//  }
    }//GEN-LAST:event_addSourceDirButtonActionPerformed

    private void addJarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJarButtonActionPerformed
	// if (!jarTextField.isEmpty()) {
	//    Project project = getCurrentProject();
	//    String jarFile = jarTextField.getValue();
	//    project.addJar(jarFile);
	//    jarTextField.clear();
	// }
    }//GEN-LAST:event_addJarButtonActionPerformed
    
    /** Exit the Application */
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
	System.exit(0);
    }//GEN-LAST:event_exitForm
    
    /**
     * Set the view panel to display the named view.
     */
    public void setView(String viewName) {
        viewPanelLayout.show(viewPanel, viewName);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
	FindBugsFrame frame = new FindBugsFrame();
        frame.setView("EditProjectPanel");
        frame.setSize(600, 400);
        frame.show();
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel editProjectLabel;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton removeSrcDirButton;
    private javax.swing.JTextField jarNameTextField;
    private javax.swing.JButton browseJarButton;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JList jarFileList;
    private javax.swing.JLabel jarFileLabel;
    private javax.swing.JButton addSourceDirButton;
    private javax.swing.JLabel sourceDirLabel;
    private javax.swing.JPanel viewPanel;
    private javax.swing.JButton removeJarButton;
    private javax.swing.JLabel jarFileListLabel;
    private javax.swing.JButton addJarButton;
    private javax.swing.JList sourceDirList;
    private javax.swing.JTree navigatorTree;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel reportPanel;
    private javax.swing.JPanel editProjectPanel;
    private javax.swing.JButton browseSrcDirButton;
    private javax.swing.JTextField srcDirTextField;
    private javax.swing.JLabel sourceDirListLabel;
    private javax.swing.JTree bugTree;
    // End of variables declaration//GEN-END:variables
    
    // My variable declarations
    private CardLayout viewPanelLayout;
}
