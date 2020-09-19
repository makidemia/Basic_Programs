package com.amazon.test;

import Amazon.Cosmetic;
import Amazon.Electronics;
import Amazon.Product;
import Amazon.User;
import com.sun.tools.corba.se.idl.StringGen;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class TestInWahteverProductsUserSelectsShouldbeInTheCart {

    public static void main(String[] args){

        List<Product> iWantToShop = new LinkedList<Product>();

            iWantToShop.add(new Electronics("25000","LG","0%",new Date(2018,10,01),"no",false,"3","Equipment","Washing machine",true," 500 watts","4"));
            iWantToShop.add(new Cosmetic("1600","mac","10%",new Date(2020,10,01),"no",false,"NA","red","mac",true,false));

        User mahek = new User("Mahek", "Oms", "addresss",iWantToShop );
    }




}
