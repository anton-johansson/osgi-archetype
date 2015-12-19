#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import org.junit.Test;

/**
 * Unit tests of {@link SampleService}.
 *
 * @author Anton Johansson
 */
public class SampleServiceTest
{
	private final SampleService service = new SampleService();

	@Test
	public void test_that_greeting_is_properly_shown()
	{
		service.setGreeting("Hello World!");
		service.greet();
	}
}
