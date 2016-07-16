/* SQL Manager for MySQL                              5.6.0.47256 */
/* -------------------------------------------------------------- */
/* Host     : localhost                                           */
/* Port     : 3306                                                */
/* Database : PHONES                                              */


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES 'utf8' */;

SET FOREIGN_KEY_CHECKS=0;

CREATE DATABASE `PHONES`
    CHARACTER SET 'utf8'
    COLLATE 'utf8_general_ci';

USE `phones`;

/* Структура для таблицы `records`:  */

CREATE TABLE `records` (
  `id` INTEGER(11) NOT NULL AUTO_INCREMENT,
  `fio` VARCHAR(20) COLLATE utf8_general_ci NOT NULL,
  `number` VARCHAR(20) COLLATE utf8_general_ci NOT NULL,
  `address` VARCHAR(20) COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY USING BTREE (`id`)
) ENGINE=InnoDB
AUTO_INCREMENT=6 CHARACTER SET 'utf8' COLLATE 'utf8_general_ci'
;

/* Data for the `records` table  (LIMIT 0,500) */

INSERT INTO `records` (`id`, `fio`, `number`, `address`) VALUES
  (4,'Test1','12345','Address1'),
  (5,'Test2','911','Address2');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;