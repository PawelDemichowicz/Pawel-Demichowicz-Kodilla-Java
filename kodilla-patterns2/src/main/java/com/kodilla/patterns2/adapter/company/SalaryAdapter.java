package com.kodilla.patterns2.adapter.company;

import com.kodilla.patterns2.adapter.company.newhrsystem.Employee;
import com.kodilla.patterns2.adapter.company.oldhrsystem.SalaryCalculator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SalaryAdapter extends SalaryAdaptee implements SalaryCalculator {
    @Override
    public double TotalSalary(String[][] workrers, double[] salaries) {
        List<Employee> employeeList = new ArrayList<>();
        for (int n = 0; n < salaries.length; n++) {
            employeeList.add(new Employee(
                    workrers[n][0],
                    workrers[n][1],
                    workrers[n][2],
                    new BigDecimal(salaries[n])));
        }
        return calculateSalaries(employeeList).doubleValue();
    }
}
