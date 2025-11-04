package com.my.app;

import com.my.app.helper.Helper;

/**
 * Entry point for the Hello World Maven project.
 */
public class App
{
    public static void main( String[] args )
    {
        System.out.println("==============================");
        System.out.println("Hello World!");
        System.out.println("This is Maven Project");
        // Call helper method
        Helper.help();
        System.out.println("==============================");
    }
}
