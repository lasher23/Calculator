package ch.lu.bbzw.calculator.frontend;

import java.util.ArrayList;
import java.util.List;

public class ObservableString {
	private List<StringChangeListener> listeners = new ArrayList<>();
	private String value = "";

	public void addListener(StringChangeListener listener) {
		listeners.add(listener);
	}

	public void removeListener(StringChangeListener listener) {

	}

	public void set(String value) {
		String oldValue = new String(value);
		this.value = value;
		fireChangeListeners(oldValue);
	}

	public String getValue() {
		return value;
	}

	private void fireChangeListeners(String oldValue) {
		for (StringChangeListener numberChangeListener : listeners) {
			numberChangeListener.onNumberChange(value, oldValue);
		}
	}

	@Override
	public String toString() {
		return value;
	}

	public void reset() {
		value = "";
	}

	@FunctionalInterface
	public interface StringChangeListener {
		void onNumberChange(String newValue, String oldValue);
	}
}
