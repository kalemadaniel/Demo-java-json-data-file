/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.io.File;
import java.io.FileReader;
import java.sql.Date;
import javax.swing.JFileChooser;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import jdk.nashorn.internal.parser.JSONParser;

/**
 *
 * @author Ulb-Kalema
 */
public class clsJson {

    FileNameExtensionFilter filter = null;

    public void ChooseJsonFile(JTextField txtPath) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        filter = new FileNameExtensionFilter("*.JSON", "json", "Json");
        fileChooser.addChoosableFileFilter(filter);
        int result = fileChooser.showSaveDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            txtPath.setText(path);
        }
    }



    public void readJsonfile(JList lst)  {
      
    }
    
    //change readJsonfile in insertjson file
}
