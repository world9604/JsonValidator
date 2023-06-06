package device.apps.jsonvalidator.validator.pattern;

import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class FirstElementPatternValidator implements ConstraintValidator<FirstElementPattern, List<String>> {
    private String pattern;

    @Override
    public void initialize(FirstElementPattern constraintAnnotation) {
        this.pattern = constraintAnnotation.pattern();
    }

    @Override
    public boolean isValid(List<String> value, ConstraintValidatorContext context) {
        if (value == null || value.isEmpty()) {
            return true;
        }

        if (value.get(0) != null) {
            return value.get(0).matches(pattern);
        }

        return true;
    }
}

