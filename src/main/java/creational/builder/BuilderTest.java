package creational.builder;

public class BuilderTest {
    public static void main(String[] args) {
        H264PropertiesBuilder h264PropertiesBuilder = new H264PropertiesBuilder();
        H264Properties h264Properties = h264PropertiesBuilder.bFrames(12).keyInt(15).minKeyInt(2).sceneCut(2).build();
    }
}
