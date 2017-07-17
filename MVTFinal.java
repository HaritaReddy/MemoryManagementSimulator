package memoryman;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Harita Reddy
 */

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.*;  
import java.awt.*;
import java.awt.event.*;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
public class MVTFinal extends javax.swing.JFrame {
Graphics g;

 
int[]arr1; 
int[]arr2;
int randomval;
int n,memavail;
    public MVTFinal() {
              
        initComponents();
 n=1;
        memavail=400;
        randomval=0;
        arr1=new int[25];
        arr2=new int[25];
        int i;
        arr1[0]=400;
        arr2[0]=0;
        for(i=1;i<25;i++)
        {
            arr1[i]=0;
            arr2[i]=0;
        }

        
        

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 255, 204));

        jButton1.setBackground(new java.awt.Color(0, 153, 255));
        jButton1.setText("Add Process");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 102, 204));
        jButton2.setText("Remove Process");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextField1.setBackground(new java.awt.Color(255, 204, 0));

        jTextField2.setBackground(new java.awt.Color(255, 204, 0));

        jButton3.setText("Start Memory Allocation");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jCheckBox1.setText("First Fit");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setText("Best Fit");

        jCheckBox3.setText("Worst Fit");

        jTextArea1.setBackground(new java.awt.Color(255, 153, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Mongolian Baiti", 1, 13)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(102, 0, 102));
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Enter the Block Number");

        jLabel2.setBackground(new java.awt.Color(153, 255, 204));
        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Memory Management- MVT");

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setText("BACK");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 324, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jCheckBox3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jCheckBox1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jCheckBox2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton4)))
                        .addGap(10, 10, 10))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox1))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jCheckBox2))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int k = Integer.parseInt(jTextField1.getText());
       
        if(jCheckBox1.isSelected()||jCheckBox2.isSelected()||jCheckBox3.isSelected())
        {int foo;
        if(jCheckBox1.isSelected())
            foo=1;
        else if(jCheckBox2.isSelected())
            foo=2;
        else
            foo=3;
            //System.out.println(n);
            if(k>memavail)
                jTextArea1.setText("It's size is greater than the memory available!\n");
            else
            {
                int flag;
                flag=0;
                int i=0;
                if(foo==1)
                {
                for(i=0;i<n;i=i+1)
                {
                    if(arr2[i]==0&&arr1[i]>=k)
                    {
                        flag=1;
                        break;
                    }
                }
                }
                else if(foo==2)
                {
                    int j,min=9999;
                    for(j=0;j<n;j++)
                    {
                        if(arr2[j]==0&&arr1[j]>=k&&arr1[j]<min)
                        {min=arr1[j];i=j;flag=1;}
                    }
                }
                else
                {
                    int j,max=-1;
                    for(j=0;j<n;j++)
                    {
                        if(arr2[j]==0&&arr1[j]>=k&&arr1[j]>max)
                        {max=arr1[j];i=j;flag=1;}
                    }
                    
                    
                }
                switch(flag)
                
                { case 0:
                    jTextArea1.setText("It cannot be allocated.\nIt is a case of external fragmentation!\n");
                    System.out.println("The elements are\n");
                    for(i=0;i<n;i++)
                        System.out.println(arr1[i]);
                               System.out.println(arr2[i]);
                break;
                case 1:
                    int s=arr1[i];
                    int p;
                    
                    if(n==1&&k==arr1[0])
                    {
                        arr1[0]=s;
                        arr2[0]=1;
                        break;
                    }
                    for(p=n;p>=i+1;p=p-1)
                    {
                        arr1[p]=arr1[p-1];
                        arr2[p]=arr2[p-1];
                    }
                    arr1[i+1]=s-k;
                    arr1[i]=k;
                    arr2[i]=1;
                    if(i%2==0)
                    g.setColor(Color.yellow);
                    else
                    g.setColor(Color.green);
                              int sum=50;

                    sum=50;
                    for(int j=0;j<i;j++)
                        sum=sum+arr1[j];
                    /*g.fillRect(50,sum, 250, k);
                    g.setColor(Color.black);
                    g.drawString(Integer.toString(k), 50, sum+10);*/
                    memavail=memavail-k;
                    n=n+1;
                    jTextArea1.setText("The process has been accommodated :)");
                    break;
                }
                int sum=50;
            for(int s=0;s<n;s++)
            {
                if(s%2==0&&arr2[s]==1)
                {
                    g.setColor(Color.yellow);
                    g.fillRect(50,sum,250,arr1[s]);
                }
                else if(s%2!=0&&arr2[s]==1)
                {
                     g.setColor(Color.green);
                    g.fillRect(50,sum,250,arr1[s]);                   
                }
                else
                {
                     g.setColor(Color.white);
                    g.fillRect(50,sum,250,arr1[s]);                    
                }
                g.setColor(Color.black);
                g.drawString(Integer.toString(arr1[s]), 50, sum+10);
                sum=sum+arr1[s];
            }
                
            }
            
        }
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int p = Integer.parseInt(jTextField2.getText());
        p=p-1;
        int ind;
        int sum=50;
       memavail=memavail+arr1[p];
        for(int j=0;j<p;j++)
             sum=sum+arr1[j];
        g.setColor(Color.white);
        g.fillRect(50, sum, 250, arr1[p]);
        if(n==1)
        {
            arr2[0]=0;
           g.setColor(Color.white);
        g.fill3DRect(50, 50, 250, 400, true);
         g.drawString(Integer.toString(400), 50, 60);
         return;
        }
        else if(n==2&&arr2[0]==1&&arr2[1]==0)
        {
            arr2[0]=0;
            arr1[0]=400;
            n--;
        }
        else if(p==0)
        {
            if(arr2[1]==0)
            {
                int sp;
                arr1[0]=arr1[0]+arr1[1];
                for(sp=1;sp<n-1;sp++)
                {
                    arr1[sp]=arr1[sp+1];
                    arr2[sp]=arr2[sp+1];
                }
                n--;
            }
            else
            {
                arr2[0]=0;
            }
        }
        else if(p==n-1)
        {
            if(arr2[p-1]==0)
            {
                arr1[p-1]=arr1[p-1]+arr1[p];
                n--;
            }
            else
                arr2[p]=0;
        }
        else if(arr2[p+1]!=0&&arr2[p-1]!=0)
        {
            arr2[p]=0;
            ind=p;
        }
        else
        {
            int m;
            //Changed Code
            if(arr2[p-1]==0&&arr2[p+1]==0)
            {
                arr1[p-1]=arr1[p-1]+arr1[p]+arr1[p+1];
                int f;
                for(f=p;f<n-2;f++)
                {
                    arr1[f]=arr1[f+2];
                    arr2[f]=arr2[f+2];
                }
                n=n-2;
            }
            //Changed code ends
            else if(arr2[p+1]==0)
            {
                arr2[p]=0;
                arr1[p]=arr1[p]+arr1[p+1];
                for(m=p+1;m<n-1;m++)
                {
                    arr1[m]=arr1[m+1];
                    arr2[m]=arr2[m+1];
                }
                n--;
                ind=p-1;
            }
            else
            {
                arr1[p-1]=arr1[p-1]+arr1[p];
                for(m=p;m<n-1;m++)
                {
                    arr1[m]=arr1[m+1];
                    arr2[m]=arr2[m+1];  
                }
                n--;
                ind=p;
            }
            
               //for(int j=0;j<ind;j++)
             //sum=sum+arr1[j]; 

            
        }
        //g.clearRect(100,100, 250,10);
                     g.setColor(Color.black);
             //g.drawString(Integer.toString(arr1[ind]), 100,sum+10);
            /*for(int j=0;j<n;j++)
            {
               g.drawString(Integer.toString(arr1[j]), 100,sum+10);
            }*/
            sum=50;
            for(int s=0;s<n;s++)
            {
                if(s%2==0&&arr2[s]==1)
                {
                    g.setColor(Color.yellow);
                    g.fillRect(50,sum,250,arr1[s]);
                }
                else if(s%2!=0&&arr2[s]==1)
                {
                     g.setColor(Color.green);
                    g.fillRect(50,sum,250,arr1[s]);                   
                }
                else
                {
                     g.setColor(Color.white);
                    g.fillRect(50,sum,250,arr1[s]);                    
                }
                g.setColor(Color.black);
                g.drawString(Integer.toString(arr1[s]), 50, sum+10);
                sum=sum+arr1[s];
            }

        //g.clearRect(100,110,250,50);
        int lm;
        for(lm=0;lm<n;lm++)
            System.out.println(arr1[lm]);
        jTextArea1.setText("Process Removed!\n");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
                g=getGraphics();
                g.setColor(Color.white);
        g.fill3DRect(50, 50, 250, 400, true);            //(100,100, 250, 600);
                g.setColor(Color.black);
                g.fill3DRect(50, 40, 250, 10, true);
                g.fill3DRect(50, 450, 250, 10, true);
                //g.fill3DRect(50, 50, 250, 10, true);
                //g.fill3DRect(50, 50, 250, 10, true);
                    g.drawString(Integer.toString(400), 50, 60);
               
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    //public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
      /*  try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MVTFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MVTFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MVTFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MVTFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
       // java.awt.EventQueue.invokeLater(new Runnable() {
         //   public void run() {
           //     new MVTFinal().setVisible(true);
            //}
        //});
    //}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
