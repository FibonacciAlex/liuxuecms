package com.liuxue.cms.util;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.codehaus.jackson.map.ObjectMapper;

/**
 * <pre>
 * 此类以jackson为基础构建
 * </pre>
 * @author Alex
 * @date 2016年2月17日  上午10:35:36
 */
public class JsonTool {

	private final static Logger _log = Logger.getLogger(JsonTool.class);
	
	private final static ObjectMapper _mapper = new ObjectMapper();
	
	/**
	 * 将对象转换成json字符串
	 * @param obj
	 * @return
	 * @throws IOException
	 */
	public static String generateJSONString(Object obj) throws IOException{
		return _mapper.writeValueAsString(obj);
	}
	
	/**
	 * 将json字符串转换成POJO对象  ps.此对象内必须没有集合
	 * @param jsonStr
	 * @param obj
	 * @throws IOException
	 */
	public static void parseJsonStr2Obj(String jsonStr, Object obj) throws IOException{
		_mapper.reader(obj.getClass()).withValueToUpdate(obj).readValue(jsonStr);
	}
	
	
	/**
	 * 解析json字符串为POJO对象，并保留集合的引用
	 * @param jsonStr
	 * @param obj
	 * @throws Exception
	 */
	public static void parseJsonStr2ObjAndKeepCollectRef(String jsonStr, Object obj)throws Exception{
		
	}
	
	
}
