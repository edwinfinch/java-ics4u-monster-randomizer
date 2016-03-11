/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monsterrandomizer;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author edwinfinch
 */
public class Randomizer extends javax.swing.JFrame {
    public final String CREDITS_FILE = "credits.txt", INFO_FILE = "info.txt";
    public final String UNKNOWN = "[Unknown]";
    
    int currentDropItemSelected, currentActorSelected;
    
    public Randomizer() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        exitButton = new javax.swing.JButton();
        loadButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        monsterInfoPanel = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        difficultyLabel = new javax.swing.JLabel();
        attackLabel = new javax.swing.JLabel();
        authourLabel = new javax.swing.JLabel();
        pictureLabel = new javax.swing.JLabel();
        soundButton = new javax.swing.JButton();
        monsterTabPane = new javax.swing.JTabbedPane();
        increaseSpawnchanceButton = new javax.swing.JButton();
        decreaseSpawnchanceButton = new javax.swing.JButton();
        debugLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Monster Randomizer");

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        loadButton.setText("Load");
        loadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadButtonActionPerformed(evt);
            }
        });

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        monsterInfoPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        nameLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        nameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameLabel.setText("Name");

        difficultyLabel.setText("Difficulty");

        attackLabel.setText("Attack types");

        authourLabel.setText("Authour");

        pictureLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pictureLabel.setText("[Picture]");

        soundButton.setText("Sound");

        javax.swing.GroupLayout monsterInfoPanelLayout = new javax.swing.GroupLayout(monsterInfoPanel);
        monsterInfoPanel.setLayout(monsterInfoPanelLayout);
        monsterInfoPanelLayout.setHorizontalGroup(
            monsterInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, monsterInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(monsterInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pictureLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nameLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(authourLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(attackLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(difficultyLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(monsterInfoPanelLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(soundButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        monsterInfoPanelLayout.setVerticalGroup(
            monsterInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, monsterInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pictureLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(difficultyLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(attackLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(authourLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(soundButton)
                .addContainerGap())
        );

        monsterTabPane.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        increaseSpawnchanceButton.setText("Increase Spawn Chance");
        increaseSpawnchanceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                increaseSpawnchanceButtonActionPerformed(evt);
            }
        });

        decreaseSpawnchanceButton.setText("Decrease Spawn Chance");
        decreaseSpawnchanceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decreaseSpawnchanceButtonActionPerformed(evt);
            }
        });

        debugLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        debugLabel.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(exitButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(debugLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE))
                    .addComponent(monsterTabPane))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(loadButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(saveButton))
                    .addComponent(monsterInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(increaseSpawnchanceButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(decreaseSpawnchanceButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(11, 11, 11))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(monsterInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(increaseSpawnchanceButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(decreaseSpawnchanceButton))
                    .addComponent(monsterTabPane))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exitButton)
                    .addComponent(loadButton)
                    .addComponent(saveButton)
                    .addComponent(debugLabel))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void saveToFile() throws IOException{
        String contentToWrite = "";
        
        System.out.println("before save " + actors.size());
        
        for(int i = 0; i < actors.size(); i++){
            Actor actor = (Actor)actors.get(i);
            ArrayList dropItems = actor.getDropItems();
            contentToWrite += "actor " + actor.name + " : RandomSpawner replaces " + actor.replaces + "\n";
            contentToWrite += "{\n";
            for (Object item : dropItems) {
                DropItem dropItem = (DropItem)item;
                contentToWrite += "    DropItem \"" + dropItem.name + "\", 256, " + dropItem.chance + "\n";
            }
            contentToWrite += "}\n";
            System.out.println("Saved " + i + ": " + actor.name);
        }
        
        System.out.println("after save " + actors.size());
        
        File file = new File(openFilePath);

        if (!file.exists()) {
            file.createNewFile();
        }

        FileWriter fileWriter = new FileWriter(file.getAbsoluteFile());
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(contentToWrite);
        bufferedWriter.close();
        
        System.out.println("final " + actors.size());
    }
    
    //Thanks to http://stackoverflow.com/questions/2808535/round-a-double-to-2-decimal-places
    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }
    
    private ArrayList actors = new ArrayList();
    
    private void setUnknown(){
        difficultyLabel.setText("Difficulty: " + UNKNOWN);
        attackLabel.setText("Distance: " + UNKNOWN);
        authourLabel.setText("Authour: " + UNKNOWN);
        pictureLabel.setIcon(null);
        pictureLabel.setText(UNKNOWN);
    }
    
    private void reloadMonsterTabPane(){
        monsterTabPane.removeAll();
        System.out.println(monsterTabPane.getTabCount());
        
        for(int i = 0; i < actors.size(); i++){
            Actor actor = (Actor)actors.get(i);

            ArrayList dropItems = actor.getDropItems();
            int amountOfItems = dropItems.size();
            String[] dropItemNames = new String[amountOfItems];
            int totalChance = 0;
            for(int i1 = 0; i1 < amountOfItems; i1++){
                DropItem item = (DropItem)dropItems.get(i1);
                totalChance += item.chance;
            }
            for(int i1 = 0; i1 < amountOfItems; i1++){
                DropItem item = (DropItem)dropItems.get(i1);
                double chance = (((double)item.chance/(double)totalChance)*100);
                dropItemNames[i1] = item.name + " - " + item.chance + "/" +  totalChance + " - " + round(chance, 2) + "%";
            }
            
            JList myList = new JList(dropItemNames);
            JScrollPane scrollPane = new JScrollPane();
            scrollPane.setViewportView(myList);
            myList.addListSelectionListener(new ListSelectionListener() {
                @Override
                public void valueChanged(ListSelectionEvent e) {
                    JList changedList = (JList)e.getSource();
                    currentActorSelected = monsterTabPane.getSelectedIndex();
                    Actor actorSelected = (Actor)actors.get(currentActorSelected);
                    currentDropItemSelected = changedList.getSelectedIndex();
                    DropItem dropItemSelected = (DropItem)actorSelected.getDropItems().get(currentDropItemSelected);
                    nameLabel.setText(dropItemSelected.name);
                    
                    
                    try {
                        ArrayList infoData = getTextFileFromData(dropItemSelected.name.substring(1), INFO_FILE);
                        if(infoData == null){
                            setUnknown();
                            return;
                        }
                        for(int d = 0; d < infoData.size(); d++){
                            String line = (String)infoData.get(d);
                            String difficultyString = "Difficulty: ";
                            String distanceString = "Distance: ";
                            if(line.contains(difficultyString)){
                                difficultyLabel.setText(line);
                            }
                            else if(line.contains(distanceString)){
                                attackLabel.setText(line);
                            }
                        }
                        ArrayList authourData = getTextFileFromData(dropItemSelected.name.substring(1), CREDITS_FILE);
                        if(authourData == null){
                            setUnknown();
                            return;
                        }
                        for(int d = 0; d < authourData.size(); d++){
                            String line = (String)authourData.get(d);
                            System.out.println(line);
                            String authourString = "Submitted: ";
                            if(line.contains(authourString)){
                                System.out.println("DOES CONTAIN");
                                authourLabel.setText("Authour: " + line.substring(authourString.length()));
                            }
                        }
                       
                        
                        URL url = getClass().getResource("/monsterrandomizer/data/" + dropItemSelected.name.substring(1) + "/");
                        File folder = new File(url.getPath());
                        System.out.println(folder.getAbsolutePath());
                        if(folder.exists()){
                            File[] listOfFiles = folder.listFiles();

                            for (int i = 0; i < listOfFiles.length; i++) {
                                File file = listOfFiles[i];
                                if (file.isFile()) {
                                    String fileExtension = null;
                                    String filePath = file.getAbsolutePath();
                                    System.out.println(filePath);
                                    
                                    int indexOfPeriod = filePath.lastIndexOf('.');
                                    if (indexOfPeriod > 0) {
                                        fileExtension = filePath.substring(indexOfPeriod+1);
                                    }
                                    System.out.println(fileExtension);
                                    if(fileExtension.equals("png")){
                                        System.out.println(file.getName());
                                        BufferedImage img = ImageIO.read(file);
                                        pictureLabel.setIcon(new ImageIcon(img));
                                        pictureLabel.setText("");
                                    }
                                } else if (file.isDirectory()) {
                                    System.out.println("Directory " + listOfFiles[i].getName());
                                }
                            }
                        }
                        
                    } catch (IOException ex) {
                        //Logger.getLogger(Randomizer.class.getName()).log(Level.SEVERE, null, ex);
                        setUnknown();
                    }
                }
            });
            
            monsterTabPane.addTab(actor.name, scrollPane);
        }
        
        monsterTabPane.setSelectedIndex(currentActorSelected);
        JList list = (JList)((JScrollPane)monsterTabPane.getComponentAt(currentActorSelected)).getViewport().getView();
        list.setSelectedIndex(currentDropItemSelected);
    }
    
    private void handleRandomizerFile(ArrayList fileList){
        Actor currentActor = null;
        actors = new ArrayList();
        for(int i = 0; i < fileList.size(); i++){
            String line = (String)fileList.get(i);
            if(line.contains("actor")){
                if(currentActor != null){
                    actors.add(currentActor);
                }
                String cleanedLine = line;
                if(cleanedLine.contains("/*")){
                    cleanedLine = cleanedLine.replace("/*" + 
                    cleanedLine.substring(
                    cleanedLine.indexOf("/*")+2, 
                    cleanedLine.indexOf("*/")+2), "");
                }
                
                String actorName = cleanedLine;
                actorName = actorName.substring(6, actorName.indexOf(" : "));
                if(actorName.contains(" ")){
                    actorName = actorName.replaceAll(" ", "");
                }
                
                String replacingName = cleanedLine;
                replacingName = replacingName.substring(replacingName.indexOf("replaces ")+9);
                
                //String name = 
                
                currentActor = new Actor(null, actorName, replacingName);
            }
            else if(line.contains("DropItem")){
                String cleanedLine = line;
                if(cleanedLine.contains(" ")){
                    cleanedLine = cleanedLine.replaceAll(" ", "");
                }
                if(cleanedLine.contains("	")){
                    cleanedLine = cleanedLine.replaceAll("	", "");
                }
                
                String name = cleanedLine.substring(cleanedLine.indexOf("DropItem")+9, cleanedLine.indexOf(",")-1);
                
                String valueString = cleanedLine.substring(cleanedLine.lastIndexOf(",")+1);
                int value = Integer.parseInt(valueString);
                
                DropItem dropItem = new DropItem(name, value);
                currentActor.addDropItem(dropItem);
            }
        }
        
        if(currentActor != null){
            actors.add(currentActor);
        }
        
        System.out.println("size on load " + actors.size());
        
        reloadMonsterTabPane();
    }
    
    private String openFilePath = "";
    
    private void loadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadButtonActionPerformed
        final JFileChooser fc = new JFileChooser();
        //Will use this filechooser code when the time comes round to stop loading sample files
        /*
        int returnVal = fc.showOpenDialog(Randomizer.this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
        
            File file = fc.getSelectedFile();
        */
            File file = new File("/Users/edwinfinch/Desktop/Luka's App/testing.Randomizer");
            openFilePath = file.getAbsolutePath();
            System.out.println("open: " + file.getAbsolutePath());
            FileReader in;
            BufferedReader readFile;
            String lineOfText;

            ArrayList fileList = new ArrayList();
            try {
                in = new FileReader(file);
                readFile = new BufferedReader(in);
                while((lineOfText = readFile.readLine()) != null){
                    System.out.println(lineOfText);
                    fileList.add(lineOfText);
                }
                readFile.close();
                in.close();
                
                handleRandomizerFile(fileList);
            } catch(Exception e){
                e.printStackTrace();
            }
            /*
        } else {
            System.out.println("cancelled");
        }
            */
    }//GEN-LAST:event_loadButtonActionPerformed

    private ArrayList getTextFileFromData(String monsterName, String textFile) throws IOException{
        //Thanks to http://www.java-examples.com/java-inputstream-string-example
        InputStream input = getClass().getResourceAsStream("/monsterrandomizer/data/" + monsterName + "/" + textFile);
        
        if(input == null){
            return null;
        }
        
        BufferedReader bReader = new BufferedReader(new InputStreamReader(input));
        String line;

        ArrayList contents = new ArrayList();
        while( (line = bReader.readLine()) != null){
            contents.add(line);
        }

        return contents;
    }
   
    
    private DropItem getCurrentlySelectedDropItem(){
        Actor actorSelected = (Actor)actors.get(currentActorSelected);
        DropItem dropItemSelected = (DropItem)actorSelected.getDropItems().get(currentDropItemSelected);
        
        return dropItemSelected;
    }
    
    private void increaseSpawnchanceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_increaseSpawnchanceButtonActionPerformed
        DropItem dropItem = getCurrentlySelectedDropItem();
        dropItem.chance++;
        
        reloadMonsterTabPane();
    }//GEN-LAST:event_increaseSpawnchanceButtonActionPerformed

    private void decreaseSpawnchanceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decreaseSpawnchanceButtonActionPerformed
        DropItem dropItem = getCurrentlySelectedDropItem();
        dropItem.chance--;
        if(dropItem.chance < 0){
            dropItem.chance = 0;
        }
        
        reloadMonsterTabPane();
    }//GEN-LAST:event_decreaseSpawnchanceButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        try{
            saveToFile();
        } catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_saveButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Randomizer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Randomizer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Randomizer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Randomizer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Randomizer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel attackLabel;
    private javax.swing.JLabel authourLabel;
    private javax.swing.JLabel debugLabel;
    private javax.swing.JButton decreaseSpawnchanceButton;
    private javax.swing.JLabel difficultyLabel;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton increaseSpawnchanceButton;
    private javax.swing.JButton loadButton;
    private javax.swing.JPanel monsterInfoPanel;
    private javax.swing.JTabbedPane monsterTabPane;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel pictureLabel;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton soundButton;
    // End of variables declaration//GEN-END:variables
}
