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

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product product = new Product("product1");

        Item item = new Item(new BigDecimal(100), 10, new BigDecimal(1000));
        Item item1 = new Item(new BigDecimal(200), 2, new BigDecimal(4000));
        Item item2 = new Item(new BigDecimal(300), 3, new BigDecimal(9000));

        Invoice invoice = new Invoice("001");

        product.getItems().add(item);
        product.getItems().add(item1);
        product.getItems().add(item2);

        invoice.getItems().add(item);
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);

        item.setProduct(product);
        item1.setProduct(product);
        item2.setProduct(product);

        item.setInvoice(invoice);
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);

        //When
        invoiceDao.save(invoice);
        int numberId = invoice.getId();

        //Then
        Assert.assertNotEquals(0, numberId);

        //CleanUp
        invoiceDao.delete(numberId);
        try {
            invoiceDao.deleteAll();
        }
        catch (Exception e) {}
    }
}