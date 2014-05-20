package main.java.org.myapp;

import main.java.org.myapp.classes.SimpleObject;
import main.java.org.myapp.mybatis.mapper.java.SimpleMapper;
import main.java.org.myapp.service.SimpleService;


public class Main {

	public static void main(String[] args) {
		System.out.println("MASTER");
		
		SimpleMapper simpleService = new SimpleService();

		System.out.println("Find object by ID & TEXT - MULTIPLE PARAMETER");
		SimpleObject res = simpleService.findObjectByIdAndTextMultiple(7, "Simple text 7");
		if (res != null)
			System.out.println(res.getId() + "; " + res.getText());
		else System.out.println("NO SUCH OBJECT");
	}

}
