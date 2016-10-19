package cn.zjc.worker;

/**
 * @author zjc
 * @version 2016/10/19 23:52
 * @description
 */
public class ConcreteEvent {

	private String type;
	private String id;

	public ConcreteEvent() {
	}

	public ConcreteEvent(String type, String id) {
		this.type = type;
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "ConcreteEvent{" +
				"type='" + type + '\'' +
				", id='" + id + '\'' +
				'}';
	}
}
