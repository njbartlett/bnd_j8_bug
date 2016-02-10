package org.example.api;

import java.util.Collection;

import org.example.model.Foo;
import org.osgi.annotation.versioning.ProviderType;

@ProviderType
public interface FooService {
	
	Collection<Foo> getFoos();
	
}
