package com.bridgelabz.program;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabz.utility.Utility;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

public class JsonInventoryDataManagement {
    public static void main(String[] args) {
    	Utility utilityObj = new Utility();
    	utilityObj.InventryDataManagment();
    }
}