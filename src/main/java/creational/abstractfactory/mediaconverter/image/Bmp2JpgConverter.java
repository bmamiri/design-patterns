package creational.abstractfactory.mediaconverter.image;

import creational.abstractfactory.mediaconverter.Converter;

import java.io.File;

public class Bmp2JpgConverter extends Converter {
    public Bmp2JpgConverter(File input) {
        super(input);
    }

    @Override
    public byte[] convert()   {
        return new byte[0];
    }
}
