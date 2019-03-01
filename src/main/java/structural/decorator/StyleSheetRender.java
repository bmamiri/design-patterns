package structural.decorator;

public class StyleSheetRender extends Render {

    private Render render;

    public StyleSheetRender() {
    }

    public StyleSheetRender(Render render, Attribute... attributes) {
        super(attributes);
        this.render = render;
    }

    @Override
    public String write() {
        String styles = writeAttributesAsStyle(getAttributes());
        if (styles != null)
            styles = "style=\"" + styles + "\"";
        return "<div class='form-input' " + styles + ">" + render.write() + "</dive>";
    }
}
