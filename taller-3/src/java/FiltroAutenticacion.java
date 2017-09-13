 
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Autenticar Usuarios.
 * @author 
 */
@WebFilter(filterName = "FiltroAutenticacion", urlPatterns = {"/taller-3/index.html","/taller-3/ProcesarFormulario"})
public class FiltroAutenticacion implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
   //No se implementa.
    }
    

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse resp = (HttpServletResponse) response;
        if (req.getSession().getAttribute("usuario")==null){
            //no esta autentidcado
            resp.sendRedirect("/login.html");    
        }else{
            //esta autenticado
            chain.doFilter(request, response);
        }
    }

    @Override
    public void destroy() {
    //no se implementa.
    }
    
}

