package com.company.ordermanagement.listeners;


import com.haulmont.cuba.core.app.UniqueNumbersAPI;
import org.springframework.stereotype.Component;
import com.haulmont.cuba.core.listener.BeforeInsertEntityListener;
import com.haulmont.cuba.core.EntityManager;
import com.company.ordermanagement.entity.Order;

import javax.inject.Inject;

@Component("ordermanagement_OrderIdCreator")
public class OrderIdCreator implements BeforeInsertEntityListener<Order> {

    @Inject
    protected UniqueNumbersAPI uniqueNumbersAPI;

    @Override
    public void onBeforeInsert(Order entity, EntityManager entityManager) {


        entity.setOrderId("" + uniqueNumbersAPI.getNextNumber("orderId"));
    }


}
