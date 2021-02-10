
public abstract class Figure {
	private final String name;
	public final String getName() { return name; }

	public Figure(String name){
		this.name = name;
	}

	public abstract double getArea();
}