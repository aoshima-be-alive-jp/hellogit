package jp.tuyano.framework;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

public class Page1ActionForm extends ActionForm {
	private static final long serialVersionUID = 1L;
	private String text1;
	private String field1;

	public String getText1() {
		return text1;
	}

	public void setText1(String text1) {
		this.text1 = text1;
	}

	public String getField1() {
		return field1;
	}

	public void setField1(String field1) {
		this.field1 = field1;
	}

	public void reset(ActionMapping mapping, HttpServletRequest request) {
		super.reset(mapping, request);
		try {
			request.setCharacterEncoding("UTF-8");
			this.setText1("お名前は？");
		} catch (UnsupportedEncodingException ex) {
			ex.printStackTrace();
		}
	}
}
