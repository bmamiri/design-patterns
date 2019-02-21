package creational.abstractfactory.mediaconverter.factory;

public interface MediaConverterAbstractFactory {

    enum MediaFactoryType {
        VIDEO, MUSIC, IMAGE
    }

    static MediaFactory createFactory(MediaFactoryType mediaFactoryType) {
        switch (mediaFactoryType) {
            case VIDEO:
                return new ImageConverterFactory();
            case MUSIC:
                return new MusicConverterFactory();
            case IMAGE:
                return new ImageConverterFactory();
        }
        throw new IllegalStateException("Bad Type");
    }
}
