-- MySQL Hands-On #1: Simple Queries

-- 1
select productName as "Name", productLine as "Product Line", buyPrice as "Buy Price"
from products
order by buyPrice desc;

-- 2
select contactFirstName as "First Name", contactLastName as "Last Name", city as "City"
from customers
where country="Germany"
order by contactLastName asc;

-- 3
select distinct status
from orders
order by status asc;

-- 4
select *
from payments
where paymentDate >= "20050101"
order by paymentDate asc;

-- 5
select lastName, firstName, email, jobTitle
from employees
join offices on employees.officeCode=offices.officeCode
where offices.city="San Francisco"
order by lastName asc;

-- 6
select productName, productLine, productScale, productVendor
from products
where productLine="Classic Cars" or productLine="Vintage Cars"
order by productLine desc, productName asc;