import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * <p></p>
 *
 * @author luolong
 * @date 2018/6/25
 */
@SpringBootApplication
@ComponentScan("luolong.*")
@EnableSwagger2
public class LuolongSwaggerApplication {

    public static void main(String[] args) {
        SpringApplication.run(LuolongSwaggerApplication.class, args);
    }
}
