CREATE TABLE IF NOT EXISTS bills (
  id               bigserial not null primary key,
  user_id          bigint constraint bill_user_fk references users (id),
  payable_amount    double precision
);