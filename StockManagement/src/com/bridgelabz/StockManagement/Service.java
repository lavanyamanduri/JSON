package com.bridgelabz.StockManagement;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;

import org.json.JSONException;

public interface Service {
	public void addStock(File f) throws JSONException, IOException;
	public void printStock(File f) throws IOException,ParseException, JSONException;
	public void createFile(String file) throws IOException;
	public void calcTotal(File f) throws IOException, JSONException, ParseException;
}
