package be.jeroendruwe.spring.dependencyinversion.provider;

import be.jeroendruwe.spring.dependencyinversion.model.Product;

import java.util.List;

public interface InversionProvider {

    List<Product> findAll(List<String> keywords);
}
