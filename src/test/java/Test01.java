
import com.chj.controller.EmpController;
import com.chj.entity.Emp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class Test01 {

    @Autowired
    private EmpController empController;

    @Test
    public void test1(){

            Emp emp=empController.findById(1);

            System.out.println(emp.toString());

    }

}
