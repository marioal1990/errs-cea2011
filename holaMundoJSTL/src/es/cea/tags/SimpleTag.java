package es.cea.tags;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class SimpleTag extends TagSupport {
	protected String color="#000000";
	protected String mensaje="Hello World Tag!";
	
	@Override
	public int doStartTag() throws JspException {
		pageContext.getSession();

		JspWriter out = pageContext.getOut();
		try {
			out.println("<font color='"+color+"'>");
			out.println(mensaje);
			out.println("</font>");
		} catch (IOException e) {
			throw new JspException(e);
		}
		return SKIP_BODY;
	}
	@Override
	public int doEndTag() throws JspException {
		return EVAL_PAGE;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
}
