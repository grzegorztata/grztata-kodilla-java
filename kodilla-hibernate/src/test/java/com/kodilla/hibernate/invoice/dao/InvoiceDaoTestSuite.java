package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;
    @Autowired
    ItemDao itemDao;
    @Autowired
    ProductDao productDao;

    @Test
    public void testInvoiceDaoSave(){

        Product product1 = new Product("product1");
        Product product2 = new Product("product2");
        Product product3 = new Product("product3");

        productDao.save(product1);
        productDao.save(product2);
        productDao.save(product3);

        Invoice invoice1 = new Invoice("001");
        Invoice invoice2 = new Invoice("002");

        Item item1 = new Item(product1, new BigDecimal(10), 1, new BigDecimal(10));
        Item item2 = new Item(product2, new BigDecimal(20), 2, new BigDecimal(40));
        Item item3 = new Item(product3, new BigDecimal(30), 3, new BigDecimal(90));

        invoice1.getItems().add(item1);
        invoice1.getItems().add(item2);
        invoice1.getItems().add(item3);

        item1.setInvoice(invoice1);
        item2.setInvoice(invoice1);
        item3.setInvoice(invoice1);

        //When
        invoiceDao.save(invoice1);
        invoiceDao.save(invoice2);


        //Then
        Assert.assertNotEquals(0, invoice1.getItems().size());
        Assert.assertNotEquals(2, invoiceDao.count());

        //CleanUp
        try {
            invoiceDao.deleteAll();
        }
        catch (Exception e) {}
    }
}