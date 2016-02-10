package org.example.svcimpl;

import java.util.Collection;
import java.util.Collections;

import org.example.api.FooService;
import org.example.model.Foo;
import org.osgi.service.component.annotations.Component;

@Component
public class FooServiceImpl implements FooService {

	@Override
	public Collection<Foo> getFoos() {
		return Collections.singletonList(new Foo() {
			@Override
			public String toString() {
				return "I am a Foo!";
			}
		});
	}

}
