/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import static java.util.Locale.filter;
import javax.swing.JFileChooser;
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
    
   public void readJsonfile(){
     
       
//      JSONParser jsonParser;
//        jsonParser = new JSONParser("./.json", null, true);
//      try {
//         //Parsing the contents of the JSON file
//         JSONObject jsonObject = (JSONObject) jsonParser.parse();
//         //Retrieving the array
//         JSONArray jsonArray = (JSONArray) jsonObject.get("people");
//         List<String> list = new ArrayList<String>();
//         for(Object object : jsonArray) {
//            JSONObject record = (JSONObject) object;
////            list.add(record.getJSONArray(jsonArray));
//        }  
//      } catch (Exception e) {
//         // TODO Auto-generated catch block
//         e.printStackTrace();
//      }
   }
}
