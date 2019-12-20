package utilities;

import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class CSV {

	//Method will read data from a CSV file and return a list
	
	public static List<String[]> read(String file){
		List<String[]> data = new LinkedList<String[]>();
		
		String dataRow;
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			
			while((dataRow = br.readLine())!=null) {
				String[] dataRecords = dataRow.split(",");
				data.add(dataRecords);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Could Not Found File");
		} 
		return data;
	}
}
