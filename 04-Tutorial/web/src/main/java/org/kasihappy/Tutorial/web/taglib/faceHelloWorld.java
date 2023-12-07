package org.kasihappy.Tutorial.web.taglib;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;
import java.io.IOException;

public class faceHelloWorld extends TagSupport {
    private String face;

    public void setFace(String face) {
        this.face = face;
    }

    public int doStartTag() throws JspException
    {
        try
        {
            JspWriter out = pageContext.getOut();

            out.println("<B>世界你好！"+face+"</B>");
        } catch (IOException ioExc)
        {
            throw new JspException(ioExc.toString());
        }
        /*跳过标记体*/
        return SKIP_BODY;
    }

    @Override
    public int doEndTag() throws JspException {
        return EVAL_PAGE;
    }
}
