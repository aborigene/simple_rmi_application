package com.mkyong.rmiclient;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import javax.swing.JOptionPane;

import com.mkyong.rmiinterface.RMIInterface;

public class ClientOperation {
	private static RMIInterface look_up;

	public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException, InterruptedException {
		
		look_up = (RMIInterface) Naming.lookup("//localhost/MyServer");
		int i = 0;
		String name;
		while (i>=0){
			name = "MyName_"+i;
		//String txt = JOptionPane.showInputDialog("What is your name?");
			System.out.print("Sending message: "+name);	
			String response = look_up.helloTo(name);
			System.out.print("Server replyed: "+response);
		//JOptionPane.showMessageDialog(null, response);
			i++;
			Thread.sleep(500);
		}
	}
}
