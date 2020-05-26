CREATE TABLE IF NOT EXISTS bills_products (
  bill_id    bigint NOT NULL constraint bills_procucts_bill_fk references bills (id),
  product_id bigint NOT NULL constraint bills_procucts_product_fk references products (id)
);