package io.github.jakebacker.jge;

public class Runner {

	public static SceneController sceneController;
	static GameObject go;

	public static void main(String[] args) {
		sceneController = new SceneController();
		go = new GameObject();
		Transform t = go.getComponent(Transform.class);
		t.position = new Vector3(10.0f, 3.14f, 0);
		System.out.println(t.position.toString());
	}
}
