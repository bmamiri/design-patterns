package creational.prototype;

public class PrototypeTest {
    public static void main(String[] args) {
        Statement statement = Statement.getBuilder()
                .setFrom("from Employee")
                .setProjection("select firstName, lastName")
                .setWhere(" where id = 11")
                .createStatement();

        statement.setRecord(new Record());

        System.out.println("Hash code of statement before clone is: " + statement.hashCode());
        System.out.println("Hash code of record before clone is: " + statement.getRecord().hashCode());

        //Shallow copy
        Statement clone = statement.clone();

        System.out.println("Hash code of statement after clone is: " + clone.hashCode() +
                " //Hash code changed after clone");
        System.out.println("Hash code of record after clone is: " + statement.getRecord().hashCode() +
                " //Hash code not changed, because it's \"Shallow copy\" ");
    }
}
