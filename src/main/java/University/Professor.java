package University;


/**
 * @author silviomoramendoza
 * @version 1.0
 * @created 08-Sep-2024 4:35:10 PM
 */
public class Professor {

	private String firstName;
	private String id;
	private String lastName;
	private String title;
	public Coordination coordination;

	//Empty constructor
	public Professor(){

	}

	//Constructor with all attributes
	public Professor(String firstName, String id, String lastName, String title, University.Coordination coordination) {
		this.firstName = firstName;
		this.id = id;
		this.lastName = lastName;
		this.title = title;
		this.coordination = coordination;
	}

	//Getters and Setters;
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Coordination getCoordination(){
		return coordination;
	}
	public void setCoordination(Coordination coordination){
	this.coordination = coordination;
	}

	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer("Professor{");
		sb.append("firstName='").append(firstName).append('\'');
		sb.append(", id='").append(id).append('\'');
		sb.append(", lastName='").append(lastName).append('\'');
		sb.append(", title='").append(title).append('\'');
		sb.append(", coordination=").append(coordination);
		sb.append('}');
		return sb.toString();
	}
}//end Professor