package creational.abstractfactory.mediaconverter;

import creational.abstractfactory.mediaconverter.exception.ConvertionException;

import java.io.File;

public abstract class Converter {
    private byte[] input;

    public Converter(byte[] input) {
        this.input = input;
    }

    public Converter(File input) {
    }

    public abstract byte[] convert() throws ConvertionException;

    public enum codecTypes {
        BPM, JPG, PNG,
        MP3, WAV, AAC,
        MP4, AVI, MKV
    }
}
