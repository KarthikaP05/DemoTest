package multipleinherit;

public class CollegeStaffs implements StaffDetails,StaffDept {
	public void collegename() {
		System.out.println("College Name: CIET");
	}
	public void totstaff() {
		System.out.println("Total No of Staff : 42");
	}
	public void staffsinIT() {
		System.out.println("Staffs in IT: 12");
	}
	public void staffsinCSE() {
		System.out.println("Staffs in CSE: 15");
	}
	public void staffsinECE() {
		System.out.println("Staffs in ECE: 15");
	}	
	public static void main(String[] args) {
		CollegeStaffs cs = new CollegeStaffs();
		cs.collegename();
		cs.totstaff();
		cs.staffsinECE();
		cs.staffsinIT();
		cs.staffsinCSE();
	}
}