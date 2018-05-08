package be.jeroendruwe.spring.dependencyinversion.service;

import be.jeroendruwe.spring.dependencyinversion.model.Product;
import be.jeroendruwe.spring.dependencyinversion.provider.Provider;

import java.util.List;

public interface InversionService {

    List<Product> findAll(Provider provider, List<String> keywords);
}
