package de.noahlehmann.hofbusapi.util.gtfs.validation;

import javax.validation.Constraint;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.Payload;
import javax.validation.constraints.NotNull;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Documented
@Constraint(validatedBy = GtfsRequired.Validator.class)
@Target({FIELD})
@Retention(RUNTIME)
@NotNull
public @interface GtfsRequired {

    String message() default "Field is required";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    boolean required() default true;

    class Validator implements ConstraintValidator<GtfsRequired, Object> {

        private boolean required;

        @Override
        public void initialize(GtfsRequired constraintAnnotation) {
            required = constraintAnnotation.required();
        }

        @Override
        public boolean isValid(Object value, ConstraintValidatorContext context) {
            return !required || value != null; // TODO: 24.01.23 more complex
        }
    }
}
