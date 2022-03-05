package Methods;

public class randomInt {
    public static void main(String[] args) {
        double doubleRandomNumber = Math.random() * 1000;
        int randomNumber = (int)doubleRandomNumber;
        System.out.println("random number: " + randomNumber);
    }
}
