package com.lofm.examples;

import java.util.List;

public interface CustomerInterface {
    CustomerJava getById(int id);
    List<CustomerJava> getAll();
}
