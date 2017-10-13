package com.lofm.examples;

import java.io.IOException;

public class TalkingToKotlin {
    public static void main(String[] args) {
        CustomerKotlin customerKotlin = new CustomerKotlin(13, "Omar", "a@b.com");
        customerKotlin.setId(13);
        System.out.println(customerKotlin.getId());
        System.out.println(customerKotlin.someField);
        customerKotlin.changeStatus(Status.Current);
        customerKotlin.changeStatus();  //This is not possible without the annotation in kotlin class
        customerKotlin.preferential();
        CustomerKotlinKt.entendedFunction(customerKotlin);
        System.out.println(UtilityClass.prefix("Ex", "coworker"));
        System.out.println(UtilityClass.CopyrightYear);
    }

    public void loadStats(CustomerKotlin customerKotlin) {
        try {
            customerKotlin.loadStatistics("filename");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
