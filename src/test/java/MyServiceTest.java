import com.bizleap.MyService;
import org.junit.Test;

public class MyServiceTest {

    @Test
    public void myTest() {
        MyService myService = new MyService();

        System.out.println(myService.getName());
    }

}
