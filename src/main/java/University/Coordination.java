package University;


/**
 * @author silviomoramendoza
 * @version 1.0
 * @created 08-Sep-2024 4:34:53 PM
 */
public class Coordination {

	private int code;
	private String name;

	//Empty constructor
	public Coordination(){
	}
	//Constructor with all attributes
	public Coordination(int code, String name) {
		this.code = code;
		this.name = name;
	}

	//Getters and Setters
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer("Coordination{");
		sb.append("code=").append(code);
		sb.append(", name='").append(name).append('\'');
		sb.append('}');
		return sb.toString();
	}
}//end Coordination