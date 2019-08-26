package com.cmsinc.origenate.jdbc;

import java.io.File;
import java.io.FileInputStream;
import java.math.BigDecimal;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GitTest2 {

	public static void main(String[] args) {
		
        try
        {
            FileInputStream file = new FileInputStream(new File("D:\\NCDPaintWebsite-master\\NCDPaintWebsite-master\\Book2_filter3_part2.xlsx"));
 
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

//    			<div class="modal fade product_view" id="product_view">
//				<div class="modal-dialog">
//					<div class="modal-content">
//						<div class="modal-header">
//							<a href="#" data-dismiss="modal" class="class pull-right">
//								<span>&times
//								</span>
//							</a>
//							<h3 class="modal-title">
//								Gift Description
//							</h3>
//						</div>
//						<div class="modal-body">
//							<div class="row">
//								<div class="col-md-6 product_img">
//									<img src="images/gifts/GBA807.jpg" class="img-responsive">
//								</div>
//								<div class="col-md-6 product_content">
//									<p>
//										Product Code: 
//										<span>
//											<h4>GBA807</h4>
//										</span>
//									</p>
//									<p>
//										Product Name: 
//										<span>
//											<h4>Gourmet Snacker 1/cs</h4>
//										</span>
//									</p>
//									<p>
//										Product Description: 
//										<span>
//											<h4>Bath & Body Spa Kit, Bath Slippers, Bath Pad, Bath Puff, Loofah, Bath Sponge, Massage Roller</h4>
//										</span>
//										<p>Special Note:</p>
//									</p>
//									<p>
//										<div class="row">
//											<div class="col-md-6">
//												Dimensions: 
//													<span>
//														<h3>11 x 5.5 x 14.5</h3>
//													</span>
//											</div>		
//											<div class="col-md-6">
//												Country Of Origin: 
//													<span>
//														<h3>Canada</h3>
//													</span>
//											</div>
//										</div>
//									</p>
//									<p>
//										<div class="row">
//											<div class="col-md-6">
//												Cost/Unit: 
//													<span>
//														<h3>$ 75.00 </h3>
//													</span>
//											</div>		
//											<div class="col-md-6">
//												Case Size: 
//													<span>
//														<h3>1</h3>
//													</span>
//											</div>
//										</div>
//									</p>
//									<div class="space-ten">
//									</div>
//								</div>
//							</div>
//						</div>
//					</div>
//				</div>
//			</div>

                System.out.println("<div class=\"modal fade product_view\" id=\"product_view"+cellProductCodeValue+"\">");
                System.out.println("<div class=\"modal-dialog\">");
                System.out.println("<div class=\"modal-content\">");
                System.out.println("<div class=\"modal-header\">");
                System.out.println("<a href=\"#\" data-dismiss=\"modal\" class=\"class pull-right\">");
                System.out.println("<span>&times");
                System.out.println("</span>");
                System.out.println("</a>");
                System.out.println("<h3 class=\"modal-title\">");
                System.out.println("Gift Description");
                System.out.println("</h3>");
                System.out.println("</div>");
                System.out.println("<div class=\"modal-body\">");
                System.out.println("<div class=\"row\">");
                System.out.println("<div class=\"col-md-6 product_img\">");
                System.out.println("<img src=\"images/gifts/"+cellImageNameValue+"\" class=\"img-responsive\">");
                System.out.println("</div>");
                System.out.println("<div class=\"col-md-6 product_content\">");
                System.out.println("<p>");
                System.out.println("Product Code: ");
                System.out.println("<span>");
                System.out.println("<h4>"+cellProductCodeValue+"</h4>");
                System.out.println("</span>");
                System.out.println("</p>");
                System.out.println("<p>");
                System.out.println("Product Name: ");
                System.out.println("<span>");
                System.out.println("<h4>"+cellProductNameValue+"</h4>");
                System.out.println("</span>");
                System.out.println("</p>");
                System.out.println("<p>");
                System.out.println("Product Description: ");
                System.out.println("<span>");
                System.out.println("<h4>"+cellDescriptionValue+"</h4>");
                System.out.println("</span>");
                System.out.println("<p>Special Note:"+cellSpecialNoteValue+"</p>");
                System.out.println("</p>");
                System.out.println("<p>");
                System.out.println("<div class=\"row\">");
                System.out.println("<div class=\"col-md-6\">");
                System.out.println("Dimensions: ");
                System.out.println("<span>");
                System.out.println("<h3>"+cellDimesnionsValue+"</h3>");
                System.out.println("</span>");
                System.out.println("</div>		");
                System.out.println("<div class=\"col-md-6\">");
                System.out.println("Country Of Origin: ");
                System.out.println("<span>");
                System.out.println("<h3>"+cellCountryOriginValue+"</h3>");
                System.out.println("</span>");
                System.out.println("</div>");
                System.out.println("</div>");
                System.out.println("</p>");
                System.out.println("<p>");
                System.out.println("<div class=\"row\">");
                System.out.println("<div class=\"col-md-6\">");
                System.out.println("Cost/Unit: ");
                System.out.println("<span>");
                System.out.println("<h3>$ "+cellCostUnitValue+" </h3>");
                System.out.println("</span>");
                System.out.println("</div>		");
                System.out.println("<div class=\"col-md-6\">");
                System.out.println("Case Size: ");
                System.out.println("<span>");
                System.out.println("<h3>"+cellCaseSizeValue+"</h3>");
                System.out.println("</span>");
                System.out.println("</div>");
                System.out.println("</div>");
                System.out.println("</p>");
                System.out.println("<div class=\"space-ten\">");
                System.out.println("</div>");
                System.out.println("</div>");
                System.out.println("</div>");
                System.out.println("</div>");
                System.out.println("</div>");
                System.out.println("</div>");
                System.out.println("</div>");
            }
            file.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
