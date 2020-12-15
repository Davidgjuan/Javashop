package model.list;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import model.Carrier;
import model.Employee;

@JacksonXmlRootElement(localName = "employees")
public class Employees {

	@JacksonXmlElementWrapper(useWrapping = false)
	private List<Employee> employee;

	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Employees [employee=" + employee + "]";
	}


}
