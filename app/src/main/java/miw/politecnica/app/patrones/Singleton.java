package miw.politecnica.app.patrones;

import miw.politecnica.app.AppApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Singleton {
    private static final Logger logger = LoggerFactory.getLogger(AppApplication.class);

    //Ejemplo de como se utiliza un patron singleton

    private String url;
    private String baseDatos;
    private static Singleton miconfigurador = null;

    private Singleton(String url, String baseDatos){

        this.url=url;
        this.baseDatos=baseDatos;

    }
    public  static Singleton getConfigurador(String url, String baseDatos) {

        if (miconfigurador==null) {

            miconfigurador=new Singleton(url,baseDatos);

        }
        return miconfigurador;

    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getBaseDatos() {
        return baseDatos;
    }

    public void setBaseDatos(String baseDatos) {
        this.baseDatos = baseDatos;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Configurador{");
        sb.append("url='").append(url).append('\'');
        sb.append(", baseDatos='").append(baseDatos).append('\'');
        sb.append('}');
        return sb.toString();
    }

}

