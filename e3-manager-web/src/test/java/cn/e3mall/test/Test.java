package cn.e3mall.test;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

/****************************************
 * @2017年8月24日
 * @author lyl
 * @describe
 * 
 ********************/
@WebService
public class Test {
	public String action() {
		return "say hello";
	}
	public static void main(String[] args) {
		String host = "http://localhost:8080/hello";
		Endpoint.publish(host, new Test());
		System.out.println(111);
	}
}
