package com.bohr.businessfunhello.annotations.validator;

import com.bohr.businessfunhello.annotations.IsMobileNo;
import com.bohr.businessfunhello.utils.RegexUtils;
import org.apache.commons.lang.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * 自定义Validation校验注解 实现类
 * @author Bohr
 */
public class IsMobileNoValidator implements ConstraintValidator<IsMobileNo,String > {

    private boolean require = false;

    @Override
    public void initialize(IsMobileNo constraintAnnotation) {
        require = constraintAnnotation.require();
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if(require){
            return RegexUtils.isMobile(s);
        }else {
            if (StringUtils.isEmpty(s)) {
                return true;
            }else {
                return RegexUtils.isMobile(s);
            }
        }
    }
}
