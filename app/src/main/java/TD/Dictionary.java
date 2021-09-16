package TD;


import java.util.HashMap;
public class Dictionary {
	private String name;
	private HashMap<String, String> translations=new HashMap<>();
	
	public Dictionary(String name) {
		this.name=name;
		
		
	}
	public String getTranslation(String element) {
		return this.translations.get(element);
	}
	public void addTranslation(String elementprem,String elementsec) {
		
	this.translations.put(elementprem, elementsec);
	}
	public String getName()
	{
		return name;
	}
	public boolean isEmpty() {
		if(this.translations.size()==0) {
			return true;
		}
		else
			return false;
	}
}
