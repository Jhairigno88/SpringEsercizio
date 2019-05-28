package sincronoGroup.myspringhelloworld;
 
public class HelloWorld {
 
       // Messaggio da visualizzare:
       private String message;
 
       /* Metodo usato per iniettare il valore della variabile message definito
        * nel file Beans.xml */
       public void setMessage(String message){
          this.message  = message;
       }
 
       public void getMessage(){
          System.out.println("Your Message : " + message);
       }
}