package org.joo.libra.sql.node;

import java.util.ArrayList;
import java.util.List;

import org.joo.libra.Predicate;

import lombok.Data;

@Data
public class ListItemExpressionNode implements ExpressionNode {

	private List<ExpressionNode> innerNode = new ArrayList<>();

	@Override
	public Predicate buildPredicate() {
		return null;
	}
}
