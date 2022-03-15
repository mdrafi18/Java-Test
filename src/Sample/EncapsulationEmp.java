package Sample;

public class EncapsulationEmp {

	int empid;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	String empname;
	
	public static void main(String args[])
	{
		EncapsulationEmp e=new EncapsulationEmp();
		e.setEmpid(100);
		System.out.println(e.getEmpid());
		
	}
	
	
	
	
}
