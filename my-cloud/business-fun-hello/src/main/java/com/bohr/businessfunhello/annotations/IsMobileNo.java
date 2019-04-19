package com.bohr.businessfunhello.annotations;


import com.bohr.businessfunhello.annotations.validator.IsMobileNoValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * 自定义Validation 注解，校验是否是手机号
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = IsMobileNoValidator.class)
public @interface IsMobileNo {

    boolean require() default true;

    String message() default "手机号格式不正确";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
