
/*
* To change this template, choose Tools | Templates
* and open the template in the editor.
 */
package edu.mass.qcc.qcccodewizard;

//~--- non-JDK imports --------------------------------------------------------


//~--- JDK imports ------------------------------------------------------------

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;
import org.netbeans.api.editor.EditorRegistry;
import org.netbeans.modules.editor.NbEditorUtilities;
import org.openide.filesystems.FileUtil;

/**
 *
 * @author Ian
 */
public final class GetVariableDeclarations  {
    ArrayList myNameArray = new ArrayList();
    ArrayList myTypeArray = new ArrayList();
    String[] typeList = {"int", "char", "string", "bool", "float", "double"};
    StringBuilder sb = new StringBuilder();
    //Types to search for.
   
    public GetVariableDeclarations() throws FileNotFoundException   {
        System.out.println("This: "+this.toString());
       InputStream     in = null;
            //Open the C++ source for parsing.
        
            java.io.File currentFile =
                FileUtil.toFile(NbEditorUtilities.getFileObject
                               (EditorRegistry.lastFocusedComponent().getDocument()));
            
            in = new FileInputStream(currentFile);
        
            //Parse using scanner class.
                Pattern pattern;
                String finds;
                
            Scanner         scan = new Scanner(in);
                
                    
                        System.out.println("Searching for variables...");
                        String Name = "";
                        /*
        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            for (String type : typeList) {

                if (line.contains(type)) {
                    //get the names of the variables.
                    String splitArray[] = line.split(" ");

                    for (int piece = 0; piece < splitArray.length; piece++) {
                        if (splitArray[piece].equals(type)) {
                            if (splitArray[piece + 1] != null) {
                                Name = splitArray[piece + 1];
                            }

                            if (Name.equals("*") || (Name.equals("**"))) {
                                if (splitArray[piece + 2] != null) {
                                    Name = splitArray[piece + 2];
                                }
                            }
                            if (Name.contains(",") || Name.contains(";")) {
                                Name = Name.replace(",", "");
                                Name = Name.replace(";", "");
                            }
                            if (Name.contains("(") || Name.contains(")")) {
                                Name = Name.replace("(", " ");
                                Name = Name.replace(")", " ");

                            }
                            if (Name.contains(" ")) {
                                String[] secondPass = Name.split(" ");
                                for (String element : secondPass) {
                                    for (int i = 0; i < typeList.length; i++) {
                                        if (element.equals(typeList[i])) {
                                            typeList[i] = "";
                                            Name = secondPass.toString();

                                        }
                                    }
                                }

                            }
                        }

                    }
                                    
                                    System.out.println("match found.");
                                    sb.append(Name).append(":");
                                }
                            }
                            
                        }
                        */
                        
                    
                System.out.println("Setting Results.");
                //Set results.
                String[] results = sb.toString().split(":");
                for (String each : results){
                     this.setMyArray(each);
                }
        
   
    }
    /**
     * @return the myNameArray
     */
    public ArrayList getMyArray() {
        return myNameArray;
    }

    /**
     * @param myArray 
     */
    public void setMyArray(String myArray) {
        this.myNameArray.add(myArray);
    }

    /**
     * @return the myTypeArray
     */
    public ArrayList getMyTypeArray() {
        return myTypeArray;
    }

    /**
     * @param myTypeArray the myTypeArray to set
     */
    public void setMyTypeArray(String myType) {
        this.myTypeArray.add(myType);
    }
}




//~ Formatted by Jindent --- http://www.jindent.com
