import resources.Product;
import resources.ProductRepository;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class BootstrapListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext sc = sce.getServletContext();
        ProductRepository userRepository = new ProductRepository();
        sc.setAttribute("userRepository", userRepository);

        userRepository.insertUser(new Product(0L, "Продукт №1", 11.11f));
        userRepository.insertUser(new Product(0L, "Product2", 22.22f));
        userRepository.insertUser(new Product(0L, "Product3", 33.33f));
        userRepository.insertUser(new Product(0L, "Product4", 44.44f));
        userRepository.insertUser(new Product(0L, "Product5", 55.55f));
        userRepository.insertUser(new Product(0L, "Product6", 66.66f));
        userRepository.insertUser(new Product(0L, "Product7", 77.77f));
        userRepository.insertUser(new Product(0L, "Product8", 88.88f));
        userRepository.insertUser(new Product(0L, "Product9", 99.99f));
        userRepository.insertUser(new Product(0L, "Product10", 101.11f));
    }
}