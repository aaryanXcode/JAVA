import java.awt.*;

public class Demo_CheckBox extends Frame
{

	Checkbox cb1,cb2;
	Checkbox cd1,cd2;
	CheckboxGroup cbg1,cbg2;


	public Demo_CheckBox()
	{
		super(" class Demo_CheckBox ");
		setLayout(new FlowLayout());
		setVisible(true);
		setEnabled(true);setSize(500,500);

		cbg1=new CheckboxGroup();
		cbg2=new CheckboxGroup();

		cb1=new Checkbox("MALE",true,cbg1);
		cb2=new Checkbox("FEMALE",false,cbg1);
		cd1=new Checkbox("GEN",false,cbg2);
		cd2=new Checkbox("ST",false,cbg2);

	/*	cb1=new Checkbox("MALE",true);
		cb2=new Checkbox("FEMALE",false);
		cd1=new Checkbox("GEN",false);
		cd2=new Checkbox("ST",false);

*/

		add(cb1);
		add(cb2);
		add(cd1);
		add(cd2);
		show();
	}
	public static void main(String args[])
	{
		new Demo_CheckBox(); 
	}

}