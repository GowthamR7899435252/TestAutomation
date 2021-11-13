package reflection4;

import java.io.FileInputStream;

import java.util.*;
import java.io.*;
import java.lang.reflect.*;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AssignmentRunner 
{
	private static String path=null;
	public static void main(String[] args) 
	{
		
       
		forassignmentP1();
		forassignment2();
		forassignment3();
		forassignment4();
		forassignment5();
		forassignment6();
		forassignment7();
	}
	
	
	public static void forassignmentP1()
	{
		FileInputStream fin=null;
		Workbook wb=null;
		Sheet sh=null;
		Row row=null;
		Cell cell=null;
		try
		{
			path=System.getProperty("user.dir");
			fin=new FileInputStream(path+"\\DataFiles\\Assignment_Runner.xlsx");
			wb=new XSSFWorkbook(fin);
			sh=wb.getSheet("Sheet8");
			int rc=sh.getPhysicalNumberOfRows();
			for(int r=1;r<rc;r++)
			{
				row=sh.getRow(r);
				cell=row.getCell(0);
				String methodname=cell.getStringCellValue();
				cell=row.getCell(1);
				String pkgclassname=cell.getStringCellValue();
				
				System.out.println(pkgclassname+ " ----> "+methodname);
				
				Class cls=Class.forName(pkgclassname);
			    Object obj=cls.getDeclaredConstructor().newInstance();
				
				Method method=obj.getClass().getMethod(methodname);
				method.invoke(obj);
			}
				
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fin.close();
				wb.close();
			}catch(Exception e)
			   {
				e.printStackTrace();
			   }
		}
	}
		
		public static void forassignment2()
		{
			FileInputStream fin=null;
			Workbook wb=null;
			Sheet sh=null;
			Row row=null;
			Cell cell=null;
			try
			{
				path=System.getProperty("user.dir");
				fin=new FileInputStream(path+"\\DataFiles\\Assignment_Runner.xlsx");
				wb=new XSSFWorkbook(fin);
				sh=wb.getSheet("Sheet2");
				int rc=sh.getPhysicalNumberOfRows();
				for(int r=1;r<rc;r++)
				{
					row=sh.getRow(r);
					cell=row.getCell(0);
					String methodname=cell.getStringCellValue();
					cell=row.getCell(1);
					String pkgclassname=cell.getStringCellValue();
					
					System.out.println(pkgclassname+ " ----> "+methodname);
					
					Class cls=Class.forName(pkgclassname);
					Object obj=cls.getDeclaredConstructor().newInstance();
					
					Method method=obj.getClass().getMethod(methodname);
					method.invoke(obj);
				}
					
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			finally
			{
				try
				{
					fin.close();
					wb.close();
				}catch(Exception e)
				   {
					e.printStackTrace();
				   }
			}
		}	
	
			public static void forassignment3()
			{
				FileInputStream fin=null;
				Workbook wb=null;
				Sheet sh=null;
				Row row=null;
				Cell cell=null;
				try
				{
					path=System.getProperty("user.dir");
					fin=new FileInputStream(path+"\\DataFiles\\Assignment_Runner.xlsx");
					wb=new XSSFWorkbook(fin);
					sh=wb.getSheet("Sheet3");
					int rc=sh.getPhysicalNumberOfRows();
					for(int r=1;r<rc;r++)
					{
						row=sh.getRow(r);
						cell=row.getCell(0);
						String methodname=cell.getStringCellValue();
						cell=row.getCell(1);
						String pkgclassname=cell.getStringCellValue();
						
						System.out.println(pkgclassname+ " ----> "+methodname);
						
						Class cls=Class.forName(pkgclassname);
						Object obj=cls.getDeclaredConstructor().newInstance();
						
						Method method=obj.getClass().getMethod(methodname);
						method.invoke(obj);
					}
						
				}catch(Exception e)
				{
					e.printStackTrace();
				}	
		finally
		{
			try
			{
				fin.close();
				wb.close();
			}catch(Exception e)
			   {
				e.printStackTrace();
			   }
		}
	}
			
			public static void forassignment4()
			{
				FileInputStream fin=null;
				Workbook wb=null;
				Sheet sh=null;
				Row row=null;
				Cell cell=null;
				try
				{
					path=System.getProperty("user.dir");
					fin=new FileInputStream(path+"\\DataFiles\\Assignment_Runner.xlsx");
					wb=new XSSFWorkbook(fin);
					sh=wb.getSheet("Sheet4");
					int rc=sh.getPhysicalNumberOfRows();
					for(int r=1;r<rc;r++)
					{
						row=sh.getRow(r);
						cell=row.getCell(0);
						String methodname=cell.getStringCellValue();
						cell=row.getCell(1);
						String pkgclassname=cell.getStringCellValue();
						
						System.out.println(pkgclassname+ " ----> "+methodname);
						
						Class cls=Class.forName(pkgclassname);
						Object obj=cls.getDeclaredConstructor().newInstance();
						
						Method method=obj.getClass().getMethod(methodname);
						method.invoke(obj);
					}
						
				}catch(Exception e)
				{
					e.printStackTrace();
				}
				finally
				{
					try
					{
						fin.close();
						wb.close();
					}catch(Exception e)
					   {
						e.printStackTrace();
					   }
				}
			}
			
			public static void forassignment5()
			{
				FileInputStream fin=null;
				Workbook wb=null;
				Sheet sh=null;
				Row row=null;
				Cell cell=null;
				try
				{
					path=System.getProperty("user.dir");
					fin=new FileInputStream(path+"\\DataFiles\\Assignment_Runner.xlsx");
					wb=new XSSFWorkbook(fin);
					sh=wb.getSheet("Sheet5");
					int rc=sh.getPhysicalNumberOfRows();
					for(int r=1;r<rc;r++)
					{
						row=sh.getRow(r);
						cell=row.getCell(0);
						String methodname=cell.getStringCellValue();
						cell=row.getCell(1);
						String pkgclassname=cell.getStringCellValue();
						
						System.out.println(pkgclassname+ " ----> "+methodname);
						
						Class cls=Class.forName(pkgclassname);
						Object obj=cls.getDeclaredConstructor().newInstance();
						
						Method method=obj.getClass().getMethod(methodname);
						method.invoke(obj);
					}
						
				}catch(Exception e)
				{
					e.printStackTrace();
				}
				finally
				{
					try
					{
						fin.close();
						wb.close();
					}catch(Exception e)
					   {
						e.printStackTrace();
					   }
				}
			}
	
			public static void forassignment6()
			{
				FileInputStream fin=null;
				Workbook wb=null;
				Sheet sh=null;
				Row row=null;
				Cell cell=null;
				try
				{
					path=System.getProperty("user.dir");
					fin=new FileInputStream(path+"\\DataFiles\\Assignment_Runner.xlsx");
					wb=new XSSFWorkbook(fin);
					sh=wb.getSheet("Sheet6");
					int rc=sh.getPhysicalNumberOfRows();
					for(int r=1;r<rc;r++)
					{
						row=sh.getRow(r);
						cell=row.getCell(0);
						String methodname=cell.getStringCellValue();
						cell=row.getCell(1);
						String pkgclassname=cell.getStringCellValue();
						
						System.out.println(pkgclassname+ " ----> "+methodname);
						
						Class cls=Class.forName(pkgclassname);
						Object obj=cls.getDeclaredConstructor().newInstance();
						
						Method method=obj.getClass().getMethod(methodname);
						method.invoke(obj);
					}
						
				}catch(Exception e)
				{
					e.printStackTrace();
				}
				finally
				{
					try
					{
						fin.close();
						wb.close();
					}catch(Exception e)
					   {
						e.printStackTrace();
					   }
				}
			}	
			public static void forassignment7()
			{
				FileInputStream fin=null;
				Workbook wb=null;
				Sheet sh=null;
				Row row=null;
				Cell cell=null;
				try
				{
					path=System.getProperty("user.dir");
					fin=new FileInputStream(path+"\\DataFiles\\Assignment_Runner.xlsx");
					wb=new XSSFWorkbook(fin);
					sh=wb.getSheet("Sheet7");
					int rc=sh.getPhysicalNumberOfRows();
					for(int r=1;r<rc;r++)
					{
						row=sh.getRow(r);
						cell=row.getCell(0);
						String methodname=cell.getStringCellValue();
						cell=row.getCell(1);
						String pkgclassname=cell.getStringCellValue();
						
						System.out.println(pkgclassname+ " ----> "+methodname);
						
						Class cls=Class.forName(pkgclassname);
						Object obj=cls.getDeclaredConstructor().newInstance();
						
						Method method=obj.getClass().getMethod(methodname);
						method.invoke(obj);
					}
						
				}catch(Exception e)
				{
					e.printStackTrace();
				}
				finally
				{
					try
					{
						fin.close();
						wb.close();
					}catch(Exception e)
					   {
						e.printStackTrace();
					   }
				}
			}						
}
