package creational.abstractfactory.mediaconverter.factory;

import creational.abstractfactory.mediaconverter.Converter;
import creational.abstractfactory.mediaconverter.image.Bmp2JpgConverter;

import java.io.File;

public class ImageConverterFactory implements MediaFactory {

    @Override
    public Converter createConverter(File file, Converter.codecTypes codecTypes) {

        String fileName = file.getName().toLowerCase();
        if (fileName.endsWith(".jpg")) {
            switch (codecTypes) {
                case JPG:
                    return new Bmp2JpgConverter(file);
            }
        }
        throw new IllegalStateException("Converter not found");
    }
}
