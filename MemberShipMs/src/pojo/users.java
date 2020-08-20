package pojo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * 用户表
 * @author ASUS
 *
 */
public class users {

	private int id;//用户id
	private String NAME;//用户名
	private String password;//密码
	private int STATUS;//用户状态
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date lastModifyTime;//最后修改时间
	private int typeid;//用户类型
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int  getSTATUS() {
		return STATUS;
	}
	public void setSTATUS(int sTATUS) {
		STATUS = sTATUS;
	}
	public Date getLastModifyTime() {
		return lastModifyTime;
	}
	public void setLastModifyTime(Date lastModifyTime) {
		this.lastModifyTime = lastModifyTime;
	}
	public int  getTypeid() {
		return typeid;
	}
	public void setTypeid(int  typeid) {
		this.typeid = typeid;
	}
	
}
