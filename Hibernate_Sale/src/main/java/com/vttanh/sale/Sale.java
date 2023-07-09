/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.vttanh.sale;

import com.vttanh.pojo.Category;
import com.vttanh.respository.ProductRepository;
import com.vttanh.respository.StatsRepository;
import java.text.ParseException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.persistence.Query;
import org.hibernate.Session;

/**
 *
 * @author admin
 */
public class Sale {

    public static void main(String[] args){
        
//        Map<String, String> params = new HashMap<>();
         // tim kiem theo ten
//      params.put("kw", "iPhone");

        // thong ke so luong theo quy
//        params.put("quarter", "1");
//        params.put("year", "2020");
        
//        StatsRepository s = new StatsRepository();
//        s.statsRevenue(params).forEach(o -> System.out.printf("%d - %s - %d\n", o[0], o[1], o[2]));
        
        Map<String, String> params = new HashMap<>();
//        params.put("fromPrice", "20000000");
//        params.put("toPrice", "40000000");
        params.put("page", "1");
        
        ProductRepository r = new ProductRepository();
        r.getProduct(params).forEach(p -> System.out.printf("%d - %s - %d\n",
                p.getId(), p.getName(), p.getPrice()));
        
        // tim kiem theo if the loai
//        try (Session s = HibernateUtils.getFactory().openSession()) {
//            Query q = s.createNamedQuery("Category.findById");
//            q.setParameter("id", 2);
//            List<Category> cates = q.getResultList();
//            cates.forEach(c -> System.out.println(c.getName()));
//        }
        
        // nap bang product
//        ProductRepository r = new ProductRepository();
//        r.getProduct(null).forEach(p -> System.out.printf("%d - %s - %.1f\n", 
//                p.getId(), p.getName(), p.getPrice()));
        
        // doc bang category
//        try ( Session s = HibernateUtils.getFactory().openSession()) {
//            Query q = s.createQuery("FROM Category");
//            List<Category> cates = q.getResultList();
//            cates.forEach(c -> System.out.println(c.getName()));
//        }
    }
}
