package com.swAssignment.fawrysystem;

import com.swAssignment.fawrysystem.BSL.UserBsl;

public class Common {
	protected UserBsl userbsl;
	public Common(UserBsl userbsl) {
		this.setUserbsl(userbsl);
	}
	public UserBsl getUserbsl() {
		return userbsl;
	}
	public void setUserbsl(UserBsl userbsl) {
		this.userbsl = userbsl;
	}
}
