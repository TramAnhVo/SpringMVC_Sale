/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vttanh.respository;

import com.vttanh.pojo.Product;
import com.vttanh.sale.HibernateUtils;
import java.util.List;
import java.util.Map;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;

/**
 *
 * @author admin
 */
public class ProductRepository {
    public List<Product> getProduct(Map<String, String> params) {
        try( Session s = HibernateUtils.getFactory().openSession()) {
             CriteriaBuilder b = s.getCriteriaBuilder();
             CriteriaQuery<Product> q = b.createQuery(Product.class);
             Root root = q.from(Product.class);
             q.select(root);
             
             Query query = s.createQuery(q);
             return query.getResultList();
        }
    }   
}
