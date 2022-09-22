package resources;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

public class ProductRepository {

    private Map<Long, Product> productMap = new ConcurrentHashMap<>();

    private AtomicLong identity = new AtomicLong(0);

    public List<Product> findAll() {
        return new ArrayList<>(productMap.values());
    }

 /*   public Product findById(long id) {
        return productMap.get(id);
    }*/

    public void insertUser(Product product) {
        long id = identity.incrementAndGet();
        product.setId(id);
        productMap.put(id, product);
    }
/*
    public void updateUser(Product product) {
        productMap.put(product.getId(), product);
    }

    public void deleteUser(Product product) {
        productMap.remove(product.getId());
    }

    public void deleteById(long id) {
        productMap.remove(id);
    }
*/
}
