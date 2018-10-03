package org.joo.libra.sql.node;

import lombok.Data;

@Data
public abstract class UnaryExpressionNode implements ExpressionNode {

    private ExpressionNode innerNode;
}