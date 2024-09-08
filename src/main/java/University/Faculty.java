package University;
import java.util.ArrayList;

/**
 * @author silviomoramendoza
 * @version 1.0
 * @created 08-Sep-2024 4:35:04 PM
 */
public class Faculty {

	private String building;
	private int id;
	private String name;
	public ArrayList<Coordination> coordinationList;

	//Empty constructor for a list
	public Faculty(){
		this.coordinationList = new ArrayList<>();
	}

	//Constructor with all attributes
	public Faculty(String building, int id, String name, Coordination coordination) {
		this.building = building;
		this.id = id;
		this.name = name;
		this.coordinationList = new ArrayList<>();
		this.coordinationList.add(coordination);
	}

	//Getters and Setters
	public String getBuilding() {
		return building;
	}

	public void setBuilding(String building) {
		this.building = building;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//Method to add a new Coordination
	public void addCoordination(int id, String name){
		Coordination coordination = new Coordination(id, name);
		coordinationList.add(coordination);
	}

	//Method to show the coordination list
	public ArrayList<Coordination> showCoordinationList(){
		return coordinationList;
	}

	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer("Faculty{");
		sb.append("building='").append(building).append('\'');
		sb.append(", id=").append(id);
		sb.append(", name='").append(name).append('\'');
		sb.append(", coordinationList=").append(coordinationList);
		sb.append('}');
		return sb.toString();
	}
}//end Faculty