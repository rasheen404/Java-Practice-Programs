package com.Synchronized.example2;

public class Hospital {
	String res1 = "Doctor";
	String res2 = "Bed";

	void tomTreatment() {
		try {
			synchronized (res1) {
				System.out.println("Tom is using " + res1);
				Thread.sleep(2000);
				synchronized (res2) {
					System.out.println("Tom is using " + res2);
					Thread.sleep(2000);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	void jerryTreatment() {
		try {
			synchronized (res1) {
				System.out.println("Jerry is using " + res1);
				Thread.sleep(2000);
				synchronized (res2) {
					System.out.println("Jerry is using " + res2);
					Thread.sleep(2000);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
