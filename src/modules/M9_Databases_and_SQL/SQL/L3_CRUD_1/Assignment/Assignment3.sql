/* 
 * Problem Description:
 * Write a query to calculate the salary of all employees 
 * after an increment of -- 20%. Save the newly calculated 
 * salary column as 'New_salary'.
 *
 *Note:
 *
 * Return the columns emp_id, name, salary, and 'New_salary'.
 * Order the output by the emp_id in ascending order.
 * Steps to calculate the salary increment:
 *
 * Multiply the current salary by the percentage of the increment.
 * Divide the result by 100.
 * Then add the result to the current salary.
 *Name the column as 'New_Salary'
 *Round off the 'New_salary'. Use Round() for this.
 *
 */
SELECT *,
  ROUND(salary + (0.2 * salary), 2) AS New_salary
FROM employees
ORDER BY emp_id;