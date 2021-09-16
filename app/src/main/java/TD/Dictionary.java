package TD;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.stream.Collectors;
public class Dictionary {
	private String name;
	private HashMap<List<String>, List<String>> translations=new HashMap<>();
	
	public Dictionary(String name) {
		this.name=name;
		
		
	}
	
	public List<String> getTranslation(String element) {
		for (Entry<List<String>, List<String>> mapentry : this.translations.entrySet()) {
			if(mapentry.getKey().contains(element)) {
				return mapentry.getValue();
			}
	                            
	        }
		return null;
	}
public List<String> getTranslationInverse(String element){
	for (Entry<List<String>, List<String>> mapentry : this.translations.entrySet()) {
		if(mapentry.getValue().contains(element)) {
			return mapentry.getKey();
		}
                            
        }
	return null;
            
}
	public void addTranslation(List<String>elements_liste1,List<String>elements_liste) {
		
	this.translations.put(elements_liste1, elements_liste);
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
