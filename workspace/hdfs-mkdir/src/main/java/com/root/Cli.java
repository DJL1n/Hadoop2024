package com.root;

import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.BasicParser;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.CommandLine;

public class Cli{
	public static void main(String[] args) throws Exception{
		CommandLineParser parser=new BasicParser();
		Options options =new Options();
		options.addOption("h","help",false,"Print this usage information");
		options.addOption("v","verbose",false,"Print out VERBOSE information");
		options.addOption("f","file",true,"File to save program output to");
		//Parse the program arguments
		CommandLine commandline = parser.parse(options,args);
		//Set the appropriate variables based on supplied options
		boolean verbose=false;
		String file="";
		if (commandline.hasOption('h')){
			System.out.println("Help Message");
			System.exit(0);
			}
		if (commandline.hasOption('v')){
			verbose=true;
			}
		if (commandline.hasOption('f')){
			file=commandline.getOptionValue('f');
			}
		System.out.println("verbose:"+verbose);
		System.out.println("file:"+file);
	}
}
