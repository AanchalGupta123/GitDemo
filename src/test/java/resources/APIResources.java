package resources;

//enum is special class in java which has  collection of constants or methods
public enum APIResources {

	
	AddPlaceAPI("/maps/api/place/add/json"),
	getPlaceAPI("/maps/api/place/get/json"),
	deletePlaceAPI("/maps/api/place/delete/json");
	
	private String resource;//made this resource globally accessisble
	

    
 APIResources(String resource)// this scope of resource variable is within this method only so need to make private within the class 
 {
  this.resource=resource;  // now this resource have the values of addplaceAPI
	 
 }
 
 public String getResource() {
	return resource;  //same addPlaceApi value will get return
	
	 
	 
	 
 }
 
 
}


