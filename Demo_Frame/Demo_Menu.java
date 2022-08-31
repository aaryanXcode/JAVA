import java.awt.*;

public class Demo_Menu extends Frame
{
	MenuBar m_bar;
	Menu file,edit,color;
	MenuItem open,close,save;
	MenuItem cut,copy,paste;
	MenuItem red,green,blue;
	Demo_Menu()
	{
		super("Menu Demo");
		setVisible(true);
		setSize(400,400);

		m_bar=new MenuBar();
		setMenuBar(m_bar);	
	
		file=new Menu("File");
		edit=new Menu("Edit");
		color=new Menu("Color");
	
		
		
		open=new MenuItem("Open");
		close=new MenuItem("Close");
		save=new MenuItem("Save");

		file.add(open);
		file.add(color);
		file.add(close);
		file.add(new MenuItem("-"));
		file.add(save);

		
		
		cut=new MenuItem("Cut");
		copy=new MenuItem("Copy");
		paste=new MenuItem("Paste");

		edit.add(cut);
		edit.add(copy);
		edit.add(paste);

		
		red=new CheckboxMenuItem("RED",true);
		blue=new CheckboxMenuItem("BLUE");
		green=new CheckboxMenuItem("GREEN");
		
		
		color.add(red);
		color.add(green);
		color.add(blue);
		
		
		m_bar.add(file);
		m_bar.add(edit);
		//m_bar.add(color);
		
		show();
	}
	public static void main(String a[])
	{
		new Demo_Menu();
	}
}