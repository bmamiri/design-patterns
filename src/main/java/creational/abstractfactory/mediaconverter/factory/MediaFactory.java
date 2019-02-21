package creational.abstractfactory.mediaconverter.factory;

import creational.abstractfactory.mediaconverter.Converter;

import java.io.File;

public interface MediaFactory {
    Converter createConverter(File file, Converter.codecTypes codecTypes);
}
