package mapexample.employeedeparment;

public class Employee {
	private int employeeId;
	private String name;
	private String company;

	private Department department;

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Employee(int employeeId, String name, String company, Department department) {
		this.employeeId = employeeId;
		this.name = name;
		this.company = company;
		this.department = department;
	}

	public Employee() {
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", company=" + company + ", department="
				+ department + "]";
	}

}
