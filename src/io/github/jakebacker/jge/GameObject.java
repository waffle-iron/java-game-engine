package io.github.jakebacker.jge;

import java.util.ArrayList;

public class GameObject {
	private ArrayList<Component> components = new ArrayList<>();

	public <T extends Component> Component getComponent(Class<T> componentClass) {

		for(Component c : components) {
			if (c.getClass().getName().equals(clazz.getName())) { // HACK
				return c;
			}
		}
		return null;
	}

	public <T extends Component> Component addComponent(Class<T> componentClass) {
		
	}


}
