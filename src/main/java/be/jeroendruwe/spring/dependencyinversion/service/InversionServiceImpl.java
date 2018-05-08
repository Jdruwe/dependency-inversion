package be.jeroendruwe.spring.dependencyinversion.service;

import be.jeroendruwe.spring.dependencyinversion.locator.ProviderLocator;
import be.jeroendruwe.spring.dependencyinversion.model.Product;
import be.jeroendruwe.spring.dependencyinversion.provider.InversionProvider;
import be.jeroendruwe.spring.dependencyinversion.provider.Provider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InversionServiceImpl implements InversionService {

    @Autowired
    private ProviderLocator providerLocator;

    @Override
    public List<Product> findAll(Provider provider, List<String> keywords) {

        List<Product> products = new ArrayList<>();

        InversionProvider inversionProvider = providerLocator.getInstance(provider);
        if (inversionProvider != null) {
            return inversionProvider.findAll(keywords);
        }

        return products;
    }
}
