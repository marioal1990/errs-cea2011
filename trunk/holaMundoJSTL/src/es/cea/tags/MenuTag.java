package es.cea.tags;

import java.io.IOException;

import javax.servlet.http.HttpSession;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class MenuTag extends TagSupport {

	@Override
	public int doStartTag() throws JspException {
		JspWriter writer = pageContext.getOut();
		HttpSession session = pageContext.getSession();
		Object usuarioRegAttribute = session.getAttribute("usuarioReg");
		try {
			if(usuarioRegAttribute==null){
				writer.print("<a href='./registro'>REGISTRATE USUARIO</a> ");
				writer.print("<hr> ");
				
			}else{
				writer.print("<h1>MENU</h1> ");
				writer.print("<a href='./opcion1'>OPCION 1</a> ");
				writer.print("<a href='./opcion2'>OPCION 2</a> ");
				writer.print("<a href='./opcion3'>OPCION 3</a> ");
				writer.print("<hr> ");
				
			}
		} catch (IOException e) {
			e.printStackTrace();
			throw new JspException(e);
		}
		return SKIP_BODY;
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
		return EVAL_PAGE;
	}


	
	
}
