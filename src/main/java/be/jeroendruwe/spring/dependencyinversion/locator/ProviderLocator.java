package be.jeroendruwe.spring.dependencyinversion.locator;

import be.jeroendruwe.spring.dependencyinversion.provider.InversionProvider;
import be.jeroendruwe.spring.dependencyinversion.provider.Provider;

public interface ProviderLocator {

    InversionProvider getInstance(Provider provider);
}
