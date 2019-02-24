package creational.abstractfactory;

import creational.abstractfactory.mediaconverter.Converter;
import creational.abstractfactory.mediaconverter.factory.MediaConverterAbstractFactory;
import creational.abstractfactory.mediaconverter.factory.MediaFactory;

import java.io.File;

public class AbstractFactoryTest {
    public static void main(String[] args) throws Exception {
        MediaFactory factory =
                MediaConverterAbstractFactory.createFactory(MediaConverterAbstractFactory.MediaFactoryType.IMAGE);
        Converter converter =
                factory.createConverter(new File("/tmp/Book.jpg"), Converter.CodecTypes.JPG);
        System.out.println(factory.getClass());
        System.out.println(converter.getClass());
        byte[] convert = converter.convert();
    }
}