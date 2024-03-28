package demoProject;

public class project {
	int prid;
	String prname;
	String prloc;
	
	public project(int prid, String prname, String prloc) {
		this.prid = prid;
		this.prname = prname;
		this.prloc = prloc;
	}

	@Override
	public String toString() {
		return "project [prid=" + prid + ", prname=" + prname + ", prloc=" + prloc + "]";
	}

	
	public void setprloc(String prloc) {
		this.prloc = prloc;
	} 
	public String getprloc() {
		// TODO Auto-generated method stub
		return prloc;
	}
	
	
	
}
