public class DNA {
    //program checks whether there is a protein in a DNA sequence
   
    public static void main(String[] args) {
   
      //  -. .-.   .-. .-.   .
      //    \   \ /   \   \ / 
      //   / \   \   / \   \  
      //  ~   `-~ `-`   `-~ `-
  
      String dna1 = "ATGCGATACGCTTGA";
      String dna2 = "ATGCGATACGTGA";
      String dna3 = "ATTAATATGTACTGA";
  
      String dna = dna1;
  
      if(dna.indexOf("ATG") != -1 && dna.indexOf("TGA") != -1 && (dna.indexOf("ATG") - dna.indexOf("TGA")) % 3 == 0){
         System.out.println("Condition 1 and 2 and 3 are satisfied.");
  
         String protein = dna.substring(dna.indexOf("ATG"), dna.indexOf("TGA")+3); 
          System.out.println("Protein: " + protein);
   
  
      } else {
        System.out.println("No protein");
      }
    }
   
  }
