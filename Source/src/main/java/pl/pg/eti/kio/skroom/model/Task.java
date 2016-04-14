package pl.pg.eti.kio.skroom.model;

public class Task {

	private static long nextId;
	private long id;
	private String name;
	private String assignee;
	private TaskStatus status;
	private long storyPoints;

	public Task(String name, String assignee, TaskStatus status, long storyPoints) {
		id = nextId++;
		this.name = name;
		this.assignee = assignee;
		this.status = status;
		this.storyPoints = storyPoints;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAssignee() {
		return assignee;
	}

	public void setAssignee(String assignee) {
		this.assignee = assignee;
	}

	public TaskStatus getStatus() {
		return status;
	}

	public void setStatus(TaskStatus status) {
		this.status = status;
	}

	public long getStoryPoints() {
		return storyPoints;
	}

	public void setStoryPoints(long storyPoints) {
		this.storyPoints = storyPoints;
	}
}
