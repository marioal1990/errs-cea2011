package es.cea.tags;

import java.io.IOException;


import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;



public class TablitaTag extends TagSupport  {

	String celdas;

	public String getCeldas() {
		return celdas;
	}

	public void setCeldas(String celdas) {
		this.celdas = celdas;
	}
	
	public int doStartTag() throws JspException {

		JspWriter writer = pageContext.getOut();
		try {
			writer.print("<table>");
			writer.print("<tr>");
			String[] arrayCeldas = celdas.split(",");
			
			for(int x=0; x< arrayCeldas.length; x++){
				
				writer.print("<td>"+ arrayCeldas[x]);
				
			}
			
			writer.print("</tr>");
			writer.print("</table>");

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