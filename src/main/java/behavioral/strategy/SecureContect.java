package behavioral.strategy;

import java.util.Objects;

public class SecureContect {
    private String raw;

    public SecureContect(String raw) {
        Objects.requireNonNull(raw);
        this.raw = raw;
    }

    public byte[] hashContent(HashStrategy hashStrategy) {
        return hashStrategy.hash(raw);
    }
}
