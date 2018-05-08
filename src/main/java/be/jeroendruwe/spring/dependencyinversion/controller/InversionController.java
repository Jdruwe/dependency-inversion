package be.jeroendruwe.spring.dependencyinversion.controller;

import be.jeroendruwe.spring.dependencyinversion.converter.ProviderConverter;
import be.jeroendruwe.spring.dependencyinversion.model.Product;
import be.jeroendruwe.spring.dependencyinversion.provider.Provider;
import be.jeroendruwe.spring.dependencyinversion.service.InversionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/inversion")
public class InversionController {

    @Autowired
    private InversionService inversionService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Product>> findAll(@RequestParam(value = "provider") Provider provider, @RequestParam(value = "keywords") List<String> keywords) {
        List<Product> products = inversionService.findAll(provider, keywords);
        return ResponseEntity.ok().body(products);
    }

    @InitBinder
    public void initBinder(final WebDataBinder webdataBinder) {
        webdataBinder.registerCustomEditor(Provider.class, new ProviderConverter());
    }
}