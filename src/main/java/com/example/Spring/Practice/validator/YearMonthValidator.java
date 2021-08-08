package com.example.Spring.Practice.validator;

import com.example.Spring.Practice.annotation.YearMonth;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class YearMonthValidator implements ConstraintValidator<YearMonth, String> {
    String pattern;         // Check Value

    @Override
    public void initialize(YearMonth constraintAnnotation) {
        //ConstraintValidator.super.initialize(constraintAnnotation);
        this.pattern = constraintAnnotation.pattern();      // Annotation Pattern ( @YearMonth Pattern )
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        // value ( Parameter Value )
        try {
            LocalDate localDate = LocalDate.parse(value + "01", DateTimeFormatter.ofPattern(this.pattern));
            //LocalDate localDate = LocalDate.parse(this.reqYearMonth, DateTimeFormatter.ofPattern("yyyyMMdd"));

            /*
            * LocalData 에는 Date 가 기본적으로 있고, 사용자가 입력한 값과 LocalData 가 매핑이 되면, 정상적인 값으로 판단.
            */
        }catch (Exception e){
            return false;
        }

        return true;
    }
}
