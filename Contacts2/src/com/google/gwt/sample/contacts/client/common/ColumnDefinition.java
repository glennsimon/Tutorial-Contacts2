package com.google.gwt.sample.contacts.client.common;

import com.google.gwt.user.client.ui.Widget;

public abstract class ColumnDefinition<T> {
	public abstract Widget /*void*/ render(T t); // , StringBuilder sb);

	public boolean isClickable() {
		return false;
	}

	public boolean isSelectable() {
		return false;
	}
}
