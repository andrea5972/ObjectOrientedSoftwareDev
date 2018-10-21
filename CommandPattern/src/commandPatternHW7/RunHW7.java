package commandPatternHW7;

import  java.util.Scanner;

public class RunHW7 {

	public static void main (String arg[]) {
		
		GameCmdInvoker cmdinvoker = new GameCmdInvoker();     
		
		Scanner scanner = new Scanner(System.in);
		
		boolean run = true;
		while(run==true) {
			
			System.out.println("Command: ");
			String input = scanner.nextLine();
	
			String[] words = input.split(" ");
			
			switch(words[0]) {
			case "add" : 
				AddCommand ac = new AddCommand(words[1]);
				cmdinvoker.setCommand(ac); 
				cmdinvoker.execute();
				break;
				
			case "delete" :
				DeleteCommand dc = new DeleteCommand(words[1]);
				cmdinvoker.setCommand(dc);
				cmdinvoker.execute();
				break;
				
			case "undo" :
				cmdinvoker.undo();
				break;
				
			case "redo" :
				cmdinvoker.redo();
				break; 
			
			case "quit" :
				run = false; 
				break; 
			
			default: 
				System.out.println("Command not recognized");
					
			}
			System.out.println(ListofWords.getInstance().toString());
			
		}
	}
}
