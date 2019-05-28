package sincronoGroup.myspringhelloworld;
 
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
/* Classe principale contenente il metodo main) */

public class MainApp {
 
    public static void main(String[] args) {
 
        /* Crea il contesto in base alle impostazioni dell'applicazione definite
         * nel file Beans.xml  */
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
 
        /* Recupera un bean avente id="helloWorld" nel file di configurazione
         * Beans.xml */
        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
 
        // Invoco il metodo che stampa il messaggio su tale oggetto
        obj.getMessage();
   }
}