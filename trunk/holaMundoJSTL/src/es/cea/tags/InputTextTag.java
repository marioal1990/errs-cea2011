package es.cea.tags;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class InputTextTag extends TagSupport{
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	String name;
	@Override
	public int doStartTag() throws JspException {
		JspWriter writer = pageContext.getOut();
		try {
			writer.print(name+": <input type='text' name='"+name+"'><br>");
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
			writer.print("");
		} catch (IOException e) {
			e.printStackTrace();
			throw new JspException(e);
		}

		return this.EVAL_PAGE;
	}

	

}
