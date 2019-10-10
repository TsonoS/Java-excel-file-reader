/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ecxelreader;

/**
 *
 * @author iPerceptions
 */
import java.io.File;
import java.io.FileInputStream;
import java.util.*;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ExcelReader {
    
   public static void main (String []args) throws Exception{
       File excelFile = new File("C:\\Users\\iPerceptions\\Documents\\NetBeansProjects\\ecxelreader\\excel\\DogsAndOwners.xlsx");
       FileInputStream fis = new FileInputStream(excelFile);
       XSSFWorkbook wb = new XSSFWorkbook(fis);
       XSSFSheet sh = wb.getSheet("sheet1");
       Iterator<Row> rowIterator = sh.iterator();
       
       while(rowIterator.hasNext()){
        Row row = rowIterator.next();
       
       Iterator<Cell> cellIterator = row.cellIterator();
       while(cellIterator.hasNext()){
           Cell c = cellIterator.next();
           System.out.println(c.toString()+ "\t\t");
       
       }
       System.out.println();
       }
       wb.close();
       fis.close();
   }
   
   

}