--liquibase formatted sql

--changeset vantoniuc:adding-data
INSERT INTO shop.categories (category_name) VALUES ('Console');
INSERT INTO shop.products (product_name, price, description, image, category_id) VALUES ('PlayStation 5', '500', null, null, 1);
