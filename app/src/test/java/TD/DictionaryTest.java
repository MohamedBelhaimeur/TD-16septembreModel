package TD;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class DictionaryTest {
	
	Dictionary dict;
	@Before public void initialize () {
        dict = new Dictionary("Example");
        dict.addTranslation("contre", "against");
        dict.addTranslation("pour", "for");
       
        
}
	@Test public void testDictionaryName() {
		
        assertThat(dict.getName(), equalTo("Example"));
        }
	
	@Test public void testIsEmpty() {
		
        assertThat(dict.isEmpty(), equalTo(false));
        }

	@Test public void testOneTranslation() {
		
		assertThat(dict.getTranslation("contre"), equalTo("against"));
		
		assertThat(dict.getTranslation("pour"), equalTo("for"));
}
	
	@Test public void TestPlusieursSens() {
		 ArrayList<String>liste_trad=new ArrayList<String>();
	        liste_trad.add("versus");
	        liste_trad.add("against");
		assertThat(dict.getTranslation("contre"), equalTo(liste_trad));
		
		
	}
}
