package SprongCore.SpringHello;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import com.helloSpring.Configuration.HelloWorldConfig;
import com.hellowSpring.model.HelloWorld;
public class App 
{
	public static void main( String[] args )
	{
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
		HelloWorld bean = (HelloWorld) context.getBean("helloWorldBean");
		bean.sayHello("Spring 4");
		context.close();
	}
}
