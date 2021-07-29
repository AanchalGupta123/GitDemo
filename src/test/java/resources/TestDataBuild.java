package resources;

import java.util.ArrayList;
import java.util.List;

import pojo.AddPlace;
import pojo.Location;

public class TestDataBuild {
	
	public AddPlace addPlacePayload(String name, String language, String address) {
		
		
		AddPlace p = new AddPlace();
		p.setAccuracy(50);
		p.setAddress(address);
		p.setLanguage(language);
		p.setWebsite("https://www.rahulshettyacademy.com");
		p.setName(name);
		p.setPhone_number("(+91) 983 893 3937");
		
		List<String> myList = new ArrayList<String>();
		      myList.add("shoe park");
		      myList.add("shop");
		
		p.setTypes(myList); // here types is expecting List of values so need to create object of list Interphase
		
		Location l = new Location();// this subclass Location has setLat and setLng so we need to create object of this class first then set values
		  l.setLat(-38.383494);
		  l.setLng(33.427362);
		  p.setLocation(l);
		  
		 return p;// we are returning java object
	}
	
	
	
	public  String  deletePlacePayload(String PlaceId) {
		return "{\r\n"
				+ "  \"place_id\":\""+PlaceId+"\"\r\n"
				+ "}";
		
		
	}

}
