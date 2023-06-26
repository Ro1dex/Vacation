package ru.netology.services;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class TestFreelancerVacation{
    @Test
    public void shouldShowVacationMonth(){
        FreelancerVacation vac = new FreelancerVacation();
        int exp = 3;
        int act = vac.vacation(10000,3000,20000);
        Assert.assertEquals(exp,act);
    }



}
