public class Cathy {

  public void sendSessionKey(int n, int r1, int r2) {
    System.out.println("Cathy authorizes Alice and sends Bob session keys encryted "
                        + "with both of their shared keys with Cathy");
    System.out.println("Encrypted message is: ");
    System.out.println(n + " || {" + r1 + " || Ks}Kac || {" + r2 + " || Ks}Kbc");
    System.out.println("Unencrypted Message is(For Bob): ");
    System.out.println(r2 + " || Ks\n");
  }
}
