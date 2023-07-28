package com.company.ordermanagement.web.screens.order;

import com.haulmont.cuba.gui.components.AbstractEditor;
import com.company.ordermanagement.entity.Order;

public class OrderEdit extends AbstractEditor<Order> {
@Override
    protected boolean preCommit(){
    if(getItem().getOrderDate().after(getItem().getDeliveryDate())){
        showNotification("something is wrong here:", NotificationType.ERROR);
        return false;
    }
    else return true;
}
}