import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean1 = context.getBean(HelloWorld.class);
        HelloWorld bean2 = context.getBean(HelloWorld.class);
        Cat bean3 = context.getBean(Cat.class);
        Cat bean4 = context.getBean(Cat.class);
        System.out.println(bean1 == bean2);
        System.out.println(bean3 == bean4);
    }
}