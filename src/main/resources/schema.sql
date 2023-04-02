-- Use BINARY LARGE OBJECT as Value too long for column "DATA BINARY"
CREATE TABLE IF NOT EXISTS `Photoz` (
    `id`         BIGINT  PRIMARY KEY AUTO_INCREMENT,
     `file_name` VARCHAR(50) NOT NULL,
     `content_type` VARCHAR(50) NOT NULL,
     `data`  BINARY LARGE OBJECT  NOT NULL
);