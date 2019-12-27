package org.joo.libra.support.eval;

import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class EvaluationKey {

    private Class<?> clazz;

    private String variableName;

    @Override
    public int hashCode() {
        return Objects.hash(clazz, variableName);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || !this.getClass().equals(o.getClass())) {
            return false;
        }
        EvaluationKey that = (EvaluationKey) o;
        return Objects.equals(clazz, that.clazz)
                && Objects.equals(variableName, that.variableName);
    }
}
