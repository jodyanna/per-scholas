-- MySQL Hands-On #2: Joins & Grouping

-- 1
select c.customerName as "Customer Name", concat(e.lastName, ', ', e.firstName) as "Sales Rep"
from customers as c
join employees as e on c.salesRepEmployeeNumber=e.employeeNumber
order by c.customerName asc;

-- 2
select p.productName as "Product Name", od.quantityOrdered as "Total # Ordered", (od.quantityOrdered * od.priceEach) as "Total Sale"
from products as p
join orderdetails as od on p.productCode=od.productCode
group by p.productCode
order by (od.quantityOrdered * od.priceEach) desc;

-- 3
select status as "Order Status", count(orderNumber) as "# Orders"
from orders
group by status
order by status asc;

-- 4
select p.productLine as "Product Line", sum(od.quantityOrdered) as "# Sold"
from products as p
join orderdetails as od on p.productCode=p.productCode
group by p.productLine
order by sum(od.quantityOrdered) desc;

-- 5
select concat(e.lastName, ', ', e.firstName) as "Sales Rep", count(od.quantityOrdered) as "# Orders", sum(od.priceEach) as `Total Sales`
from employees as e
join customers as c on c.salesRepEmployeeNumber=e.employeeNumber
join orders as o on c.customerNumber=o.customerNumber
join orderdetails as od on o.orderNumber=od.orderNumber
where e.jobTitle="Sales Rep"
group by e.employeeNumber
order by `Total Sales` desc;

