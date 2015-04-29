package me.dommi2212.BungeeBridge;

import java.util.logging.Level;
import java.util.logging.Logger;

import net.md_5.bungee.BungeeCord;

public class ConsolePrinter {
	
	/** Specifies the prefix. */
	private static final String prefix = "[BungeeBridgeS] ";
	
	/** Logger used to send messages to the console. */
	private static Logger logger = BungeeCord.getInstance().getLogger();
	
	public static void log(Level lvl, String msg) {
		logger.log(lvl, prefix + msg);
	}
	
	public static void print(String msg) {
		log(Level.INFO, msg);
	}
	
	public static void err(String msg) {
		log(Level.SEVERE, msg);
	}
	
	public static void warn(String msg) {
		log(Level.WARNING, msg);
	}
	
	
	
	

}
