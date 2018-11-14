import java.util.Random;

public class OtwayRees {

  public static void main(String[] args) {
    Random rand = new Random();
    // Numbers involved with protocol. Ranges are arbitrary
    int n = rand.nextInt(50); //Session number
    int r1 = rand.nextInt(999999); //random number 1
    int r2 = rand.nextInt(999999); //random number 2

    Alice a = new Alice(); //Person who wants to initiate communication
    Bob b = new Bob(); //Person wanting to be communicated with
    Cathy c = new Cathy(); // Trusted 3rd Party

    a.initiate(n, r1);
    b.authorize(n, r1, r2);
    c.sendSessionKey(n, r1, r2);
    b.sendSession(n, r1);

    String m = "Hello Bob! So nice to hear from you again."; //first message

    a.sendMessage(m);
  }

}
