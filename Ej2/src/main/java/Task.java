public class Task {
	private static int nextId = 1;
	
	private int id;
	private String name;
	
	public Task(String name) {
		this.id = nextId;
		nextId++;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
}
