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
        listes_traduction_reverse.add("versus");
        listes_traduction.add("contre");
      
        dict.addTranslation(listes_traduction, listes_traduction_reverse);  
       
        List<String>listes_traduction2=new ArrayList<String>();
        List<String>listes_traduction_reverse2=new ArrayList<String>();
        listes_traduction2.add("pour");
        listes_traduction_reverse2.add("for");
        dict.addTranslation(listes_traduction2,listes_traduction_reverse2 ); 
        
        List<String>listes_traduction3=new ArrayList<String>();
        List<String>listes_traduction_reverse3=new ArrayList<String>();
        listes_traduction3.add("salut");
        listes_traduction3.add("bonjour");
        listes_traduction_reverse3.add("hi");
        listes_traduction_reverse3.add("hello");
        dict.addTranslation(listes_traduction3,listes_traduction_reverse3 );
        
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
        liste_trad.add("salut");
        liste_trad.add("bonjour");
		assertThat(dict.getTranslationInverse("hi"), equalTo(liste_trad));
	}
}
