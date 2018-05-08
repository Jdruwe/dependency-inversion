package be.jeroendruwe.spring.dependencyinversion.provider;

import be.jeroendruwe.spring.dependencyinversion.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service(value = Provider.Constants.ZALANDO)
public class ZalandoProvider implements InversionProvider {

    @Override
    public List<Product> findAll(List<String> keywords) {

        List<Product> products = new ArrayList<>();
        Product product = new Product("Product from Zalando");
        products.add(product);
        return products;
    }
}
