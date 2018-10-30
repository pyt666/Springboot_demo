package com.example.Springbootdemo.model;

import java.util.HashMap;
import java.util.Map;

import com.example.Springbootdemo.exception.ForRollbackException;


public enum RESCODE {
	SUCCESS(0, "成功"), 
	FOR_EXCEPTION
	;
	private int nCode;
	private String nMsg;
	
	private RESCODE() {
	}
	
	private RESCODE(int nCode, String nMsg) {
		this.nCode = nCode;
		this.nMsg = nMsg;
	}
	public int getnCode() {
		return nCode;
	}
	public void setnCode(int nCode) {
		this.nCode = nCode;
	}
	public String getnMsg() {
		return nMsg;
	}
	public void setnMsg(String nMsg) {
		this.nMsg = nMsg;
	}
	

	/**
	 * 最新的返回json
	 */
	public Map<String,Object> getJSONRES(){
		Map<String,Object> map = new HashMap<>();
		map.put(Constants.RESPONSE_CODE_KEY, this.nCode);
		map.put(Constants.RESPONSE_MSG_KEY, this.nMsg);
		return map;
	}
		
	public Map<String,Object> getJSONRES(Object entity){
		Map<String, Object> jsonres = getJSONRES();
		jsonres.put(Constants.RESPONSE_DATA_KEY, entity);
		return jsonres;
	}
	
	public Map<String,Object> getJSONRES(Object entity,int pages,long count){
		Map<String, Object> jsonres = getJSONRES();
		jsonres.put(Constants.RESPONSE_DATA_KEY, entity);
		jsonres.put(Constants.RESPONSE_SIZE_KEY, pages);
		jsonres.put(Constants.RESPONSE_REAL_SIZE_KEY, count);
		return jsonres;
	}
	
	public Map<String,Object> getJSONRES(ForRollbackException e){
		Map<String,Object> map = new HashMap<>();
		map.put(Constants.RESPONSE_CODE_KEY, e.getErrorCode());
		map.put(Constants.RESPONSE_MSG_KEY, e.getMessage());
		return map;
	}	
	
}
