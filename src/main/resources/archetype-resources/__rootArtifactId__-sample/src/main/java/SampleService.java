#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

/**
 * Sample service.
 */
public class SampleService
{
    private String greeting;

    public void setGreeting(String greeting)
    {
        this.greeting = greeting;
    }

    public void greet()
    {
        System.out.println("Greeting from service: " + greeting);
    }
}
