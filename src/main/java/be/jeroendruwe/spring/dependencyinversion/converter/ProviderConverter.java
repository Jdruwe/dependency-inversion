package be.jeroendruwe.spring.dependencyinversion.converter;

import be.jeroendruwe.spring.dependencyinversion.provider.Provider;

import java.beans.PropertyEditorSupport;

public class ProviderConverter extends PropertyEditorSupport {

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        setValue(Provider.fromValue(text));
    }
}