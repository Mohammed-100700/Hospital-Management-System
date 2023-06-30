package  Hclass;


public class Patient extends Person{
	private String disease;
	

	public Patient() {
		super();
	}
	//setter methods
	
	
	public void setDisease(String disease){
		this.disease= disease;
	 }
	 
	 
	 //getter methods
	
	public String getDisease(){
	 return disease;
    }

	
}
    