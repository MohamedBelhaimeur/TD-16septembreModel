package TD;



public class Dictionary {
	private String name;
	
	public Dictionary(String name) {
		this.name=name;
		
		
	}
	public String getTranslation(String element) {
		if(element.equals("contre"))
			return "against";
		return null;
	}
	public String getName()
	{
		return name;
	}
	public boolean isEmpty() {
		return true;
	}
}
