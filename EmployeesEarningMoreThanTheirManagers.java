//Employee 表包含所有员工，他们的经理也属于员工。每个员工都有一个 Id，此外还有一列对应员工的经理的 Id。 
//
// +----+-------+--------+-----------+
//| Id | Name  | Salary | ManagerId |
//+----+-------+--------+-----------+
//| 1  | Joe   | 70000  | 3         |
//| 2  | Henry | 80000  | 4         |
//| 3  | Sam   | 60000  | NULL      |
//| 4  | Max   | 90000  | NULL      |
//+----+-------+--------+-----------+
// 
//
// 给定 Employee 表，编写一个 SQL 查询，该查询可以获取收入超过他们经理的员工的姓名。在上面的表格中，Joe 是唯一一个收入超过他的经理的员工。
// 
//
// +----------+
//| Employee |
//+----------+
//| Joe      |
//+----------+
// 
// 👍 295 👎 0

package com.cute.leetcode.editor.cn;
public class EmployeesEarningMoreThanTheirManagers {
    public static void main(String[] args) {
        Solution solution = new EmployeesEarningMoreThanTheirManagers().new Solution();
    }
    //There is no code of Java type for this problem
}