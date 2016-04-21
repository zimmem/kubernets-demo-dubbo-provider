/**
 * 
 */
package kubernets.demo.dubbo.provider;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author zhaowen_zhuang
 */
public class HelloServiceImpl implements HelloService {

    public String sayHello() {
        try {
            return "hello from " + InetAddress.getLocalHost().getHostName();
        } catch (UnknownHostException e) {
            e.printStackTrace();
            return "hello with exception";
        }
    }

}
