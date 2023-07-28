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
);