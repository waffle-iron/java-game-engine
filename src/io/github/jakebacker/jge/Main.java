package io.github.jakebacker.jge;

public class Main {

	static GameObject go;

	public static void main(String[] args) {
		go = new GameObject();
		go.getComponent(Component.class);
	}
}
