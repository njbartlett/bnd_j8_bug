package org.example.client;

import org.example.api.FooService;
import org.osgi.service.component.annotations.*;

@Component(
		service = Object.class,
		immediate = true,
		property = {
				"osgi.command.scope=bug",
				"osgi.command.function=crash"
		})
public class ExampleCommand {
	
	@Reference
	private FooService fooSvc;

	public void crash() {
		System.out.println("Crashing in 3... 2... 1... ");
		
		// This version fails because bnd does not see the dependency on org.example.model.Foo
		fooSvc.getFoos().forEach(System.out::println);

		// This version works because the (f) var creates this dependency
		//fooSvc.getFoos().forEach(f -> System.out.print(f));
	}
	
}
