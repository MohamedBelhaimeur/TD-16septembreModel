package TD;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class DictionaryParser {
	public IDictionary loadTranslations(ILineReader reader) throws IOException {
		Dictionary dic=new Dictionary(reader.readLine());
		String line="";
		 HashMap<List<String>, List<String>> translations_list=new HashMap<>();
		 while ((line = reader.readLine()) != null) {
			 List<String> liste_clef=new ArrayList<String>();
			 List<String> liste_value=new ArrayList<String>();
		 liste_clef.add(line.substring(0,line.lastIndexOf("=")-1));
		 liste_value.add(line.substring(line.lastIndexOf("=")+2));
	            translations_list.put(liste_clef, liste_value);

	   		 for (Entry<List<String>, List<String>> mapentry : dic.getTranslations().entrySet()) {
	   				if(mapentry.getKey().contains(liste_clef)) {
	   					mapentry.getValue().addAll(liste_value);
	   				}
	   				if(mapentry.getValue().contains(liste_value)) {
	   					mapentry.getKey().addAll(liste_clef);
	   				}
	   				else
	   					dic.addTranslation(liste_clef, liste_value);
	   		 }
	        }
		 
		
		return dic;
			
		
		 }
}
