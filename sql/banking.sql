-- Interactive Exercise - Banking Queries 

-- 1
select P.NAME as 'Product', PT.NAME as 'Type'
from PRODUCT as P
join PRODUCT_TYPE as PT on P.PRODUCT_TYPE_CD=PT.PRODUCT_TYPE_CD;

-- 2  For each branch, list the branch name and city, plus last name and title of each employee who works in that branch.
select B.NAME, B.CITY, E.LAST_NAME, E.TITLE
from BRANCH as B
inner join EMPLOYEE as E on B.BRANCH_ID=E.ASSIGNED_BRANCH_ID;

-- 3 Show a list of each unique employee title.
select TITLE
from EMPLOYEE
group by TITLE;

-- 4 Show the last name and title of each employee, 
-- along with the last name and title of that employee's boss.
select E.LAST_NAME, E.TITLE, B.LAST_NAME, B.TITLE
from EMPLOYEE as E, EMPLOYEE as B
where E.SUPERIOR_EMP_ID=B.EMP_ID;

-- 5 For each account, show the name of the account's product, 
-- the available balance, and the customer's last name.
select P.NAME, A.AVAIL_BALANCE, I.LAST_NAME
from ACCOUNT as A
left join PRODUCT as P on A.PRODUCT_CD=P.PRODUCT_CD
left join INDIVIDUAL as I on A.CUST_ID=I.CUST_ID;

-- 6 List all account transaction details for individual customers whose last name starts with 'T'.
select AC.*
from INDIVIDUAL as I
join ACCOUNT as A on I.CUST_ID=A.CUST_ID
join ACC_TRANSACTION as AC on A.ACCOUNT_ID=AC.ACCOUNT_ID
where I.LAST_NAME like 'T%';
