package org.kasihappy.Tutorial.web.taglib;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.BodyTagSupport;
import java.io.IOException;

public class Iftag extends BodyTagSupport {

     private static final long serialVersionUID = 1L;
     private boolean myPredicate;

    public void setMyPredicate(boolean myPredicate) {
        this.myPredicate = myPredicate;
    }

    public boolean getPredicate() {
        return myPredicate;
    }

    public int doStartTag()
    {
        if (getPredicate())
            return EVAL_BODY_BUFFERED;
        else
            return SKIP_BODY;
    }

    public int doAfterBody() throws JspException
    {
        try {
            bodyContent.writeOut(bodyContent.getEnclosingWriter());
            return SKIP_BODY;
        } catch (IOException ex)
        {
            throw new JspTagException(ex.toString());
        }
    }
}
