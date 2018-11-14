public class Bob {
  public void authorize(int n, int r1, int r2) {
    System.out.println("Bob sends Cathy his and Alice's info to authorize Alice"
                        + " and get a session key for communication");
    System.out.println("Encrypted message is: ");
    System.out.println(n + "|| Alice || Bob || {" + r1 + "|| " + n + " || Alice || Bob}Kac || {"
                        + r2 + " || " + n + " || Alice || Bob}Kbc");
    System.out.println("Unencrypted message is: ");
    System.out.println(r1 + "|| " + n + " || Alice || Bob || " + r2 + " || " + n + " || Alice || Bob\n");

  }

  public void sendSession(int n, int r1) {
      System.out.println("Bob send Alice session Key encrypted with her shared key with"
                          + " Cathy along with the session number and random number to ensure integrity");
      System.out.println("Encrypted message is: ");
      System.out.println(n + " || {" + r1 + " || Ks}Kac");
      System.out.println("Unencrypted message is: ");
      System.out.println(r1 + " || Ks");
  }
}
