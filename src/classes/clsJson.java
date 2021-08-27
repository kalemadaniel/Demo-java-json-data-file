/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.io.File;
import java.sql.Connection;
import javax.swing.JFileChooser;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.ParseException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


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

    
    public void insertJsonfile()  {
        // TODO code application logic here
        //Creating a JSONParser object
      JSONParser jsonParser = new JSONParser();
      try {
         //Parsing the contents of the JSON file
         JSONObject jsonObject = (JSONObject) jsonParser.parse(new FileReader("./filejson.json"));
         //Retrieving the array
         JSONArray jsonArray = (JSONArray) jsonObject.get("population");
         
         //Insert a row into the MyPlayers table
         clspersonne pers=new clspersonne();
         for(Object object : jsonArray) {
            JSONObject record = (JSONObject) object;
            pers.setId(Integer.parseInt((String) record.get("ID")));
            pers.setNom((String) record.get("nom"));
            pers.setNom((String) record.get("postnom"));
            pers.setNom((String) record.get("prenom"));
            pers.setAge(Integer.parseInt((String) record.get("age")));
            pers.setNom((String) record.get("genre"));
            pers.setNom((String) record.get("ville"));
            pers.insertdata(pers);
         }  
         System.out.println("Records inserted.....");
      } catch (FileNotFoundException e) {
         e.printStackTrace();
      } catch (IOException e) {
         e.printStackTrace();
      } catch (Exception e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
    }


    
    //change readJsonfile in insertjson file
}
