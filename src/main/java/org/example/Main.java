package org.example;

import org.apache.commons.configuration2.ex.ConfigurationException;
import org.example.Config;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ConfigurationException {
        System.out.printf(Config.getProperty("appsettings.properties", "orders.folder"));
    }
}