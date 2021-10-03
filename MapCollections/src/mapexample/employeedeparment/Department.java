package mapexample.employeedeparment;

public class Department {

	private String departmentId;
	private String departName;

	public String getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartName() {
		return departName;
	}

	public void setDepartName(String departName) {
		this.departName = departName;
	}

	public Department(String departmentId, String departName) {
		this.departmentId = departmentId;
		this.departName = departName;
	}

	public Department() {
	}

	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", departName=" + departName + "]";
	}

}
