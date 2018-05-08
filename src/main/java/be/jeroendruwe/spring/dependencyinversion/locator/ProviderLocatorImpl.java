package be.jeroendruwe.spring.dependencyinversion.locator;

import be.jeroendruwe.spring.dependencyinversion.provider.InversionProvider;
import be.jeroendruwe.spring.dependencyinversion.provider.Provider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class ProviderLocatorImpl implements ProviderLocator {

    @Autowired
    private Map<String, InversionProvider> providerRegistry;

    public InversionProvider getInstance(Provider provider) {
        return providerRegistry.get(provider.getValue());
    }
}
