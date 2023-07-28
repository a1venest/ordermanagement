package com.company.ordermanagement.web.screens.product;

import com.haulmont.cuba.gui.screen.*;
import com.company.ordermanagement.entity.Product;

@UiController("ordermanagement_Product.browse")
@UiDescriptor("product-browse.xml")
@LookupComponent("productsTable")
@LoadDataBeforeShow
public class ProductBrowse extends StandardLookup<Product> {
}