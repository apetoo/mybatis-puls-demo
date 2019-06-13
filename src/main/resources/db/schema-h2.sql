DROP TABLE IF EXISTS user;

CREATE TABLE user
(
    id    BIGINT(20)  NOT NULL COMMENT '主键ID',
    name  VARCHAR(30) NULL DEFAULT NULL COMMENT '姓名',
    age   INT(11)     NULL DEFAULT NULL COMMENT '年龄',
    email VARCHAR(50) NULL DEFAULT NULL COMMENT '邮箱',
    state int(10) NULL DEFAULT NULL COMMENT '状态',
    PRIMARY KEY (id)
);

DROP TABLE IF EXISTS commodity;
CREATE TABLE commodity
(
    id    int(11)        NOT NULL COMMENT '主键ID',
    name  varchar(30)   NOT NULL COMMENT '名字',
    price decimal(10, 2) NOT NULL COMMENT '价格',
    PRIMARY KEY (id)
);

