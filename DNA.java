//program that determines whether there is a protein in a strand of DNA
public class DNA {
  public static void main(String[] args) {
	//Sample DNA strand 1  
    String dna1 = "ATGCGATACGCTTGA";
    //Sample DNA strand 2
    String dna2 = "ATGCGATACGTGA";
    //Sample DNA strand 3 
    String dna3 = "ATTAATATGTACTGA";
    //Generic variable
    String dna = dna3;
    
    System.out.println("DNA strand length: " + dna.length());
    
    int atg = dna.indexOf("ATG");
    System.out.println("DNA starting index: " + atg);

    int tga = dna.indexOf("TGA");
    System.out.println("DNA ending index: " + tga);
    
    if (atg != -1 && tga != -1 && (atg - tga) % 3 == 0) {
      System.out.println("Condition 1, 2 & 3 are satisfied.");
      String protein = dna.substring(atg, tga + 3);
      System.out.println("Protein: " + protein);
    }
    else {
      System.out.println("No protein is present");
    }
  }
}