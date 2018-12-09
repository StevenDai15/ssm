package base.model;

import java.io.Serializable;


/**
 * 
 * @author: daibin
 * @date: 2018年12月4日 下午9:33:38
 */
public class BaseModel implements Serializable{
	
	private static final long serialVersionUID = -333749275984395517L;
	
	private int resultCode;
	private String resultMessage;
	/**
	 * @return the resultCode
	 */
	public int getResultCode() {
		return resultCode;
	}
	/**
	 * @param resultCode the resultCode to set
	 */
	public void setResultCode(int resultCode) {
		this.resultCode = resultCode;
	}
	/**
	 * @return the resultMessage
	 */
	public String getResultMessage() {
		return resultMessage;
	}
	/**
	 * @param resultMessage the resultMessage to set
	 */
	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}
	
	
}
