package TD;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class DictionaryTest {
	
	Dictionary dict= new Dictionary("Example");
	
	@Test public void testDictionaryName() {
		
        assertThat(dict.getName(), equalTo("Example"));
        }
	
	@Test public void testIsEmpty() {
		
        assertThat(dict.isEmpty(), equalTo(true));
        }

	@Test public void testOneTranslation() {
		dict.addTranslation("contre", "against");
		assertThat(dict.getTranslation("contre"), equalTo("against"));
		dict.addTranslation("pour", "for");
		assertThat(dict.getTranslation("pour"), equalTo("for"));
}
}
