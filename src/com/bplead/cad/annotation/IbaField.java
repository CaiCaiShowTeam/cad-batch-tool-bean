/**
 * IbaField.java
 * 2018年10月15日
 */
package com.bplead.cad.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 2018年10月15日下午3:35:02
 */
@Retention(RetentionPolicy.RUNTIME)
@Target( { ElementType.FIELD})
public @interface IbaField {
    String target() default "EPMDocument";
    String ibaName() default "default";
    boolean panelAttr() default false;
}
