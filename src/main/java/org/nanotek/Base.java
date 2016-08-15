package org.nanotek;

import java.util.Optional;
import java.io.Serializable;
import java.util.function.Supplier;

//TODO: Implement HashCode, Equals, and ToString as default methods of Base classes.
//https://www.mkyong.com/java/java-custom-annotations-example/
//http://www.coderanch.com/t/477462/ORM/databases/Business-key-hibernate
public interface Base<K extends Serializable> extends Identifiable <K>  {

	public void setId(K id);
	
	default <T> T newAnyType(Supplier<T> supplier)
	{ 
		return supplier.get();
	}
	
	default <T> T ofNullable(T dest , Supplier<T> supplier) 
	{ 
		return Optional.ofNullable(dest).orElseGet(supplier); 
	}
	
	default <T extends Base<?>> T newType(Supplier<T> baseSupplier)
	{ 
		return baseSupplier.get();
	}
	
}
