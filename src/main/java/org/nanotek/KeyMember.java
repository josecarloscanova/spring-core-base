package org.nanotek;

import java.lang.annotation.Target;
import java.lang.annotation.Retention;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD) //can use in method only.
public @interface KeyMember {
	
	//should ignore this test?
	public boolean businessKeyMember() default true;

	//should ignore this test?
	public boolean toStringMember() default true;

	//should ignore this test?
	public boolean hashCodeMember() default false;
	
}