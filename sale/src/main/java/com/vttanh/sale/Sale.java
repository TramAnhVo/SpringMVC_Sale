/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.vttanh.sale;

import com.vttanh.pojo.Category;
import com.vttanh.respository.ProductRepository;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;

/**
 *
 * @author admin
 */
public class Sale {

    public static void main(String[] args) {
        // nap bang product
        ProductRepository r = new ProductRepository();
        r.getProduct(null).forEach(p -> System.out.printf("%d - %s - %.1f\n", 
                p.getId(), p.getName(), p.getPrice()));
        
        // doc bang category
//        try ( Session s = HibernateUtils.getFactory().openSession()) {
//            Query q = s.createQuery("FROM Category");
//            List<Category> cates = q.getResultList();
//            cates.forEach(c -> System.out.println(c.getName()));
//        }
    }
}
