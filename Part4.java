package StringsFirstAssignments;

import edu.duke.*;
import edu.duke.URLResource;
/**
 * Write a description of Part4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Part4 {
    public String FindYoutube(URLResource url)
    {
       
      
       String searchtext="youtube.com";
       String results="null";
       for(String words:url.words())
       {
          String itemLower= words.toLowerCase();
          int pos= itemLower.indexOf("youtube.com");
         
           if(pos!=-1)
           {
               int beg = itemLower.lastIndexOf("\"",pos);
               int end = itemLower.indexOf("\"",pos+1);
               System.out.println(itemLower.substring(beg+1,end));
            }
            
           
           
        }
        return "";
       
       
        
    }
    public void test()
    {
        URLResource url = new URLResource("http://www.dukelearntoprogram.com/course2/data/manylinks.html");
     
        String results=FindYoutube(url);
        System.out.println(results);
        
    }
    public static void main(String args [])
    {
        Part4 p4= new Part4();
        p4.test();
    }

}
