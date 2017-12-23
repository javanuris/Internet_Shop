package kz.nuris;

import kz.nuris.entities.*;
import kz.nuris.utils.HiberanteSessionFactoryUtil;
import org.hibernate.Session;

/**
 * Created by User on 22.12.2017.
 */
public class Main {
    public static void main(String[] args) {
        Session session = HiberanteSessionFactoryUtil.getSession();
        session.beginTransaction();

      /*  Role roleEntity = new Role();
        roleEntity.setId(1);

        City cityEntity = new City();
        cityEntity.setId(1);

        User userEntity = new User();
        userEntity.setFirstName("Nurislam");
        userEntity.setLastName("Kalenov");
        userEntity.setEmail("kalenov.n");
        userEntity.setPhone("87475139923");
        userEntity.setCash(500);
        userEntity.setPassword("123456");
        userEntity.setCity(cityEntity);
        userEntity.setRole(roleEntity);*/


      /*  Brand brand = new Brand();
        brand.setName("Adidas");*/

     /*   Category category = new Category();
        category.setName("Short");
*/
     /*  GoodType goodType = new GoodType();
        goodType.setName("Cotton");
*/
       /* User user = new User();
        user.setId(1);
        Review review = new Review();
        review.setName("No bad");
        review.setRating(5);
        review.setUser(user);
*/

        Brand brand = new Brand();
        brand.setId(1);

        Category category = new Category();
        category.setId(1);
        GoodType goodType = new GoodType();
        goodType.setId(1);


        Good good = new Good();
        good.setName("Inspire boots");
        good.setCount(5);
        good.setPrice(15000);
        good.setDescription("Amazing material for amazing life");
        good.setCategory(category);
        good.setBrand(brand);
        good.setGoodType(goodType);


        session.save(good);
        session.getTransaction().commit();
    }
}
