package globalproject.data;

import globalproject.domain.Product;
import globalproject.domain.ProductsRepository;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jose flAVIO
 */
public class ProductsRepositoryImpl implements ProductsRepository{

    @Override
    public List<Product> getAll() {
        
        List<Product> list = new ArrayList<>();
        
        list.add(new Product(0, "prod1", "producto 1", 99.99));
        list.add(new Product(1, "prod2", "producto 2", 145.99));
        list.add(new Product(2, "prod3", "producto 3", 36.99));
        list.add(new Product(3, "prod4", "producto 4", 85.99));
        
        return list;
    }
    
}
