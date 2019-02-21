package creational.abstractfactory.mediaconverter.factory;

import creational.abstractfactory.mediaconverter.Converter;

import java.io.File;

public class VideoConverterFactory implements MediaFactory {

    @Override
    public Converter createConverter(File file, Converter.codecTypes codecTypes) {

        String fileName = file.getName().toLowerCase();

        throw new IllegalStateException("Converter not found");
    }
}
