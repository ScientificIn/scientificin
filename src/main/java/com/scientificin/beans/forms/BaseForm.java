package com.scientificin.beans.forms;

import com.google.gson.Gson;

public abstract class BaseForm {

	public abstract boolean validate();
	
	@Override
	public String toString() {
		return new Gson().toJson(this);
	}
}
