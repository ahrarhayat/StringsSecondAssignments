package StringsFirstAssignments;


/**
 * Write a description of Part3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Part3 {
    public boolean twoOccurrences(String stringa, String stringb)
    {
        int common1st=stringb.indexOf(stringa);
        
        if(common1st==-1)
        {
            return false;
        }
        
        int common2nd=stringb.indexOf(stringa,common1st+stringa.length());
        if(common2nd==-1)
        {
            return false;
        }
       
        return true;
    }
    
    public void testing()
    {
        String stringa="an";
        String stringb="banana";
        boolean result=twoOccurrences( stringa,stringb);
        String result_St=lastPart( stringa,  stringb);
        System.out.println(result_St);
        
        stringa="zoo";
        stringb="forest";
        result_St=lastPart( stringa,  stringb);
         System.out.println(result_St);
        
        //stringa="atg";
       // stringb="ctgtatgta";
       // result=twoOccurrences( stringa,stringb);
       //  System.out.println(result);
        
      //  stringa="Phone";
       //  stringb="Apple Phone: iPhone";
      //   result=twoOccurrences( stringa,stringb);
       //  System.out.println(result);
        
       //  stringa="phone";
       //  stringb="cell";
        // result=twoOccurrences( stringa,stringb);
       //  System.out.println(result);
       
       
      
    }
    public String lastPart(String stringa, String stringb)
    {
        int common1st=stringb.indexOf(stringa);
        
        if(common1st==-1)
        {
            return stringb;
        }
        else{
            return stringb.substring(common1st+stringa.length());
        }
        
        
    }
    
    
    public static void main(String args [])
    {
        Part3 p3=new Part3();
        p3.testing();
       
    }

}
