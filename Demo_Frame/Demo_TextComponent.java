import java.awt.*;


 class Demo_TextComponent extends Frame
{
	TextField tx;
	TextArea ta;
        public Demo_TextComponent()
        {
		super("Text Component");
		setSize(200,300);
		setVisible(true);
		setLayout(new FlowLayout());
		ta=new TextArea("Hiiiiiii",10,50);
		//ta.setEditable(false);
		tx=new TextField(50);
		
                		add(ta);
               		add(tx);
                		show();
        }
       public static void main(String a[])
     {
	new Demo_TextComponent(); 
    }
	

}

