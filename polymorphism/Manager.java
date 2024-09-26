package polymorphism;

public class Manager extends Emp {
	private int noTeam;

	public int getNoTeam() {
		return noTeam;
	}

	public void setNoTeam(int noTeam) {
		this.noTeam = noTeam;
	}

	public double getSalary() {
		return (super.getSalary() + 10000);
	}

}
