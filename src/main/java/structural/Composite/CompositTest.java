package structural.Composite;

public class CompositTest {
    public static void main(String[] args) {
        Menu root = new Menu("/transfer", "Money Transfer");
        root.add(new MenuItem("/card-transfer", "Permanent Account Number"))
                .add(new MenuItem("/deposit-transfer", "Deposit number"));

        Menu subMenu = new Menu("/iban", "International Bank Account Number");
        subMenu.add(new MenuItem("/ach", "Automated Clearing House"))
                .add(new MenuItem("/rtgs", "Real-time gross settlement"));

        root.add(subMenu);

        System.out.println(root.toString());
    }
}
