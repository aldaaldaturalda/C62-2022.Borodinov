package filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;

@WebFilter(filterName = "Filter")
public class CodeFilter implements Filter {
    public void init(FilterConfig config) throws ServletException {
        System.out.println("Filter init");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        if (servletRequest.getCharacterEncoding() == null) {
            servletRequest.setCharacterEncoding("UTF-8");
        }
        filterChain.doFilter(servletRequest, servletResponse);
        servletResponse.setContentType("text/html");
        servletResponse.setCharacterEncoding("UTF-8");
    }

    @Override
    public void destroy() {
        System.out.println("Filter Destroy");
    }
}
