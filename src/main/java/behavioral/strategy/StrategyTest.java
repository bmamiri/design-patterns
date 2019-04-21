package behavioral.strategy;

public class StrategyTest {
    public static void main(String[] args) {
        SecureContect secureContect = new SecureContect("P@ssw0rd");
        byte[] bytes = secureContect.hashContent(new SHA256Hash());
        System.out.println(new String(bytes));
    }
}
