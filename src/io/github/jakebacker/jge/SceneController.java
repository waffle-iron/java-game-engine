package io.github.jakebacker.jge;

import java.util.ArrayList;

public class SceneController {
	private ArrayList<GameObject> gameObjects;

	public SceneController() {
		gameObjects = new ArrayList<>();
	}

	public void addGameObject(GameObject gameObject) {
		gameObjects.add(gameObject);
		UpdateScene();
	}

	private void UpdateScene() {

	}
}
