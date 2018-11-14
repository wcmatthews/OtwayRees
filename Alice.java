public class Alice {

    public void initiate(int n, int r1) {
      System.out.println("Alice sends Bob request to begin interaction");
      System.out.print ("Encrypted message is: ");
      System.out.println(n + "|| Alice || Bob || {" + r1 + "|| " + n + " || Alice || Bob}Kac\n");
    }

    public void sendMessage(String m) {
      System.out.println("Alice sends first message with new session key");
      System.out.println("Encrypted message is: {" + m + "}Ks");
      System.out.println("Decrypted message is: " + m + "\n");
    }
}
