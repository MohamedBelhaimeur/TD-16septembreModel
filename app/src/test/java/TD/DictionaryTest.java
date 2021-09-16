package TD;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import java.util.List;
public class DictionaryTest {
	
	Dictionary dict;
	@Before public void initialize () {
        dict = new Dictionary("Example");
        List<String>listes_traduction=new ArrayList<String>();
        List<String>listes_traduction_reverse=new ArrayList<String>();
        listes_traduction_reverse.add("contre");
        listes_traduction.add("versus");
      
        dict.addTranslation(listes_traduction_reverse, listes_traduction);  
        
        List<String>listes_traduction2=new ArrayList<String>();
        List<String>listes_traduction_reverse2=new ArrayList<String>();
        listes_traduction2.add("pour");
       
        dict.addTranslation(listes_traduction_reverse2,listes_traduction2 ); 
        
        List<String>listes_traduction3=new ArrayList<String>();
        listes_traduction3.add("hi");
        listes_traduction3.add("hello");
        List<String>listes_traduction_reverse3=new ArrayList<String>();
        listes_traduction_reverse3.add("salut");
        dict.addTranslation(listes_traduction_reverse3,listes_traduction3 );
        
}
	@Test public void testDictionaryName() {
		
        assertThat(dict.getName(), equalTo("Example"));
        }
	
	@Test public void testIsEmpty() {
		
        assertThat(dict.isEmpty(), equalTo(false));
        }

	@Test public void testOneTranslation() {
		 List<String>listes_traduction=new ArrayList<String>();
	        listes_traduction.add("versus");
	       
		
		assertThat(dict.getTranslation("contre"), equalTo(listes_traduction));
	       List<String>listes_traduction2=new ArrayList<String>();
	        
	        listes_traduction2.add("for");
		assertThat(dict.getTranslation("pour"), equalTo(listes_traduction2));
}
	
	@Test public void TestPlusieursSens() {
		 ArrayList<String>liste_trad=new ArrayList<String>();
	        liste_trad.add("hi");
	        liste_trad.add("hello");
		assertThat(dict.getTranslation("salut"), equalTo(liste_trad));
		
		
	}
	@Test public void TestTraductionInverse() {
		ArrayList<String>liste_trad=new ArrayList<String>();
        liste_trad.add("contre");
        
		assertThat(dict.getTranslationInverse("versus"), equalTo(liste_trad));
	}
}
