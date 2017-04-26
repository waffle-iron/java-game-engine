package io.github.jakebacker.jge;

public class Vector3 {

	private float x;
	private float y;
	private float z;

	public Vector3(float x, float y, float z) {
		setX(x);
		setY(y);
		setZ(z);
	}

	public float getZ() {
		return z;
	}

	public void setZ(float z) {
		this.z = z;
	}

	public float getY() {
		return y;
	}

	private void setY(float y) {
		this.y = y;
	}

	public float getX() {
		return x;
	}

	private void setX(float x) {
		this.x = x;
	}

	public String toString() {
		String string = "X: " + getX() + " Y: " + getY() + " Z: " + getZ();
		return string;
	}

}
