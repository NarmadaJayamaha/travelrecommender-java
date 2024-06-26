/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

class MyCustomFilter extends javax.swing.filechooser.FileFilter {
    @Override
    public boolean accept(File file) {
        // Allow only directories, or files with ".txt" extension
        
        return true;
    }
    @Override
    public String getDescription() {
        // This description will be displayed in the dialog,
        // hard-coded = ugly, should be done via I18N
        return "Images (*.png, *jpg)";
    }
}

/**
 *
 * @author softmint
 */
public class form extends javax.swing.JFrame {

    /**
     * Creates new form form
     */
    public form() {
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

        fileChooser = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        placename = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        city = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        phonenumber = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        openbutton = new javax.swing.JButton();
        textarea = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        rating = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        typeselector = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        latitude = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        longitude = new javax.swing.JTextField();
        submitbtn = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        open = new javax.swing.JMenuItem();
        exit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        fileChooser.setFileFilter(new MyCustomFilter());

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("PT Sans Caption", 1, 18)); // NOI18N
        jLabel1.setText("Travel Recommender");

        jLabel2.setText("Place Name");

        placename.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                placenameKeyPressed(evt);
            }
        });

        jLabel3.setText("Address");

        address.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                addressKeyPressed(evt);
            }
        });

        jLabel4.setText("City");

        city.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cityKeyPressed(evt);
            }
        });

        jLabel5.setText("Phone Number");

        phonenumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phonenumberActionPerformed(evt);
            }
        });
        phonenumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                phonenumberKeyPressed(evt);
            }
        });

        jLabel6.setText("Image");

        openbutton.setText("Browse");
        openbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openbuttonActionPerformed(evt);
            }
        });

        textarea.setBackground(new java.awt.Color(204, 204, 204));
        textarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textareaActionPerformed(evt);
            }
        });

        jLabel7.setText("Rating");

        rating.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ratingActionPerformed(evt);
            }
        });
        rating.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ratingKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ratingKeyTyped(evt);
            }
        });

        jLabel8.setText("Type");

        typeselector.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hotel", "Travel Destination" }));
        typeselector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeselectorActionPerformed(evt);
            }
        });

        jLabel9.setText("Latitude");

        latitude.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                latitudeKeyPressed(evt);
            }
        });

        jLabel10.setText("Longitude");

        longitude.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                longitudeKeyPressed(evt);
            }
        });

        submitbtn.setBackground(new java.awt.Color(0, 0, 255));
        submitbtn.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        submitbtn.setForeground(new java.awt.Color(255, 255, 255));
        submitbtn.setText("SUBMIT");
        submitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(submitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel10)
                        .addComponent(jLabel9)
                        .addComponent(typeselector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(openbutton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(textarea, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel7)
                        .addComponent(jLabel5)
                        .addComponent(jLabel4)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(jLabel1)
                        .addComponent(placename, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
                        .addComponent(address)
                        .addComponent(city)
                        .addComponent(phonenumber, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jLabel6))
                        .addComponent(rating)
                        .addComponent(latitude)
                        .addComponent(longitude)))
                .addContainerGap(288, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(placename, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(phonenumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(openbutton)
                    .addComponent(textarea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rating, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(typeselector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(latitude, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(longitude, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(submitbtn)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jMenu1.setText("File");

        open.setText("Open");
        open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openActionPerformed(evt);
            }
        });
        jMenu1.add(open);

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jMenu1.add(exit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void phonenumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phonenumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phonenumberActionPerformed

    private void openActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openActionPerformed
        // TODO add your handling code here:
        int returnVal = fileChooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            // What to do with the file, e.g. display it in a TextArea
            String filename = file.getAbsolutePath();
            textarea.setText(filename);
        } else {
            System.out.println("File access cancelled by user.");
        }
    }//GEN-LAST:event_openActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void openbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openbuttonActionPerformed
        // TODO add your handling code here:
        int returnVal = fileChooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            // What to do with the file, e.g. display it in a TextArea
            String filename = file.getAbsolutePath();
            textarea.setText(filename);
        } else {
            System.out.println("File access cancelled by user.");
        }
    }//GEN-LAST:event_openbuttonActionPerformed

    private void ratingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ratingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ratingActionPerformed

    private void typeselectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeselectorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeselectorActionPerformed

    private void submitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitbtnActionPerformed
        // TODO add your handling code here:
        submitbtn.setEnabled(false);
        JTextField[] textFields = {placename, address, city, phonenumber, rating, latitude, longitude};
        boolean anyEmpty = false;
        for (JTextField textField : textFields) {
            if (textField.getText().isEmpty()) {
                // Set flag to true if any text field is empty
                anyEmpty = true;
                break; // No need to continue checking if one is already empty
            }
        }
        
        String imagePath = textarea.getText();
        
        if(imagePath.equals("")) {
            submitbtn.setEnabled(true);
            JOptionPane.showMessageDialog(null, "Please choose an image", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            if (anyEmpty || imagePath.equals("")) {
                submitbtn.setEnabled(true);
              JOptionPane.showMessageDialog(null, "One or more text fields are empty!", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                try {
                    submitbtn.setEnabled(false);

                    String placename_text = placename.getText();
                    String address_text = address.getText();
                    String city_text = city.getText();
                    String phonenumber_text = phonenumber.getText();
                    String rating_text = rating.getText();
                    String type_text = String.valueOf(typeselector.getSelectedItem());;
                    String longitude_text = longitude.getText();
                    String latitude_text = latitude.getText();
    //                
    //                String jsonInputString = "{\"name\": \""+ placename_text +"\", \"address\": \""+ address_text +"\", \"city\": \""+ city_text +"\", \"phone_number\": \""+ phonenumber_text +"\", \"rating\": \""+ rating_text +"\", \"type\": \""+ type_text +"\", \"longitude\": \""+ longitude_text +"\", \"latitude\": \""+ latitude_text +"\"}";

                    URL url = new URL("http://travelrecomender.ceylontechsolutions.com/test.php");
                    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                    connection.setRequestMethod("POST");
                    connection.setDoOutput(true);

                    // Boundary for multipart/form-data
                    String boundary = Long.toHexString(System.currentTimeMillis());
                    connection.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + boundary);

                    try (
                            OutputStream output = connection.getOutputStream();
                            PrintWriter writer = new PrintWriter(new OutputStreamWriter(output, StandardCharsets.UTF_8), true);
                            FileInputStream fileInputStream = new FileInputStream(textarea.getText())
                    ) {
                        // Start of the multipart/form-data
                        writer.append("--").append(boundary).append("\r\n");
                        writer.append("Content-Disposition: form-data; name=\"image\"; filename=\"").append(new File(textarea.getText()).getName()).append("\"\r\n");
                        writer.append("Content-Type: ").append(connection.guessContentTypeFromName(new File(textarea.getText()).getName())).append("\r\n\r\n");
                        writer.flush();

                        // Write image data
                        byte[] buffer = new byte[4096];
                        int bytesRead;
                        while ((bytesRead = fileInputStream.read(buffer)) != -1) {
                            output.write(buffer, 0, bytesRead);
                        }
                        output.flush(); // Important before continuing with writer!

                        // End of multipart/form-data
                        writer.append("\r\n--").append(boundary).append("\r\n");
                        writer.append("Content-Disposition: form-data; name=\"name\"\r\n\r\n").append(placename_text).append("\r\n");

                        writer.append("\r\n--").append(boundary).append("\r\n");
                        writer.append("Content-Disposition: form-data; name=\"address\"\r\n\r\n").append(address_text).append("\r\n");

                        writer.append("\r\n--").append(boundary).append("\r\n");
                        writer.append("Content-Disposition: form-data; name=\"city\"\r\n\r\n").append(city_text).append("\r\n");

                        writer.append("\r\n--").append(boundary).append("\r\n");
                        writer.append("Content-Disposition: form-data; name=\"phone_number\"\r\n\r\n").append(phonenumber_text).append("\r\n");

                        writer.append("\r\n--").append(boundary).append("\r\n");
                        writer.append("Content-Disposition: form-data; name=\"rating\"\r\n\r\n").append(rating_text).append("\r\n");

                        writer.append("\r\n--").append(boundary).append("\r\n");
                        writer.append("Content-Disposition: form-data; name=\"type\"\r\n\r\n").append(type_text).append("\r\n");

                        writer.append("\r\n--").append(boundary).append("\r\n");
                        writer.append("Content-Disposition: form-data; name=\"latitude\"\r\n\r\n").append(latitude_text).append("\r\n");

                        writer.append("\r\n--").append(boundary).append("\r\n");
                        writer.append("Content-Disposition: form-data; name=\"longitude\"\r\n\r\n").append(longitude_text).append("\r\n");

                        writer.append("\r\n--").append(boundary).append("--\r\n");
                        writer.flush();
                    }

                    // Get response code
                    int responseCode = connection.getResponseCode();
                    if (responseCode == HttpURLConnection.HTTP_OK) {
                        // Read response from server
                        try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                            String line;
                            while ((line = reader.readLine()) != null) {
                                JOptionPane.showMessageDialog(null, "Destination added successfully", "Info", JOptionPane.INFORMATION_MESSAGE); // Print each line of the response to the console
                            }
                        }
                        placename.setText("");
                        address.setText("");
                        city.setText("");
                        phonenumber.setText("");
                        rating.setText("");
                        longitude.setText("");
                        latitude.setText("");
                        textarea.setText("");
                        submitbtn.setEnabled(true);
                    } else {
                        submitbtn.setEnabled(true);
                        JOptionPane.showMessageDialog(null, "Destination adding failed, please check information you entered and try again", "Info", JOptionPane.ERROR_MESSAGE);
                    }

                    submitbtn.setEnabled(true);
                    connection.disconnect();



                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }//GEN-LAST:event_submitbtnActionPerformed
    
    private static byte[] readImageData(File imageFile) throws IOException {
        // Read the image file into a byte array
        try (FileInputStream fis = new FileInputStream(imageFile);
             ByteArrayOutputStream bos = new ByteArrayOutputStream()) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
            return bos.toByteArray();
        }
    }
    
    private void ratingKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ratingKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_ratingKeyPressed

    private void ratingKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ratingKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        
        if(!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_ratingKeyTyped

    private void textareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textareaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textareaActionPerformed

    private void placenameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_placenameKeyPressed
        // TODO add your handling code here:
        if ((evt.getKeyCode() == KeyEvent.VK_V) && ((evt.getModifiers() & Toolkit.getDefaultToolkit().getMenuShortcutKeyMask()) != 0)) {
            // Perform paste operation
            placename.paste();
        }
    }//GEN-LAST:event_placenameKeyPressed

    private void addressKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addressKeyPressed
        // TODO add your handling code here:
        if ((evt.getKeyCode() == KeyEvent.VK_V) && ((evt.getModifiers() & Toolkit.getDefaultToolkit().getMenuShortcutKeyMask()) != 0)) {
            // Perform paste operation
            address.paste();
        }
    }//GEN-LAST:event_addressKeyPressed

    private void cityKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cityKeyPressed
        // TODO add your handling code here:
        if ((evt.getKeyCode() == KeyEvent.VK_V) && ((evt.getModifiers() & Toolkit.getDefaultToolkit().getMenuShortcutKeyMask()) != 0)) {
            // Perform paste operation
            city.paste();
        }
    }//GEN-LAST:event_cityKeyPressed

    private void phonenumberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phonenumberKeyPressed
        // TODO add your handling code here:
        if ((evt.getKeyCode() == KeyEvent.VK_V) && ((evt.getModifiers() & Toolkit.getDefaultToolkit().getMenuShortcutKeyMask()) != 0)) {
            // Perform paste operation
            phonenumber.paste();
        }
    }//GEN-LAST:event_phonenumberKeyPressed

    private void latitudeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_latitudeKeyPressed
        // TODO add your handling code here:
        if ((evt.getKeyCode() == KeyEvent.VK_V) && ((evt.getModifiers() & Toolkit.getDefaultToolkit().getMenuShortcutKeyMask()) != 0)) {
            // Perform paste operation
            latitude.paste();
        }
    }//GEN-LAST:event_latitudeKeyPressed

    private void longitudeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_longitudeKeyPressed
        // TODO add your handling code here:
        if ((evt.getKeyCode() == KeyEvent.VK_V) && ((evt.getModifiers() & Toolkit.getDefaultToolkit().getMenuShortcutKeyMask()) != 0)) {
            // Perform paste operation
            longitude.paste();
        }
    }//GEN-LAST:event_longitudeKeyPressed

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
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JTextField city;
    private javax.swing.JMenuItem exit;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField latitude;
    private javax.swing.JTextField longitude;
    private javax.swing.JMenuItem open;
    private javax.swing.JButton openbutton;
    private javax.swing.JTextField phonenumber;
    private javax.swing.JTextField placename;
    private javax.swing.JTextField rating;
    private javax.swing.JButton submitbtn;
    private javax.swing.JTextField textarea;
    private javax.swing.JComboBox<String> typeselector;
    // End of variables declaration//GEN-END:variables
}
