import java.awt.*;
import java.awt.event.*;
class Demo_ItemEvent extends Frame implements ItemListener
{	
	Checkbox add,sub;
	CheckboxGroup cb;
	TextField no1,no2,re;	
	Choice ch;
	Demo_ItemEvent()
	{
		
		setSize(300,400);
		setVisible(true);
		setLayout(null);
				
		cb=new CheckboxGroup();
		add=new Checkbox("ADDITION",true,cb);
		sub=new Checkbox("SUBTRACTION",false,cb);
		
		no1=new TextField();
		no2=new TextField();
		re=new TextField();
		
		sub.setBounds(50,50,100,20);
		add.setBounds(50,80,100,20);

		add(sub);
		add(add);
		
		no1.setBounds(50,110,50,20);
		no2.setBounds(110,110,50,20);
		re.setBounds(170,110,50,20);	
		add(no1);
		add(no2);
		add(re);	
		ch=new Choice();			
		ch.setBounds(270,110,50,20);	
		
		ch.add("ADD");
		ch.add("SUB");
		add(ch);
		add.addItemListener(this);
		sub.addItemListener(this);
		ch.addItemListener(this);
	}
	Choice ch1;
	public void itemStateChanged(ItemEvent ae)
	{
		try
		{
			ch1=(Choice)ae.getSource();
		}
		catch(ClassCastException c)
		{
			ch1=new Choice();	
		}
		if((ae.getSource()==add && add.getState())||ch1.getSelectedItem()=="ADD")
		{
			try
			{
				re.setText(Integer.parseInt(no1.getText())+Integer.parseInt(no2.getText())+"");
			}
			catch(Exception e)
			{
				re.setText("Error!!");
			}
		}
		else if((ae.getSource()==sub && sub.getState())||ch1.getSelectedItem()=="SUB")
		{
			try
			{
				re.setText(Integer.parseInt(no1.getText())-Integer.parseInt(no2.getText())+"");
			}
			catch(Exception e)
			{
				re.setText("Error!!");
			}
		}		
		
	}
	public static void main(String a[])
	{
		new Demo_ItemEvent();
	}
		
}
		