/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import static java.util.Locale.filter;
import javax.swing.JFileChooser;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import jdk.nashorn.internal.parser.JSONParser;
import org.json.JSONArray;
import org.json.JSONObject;

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
      JSONParser jsonParser;
      try {
          jsonParser = new JSONParser(new FileReader("E:/players_data.json").toString(), null, true);
         //Parsing the contents of the JSON file
         JSONObject jsonObject = (JSONObject) jsonParser.parse();
         //Retrieving the array
         JSONArray jsonArray = (JSONArray) jsonObject.get("players_data");
         for(Object object : jsonArray) {
            JSONObject record = (JSONObject) object;
            //lst.add();
//            int id = Integer.parseInt((String) record.get("ID"));
//            String first_name = (String) record.get("First_Name");
//            String last_name = (String) record.get("Last_Name");
//            String date = (String) record.get("Date_Of_Birth");
//            long date_of_birth = Date.valueOf(date).getTime();
//            String place_of_birth = (String) record.get("Place_Of_Birth");
//            String country = (String) record.get("Country");
         }  
         System.out.println("Records inserted.....");
      } catch (Exception e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
    }
}
