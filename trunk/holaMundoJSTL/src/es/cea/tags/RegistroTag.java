package es.cea.tags;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;


public class RegistroTag extends TagSupport{

	String action;
	String method;
	
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	
	public int doStartTag() throws JspException {

		JspWriter writer = pageContext.getOut();
		try {
			writer.print("<form action='" + action + "' method='" + method + "'>");
			writer.print("Nombre: <input type = 'text' value='' name='nombre'><br>");
			writer.print("clave: <input type = 'text' value='' name='clave'><br>");

			writer.print("<input type='submit' value='Aceptar'>");

		} catch (IOException e) {
			e.printStackTrace();
			throw new JspException(e);
		}
		
		return this.SKIP_BODY;
	}
	@Override
	public int doEndTag() throws JspException {
		return EVAL_PAGE;
	}

}
