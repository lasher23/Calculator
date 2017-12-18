package ch.lu.bbzw.calculator.operators.builder.preparation;

import java.util.ArrayList;
import java.util.List;

public final class PreparatorManager {
	private static List<Preparator> preparators = new ArrayList<>();
	
	static {
		preparators.add(new SinPreparator());
		preparators.add(new CosPreparator());
	}
	
	private PreparatorManager() {
		throw new IllegalAccessError();
	}
	
	public static String pepare(String prepare) {
		for (Preparator preparator : preparators) {
			prepare = preparator.prepare(prepare);
		}
		return prepare;
	}
}
