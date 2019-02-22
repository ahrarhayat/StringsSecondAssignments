
/**
 * Write a description of Part2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Part2 {
     public String   findSimpleGene(String dna, String startCodon, String stopCodon)
 {
  //Start codon is ATG
  //Stop codon is TAA
  String Result="DNA: "+dna;
  if(dna.length()%3==0 )
        {
        
        
  int startCodonindex= dna.indexOf(startCodon);
  
  if(startCodonindex==-1)//no ATG
  {
     
     return Result;
    }
    
    int stopCodonindex= dna.indexOf(stopCodon,startCodonindex+3);
    if(stopCodonindex==-1)//no TAA
    {
        
        return Result;
    }
    
  Result="Gene: "+dna.substring(startCodonindex,stopCodonindex+3)+"  DNA: "+dna;
}

    return Result;
}
    
    public void testSimpleGene()
    {
        String dna = "AGTAATGAGGTAGGAATAGGATAA";//DNA with gene
        String startCodon="ATG";
        String stopCodon="TAA";
        String result=findSimpleGene(dna,startCodon,stopCodon);
        System.out.println("Result: "+result);
        
        dna="AGTAATGAGGTAGGAATAGGTAA";//DNA with invalid gene
        result=findSimpleGene(dna,startCodon,stopCodon);
        System.out.println("Result: "+result+" DNA with invalid gene");
        
        dna="AGTAGTGAGGTAGGAATAGGTAAG";//DNA with no ATG
        result=findSimpleGene(dna,startCodon,stopCodon);
        System.out.println("Result: "+result+" DNA with no ATG");
        
        dna="AGTAGTGAGGTAGGAATAGGTAGG";//DNA with no TAA
        result=findSimpleGene(dna,startCodon,stopCodon);
        System.out.println("Result: "+result+" DNA with no TAA");
        
        dna="agtaatgaggtaggaataggtaa";
        result=findSimpleGene(dna,startCodon,stopCodon);
        System.out.println("Result: "+result);
        
        
        
        
        
    }
    public static void main(String args [])
    {
        Part2 p2= new Part2();
        p2.testSimpleGene();
    }
    

}
