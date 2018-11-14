import java.util.Random;

public class OtwayRees {

  //Random rand = new Random();

  //int n = rand.nextInt(50);
  //int r1 = rand.nextInt(999999);
  //int r2 = rand.nextInt(999999);

  public static void main(String[] args) {
    Random rand = new Random();

    int n = rand.nextInt(50);
    int r1 = rand.nextInt(999999);
    int r2 = rand.nextInt(999999);

    Alice a = new Alice();
    Bob b = new Bob();
    Cathy c = new Cathy();

    a.initiate(n, r1);
    b.authorize(n, r1, r2);
    c.sendSessionKey(n, r1, r2);
    b.sendSession(n, r1);

  }

}
