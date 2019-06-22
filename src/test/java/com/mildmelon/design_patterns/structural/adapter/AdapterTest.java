package com.mildmelon.design_patterns.structural.adapter;

import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

@Slf4j
public class AdapterTest {

    @Test
    public void adaptTest() {
        EmployeeClient client = new EmployeeClient();
        List<Employee> employeeList = client.getEmployeeList();

        for (Employee employee : employeeList) {
            if (!(employee instanceof EmployeeDB)
                    && !(employee instanceof EmployeeAdapterLdap)
                    && !(employee instanceof EmployeeAdapterCSV)) {
                Assert.fail("Unknown class " + employee.getClass().getSimpleName());
            } else {
                String info = employee.info();
                Assert.assertNotNull(info);
                log.info(info);
            }
        }
    }

}
