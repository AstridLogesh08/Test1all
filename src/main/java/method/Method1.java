package method;

public class Method1 {
 
	public void createVideo() {
		System.out.println("Video Created");
	}
	
	private boolean uploadVideo() {
		System.out.println("Uploading");
		return true;		
		//Return Should be placed at the end of the method
	}
	public String share() {
		return "Youtube";
	}
}

//PUBLIC, PRIVATE, RETURN, STRING