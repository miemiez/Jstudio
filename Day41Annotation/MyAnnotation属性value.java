package Day41Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//只允许该注解可以标注类，方法
@Target({ElementType.TYPE,ElementType.METHOD})
//希望这个注解可以被反射到
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation属性value {
	String value();//如果这个注解只有一个属性value，那么赋值时，属性值value可以不写
}
