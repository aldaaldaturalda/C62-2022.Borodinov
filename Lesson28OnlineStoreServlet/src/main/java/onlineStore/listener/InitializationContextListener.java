package onlineStore.listener;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;
import onlineStore.repository.CategoryRepository;
import onlineStore.repository.impl.JdbcCategoryRepositoryImpl;
import onlineStore.repository.impl.ProductRepositoryImpl;
import onlineStore.service.CategoryService;
import onlineStore.service.ProductService;

import java.sql.Connection;
import java.sql.DriverManager;

@WebListener
public class InitializationContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ProductService productService = new ProductService(new ProductRepositoryImpl());
        sce.getServletContext().setAttribute("productService", productService);
        CategoryRepository jdbcCategoryRepository = new JdbcCategoryRepositoryImpl(getConnection(sce));
        CategoryService categoryService = new CategoryService(jdbcCategoryRepository);
        sce.getServletContext().setAttribute("categoryService", categoryService);
    }

    private Connection getConnection(ServletContextEvent sce) {
        String username = sce.getServletContext().getInitParameter("db_user");
        String password = sce.getServletContext().getInitParameter("db_password");
        String dbUrl = sce.getServletContext().getInitParameter("db_url");
        String dbDriver = sce.getServletContext().getInitParameter("db_driver");
        try {
            Class.forName(dbDriver);
            return DriverManager.getConnection(dbUrl, username, password);
        } catch (Exception e) {
            System.out.println("Unexpected error " + e.getMessage());
        }
        return null;
    }
}
