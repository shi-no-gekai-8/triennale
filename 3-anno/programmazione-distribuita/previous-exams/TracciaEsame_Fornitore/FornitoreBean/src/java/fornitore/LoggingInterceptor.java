package fornitore;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Interceptor
@Loggable
public class LoggingInterceptor {
    
    @AroundInvoke
    public Object logMethod(InvocationContext ic) throws Exception{
        System.out.println("Invoco(Entrata): Classe" + ic.getTarget().getClass().getName() +
                           " Metodo " + ic.getMethod().getName());
        
        try{
            return ic.proceed();
        } finally {
            System.out.println("Invoco(Uscita): Classe" + ic.getTarget().getClass().getName() +
                               " Metodo " + ic.getMethod().getName());
        }
    } 
       
}
