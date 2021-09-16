package TD;

import java.util.List;

public interface IDictionary {
	public List<String> getTranslation(String element);
	public List<String> getTranslationInverse(String element);
	public void addTranslation(List<String>elements_liste1,List<String>elements_liste);
	public String getName();
	public boolean isEmpty();
}
