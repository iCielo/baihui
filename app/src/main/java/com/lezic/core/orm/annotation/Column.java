package com.lezic.core.orm.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.FIELD })
@Inherited
public @interface Column {

	public enum Type {
		NULL, INTEGER, REAL, TEXT, BLOB
	};

	public Type type() default Type.NULL;
}
