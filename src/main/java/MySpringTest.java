import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.neusoft.po.User;
import com.neusoft.service.UserService;

/**
 * @Auther:某位不知名魔法少年
 * @ClassName:MySpringTest
 * @Date:2022/6/7 10:45
 * @功能描述:
 * @Version:1.0
 */
public class MySpringTest {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        UserService service=(UserService)context.getBean("userService");
        User user=service.getUser();
        System.out.println(user);
    }
}
