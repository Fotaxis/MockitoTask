package shopping;

import customer.Customer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import product.Product;
import product.ProductDao;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Тестирование {@link ShoppingService}
 */
@ExtendWith(MockitoExtension.class)
public class ShoppingServiceTest {

    private ProductDao productDaoMock;

    @InjectMocks
    ShoppingService shoppingService;

    public ShoppingServiceTest(@Mock ProductDao productDaoMock) {
        this.productDaoMock = productDaoMock;
        shoppingService = new ShoppingServiceImpl(productDaoMock);
    }

    /**
     * Тестирование получения корзины покупателя
     */
    @Test
    public void getCartTest() {

    }

//    /**
//     * Тестирование получения всех товаров
//     */
//    @Test
//    public void getAllProductsTest() {
//        Mockito.when(productDaoMock.getAll())
//                .thenReturn(Arrays.asList(new Product("a", 2), new Product("a", 2)));
//    }

    /**
     * Тестирование получения всех товаров
     */
    @Test
    public void getProductByNameTest() {
        Mockito.when(productDaoMock.getByName(Mockito.any(String.class)))
                .thenReturn());
    }

    /**
     * Тестирование выброса ошибки
     */
    @Test
    public void butTest() {
        Customer customer = new Customer(1, "11");
        Cart cart = shoppingService.getCart(customer);
        cart.add();
        Mockito.when(productDaoMock.save(Mockito.any(Product.class))
    }

}

