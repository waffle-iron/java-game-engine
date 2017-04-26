package io.github.jakebacker.jge;

public class Transform extends Component{
	public Vector3 position = new Vector3(0, 0, 0);

	public Transform(GameObject gameObject) {
		super(gameObject);
	}
}
