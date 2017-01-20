package test;

import com.caucho.hessian.client.HessianProxyFactory;
import com.xmm.hessian.service.UserService;

import java.net.MalformedURLException;

/**
 * Created by 肖明明 on 2017/1/20.
 */
public class HessianClient {
    public static void main(String[] args) throws MalformedURLException {
        String url = "http://localhost:8080/userService";
        HessianProxyFactory factory = new HessianProxyFactory();
        UserService service = (UserService) factory.create(UserService.class, url);
        System.out.println(service.getUser());
        
    }
    
    
}
