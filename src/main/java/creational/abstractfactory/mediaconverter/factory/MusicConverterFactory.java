package creational.abstractfactory.mediaconverter.factory;

import creational.abstractfactory.mediaconverter.Converter;

import java.io.File;

public class MusicConverterFactory implements MediaFactory {

    @Override
    public Converter createConverter(File file, Converter.CodecTypes codecTypes) {

        throw new IllegalStateException("Converter not found");
    }
}
