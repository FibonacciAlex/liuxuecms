package cms.liuexue.test;


import com.alibaba.druid.util.HttpClientUtils;

public class MybatisTest {
	
	public static void main(String[] args){
		//http://localhost:8080/personInfo?name=saddf&sex=2
		boolean post = HttpClientUtils.post("http://localhost:8080/personInfo", "name=saddf&sex=2", 6000);
		System.err.println("post sucess:" + post);

	}
	
	
	
	  
}
