package com.qa.encapsulation;

public class BrowserUtil {

	public void launchBrowser() {
		System.out.println("launchBrowser");
		isBrowserExist();
	}

	private void isBrowserExist() {
		System.out.println("isBrowserExist");
		checkBrowserComptability();
	}

	private void checkBrowserComptability() {
		System.out.println("checkBrowserComptability");
		checkRAMAllocated();
	}

	private void checkRAMAllocated() {
		System.out.println("checkRAMAllocated");
	}
}
