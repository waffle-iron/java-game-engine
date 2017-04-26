package io.github.jakebacker.jge;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

public class GameObject {
	private ArrayList<Component> components = new ArrayList<>();
	public Transform transform;

	public String name = "";

	public GameObject() {
		name = "GameObject";
		transform = addComponent(Transform.class);
		Runner.sceneController.addGameObject(this);
	}

	public <T extends Component> T getComponent(Class<T> componentClass) {

		for(Component c : components) {
			if (c.getClass().getName().equals(componentClass.getName())) { // HACK
				return (T)c; // Another hack
			}
		}
		return null;
	}

	public <T extends Component> T addComponent(Class<T> componentClass) {
		try {
			T component = componentClass.getConstructor(GameObject.class).newInstance(this);
			components.add(component);
			return component;
		} catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
			System.out.println("This should not happen!!!");
		}
		return null; // There is a problem if you get here
	}


}
