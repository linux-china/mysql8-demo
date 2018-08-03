MySQL 8.0
=========

Demo for MySQL 8 with Document store feature.

# Setup

Please use "docker-compose up -d" to start MySQL 8.

# Ports

* 3306: traditional
* 33060: X Protocol

# Document Store

* Schema: database name
* Collection: almost like table
* DbDoc: document
* id: name should be "_id" with String type

# MySQL Shell

* install: brew cask install mysql-shell
* SQL Model(mysql cli) :  mysqlsh --sql --uri root@127.0.0.1/demo
```bash
mysqlsh --uri root@127.0.0.1/demo
```
Operations in MySQL Shell

```
JS> \?
JS> \use demo
JS> db.createCollection("countryinfo")
```

# Reference

* MySQL Shell: https://dev.mysql.com/doc/refman/5.7/en/mysql-shell.html
* Connector/J 8.0: https://dev.mysql.com/doc/connector-j/8.0/en/connector-j-whats-new.html
* Enable X Protocol: https://dev.mysql.com/doc/refman/5.7/en/document-store-setting-up.html
```
mysqlsh -u root -h 127.0.0.1 --classic --dba enableXProtocol
```
