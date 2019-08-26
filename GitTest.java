package com.cmsinc.origenate.jdbc;

import java.io.File;
import java.io.FileInputStream;
import java.math.BigDecimal;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GitTest {

	public static void main(String[] args) {
		
        try
        {
            FileInputStream file = new FileInputStream(new File("D:\\NCDPaintWebsite-master\\NCDPaintWebsite-master\\Book2_filter3.xlsx"));
 
            //Create Workbook instance holding reference to .xlsx file
            XSSFWorkbook workbook = new XSSFWorkbook(file);
 
            //Get first/desired sheet from the workbook
            XSSFSheet sheet = workbook.getSheetAt(0);
 
            //Iterate through each rows one by one
            Iterator<Row> rowIterator = sheet.iterator();
            while (rowIterator.hasNext())
            {
            	String cellImageNameValue = "";
            	String cellProductCodeValue = "";
            	String cellProductNameValue = "";
            	String cellSpecialNoteValue = "";
            	String cellDescriptionValue = "";
            	String cellDimesnionsValue = "";
            	String cellCountryOriginValue = "";
            	String cellCaseSizeValue = "";
            	String cellCostUnitValue = "";
            	String cellCategoryValue = "";
            	
                Row row = rowIterator.next();
                //For each row, iterate through all the columns
                Iterator<Cell> cellIterator = row.cellIterator();
                 
                while (cellIterator.hasNext())
                {
                    Cell cell = cellIterator.next();
                    //Check the cell type and format accordingly
                    
                    Integer columnIndex = cell.getColumnIndex();
                    if(columnIndex == 2){
                         switch (cell.getCellType())
                         {
                             case Cell.CELL_TYPE_NUMERIC:
                            	 cellImageNameValue= String.valueOf(cell.getNumericCellValue());
                                 break;
                             case Cell.CELL_TYPE_STRING:
                            	 cellImageNameValue= cell.getStringCellValue();
                                 break;
                         }
                    	// System.out.println("cellImageNameValue : " + cellImageNameValue);
                    }else if(columnIndex == 3){
	                     switch (cell.getCellType())
	                     {
	                         case Cell.CELL_TYPE_NUMERIC:
	                        	 cellProductCodeValue= String.valueOf(cell.getNumericCellValue());
	                             break;
	                         case Cell.CELL_TYPE_STRING:
	                        	 cellProductCodeValue= cell.getStringCellValue();
	                             break;
	                     }
	                	// System.out.println("cellProductCodeValue : " + cellProductCodeValue);
	                }else if(columnIndex == 4){
	                     switch (cell.getCellType())
	                     {
	                         case Cell.CELL_TYPE_NUMERIC:
	                        	 cellProductNameValue= String.valueOf(cell.getNumericCellValue());
	                             break;
	                         case Cell.CELL_TYPE_STRING:
	                        	 cellProductNameValue= cell.getStringCellValue();
	                             break;
	                     }
	                	// System.out.println("cellProductNameValue : " + cellProductNameValue);
	                }else if(columnIndex == 5){
	                     switch (cell.getCellType())
	                     {
	                         case Cell.CELL_TYPE_NUMERIC:
	                        	 cellSpecialNoteValue= String.valueOf(cell.getNumericCellValue());
	                             break;
	                         case Cell.CELL_TYPE_STRING:
	                        	 cellSpecialNoteValue= cell.getStringCellValue();
	                             break;
	                     }
	                	// System.out.println("cellSpecialNoteValue : " + cellSpecialNoteValue);
	                }else if(columnIndex == 6){
	                     switch (cell.getCellType())
	                     {
	                         case Cell.CELL_TYPE_NUMERIC:
	                        	 cellDescriptionValue= String.valueOf(cell.getNumericCellValue());
	                             break;
	                         case Cell.CELL_TYPE_STRING:
	                        	 cellDescriptionValue= cell.getStringCellValue();
	                             break;
	                     }
	                	// System.out.println("cellDescriptionValue : " + cellDescriptionValue);
	                }else if(columnIndex == 7){
	                     switch (cell.getCellType())
	                     {
	                         case Cell.CELL_TYPE_NUMERIC:
	                        	 cellDimesnionsValue= String.valueOf(cell.getNumericCellValue());
	                             break;
	                         case Cell.CELL_TYPE_STRING:
	                        	 cellDimesnionsValue= cell.getStringCellValue();
	                             break;
	                     }
	                	 //System.out.println("cellDimesnionsValue : " + cellDimesnionsValue);
	                }else if(columnIndex == 8){
	                     switch (cell.getCellType())
	                     {
	                         case Cell.CELL_TYPE_NUMERIC:
	                        	 cellCountryOriginValue= String.valueOf(cell.getNumericCellValue());
	                             break;
	                         case Cell.CELL_TYPE_STRING:
	                        	 cellCountryOriginValue= cell.getStringCellValue();
	                             break;
	                     }
	                	 //System.out.println("cellCountryOriginValue : " + cellCountryOriginValue);
	                }else if(columnIndex == 9){
	                     switch (cell.getCellType())
	                     {
	                         case Cell.CELL_TYPE_NUMERIC:
	                        	 cellCaseSizeValue= String.valueOf(cell.getNumericCellValue());
	                             break;
	                         case Cell.CELL_TYPE_STRING:
	                        	 cellCaseSizeValue= cell.getStringCellValue();
	                             break;
	                     }
	                	 //System.out.println("cellCaseSizeValue : " + cellCaseSizeValue);
	                }else if(columnIndex == 10){
	                     switch (cell.getCellType())
	                     {
	                         case Cell.CELL_TYPE_NUMERIC:
	                        	 cellCostUnitValue= String.valueOf(cell.getNumericCellValue());
	                             break;
	                         case Cell.CELL_TYPE_STRING:
	                        	 cellCostUnitValue= cell.getStringCellValue();
	                             break;
	                     }
	                	// System.out.println("cellCostUnitValue : " + cellCostUnitValue);
	                }else if(columnIndex == 11){
	                     switch (cell.getCellType())
	                     {
	                         case Cell.CELL_TYPE_NUMERIC:
	                        	 cellCategoryValue= String.valueOf(cell.getNumericCellValue());
	                             break;
	                         case Cell.CELL_TYPE_STRING:
	                        	 cellCategoryValue= cell.getStringCellValue();
	                             break;
	                     }
	                	 //System.out.println("cellCategoryValue : " + cellCategoryValue);
	                }
                   
                    
                    

                    
                   // System.out.println(cell.getStringCellValue());
                }
                System.out.println("");
               // System.out.println("===cellCategoryValue=== : "+cellCategoryValue);
                
                System.out.println("<li class=\"element isotope-"+cellCategoryValue+"\">");
                System.out.println("<div class=\"thumb-isotope\">");
                System.out.println("<div class=\"thumbnail clearfix\">");
//                System.out.println("<a href=\"images/gifts/"+cellImageNameValue+"\" rel=\"prettyPhoto[mix]\" title=\"Photo\" class=\"p\">");
//                System.out.println("<div class=\"thumb-isotope\">");
//                System.out.println("<figure>");
//				System.out.println("<img src=\"images/gifts/"+cellImageNameValue+"\" alt=\"\"><em></em>");
//				System.out.println("</figure>");
//				//System.out.println("<div class=\"caption\">"+cellProductCodeValue+"</div>");
//				System.out.println("<div class=\"caption\">");
//				System.out.println("<b>"+cellProductCodeValue+"</b><br>");
//				System.out.println("<b>"+cellProductNameValue+"</b> <br>");
//				System.out.println("Cost/Unit: <b>$"+cellCostUnitValue+"</b><br>");
//				System.out.println("Case Size: <b>"+cellCaseSizeValue+"</b>");
//				System.out.println("</div>");
//				System.out.println("</div>");
//				System.out.println("</a>");
                System.out.println("<a href=\"#\"  data-toggle=\"modal\" data-target=\"#product_view"+cellProductCodeValue+"\">");
				System.out.println("<img src=\"images/gifts/"+cellImageNameValue+"\" alt=\"\" class=\"img-responsive\">");
				System.out.println("<div class=\"caption\">");
				System.out.println("<h4>");
				System.out.println(cellProductCodeValue);
				System.out.println("</h4>");
				System.out.println("<p>");
				System.out.println("<b>"+cellProductNameValue+"</b>");
				System.out.println("</p>");
				System.out.println("<p>Cost/Unit 	: <b>$"+cellCostUnitValue+"</b>");
				System.out.println("</p>");
				System.out.println("<p>Case Size	: <b>"+cellCaseSizeValue+"</b>");
				System.out.println("</p>");
				System.out.println("</div>");
				System.out.println("<div class=\"space-ten\">");
				System.out.println("</div>");
				System.out.println("</a>");
				System.out.println("</div>");
				System.out.println("</div>");
				System.out.println("</li>");
				
				
//				<li class="element isotope-filter2">
//				  <div class="thumb-isotope">
//					<div class="thumbnail  clearfix">
//						<a href="#"  data-toggle="modal" data-target="#product_view">
//						<img src="images/gifts/GBA807.jpg" alt="" class="img-responsive">
//						<div class="caption">
//							<h4>
//								GBA807
//							</h4>
//							<p>
//								<b>Gourmet Snacker 1/cs</b>
//							</p>
//							<p>Cost/Unit 	: <b>$700.99</b>
//							</p>
//							<p>Case Size	: <b>1</b>
//							</p>
//						</div>
//						<div class="space-ten">
//						</div>
//						</a>
//					</div>
//				  </div>
//				</li>
            }
            file.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
