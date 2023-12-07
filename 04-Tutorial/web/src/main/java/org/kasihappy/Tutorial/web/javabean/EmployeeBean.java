package org.kasihappy.Tutorial.web.javabean;

public class EmployeeBean {
    private String name;

    public EmployeeBean()
    {
        name = "Start value";
    }

    public String getName()
    {
        System.out.println("in getName() name="+name);
        return name;
    }

    public void setName(String newValue)
    {
        System.out.println("in setName() newValue="+newValue);
        if (newValue != null)
        {
            name = newValue;
        }
    }
}