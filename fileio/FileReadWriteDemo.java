package fileio;

import Hclass.Patient;
import Hclass.Doctor;

import java.io.*;

public class FileReadWriteDemo
{
	 File file;				
	 FileWriter writer;		
	
	
	public void writeInFile(Patient patient){
	
		try{
			File file = new File("E:/NSU/4th semester/Hospital MS/text_files/patient.txt");		
			file.createNewFile();					
			writer = new FileWriter(file,true);
			writer.write(patient.getID() + "," + patient.getName() + "," + patient.getAge() + "," + patient.getPhone() + "," + patient.getDisease() + "\n");				 
			writer.flush();							
			writer.close();							
		}
		catch(IOException ioe){
			ioe.printStackTrace();
		}
	}
	
	public void writeInFile(Doctor doctor)
	{
	
		try{
			File file = new File("E:/NSU/4th semester/Hospital MS/text_files/doctor.txt");		
			file.createNewFile();					
			writer = new FileWriter(file, true);
			writer.write(doctor.getID() + "," + doctor.getName() + "," + doctor.getAge() + "," + doctor.getPhone() + "," + doctor.getSpecialist() + "," + doctor.getAvailability() + "\n");				 
			writer.flush();							
			writer.close();							
		}
		catch(IOException ioe){
			ioe.printStackTrace();
		}
	}
	
}