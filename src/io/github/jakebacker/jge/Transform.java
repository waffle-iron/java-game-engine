package io.github.jakebacker.jge;

public class Transform extends Component{
	/**
	 * The position of the Transform in local coordinates
	 */
	public Vector3 position = new Vector3(0, 0, 0);
	// I'm not doing quaternions...
	/**
	 * The rotation of the Transform in Euler Angles
	 */
	public Vector3 rotation = new Vector3(0, 0, 0);

	/**
	 * The scale of the Transform
	 */
	public Vector3 scale = new Vector3(0, 0, 0);

	public Transform(GameObject gameObject) {
		super(gameObject);
	}
}
