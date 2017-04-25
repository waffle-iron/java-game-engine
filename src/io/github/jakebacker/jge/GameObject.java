package io.github.jakebacker.jge;

import java.util.ArrayList;

public class GameObject {
	private ArrayList<Component> components = new ArrayList<>();

	public <T> Component getComponent(Class<T> clazz) {

		for(Component c : components) {
			if (c.getClass().getName().equals(clazz.getName())) { // HACK

			}
		}
	}
}
