package TD;


import java.util.HashMap;
import java.util.List;
public class Dictionary {
	private String name;
	private HashMap<String, List<String>> translations=new HashMap<>();
	
	public Dictionary(String name) {
		this.name=name;
		
		
	}
	
	public List<String> getTranslation(String element) {
		return this.translations.get(element);
	}
	public void addTranslation(String elementprem,List<String>elements_liste) {
		
	this.translations.put(elementprem, elements_liste);
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
