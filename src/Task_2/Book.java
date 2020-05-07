package Task_2;

public class Book {
	private int year;
	private int number;
	private String color;
	private String name;

	public Book(int year, int number) {
		this.year = year;
		this.number = number;
	}

	public Book(int year, int number, String color, String name) {
		this(year, number);
		this.color = color;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Book [year=" + year + ", number=" + number + ", color=" + color + ", name=" + name + "]";
	}

}
