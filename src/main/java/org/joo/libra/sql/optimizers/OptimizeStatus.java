package org.joo.libra.sql.optimizers;

import org.joo.libra.sql.node.ExpressionNode;

public class OptimizeStatus {

    private final ExpressionNode node;

    private final int changes;

    public OptimizeStatus(ExpressionNode node, int changes) {
        this.node = node;
        this.changes = changes;
    }

    public ExpressionNode getNode() {
        return node;
    }

    public int getChanges() {
        return changes;
    }
}
