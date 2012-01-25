package es.cea.tags;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class ImagenTag extends TagSupport {
	Object url;
	
	public Object getUrl() {
		return url;
	}
	public void setUrl(Object url) {
		this.url = url;
	}
	@Override
	public int doStartTag() throws JspException {
		pageContext.getSession();

		JspWriter out = pageContext.getOut();
		try {
			out.println("<img src='"+url.toString()+"' />");
		} catch (IOException e) {
			throw new JspException(e);
		}
		return SKIP_BODY;
	}
	@Override
	public int doEndTag() throws JspException {
		return EVAL_PAGE;
	}


}
