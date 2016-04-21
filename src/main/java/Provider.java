import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 */

/**
 * @author zhaowen_zhuang
 */
public class Provider {
    
    private static boolean shutdown = false;

    public static void main(String[] args) throws InterruptedException {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        context.registerShutdownHook();
        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {

            public void run() {
                Provider.shutdown = true;

            }
        }));
        while(!Provider.shutdown){
            synchronized (Provider.class) {
                Provider.class.wait(1000);
            }
        }
    }
}
