alter table ORDERMANAGEMENT_LINE_ITEM add constraint FK_ORDERMANAGEMENT_LINE_ITEM_ON_PRODUCT foreign key (PRODUCT_ID) references ORDERMANAGEMENT_PRODUCT(ID);
alter table ORDERMANAGEMENT_LINE_ITEM add constraint FK_ORDERMANAGEMENT_LINE_ITEM_ON_ORDER foreign key (ORDER_ID) references ORDERMANAGEMENT_ORDER(ID);
create index IDX_ORDERMANAGEMENT_LINE_ITEM_ON_PRODUCT on ORDERMANAGEMENT_LINE_ITEM (PRODUCT_ID);
create index IDX_ORDERMANAGEMENT_LINE_ITEM_ON_ORDER on ORDERMANAGEMENT_LINE_ITEM (ORDER_ID);