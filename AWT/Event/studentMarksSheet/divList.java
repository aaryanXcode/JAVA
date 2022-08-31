import java.awt.*;
import java.awt.event.*;
class divList extends Frame
{
	
	
	Panel center,listPanel,dataPanel;
	Label rLabel,pLabel,dLabel;		
	TextField tx1[],tx2[],tx3[];
	divList(studentMarksSheet s[],String div,int count)
	{
		
		super("student Marks sheet");
		
		setVisible(true);
		setSize(700,700);
		setLayout(new BorderLayout());
		
		listPanel=new Panel();
		listPanel.setLayout(new GridLayout(1,3));
		rLabel=new Label("roll no");
		rLabel.setFont(new Font("Arial", Font. PLAIN, 40));
		pLabel=new Label("percentage");
		pLabel.setFont(new Font("Arial", Font. PLAIN, 40));
		dLabel=new Label("division");
		dLabel.setFont(new Font("Arial", Font. PLAIN, 40));
		listPanel.add(rLabel);
		listPanel.add(pLabel);
		listPanel.add(dLabel);


		center=new Panel();
		center.setLayout(new GridLayout(1,3));
		
		

		dataPanel=new Panel();
		
		dataPanel.setLayout(new GridLayout(count,3));
		
		tx1=new TextField[s.length];
		tx2=new TextField[s.length];
		tx3=new TextField[s.length];
		System.out.println(div+" "+count);
		for(int i=0;i<s.length;i++)
		{
			if(div=="1st division")
			{	
				if(s[i].div==div)
				{
					tx1[i]=new TextField(s[i].RollNo+"");
					tx2[i]=new TextField(s[i].Percentage+"");
					tx3[i]=new TextField(s[i].div+"");
					dataPanel.add(tx1[i]);
					dataPanel.add(tx2[i]);
					dataPanel.add(tx3[i]);
				}
			}
			if(div=="2nd division")
			{	
				if(s[i].div==div)
				{
					tx1[i]=new TextField(s[i].RollNo+"");
					tx2[i]=new TextField(s[i].Percentage+"");
					tx3[i]=new TextField(s[i].div+"");
					dataPanel.add(tx1[i]);
					dataPanel.add(tx2[i]);
					dataPanel.add(tx3[i]);
				}
			}
			if(div=="3rd division")
			{	
				if(s[i].div==div)
				{
					tx1[i]=new TextField(s[i].RollNo+"");
					tx2[i]=new TextField(s[i].Percentage+"");
					tx3[i]=new TextField(s[i].div+"");
					dataPanel.add(tx1[i]);
					dataPanel.add(tx2[i]);
					dataPanel.add(tx3[i]);
				}
			}
			if(div=="fail")
			{	
				if(s[i].div==div)
				{
					tx1[i]=new TextField(s[i].RollNo+"");
					tx2[i]=new TextField(s[i].Percentage+"");
					tx3[i]=new TextField(s[i].div+"");
					dataPanel.add(tx1[i]);
					dataPanel.add(tx2[i]);
					dataPanel.add(tx3[i]);
				}
			}
		
		}	
		
		center.add(dataPanel);
		

		
		
		add(listPanel,BorderLayout.NORTH);
		add(center,BorderLayout.CENTER);
		show();
	}
	

}