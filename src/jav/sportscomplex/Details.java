package jav.sportscomplex;

public class Details 
{
 String name;
 int slot;
 String time;
public Details(String name, int slot, String time) {
	super();
	this.name = name;
	this.slot = slot;
	this.time = time;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getSlot() {
	return slot;
}
public void setSlot(int slot) {
	this.slot = slot;
}
public String getTime() {
	return time;
}
public void setTime(String time) {
	this.time = time;
}
 
}
