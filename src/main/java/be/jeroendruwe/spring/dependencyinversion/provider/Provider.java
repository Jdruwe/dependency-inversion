package be.jeroendruwe.spring.dependencyinversion.provider;

import java.util.Arrays;

public enum Provider {

    ZALANDO(Constants.ZALANDO),
    HYBRIS(Constants.HYBRIS);

    private String value;

    Provider(String value) {
        this.value = value;
    }

    public static Provider fromValue(String value) {

        for (Provider provider : values()) {
            if (provider.value.equalsIgnoreCase(value)) {
                return provider;
            }
        }

        throw new IllegalArgumentException(
                "Unknown provider type " + value + ", Allowed values are " + Arrays.toString(values()));
    }

    public String getValue() {
        return value;
    }

    public static class Constants {
        public static final String ZALANDO = "zalando";
        public static final String HYBRIS = "hybris";
    }
}