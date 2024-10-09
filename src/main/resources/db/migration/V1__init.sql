USE bookdb;

DROP TABLE IF EXISTS books CASCADE;

CREATE TABLE books (
                      ID          BIGINT AUTO_INCREMENT PRIMARY KEY,
                      COVER_URL   VARCHAR(255)   NULL,
                      CURRENCY    VARCHAR(3)     NULL,
                      DESCRIPTION VARCHAR(255)   NULL,
                      IS_VISIBLE  BIT            NOT NULL,
                      PRICE       DECIMAL(19, 2) NULL,
                      TITLE       VARCHAR(255)   NOT NULL,
                      ISBN        VARCHAR(13)    NOT NULL,
                      QUANTITY    BIGINT         NULL,
                      AUTHOR      VARCHAR(255)   NULL,
                      CONSTRAINT UK_d25ugxfsu9u67yw7clk943quy
                          UNIQUE (ISBN)
);
