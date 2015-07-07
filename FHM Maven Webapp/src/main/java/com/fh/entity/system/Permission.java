package com.fh.entity.system;


import java.io.Serializable;

/**
 * <p>User: Zhang Kaitao
 * <p>Date: 14-1-28
 * <p>Version: 1.0
 */
public class Permission implements Serializable {
  
	private static final long serialVersionUID = 1L;

   
	private Long PERMISSION_ID;
    private String PERMISSION; //权限标识 程序中判断使用,如"user:create"
    private String DESCRIPTION; //权限描述,UI界面显示使用
    private Boolean AVAILABLE = Boolean.FALSE;; //是否可用,如果不可用将不会添加给用户
    
    

    public Permission() {
		super();
	}
    
    public Permission(Long pERMISSION_ID, String pERMISSION,
			String dESCRIPTION, Boolean aVAILABLE) {
		super();
		PERMISSION_ID = pERMISSION_ID;
		PERMISSION = pERMISSION;
		DESCRIPTION = dESCRIPTION;
		AVAILABLE = aVAILABLE;
	}


	public void setPERMISSION_ID(Long pERMISSION_ID) {
		PERMISSION_ID = pERMISSION_ID;
	}

	public String getPERMISSION() {
		return PERMISSION;
	}

	public void setPERMISSION(String pERMISSION) {
		PERMISSION = pERMISSION;
	}

	public String getDESCRIPTION() {
		return DESCRIPTION;
	}

	public void setDESCRIPTION(String dESCRIPTION) {
		DESCRIPTION = dESCRIPTION;
	}

	public Boolean getAVAILABLE() {
		return AVAILABLE;
	}

	public void setAVAILABLE(Boolean aVAILABLE) {
		AVAILABLE = aVAILABLE;
	}

	

	@Override
    public int hashCode() {
        return PERMISSION_ID != null ? PERMISSION_ID.hashCode() : 0;
    }

	@Override
	public String toString() {
		return "Permission [PERMISSION_ID=" + PERMISSION_ID + ", PERMISSION="
				+ PERMISSION + ", DESCRIPTION=" + DESCRIPTION + ", AVAILABLE="
				+ AVAILABLE + "]";
	}

   
}
