package org.system;

public class Desktop extends Computer {

	public void desktopSize()
	{
		System.out.println("Desktop Size:15 inch");
	}
	
	
	public static void main(String[] args) {
		
		Computer singleInheritance=new Computer();
		singleInheritance.computerModel();
		
		Desktop desktopInherit=new Desktop();
		desktopInherit.computerModel();
		desktopInherit.desktopSize();
		
	}

}
