import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author lancq
 * @Description
 * @Date 2018/10/22
 **/
public class SpringTest {
	BeanFactory beanFactory = new ClassPathXmlApplicationContext("applicationContext.xml");
	Object object = beanFactory.getBean("member");
}
