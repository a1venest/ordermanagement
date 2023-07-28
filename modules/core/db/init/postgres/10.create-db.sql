-- begin ORDERMANAGEMENT_CUSTOMER
create table ORDERMANAGEMENT_CUSTOMER (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    FIRST_NAME varchar(255) not null,
    BIRTHDAY date,
    --
    primary key (ID)
)^
-- end ORDERMANAGEMENT_CUSTOMER
-- begin ORDERMANAGEMENT_ADDRESS
create table ORDERMANAGEMENT_ADDRESS (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    STREET varchar(255) not null,
    POST_CODE varchar(255) not null,
    CITY varchar(255) not null,
    CUSTOMER_ID uuid not null,
    --
    primary key (ID)
)^
-- end ORDERMANAGEMENT_ADDRESS
-- begin ORDERMANAGEMENT_LINE_ITEM
create table ORDERMANAGEMENT_LINE_ITEM (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    PRODUCT_ID uuid not null,
    PRICE decimal(19, 2) not null,
    QUANTITY integer not null,
    ORDER_ID uuid not null,
    --
    primary key (ID)
)^
-- end ORDERMANAGEMENT_LINE_ITEM
-- begin ORDERMANAGEMENT_PRODUCT
create table ORDERMANAGEMENT_PRODUCT (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    CODE varchar(255) not null,
    --
    primary key (ID)
)^
-- end ORDERMANAGEMENT_PRODUCT
-- begin ORDERMANAGEMENT_ORDER
create table ORDERMANAGEMENT_ORDER (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CUSTOMER_ID uuid not null,
    ORDER_ID varchar(255),
    ORDER_DATE date not null,
    DELIVERY_DATE date not null,
    --
    primary key (ID)
)^
-- end ORDERMANAGEMENT_ORDER
