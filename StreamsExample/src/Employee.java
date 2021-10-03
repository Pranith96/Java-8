
public class Employee {

	private int id;
	private String name;
	private String dept;
	private long salary;

	public Employee(int id, String name, String dept, long salary) {
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}

	public Employee() {
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

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getDept() == null) ? 0 : getDept().hashCode());
		result = prime * result + getId();
		result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
		result = prime * result + (int) (getSalary() ^ (getSalary() >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (getDept() == null) {
			if (other.getDept() != null)
				return false;
		} else if (!getDept().equals(other.getDept()))
			return false;
		if (getId() != other.getId())
			return false;
		if (getName() == null) {
			if (other.getName() != null)
				return false;
		} else if (!getName().equals(other.getName()))
			return false;
		if (getSalary() != other.getSalary())
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
	}

}
