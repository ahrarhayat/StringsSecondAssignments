
/**
 * Write a description of Part1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Part1 {
 public String   findSimpleGene(String dna)
 {
  //Start codon is ATG
  //Stop codon is TAA
  String Result="DNA: "+dna;
  if(dna.length()%3==0 )
        {
        
        
  int startCodon= dna.indexOf("ATG");
  
  if(startCodon==-1)//no ATG
  {
     
     return Result;
    }
    
    int stopCodon= dna.indexOf("TAA",startCodon+3);
    if(stopCodon==-1)//no TAA
    {
        
        return Result;
    }
    
  Result="Gene: "+dna.substring(startCodon,stopCodon+3)+"  DNA: "+dna;
}

    return Result;
}
    
    public void testSimpleGene()
    {
        String dna = "AGTAATGAGGTAGGAATAGGATAA";//DNA with gene
        String result=findSimpleGene(dna);
        System.out.println("Result: "+result);
        
        dna="AGTAATGAGGTAGGAATAGGTAA";//DNA with invalid gene
        result=findSimpleGene(dna);
        System.out.println("Result: "+result+" DNA with invalid gene");
        
        dna="AGTAGTGAGGTAGGAATAGGTAAG";//DNA with no ATG
        result=findSimpleGene(dna);
        System.out.println("Result: "+result+" DNA with no ATG");
        
        dna="AGTAGTGAGGTAGGAATAGGTAGG";//DNA with no TAA
        result=findSimpleGene(dna);
        System.out.println("Result: "+result+" DNA with no TAA");
        
        
        
    }
    public static void main(String args [])
    {
        Part1 p1= new Part1();
        p1.testSimpleGene();
    }
    
    

}
