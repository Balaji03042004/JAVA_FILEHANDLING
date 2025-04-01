/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textfiles;

import java.io.File;

/**
 *
 * @author balaji.b
 */
public class FolderCreation {
    
    // create the new folder
    public static void createFolder(String folpath)
    {
        File folder=new File(folpath);
        if(!folder.exists())
        {
            folder.mkdir();
            System.out.print("Folder is successfully created");
        }
    }
    
    // check if the folder is exists or not 
    public static boolean checkFolder(String folpath)
    {
        File folder=new File(folpath);
        return folder.exists();
    }
    
    
    //rename the folder 
    public static void renameFolder(String oldpath,String newpath)
    {
        File oldfolder=new File(oldpath);
        File newfolder = new File(newpath);
        if(oldfolder.exists())
        {
            oldfolder.renameTo(newfolder);
            System.out.print("Rename the folder as"+newpath);
        }
    }
    
    //delete the folder and files
        public static void deleteFolder(String folpath)
        {
            File folder =new File(folpath);
            if(folder.exists())
            {
                for(File file:folder.listFiles())
                {
                    file.delete();
                }
                folder.delete();
                
            }
        }
    
    
    public static void main(String[] args)
            
    {
        String folpath="C:\\Users\\balaji.b\\Documents\\Testingfoldercreation\\sapmleFolder";
        String newname="C:\\Users\\balaji.b\\Documents\\Testingfoldercreation\\NewSample";
        createFolder(folpath);
        renameFolder(folpath,newname);
        deleteFolder(folpath);
         boolean data=checkFolder(folpath);
         System.out.print(data);
         
    }
}
