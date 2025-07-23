package Entityclassassignments1;

public class Student {
 private int rollNo;
 private String Name;
 private int mobileNo;

public int getRollNo() {
	return rollNo;
}
public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public int getMobileNo() {
	return mobileNo;
}
public void setMobileNo(int mobileNo) {
	this.mobileNo = mobileNo;
}
@Override
public String toString() {
	return "Student [rollNo=" + rollNo + ", Name=" + Name + ", mobileNo=" + mobileNo + "]";
}
 

}
