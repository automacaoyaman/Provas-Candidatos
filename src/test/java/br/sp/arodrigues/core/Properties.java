package br.sp.arodrigues.core;

public class Properties {
	
	public static boolean CLOSES_BROWSER = false;
	public static Browsers browser = Browsers.CHROME;
	
	public enum Browsers{
		CHROME,
		FIREFOX,
		INTERNET_EXPLORER,
		OPERA
	}
}
