
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
/**
 * @author zhangfanghui
 * @since 2017/9/13
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        /*Integer a= 2;
        int b = 2;
        System.out.println(a == b);*/
    }
}
