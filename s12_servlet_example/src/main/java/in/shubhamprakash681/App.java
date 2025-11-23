package in.shubhamprakash681;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.connector.Connector;
import org.apache.catalina.startup.Tomcat;

public class App {
    public static void main(String[] args) throws LifecycleException {
        Connector connector = new Connector();
        connector.setPort(8080);

        Tomcat tomcat = new Tomcat();

        Context context = tomcat.addContext("", null);
        Tomcat.addServlet(context, HelloServlet.class.getName(), new HelloServlet());
        context.addServletMappingDecoded("/", HelloServlet.class.getName());

        tomcat.getService().addConnector(connector);
        tomcat.start();
        tomcat.getServer().await();
    }
}
