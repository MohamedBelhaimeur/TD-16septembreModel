package TD;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class DictionaryTest {
	
	Dictionary dict= new Dictionary();
	
	@Test public void testDictionaryName() {
		
        assertThat(dict.getName(), equalTo("Example"));
        }
}
