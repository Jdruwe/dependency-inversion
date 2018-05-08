package be.jeroendruwe.spring.dependencyinversion.provider;

import be.jeroendruwe.spring.dependencyinversion.model.Product;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service(value = Provider.Constants.HYBRIS)
public class HybrisProvider implements InversionProvider {

    @Override
    public List<Product> findAll(List<String> keywords) {

        List<Product> products = new ArrayList<>();
        Product product = new Product("Product from Hybris");
        products.add(product);
        return products;
    }
}
