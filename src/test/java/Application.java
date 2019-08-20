import com.chj.HelloWord;
import org.junit.Test;
        import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    @Test
    public void test1(){
        ClassPathXmlApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");

        HelloWord helloWord= (HelloWord) app.getBean("helloWord");

        helloWord.say();
    }

}
