package com.raxrot.principleasandstrategies;

import java.util.Date;

public class SingleResponsibility {
}

 class Employee{
    private String employeeId;
    private String name;
    private String address;
    private Date dateOfJoining;

}

class HrPromotions{
    public boolean isPromotionThisYear(Employee employee){
        //impl using employee passed
        return false;
    }
}

class Finance{
    public double calcIncomeTaxForCurrentYear(Employee employee){
        //impl using employee passed
        return 0.0;
    }
}
