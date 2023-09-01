import java.awt.*;
class Suk extends Frame
{
Suk()
{
setSize(400,400);
setVisible(true);
setLayout(null);
setTitle("Sukhankar Frame 2");


MenuBar m=new MenuBar();
Menu mn=new Menu("File");
MenuItem mi=new MenuItem("New Tab");
MenuItem mi1=new MenuItem("Open");
MenuItem mi2=new MenuItem("Save");
mn.add(mi);
mn.add(mi1);
mn.add(mi2);
m.add(mn);


Menu mn1=new Menu("Edit");
MenuItem em=new MenuItem("Undo");
MenuItem em1=new MenuItem("Copy");
MenuItem em2=new MenuItem("Cut");
MenuItem em3=new MenuItem("Paste");
mn1.add(em);
mn1.add(em1);
mn1.add(em2);
mn1.add(em3);
m.add(mn1);

Menu mn2=new Menu("View");
Menu vm=new Menu("Zoom");
MenuItem vmn=new MenuItem("Zoom in");
MenuItem vmn1=new MenuItem("Zoom out");
MenuItem vmn2=new MenuItem("Restore default zoom");
MenuItem vm1=new MenuItem("Status bar");
MenuItem vm2=new MenuItem("Word wrap");
vm.add(vmn);
vm.add(vmn1);
vm.add(vmn2);
mn2.add(vm);
mn2.add(vm1);
mn2.add(vm2);
m.add(mn2);
setMenuBar(m);

}

public static void main(String[] args)
{
new Suk();
}
}