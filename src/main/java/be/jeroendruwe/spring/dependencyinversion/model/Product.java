package be.jeroendruwe.spring.dependencyinversion.model;

public class Product {

    private String name;

    public Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
