import java.awt.*;
class WindowEx extends Frame
{
WindowEx()
{
setLocation(100,100);
setSize(400,400);
setVisible(true);
setLayout(null);
setTitle("Sukhankar Frame 1");

Label l=new Label("Name:-");
l.setBounds(30,100,60,30);
add(l);

TextField f=new TextField();
f.setBounds(190,100,190,30);
add(f);

Label l1=new Label("Address:-");
l1.setBounds(30,150,60,30);
add(l1);

TextArea f1=new TextArea();
f1.setBounds(190,150,250,70);
add(f1);

Label l2=new Label("Gender:-");
l2.setBounds(30,250,60,30);
add(l2);

CheckboxGroup g=new CheckboxGroup();
Checkbox m=new Checkbox("Male",g,true);
m.setBounds(190,250,50,30);
add(m);

Checkbox fe=new Checkbox("Female",g,false);
fe.setBounds(260,250,70,30);
add(fe);

Label l3=new Label("Department:-");
l3.setBounds(30,300,80,30);
add(l3);

Choice d=new Choice();
d.setBounds(190,300,50,30);
d.add("CSE");
d.add("ECE");
d.add("AIDS");
d.add("ETC");
add(d);

Label l4=new Label("Hobbies:-");
l4.setBounds(30,350,55,30);
add(l4);

Checkbox h=new Checkbox("Reading");
h.setBounds(190,350,70,18);
add(h);
Checkbox h1=new Checkbox("Playing games");
h1.setBounds(190,370,90,18);
add(h1);
Checkbox h2=new Checkbox("Swimming");
h2.setBounds(190,390,80,18);
add(h2);
Checkbox h3=new Checkbox("Writing");
h3.setBounds(190,410,70,18);
add(h3);

Label l5=new Label("Programming language:-");
l5.setBounds(30,460,145,30);
add(l5);

List li=new List(2,true);
li.setBounds(190,460,110,40);
li.add("C");
li.add("Python");
li.add("Ruby");
li.add("java");
li.add("C++");
li.add("Node JS");
add(li);





Button b=new Button("Submit");
b.setBounds(200,610,50,30);
add(b);



Color c=new Color(255,0,0);
setBackground(c);



Color c2=new Color(255,215,0);
l3.setBackground(c2);
l1.setBackground(c2);
l2.setBackground(c2);
l4.setBackground(c2);
l5.setBackground(c2);
h.setBackground(c2);
h1.setBackground(c2);
h2.setBackground(c2);
h3.setBackground(c2);
li.setBackground(c2);
m.setBackground(c2);
fe.setBackground(c2);
}
public static void main(String[] args)
	{
new WindowEx();

}
}
