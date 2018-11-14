import java.util.Random;

public class Alice {

  Random rand = new Random();

  //private int n = rand.nextInt(50);
  //private int r1 = rand.nextInt(999999);

    public void initiate(int n, int r1) {
      System.out.println("Alice sends Bob request to begin interaction");
      System.out.print ("Encrypted message is: ");
      System.out.println(n + "|| Alice || Bob || {" + r1 + "|| " + n + " || Alice || Bob}Kac\n");
    }
}
