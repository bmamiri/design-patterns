package structural.decorator;

public class DecoratorTest {
    public static void main(String[] args) {
        Render submitInputElement = new SubmitInputElement(new Attribute("id", "id12")
                , new Attribute("value", "Save"));

        System.out.println(submitInputElement.write());

        StyleSheetRender sheetRender = new StyleSheetRender(submitInputElement,
                new Attribute("height", "200px"));

        System.out.println(sheetRender.write());
    }
}
