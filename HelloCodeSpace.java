import java.util.Set;
import java.util.TreeSet;

public class HelloCodeSpace{
  public static void main(String[] args){
    System.out.println("Hello Java Code Space");
    
    String  characterLatter = "the quick brown fox jumps over the lazy dog";

    Set<Character> aToZee = new TreeSet<Character>();
    for(char mychar : characterLatter.toCharArray())
       aToZee.add(mychar);

       System.out.println("The characters is :" + characterLatter);
       System.out.println("The sorted characters are :" + aToZee);
  }
}