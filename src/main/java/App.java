import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean1 = (HelloWorld) context.getBean("helloWorld");
        HelloWorld bean2 = (HelloWorld) context.getBean("helloWorld");
        Cat bean3 = (Cat) context.getBean("cat");
        Cat bean4 = (Cat) context.getBean("cat");
        System.out.println(bean1 == bean2);
        System.out.println(bean3 == bean4);
    }
}