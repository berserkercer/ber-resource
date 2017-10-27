package ut.com.ber.plugin.resource;

import org.junit.Test;
import com.ber.plugin.resource.api.MyPluginComponent;
import com.ber.plugin.resource.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}