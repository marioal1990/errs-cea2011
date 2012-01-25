package es.cea.tags;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.BodyContent;
import javax.servlet.jsp.tagext.BodyTagSupport;
import javax.servlet.jsp.tagext.TagSupport;

public class FormTag extends TagSupport {
	String action;

	
	
	@Override
	public int doStartTag() throws JspException {
		
		JspWriter writer = pageContext.getOut();
		try {
			writer.print("<form action='"+action+"' method='POST'> ");
		} catch (IOException e) {
			e.printStackTrace();
			throw new JspException(e);
		}
		return EVAL_BODY_INCLUDE;
	}
	@Override
	public int doEndTag() throws JspException {
		JspWriter writer = pageContext.getOut();
		try {
			writer.print("<input type='submit' value='enviar'></form> ");
		} catch (IOException e) {
			e.printStackTrace();
			throw new JspException(e);
		}
		return EVAL_PAGE;
	}
	@Override
	public int doAfterBody() throws JspException {
		System.out.println("doAfterBody");
//		BodyContent bodyContent2 = getBodyContent();
//		System.out.println(bodyContent2.toString());
		return super.doAfterBody();
	}

//	@Override
//	public void doInitBody() throws JspException {
//		System.out.println("doInitBody");
//		super.doInitBody();
//	}
//
//	
//
//	@Override
//	public BodyContent getBodyContent() {
//		System.out.println("getBodyContent");
//		return super.getBodyContent();
//	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}
	
}
