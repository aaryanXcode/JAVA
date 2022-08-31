import java.awt.*;
import java.awt.event.*;
class demo_cal extends Frame implements ActionListener
{
	
	Button b[];
	TextField t1;
	Panel p1,p2;
	String value="";

        demo_cal()
        {
		super("demo_cal");
		b=new Button[16];
           		setLayout(new BorderLayout());
	 	setSize(150,150);
		setResizable(false);
	 	setVisible(true);
		p1=new Panel();
		
 		for(int i=0;i<10;i++)	
		{
			b[i]=new Button(""+i);

		}
		t1=new TextField(15);
		t1.setBackground(Color.black);
		t1.setForeground(Color.green);
		t1.setFont(new Font("Arial Narrow",Font.BOLD,12));
		p1.add(t1);
		b[10]=new Button("+");
		b[11]=new Button("*");	
		b[12]=new Button("/");
		b[13]=new Button("-");	
		b[14]=new Button("=");	
		b[15]=new Button("clr");	
		p2=new Panel();
		p2.setLayout(new GridLayout(4,5));
		for(int i=0;i<16;i++)
		{
			p2.add(b[i]);
			b[i].addActionListener(this);
		}
		add(p1,BorderLayout.NORTH);
		add(p2,BorderLayout.CENTER);
		t1.setText("0");
		show();
	}
	int no1,no2;
	String op="";
	public void actionPerformed(ActionEvent ae)
	{
		
		try
		{	
			if(Integer.parseInt(ae.getActionCommand())>=0 &&Integer.parseInt(ae.getActionCommand())<=9)
			value=value+ae.getActionCommand();			

			t1.setText(value);
		}
		catch(Exception e)
		{
			System.out.println("ex"+ae.getActionCommand());
			String opr=ae.getActionCommand();
			if(opr.equals("+")||opr.equals("-")||opr.equals("*")||opr.equals("/"))
			{
				
				if(op.length()>0)
				{
					value=value+no1;
					no1=Integer.parseInt(value);
					value="";			
				}
				else
				{
					no1=Integer.parseInt(value);
					value="";			
				}
				op=opr;
			}
			else if(opr.equals("clr"))
			{
				t1.setText("0");
				value="";
			}								
			else
			{	
			
				no2=Integer.parseInt(value);
				try
				{
					int re=process(no1,no2,op);		
					t1.setText(""+re);
					op="";	
				}
				catch(Exception ee)
				{
					t1.setText("Err!!");
				}
				
			}
					
		}
		
	}	
	int process(int no1,int no2,String op) throws Exception 
	{
		int re=0;
		if(op=="+")
		{
			re=no1+no2;
		}
		else if(op=="/")
		{
			re=no1/no2;
			
		}					
		else if(op=="*")
		{
			re=no1*no2;
		}					
		else if(op=="-")
		{
			re=no1-no2;
		}	
		return(re);				
					
	}
	
	public static void main(String a[])
	{
		new demo_cal();
	}
}	






		