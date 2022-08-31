import javax.swing.*;
import java.awt.event.*;
import java.awt.print.*;
import javax.print.*;
import java.io.*;
import javax.print.attribute.*; 
import javax.print.attribute.standard.*;
import java.awt.print.*;
import java.awt.*;
class Demo_Print_Dialog extends JFrame implements ActionListener
{
	JButton print;
	DocFlavor flavor;
	PrinterJob prn;
	PrintRequestAttributeSet attrib_set;
	PrintService[] pservices;
	DocPrintJob p_job;
	Doc doc;
	Demo_Print_Dialog()
	{
		super("Print Dialog");
		setVisible(true);
		setSize(300,300);
		setLayout(new FlowLayout());
		print=new JButton("PRINT");
		getContentPane().add(print);
		try
		{
			flavor = DocFlavor.INPUT_STREAM.POSTSCRIPT;
			prn=PrinterJob.getPrinterJob();		
			attrib_set = new HashPrintRequestAttributeSet();
			attrib_set.add(MediaSizeName.ISO_A4);
			pservices =PrintServiceLookup.lookupPrintServices(flavor, attrib_set);
			p_job = pservices[0].createPrintJob();
			doc = new PrinterData(flavor);
		}
		catch(Exception e)
		{
			System.out.println("ex:"+e);			
		}
		print.addActionListener(this);
		show();
	}
	public void actionPerformed(ActionEvent ae)
	{

		try
		{
		
			///PageFormat pg_format=prn.pageDialog(new PageFormat());
			boolean pr=prn.printDialog();
			//Printable prt=new Printer_Data();
			///prn.setPrintable(prt,pg_format);
			try 
			{
			            p_job.print(doc,attrib_set);
	        		}
			catch (Exception e) 
			{ 
				System.out.println("ex:"+e);
	        		}
	

	
		}
		catch(Exception e)
		{
			System.out.println("ex:"+e);
		}
		
		
	}
	public static void main(String a[])
	{
		new Demo_Print_Dialog();
	}
}

class Printer_Data implements Printable
{
	Printer_Data(){}
	public int print(Graphics graphics, PageFormat pageFormat, int pageIndex)  
	{
		graphics.drawString("hellodgdfgs",(int)pageFormat.getImageableX(),(int)pageFormat.getImageableY());	
		return(Printable.NO_SUCH_PAGE);
	}
}