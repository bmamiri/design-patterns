package structural.proxy;

public class ProxyTest {
    public static void main(String[] args) throws Exception {
        Class<?> aClass = Class.forName("structural.proxy.ProxyTest");
        Object testObject = aClass.newInstance();
        Object plus = aClass.getMethod("plus", int.class, int.class)
                .invoke(testObject, 12, 12);
        System.out.println(plus);
    }

    public int plus(int x, int y) {
        return x + y;
    }
}
