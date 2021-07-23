import people.*;
public class HelloChercheur {
  
  public static void main(String[] args){
    // implementing array 

    IChercheur ensChercheur = new EnsChercheurTable("Dupont", "Jean", 20);

    System.out.println("Hello Chercheur ARRAY "+ ensChercheur);
    System.out.println();

    ensChercheur.ajuterPublication("Using Interfaces in Java, Dupont J., 2021");

    System.out.println("Hello Chercheur ARRAY "+ensChercheur);
    System.out.println();

    System.out.println("Total de personnes: " +Personne.getNombrePersonnes());

    // implementing vector 
    
    IChercheur ensChercheurVector = new EnsChercheurVector("Dupont", "Jean", 20);
    System.out.println("Hello Chercheur2 VECTOR "+ensChercheurVector);
    System.out.println();

    ensChercheurVector.ajuterPublication("Using Interfaces in Java, Dupont J., 2021");

    System.out.println("Hello Chercheur2 VECTOR "+ensChercheurVector);
    System.out.println();


    // implementing TreeSet 

    IChercheur ensChercheurTreeSet = new EnsChercheurTreeSet("Dupont", "Jean", 20);
    System.out.println("Hello Chercheur3 TreeSet "+ensChercheurVector);
    System.out.println();

    ensChercheurTreeSet.ajuterPublication("Using Interfaces in Java, Dupont J., 2021");

    System.out.println("Hello Chercheur3 TreeSet "+ensChercheurTreeSet);
    System.out.println();

  }
}