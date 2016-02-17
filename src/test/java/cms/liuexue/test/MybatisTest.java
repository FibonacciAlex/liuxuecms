package cms.liuexue.test;



import java.io.IOException;

import com.alibaba.druid.util.HttpClientUtils;
import com.liuxue.cms.modules.entiy.request.Bean;
import com.liuxue.cms.util.JsonTool;

public class MybatisTest {
	
	public static void main(String[] args){
		//http://localhost:8080/personInfo?name=saddf&sex=2
		Bean b = new Bean();
		b.setName("aaa");
		b.setSex("2");
		String string = "";
		try {
			string = JsonTool.generateJSONString(b);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.err.println("--------------"+ string);
		boolean post = HttpClientUtils.post("http://localhost:82/cms/personInfo", string, 6000);
		System.err.println("post sucess:" + post);

	}
	
	
	
	  
}
