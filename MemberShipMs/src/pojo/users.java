package pojo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * �û���
 * @author ASUS
 *
 */
public class users {

	private int id;//�û�id
	private String NAME;//�û���
	private String password;//����
	private int STATUS;//�û�״̬
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date lastModifyTime;//����޸�ʱ��
	private int typeid;//�û�����
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
