
public class Package {

	// cm^3

	private int height;
	private int width;
	private int lenght;

	public Package(int height, int width, int lenght) {

		setHeight(height);
		setLenght(lenght);
		setWidth(width);
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getLenght() {
		return lenght;
	}

	public void setLenght(int lenght) {
		this.lenght = lenght;
	}

	// calculates the volume of a Package object
	public int calculatePackageVolume() {
		int volume;

		volume = getHeight() * getLenght() * getWidth();

		return volume;
	}

}
