package es.cea.tags;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class EnlaceGoogleTag extends TagSupport{
//	 SKIP_BODY = 0;
//	 EVAL_BODY_INCLUDE = 1;
//	 SKIP_PAGE = 5;
//	 EVAL_PAGE = 6;
	String textoEnlace;
	
	public String getTextoEnlace() {
		return textoEnlace;
	}
	public void setTextoEnlace(String textoEnlace) {
		this.textoEnlace = textoEnlace;
	}
	@Override
	public int doStartTag() throws JspException {
		JspWriter writer = pageContext.getOut();
		try {
			writer.print("<a href='http://www.google.com'>"+getTextoEnlace());
		} catch (IOException e) {
			e.printStackTrace();
			throw new JspException(e);
		}
		
		return this.SKIP_BODY;
	}
	@Override
	public int doEndTag() throws JspException {
		JspWriter writer = pageContext.getOut();
		try {
			writer.print("</a>");
		} catch (IOException e) {
			e.printStackTrace();
			throw new JspException(e);
		}

		return this.EVAL_PAGE;
	}

	

}
