import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld hwBean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld hwBean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        Cat catBean =
                applicationContext.getBean("cat", Cat.class);
        Cat catBean2 =
                applicationContext.getBean("cat", Cat.class);
        System.out.println(catBean == catBean2);
        System.out.println(hwBean == hwBean2);
    }
}