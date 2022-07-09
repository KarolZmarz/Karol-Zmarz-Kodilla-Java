package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    void testInvoiceDaoSave() {
        //Given
        Product shoes = new Product("Shoes");
        Product shirts = new Product("Shirts");

        Item shoesItem = new Item(shoes, BigDecimal.valueOf(200), 2);
        Item shirtsItem = new Item(shirts, BigDecimal.valueOf(50), 3);

        Invoice invoice = new Invoice("1");
        invoice.getItems().addAll(List.of(shoesItem, shirtsItem));

        //When
        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();

        //Then
        assertEquals(0, invoiceId);

        //CleanUp
        try {
            invoiceDao.deleteById(invoiceId);
        } catch(Exception e) {
            //do nothing
        }
    }
}
